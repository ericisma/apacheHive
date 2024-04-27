<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class GetLatestCommittedCompactionInfoResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'compactions',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\CompactionInfoStruct',
                ),
        ),
    );

    /**
     * @var \metastore\CompactionInfoStruct[]
     */
    public $compactions = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['compactions'])) {
                $this->compactions = $vals['compactions'];
            }
        }
    }

    public function getName()
    {
        return 'GetLatestCommittedCompactionInfoResponse';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->compactions = array();
                        $_size841 = 0;
                        $_etype844 = 0;
                        $xfer += $input->readListBegin($_etype844, $_size841);
                        for ($_i845 = 0; $_i845 < $_size841; ++$_i845) {
                            $elem846 = null;
                            $elem846 = new \metastore\CompactionInfoStruct();
                            $xfer += $elem846->read($input);
                            $this->compactions []= $elem846;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('GetLatestCommittedCompactionInfoResponse');
        if ($this->compactions !== null) {
            if (!is_array($this->compactions)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('compactions', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->compactions));
            foreach ($this->compactions as $iter847) {
                $xfer += $iter847->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}

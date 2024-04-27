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

class EnvironmentContext
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'properties',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::STRING,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var array
     */
    public $properties = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['properties'])) {
                $this->properties = $vals['properties'];
            }
        }
    }

    public function getName()
    {
        return 'EnvironmentContext';
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
                    if ($ftype == TType::MAP) {
                        $this->properties = array();
                        $_size0 = 0;
                        $_ktype1 = 0;
                        $_vtype2 = 0;
                        $xfer += $input->readMapBegin($_ktype1, $_vtype2, $_size0);
                        for ($_i4 = 0; $_i4 < $_size0; ++$_i4) {
                            $key5 = '';
                            $val6 = '';
                            $xfer += $input->readString($key5);
                            $xfer += $input->readString($val6);
                            $this->properties[$key5] = $val6;
                        }
                        $xfer += $input->readMapEnd();
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
        $xfer += $output->writeStructBegin('EnvironmentContext');
        if ($this->properties !== null) {
            if (!is_array($this->properties)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('properties', TType::MAP, 1);
            $output->writeMapBegin(TType::STRING, TType::STRING, count($this->properties));
            foreach ($this->properties as $kiter7 => $viter8) {
                $xfer += $output->writeString($kiter7);
                $xfer += $output->writeString($viter8);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}

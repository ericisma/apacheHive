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

class ThriftHiveMetastore_update_partition_column_statistics_result
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        0 => array(
            'var' => 'success',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        1 => array(
            'var' => 'o1',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\NoSuchObjectException',
        ),
        2 => array(
            'var' => 'o2',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\InvalidObjectException',
        ),
        3 => array(
            'var' => 'o3',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\MetaException',
        ),
        4 => array(
            'var' => 'o4',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\InvalidInputException',
        ),
    );

    /**
     * @var bool
     */
    public $success = null;
    /**
     * @var \metastore\NoSuchObjectException
     */
    public $o1 = null;
    /**
     * @var \metastore\InvalidObjectException
     */
    public $o2 = null;
    /**
     * @var \metastore\MetaException
     */
    public $o3 = null;
    /**
     * @var \metastore\InvalidInputException
     */
    public $o4 = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['success'])) {
                $this->success = $vals['success'];
            }
            if (isset($vals['o1'])) {
                $this->o1 = $vals['o1'];
            }
            if (isset($vals['o2'])) {
                $this->o2 = $vals['o2'];
            }
            if (isset($vals['o3'])) {
                $this->o3 = $vals['o3'];
            }
            if (isset($vals['o4'])) {
                $this->o4 = $vals['o4'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_update_partition_column_statistics_result';
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
                case 0:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->success);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 1:
                    if ($ftype == TType::STRUCT) {
                        $this->o1 = new \metastore\NoSuchObjectException();
                        $xfer += $this->o1->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRUCT) {
                        $this->o2 = new \metastore\InvalidObjectException();
                        $xfer += $this->o2->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRUCT) {
                        $this->o3 = new \metastore\MetaException();
                        $xfer += $this->o3->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRUCT) {
                        $this->o4 = new \metastore\InvalidInputException();
                        $xfer += $this->o4->read($input);
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
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_update_partition_column_statistics_result');
        if ($this->success !== null) {
            $xfer += $output->writeFieldBegin('success', TType::BOOL, 0);
            $xfer += $output->writeBool($this->success);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->o1 !== null) {
            $xfer += $output->writeFieldBegin('o1', TType::STRUCT, 1);
            $xfer += $this->o1->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->o2 !== null) {
            $xfer += $output->writeFieldBegin('o2', TType::STRUCT, 2);
            $xfer += $this->o2->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->o3 !== null) {
            $xfer += $output->writeFieldBegin('o3', TType::STRUCT, 3);
            $xfer += $this->o3->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->o4 !== null) {
            $xfer += $output->writeFieldBegin('o4', TType::STRUCT, 4);
            $xfer += $this->o4->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}

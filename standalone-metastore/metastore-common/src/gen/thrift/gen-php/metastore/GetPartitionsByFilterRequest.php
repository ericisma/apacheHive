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

class GetPartitionsByFilterRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'catName',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'dbName',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'tblName',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'filter',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        5 => array(
            'var' => 'maxParts',
            'isRequired' => false,
            'type' => TType::I16,
        ),
        6 => array(
            'var' => 'skipColumnSchemaForPartition',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        7 => array(
            'var' => 'includeParamKeyPattern',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        8 => array(
            'var' => 'excludeParamKeyPattern',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $catName = null;
    /**
     * @var string
     */
    public $dbName = null;
    /**
     * @var string
     */
    public $tblName = null;
    /**
     * @var string
     */
    public $filter = null;
    /**
     * @var int
     */
    public $maxParts = -1;
    /**
     * @var bool
     */
    public $skipColumnSchemaForPartition = null;
    /**
     * @var string
     */
    public $includeParamKeyPattern = null;
    /**
     * @var string
     */
    public $excludeParamKeyPattern = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['catName'])) {
                $this->catName = $vals['catName'];
            }
            if (isset($vals['dbName'])) {
                $this->dbName = $vals['dbName'];
            }
            if (isset($vals['tblName'])) {
                $this->tblName = $vals['tblName'];
            }
            if (isset($vals['filter'])) {
                $this->filter = $vals['filter'];
            }
            if (isset($vals['maxParts'])) {
                $this->maxParts = $vals['maxParts'];
            }
            if (isset($vals['skipColumnSchemaForPartition'])) {
                $this->skipColumnSchemaForPartition = $vals['skipColumnSchemaForPartition'];
            }
            if (isset($vals['includeParamKeyPattern'])) {
                $this->includeParamKeyPattern = $vals['includeParamKeyPattern'];
            }
            if (isset($vals['excludeParamKeyPattern'])) {
                $this->excludeParamKeyPattern = $vals['excludeParamKeyPattern'];
            }
        }
    }

    public function getName()
    {
        return 'GetPartitionsByFilterRequest';
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
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->catName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->dbName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->tblName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->filter);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::I16) {
                        $xfer += $input->readI16($this->maxParts);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->skipColumnSchemaForPartition);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->includeParamKeyPattern);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 8:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->excludeParamKeyPattern);
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
        $xfer += $output->writeStructBegin('GetPartitionsByFilterRequest');
        if ($this->catName !== null) {
            $xfer += $output->writeFieldBegin('catName', TType::STRING, 1);
            $xfer += $output->writeString($this->catName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->dbName !== null) {
            $xfer += $output->writeFieldBegin('dbName', TType::STRING, 2);
            $xfer += $output->writeString($this->dbName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->tblName !== null) {
            $xfer += $output->writeFieldBegin('tblName', TType::STRING, 3);
            $xfer += $output->writeString($this->tblName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->filter !== null) {
            $xfer += $output->writeFieldBegin('filter', TType::STRING, 4);
            $xfer += $output->writeString($this->filter);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->maxParts !== null) {
            $xfer += $output->writeFieldBegin('maxParts', TType::I16, 5);
            $xfer += $output->writeI16($this->maxParts);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->skipColumnSchemaForPartition !== null) {
            $xfer += $output->writeFieldBegin('skipColumnSchemaForPartition', TType::BOOL, 6);
            $xfer += $output->writeBool($this->skipColumnSchemaForPartition);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->includeParamKeyPattern !== null) {
            $xfer += $output->writeFieldBegin('includeParamKeyPattern', TType::STRING, 7);
            $xfer += $output->writeString($this->includeParamKeyPattern);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->excludeParamKeyPattern !== null) {
            $xfer += $output->writeFieldBegin('excludeParamKeyPattern', TType::STRING, 8);
            $xfer += $output->writeString($this->excludeParamKeyPattern);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}

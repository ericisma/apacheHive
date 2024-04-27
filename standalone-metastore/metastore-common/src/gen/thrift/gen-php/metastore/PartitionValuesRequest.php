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

class PartitionValuesRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'dbName',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'tblName',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'partitionKeys',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\FieldSchema',
                ),
        ),
        4 => array(
            'var' => 'applyDistinct',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        5 => array(
            'var' => 'filter',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        6 => array(
            'var' => 'partitionOrder',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\FieldSchema',
                ),
        ),
        7 => array(
            'var' => 'ascending',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        8 => array(
            'var' => 'maxParts',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        9 => array(
            'var' => 'catName',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        10 => array(
            'var' => 'validWriteIdList',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $dbName = null;
    /**
     * @var string
     */
    public $tblName = null;
    /**
     * @var \metastore\FieldSchema[]
     */
    public $partitionKeys = null;
    /**
     * @var bool
     */
    public $applyDistinct = true;
    /**
     * @var string
     */
    public $filter = null;
    /**
     * @var \metastore\FieldSchema[]
     */
    public $partitionOrder = null;
    /**
     * @var bool
     */
    public $ascending = true;
    /**
     * @var int
     */
    public $maxParts = -1;
    /**
     * @var string
     */
    public $catName = null;
    /**
     * @var string
     */
    public $validWriteIdList = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['dbName'])) {
                $this->dbName = $vals['dbName'];
            }
            if (isset($vals['tblName'])) {
                $this->tblName = $vals['tblName'];
            }
            if (isset($vals['partitionKeys'])) {
                $this->partitionKeys = $vals['partitionKeys'];
            }
            if (isset($vals['applyDistinct'])) {
                $this->applyDistinct = $vals['applyDistinct'];
            }
            if (isset($vals['filter'])) {
                $this->filter = $vals['filter'];
            }
            if (isset($vals['partitionOrder'])) {
                $this->partitionOrder = $vals['partitionOrder'];
            }
            if (isset($vals['ascending'])) {
                $this->ascending = $vals['ascending'];
            }
            if (isset($vals['maxParts'])) {
                $this->maxParts = $vals['maxParts'];
            }
            if (isset($vals['catName'])) {
                $this->catName = $vals['catName'];
            }
            if (isset($vals['validWriteIdList'])) {
                $this->validWriteIdList = $vals['validWriteIdList'];
            }
        }
    }

    public function getName()
    {
        return 'PartitionValuesRequest';
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
                        $xfer += $input->readString($this->dbName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->tblName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->partitionKeys = array();
                        $_size609 = 0;
                        $_etype612 = 0;
                        $xfer += $input->readListBegin($_etype612, $_size609);
                        for ($_i613 = 0; $_i613 < $_size609; ++$_i613) {
                            $elem614 = null;
                            $elem614 = new \metastore\FieldSchema();
                            $xfer += $elem614->read($input);
                            $this->partitionKeys []= $elem614;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->applyDistinct);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->filter);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::LST) {
                        $this->partitionOrder = array();
                        $_size615 = 0;
                        $_etype618 = 0;
                        $xfer += $input->readListBegin($_etype618, $_size615);
                        for ($_i619 = 0; $_i619 < $_size615; ++$_i619) {
                            $elem620 = null;
                            $elem620 = new \metastore\FieldSchema();
                            $xfer += $elem620->read($input);
                            $this->partitionOrder []= $elem620;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->ascending);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 8:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->maxParts);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 9:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->catName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 10:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->validWriteIdList);
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
        $xfer += $output->writeStructBegin('PartitionValuesRequest');
        if ($this->dbName !== null) {
            $xfer += $output->writeFieldBegin('dbName', TType::STRING, 1);
            $xfer += $output->writeString($this->dbName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->tblName !== null) {
            $xfer += $output->writeFieldBegin('tblName', TType::STRING, 2);
            $xfer += $output->writeString($this->tblName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->partitionKeys !== null) {
            if (!is_array($this->partitionKeys)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('partitionKeys', TType::LST, 3);
            $output->writeListBegin(TType::STRUCT, count($this->partitionKeys));
            foreach ($this->partitionKeys as $iter621) {
                $xfer += $iter621->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->applyDistinct !== null) {
            $xfer += $output->writeFieldBegin('applyDistinct', TType::BOOL, 4);
            $xfer += $output->writeBool($this->applyDistinct);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->filter !== null) {
            $xfer += $output->writeFieldBegin('filter', TType::STRING, 5);
            $xfer += $output->writeString($this->filter);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->partitionOrder !== null) {
            if (!is_array($this->partitionOrder)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('partitionOrder', TType::LST, 6);
            $output->writeListBegin(TType::STRUCT, count($this->partitionOrder));
            foreach ($this->partitionOrder as $iter622) {
                $xfer += $iter622->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->ascending !== null) {
            $xfer += $output->writeFieldBegin('ascending', TType::BOOL, 7);
            $xfer += $output->writeBool($this->ascending);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->maxParts !== null) {
            $xfer += $output->writeFieldBegin('maxParts', TType::I64, 8);
            $xfer += $output->writeI64($this->maxParts);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->catName !== null) {
            $xfer += $output->writeFieldBegin('catName', TType::STRING, 9);
            $xfer += $output->writeString($this->catName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->validWriteIdList !== null) {
            $xfer += $output->writeFieldBegin('validWriteIdList', TType::STRING, 10);
            $xfer += $output->writeString($this->validWriteIdList);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
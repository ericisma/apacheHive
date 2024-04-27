<?php
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

class Stage
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'stageId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'stageType',
            'isRequired' => false,
            'type' => TType::I32,
            'class' => '\StageType',
        ),
        3 => array(
            'var' => 'stageAttributes',
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
        4 => array(
            'var' => 'stageCounters',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::I64,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::I64,
                ),
        ),
        5 => array(
            'var' => 'taskList',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\Task',
                ),
        ),
        6 => array(
            'var' => 'done',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        7 => array(
            'var' => 'started',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
    );

    /**
     * @var string
     */
    public $stageId = null;
    /**
     * @var int
     */
    public $stageType = null;
    /**
     * @var array
     */
    public $stageAttributes = null;
    /**
     * @var array
     */
    public $stageCounters = null;
    /**
     * @var \Task[]
     */
    public $taskList = null;
    /**
     * @var bool
     */
    public $done = null;
    /**
     * @var bool
     */
    public $started = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['stageId'])) {
                $this->stageId = $vals['stageId'];
            }
            if (isset($vals['stageType'])) {
                $this->stageType = $vals['stageType'];
            }
            if (isset($vals['stageAttributes'])) {
                $this->stageAttributes = $vals['stageAttributes'];
            }
            if (isset($vals['stageCounters'])) {
                $this->stageCounters = $vals['stageCounters'];
            }
            if (isset($vals['taskList'])) {
                $this->taskList = $vals['taskList'];
            }
            if (isset($vals['done'])) {
                $this->done = $vals['done'];
            }
            if (isset($vals['started'])) {
                $this->started = $vals['started'];
            }
        }
    }

    public function getName()
    {
        return 'Stage';
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
                        $xfer += $input->readString($this->stageId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->stageType);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::MAP) {
                        $this->stageAttributes = array();
                        $_size64 = 0;
                        $_ktype65 = 0;
                        $_vtype66 = 0;
                        $xfer += $input->readMapBegin($_ktype65, $_vtype66, $_size64);
                        for ($_i68 = 0; $_i68 < $_size64; ++$_i68) {
                            $key69 = '';
                            $val70 = '';
                            $xfer += $input->readString($key69);
                            $xfer += $input->readString($val70);
                            $this->stageAttributes[$key69] = $val70;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::MAP) {
                        $this->stageCounters = array();
                        $_size71 = 0;
                        $_ktype72 = 0;
                        $_vtype73 = 0;
                        $xfer += $input->readMapBegin($_ktype72, $_vtype73, $_size71);
                        for ($_i75 = 0; $_i75 < $_size71; ++$_i75) {
                            $key76 = '';
                            $val77 = 0;
                            $xfer += $input->readString($key76);
                            $xfer += $input->readI64($val77);
                            $this->stageCounters[$key76] = $val77;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::LST) {
                        $this->taskList = array();
                        $_size78 = 0;
                        $_etype81 = 0;
                        $xfer += $input->readListBegin($_etype81, $_size78);
                        for ($_i82 = 0; $_i82 < $_size78; ++$_i82) {
                            $elem83 = null;
                            $elem83 = new \Task();
                            $xfer += $elem83->read($input);
                            $this->taskList []= $elem83;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->done);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->started);
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
        $xfer += $output->writeStructBegin('Stage');
        if ($this->stageId !== null) {
            $xfer += $output->writeFieldBegin('stageId', TType::STRING, 1);
            $xfer += $output->writeString($this->stageId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->stageType !== null) {
            $xfer += $output->writeFieldBegin('stageType', TType::I32, 2);
            $xfer += $output->writeI32($this->stageType);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->stageAttributes !== null) {
            if (!is_array($this->stageAttributes)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('stageAttributes', TType::MAP, 3);
            $output->writeMapBegin(TType::STRING, TType::STRING, count($this->stageAttributes));
            foreach ($this->stageAttributes as $kiter84 => $viter85) {
                $xfer += $output->writeString($kiter84);
                $xfer += $output->writeString($viter85);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->stageCounters !== null) {
            if (!is_array($this->stageCounters)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('stageCounters', TType::MAP, 4);
            $output->writeMapBegin(TType::STRING, TType::I64, count($this->stageCounters));
            foreach ($this->stageCounters as $kiter86 => $viter87) {
                $xfer += $output->writeString($kiter86);
                $xfer += $output->writeI64($viter87);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->taskList !== null) {
            if (!is_array($this->taskList)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('taskList', TType::LST, 5);
            $output->writeListBegin(TType::STRUCT, count($this->taskList));
            foreach ($this->taskList as $iter88) {
                $xfer += $iter88->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->done !== null) {
            $xfer += $output->writeFieldBegin('done', TType::BOOL, 6);
            $xfer += $output->writeBool($this->done);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->started !== null) {
            $xfer += $output->writeFieldBegin('started', TType::BOOL, 7);
            $xfer += $output->writeBool($this->started);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}

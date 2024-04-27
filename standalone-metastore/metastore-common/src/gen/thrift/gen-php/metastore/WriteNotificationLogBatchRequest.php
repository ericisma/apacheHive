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

class WriteNotificationLogBatchRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'catalog',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'db',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'table',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'requestList',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\WriteNotificationLogRequest',
                ),
        ),
    );

    /**
     * @var string
     */
    public $catalog = null;
    /**
     * @var string
     */
    public $db = null;
    /**
     * @var string
     */
    public $table = null;
    /**
     * @var \metastore\WriteNotificationLogRequest[]
     */
    public $requestList = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['catalog'])) {
                $this->catalog = $vals['catalog'];
            }
            if (isset($vals['db'])) {
                $this->db = $vals['db'];
            }
            if (isset($vals['table'])) {
                $this->table = $vals['table'];
            }
            if (isset($vals['requestList'])) {
                $this->requestList = $vals['requestList'];
            }
        }
    }

    public function getName()
    {
        return 'WriteNotificationLogBatchRequest';
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
                        $xfer += $input->readString($this->catalog);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->db);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->table);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::LST) {
                        $this->requestList = array();
                        $_size948 = 0;
                        $_etype951 = 0;
                        $xfer += $input->readListBegin($_etype951, $_size948);
                        for ($_i952 = 0; $_i952 < $_size948; ++$_i952) {
                            $elem953 = null;
                            $elem953 = new \metastore\WriteNotificationLogRequest();
                            $xfer += $elem953->read($input);
                            $this->requestList []= $elem953;
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
        $xfer += $output->writeStructBegin('WriteNotificationLogBatchRequest');
        if ($this->catalog !== null) {
            $xfer += $output->writeFieldBegin('catalog', TType::STRING, 1);
            $xfer += $output->writeString($this->catalog);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->db !== null) {
            $xfer += $output->writeFieldBegin('db', TType::STRING, 2);
            $xfer += $output->writeString($this->db);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->table !== null) {
            $xfer += $output->writeFieldBegin('table', TType::STRING, 3);
            $xfer += $output->writeString($this->table);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->requestList !== null) {
            if (!is_array($this->requestList)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('requestList', TType::LST, 4);
            $output->writeListBegin(TType::STRUCT, count($this->requestList));
            foreach ($this->requestList as $iter954) {
                $xfer += $iter954->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}

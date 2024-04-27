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

class TOpenSessionReq
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'client_protocol',
            'isRequired' => true,
            'type' => TType::I32,
            'class' => '\TProtocolVersion',
        ),
        2 => array(
            'var' => 'username',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'password',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'configuration',
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
     * @var int
     */
    public $client_protocol =     9;
    /**
     * @var string
     */
    public $username = null;
    /**
     * @var string
     */
    public $password = null;
    /**
     * @var array
     */
    public $configuration = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['client_protocol'])) {
                $this->client_protocol = $vals['client_protocol'];
            }
            if (isset($vals['username'])) {
                $this->username = $vals['username'];
            }
            if (isset($vals['password'])) {
                $this->password = $vals['password'];
            }
            if (isset($vals['configuration'])) {
                $this->configuration = $vals['configuration'];
            }
        }
    }

    public function getName()
    {
        return 'TOpenSessionReq';
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
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->client_protocol);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->username);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->password);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::MAP) {
                        $this->configuration = array();
                        $_size125 = 0;
                        $_ktype126 = 0;
                        $_vtype127 = 0;
                        $xfer += $input->readMapBegin($_ktype126, $_vtype127, $_size125);
                        for ($_i129 = 0; $_i129 < $_size125; ++$_i129) {
                            $key130 = '';
                            $val131 = '';
                            $xfer += $input->readString($key130);
                            $xfer += $input->readString($val131);
                            $this->configuration[$key130] = $val131;
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
        $xfer += $output->writeStructBegin('TOpenSessionReq');
        if ($this->client_protocol !== null) {
            $xfer += $output->writeFieldBegin('client_protocol', TType::I32, 1);
            $xfer += $output->writeI32($this->client_protocol);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->username !== null) {
            $xfer += $output->writeFieldBegin('username', TType::STRING, 2);
            $xfer += $output->writeString($this->username);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->password !== null) {
            $xfer += $output->writeFieldBegin('password', TType::STRING, 3);
            $xfer += $output->writeString($this->password);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->configuration !== null) {
            if (!is_array($this->configuration)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('configuration', TType::MAP, 4);
            $output->writeMapBegin(TType::STRING, TType::STRING, count($this->configuration));
            foreach ($this->configuration as $kiter132 => $viter133) {
                $xfer += $output->writeString($kiter132);
                $xfer += $output->writeString($viter133);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}

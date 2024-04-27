/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.rpc.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.hive.common.classification.InterfaceAudience.Public @org.apache.hadoop.hive.common.classification.InterfaceStability.Stable public class TGetInfoReq implements org.apache.thrift.TBase<TGetInfoReq, TGetInfoReq._Fields>, java.io.Serializable, Cloneable, Comparable<TGetInfoReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetInfoReq");

  private static final org.apache.thrift.protocol.TField SESSION_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionHandle", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField INFO_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("infoType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetInfoReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetInfoReqTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable TSessionHandle sessionHandle; // required
  private @org.apache.thrift.annotation.Nullable TGetInfoType infoType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SESSION_HANDLE((short)1, "sessionHandle"),
    /**
     * 
     * @see TGetInfoType
     */
    INFO_TYPE((short)2, "infoType");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SESSION_HANDLE
          return SESSION_HANDLE;
        case 2: // INFO_TYPE
          return INFO_TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SESSION_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("sessionHandle", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSessionHandle.class)));
    tmpMap.put(_Fields.INFO_TYPE, new org.apache.thrift.meta_data.FieldMetaData("infoType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TGetInfoType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetInfoReq.class, metaDataMap);
  }

  public TGetInfoReq() {
  }

  public TGetInfoReq(
    TSessionHandle sessionHandle,
    TGetInfoType infoType)
  {
    this();
    this.sessionHandle = sessionHandle;
    this.infoType = infoType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetInfoReq(TGetInfoReq other) {
    if (other.isSetSessionHandle()) {
      this.sessionHandle = new TSessionHandle(other.sessionHandle);
    }
    if (other.isSetInfoType()) {
      this.infoType = other.infoType;
    }
  }

  public TGetInfoReq deepCopy() {
    return new TGetInfoReq(this);
  }

  @Override
  public void clear() {
    this.sessionHandle = null;
    this.infoType = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TSessionHandle getSessionHandle() {
    return this.sessionHandle;
  }

  public void setSessionHandle(@org.apache.thrift.annotation.Nullable TSessionHandle sessionHandle) {
    this.sessionHandle = sessionHandle;
  }

  public void unsetSessionHandle() {
    this.sessionHandle = null;
  }

  /** Returns true if field sessionHandle is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionHandle() {
    return this.sessionHandle != null;
  }

  public void setSessionHandleIsSet(boolean value) {
    if (!value) {
      this.sessionHandle = null;
    }
  }

  /**
   * 
   * @see TGetInfoType
   */
  @org.apache.thrift.annotation.Nullable
  public TGetInfoType getInfoType() {
    return this.infoType;
  }

  /**
   * 
   * @see TGetInfoType
   */
  public void setInfoType(@org.apache.thrift.annotation.Nullable TGetInfoType infoType) {
    this.infoType = infoType;
  }

  public void unsetInfoType() {
    this.infoType = null;
  }

  /** Returns true if field infoType is set (has been assigned a value) and false otherwise */
  public boolean isSetInfoType() {
    return this.infoType != null;
  }

  public void setInfoTypeIsSet(boolean value) {
    if (!value) {
      this.infoType = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SESSION_HANDLE:
      if (value == null) {
        unsetSessionHandle();
      } else {
        setSessionHandle((TSessionHandle)value);
      }
      break;

    case INFO_TYPE:
      if (value == null) {
        unsetInfoType();
      } else {
        setInfoType((TGetInfoType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SESSION_HANDLE:
      return getSessionHandle();

    case INFO_TYPE:
      return getInfoType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SESSION_HANDLE:
      return isSetSessionHandle();
    case INFO_TYPE:
      return isSetInfoType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TGetInfoReq)
      return this.equals((TGetInfoReq)that);
    return false;
  }

  public boolean equals(TGetInfoReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sessionHandle = true && this.isSetSessionHandle();
    boolean that_present_sessionHandle = true && that.isSetSessionHandle();
    if (this_present_sessionHandle || that_present_sessionHandle) {
      if (!(this_present_sessionHandle && that_present_sessionHandle))
        return false;
      if (!this.sessionHandle.equals(that.sessionHandle))
        return false;
    }

    boolean this_present_infoType = true && this.isSetInfoType();
    boolean that_present_infoType = true && that.isSetInfoType();
    if (this_present_infoType || that_present_infoType) {
      if (!(this_present_infoType && that_present_infoType))
        return false;
      if (!this.infoType.equals(that.infoType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSessionHandle()) ? 131071 : 524287);
    if (isSetSessionHandle())
      hashCode = hashCode * 8191 + sessionHandle.hashCode();

    hashCode = hashCode * 8191 + ((isSetInfoType()) ? 131071 : 524287);
    if (isSetInfoType())
      hashCode = hashCode * 8191 + infoType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TGetInfoReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSessionHandle(), other.isSetSessionHandle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionHandle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionHandle, other.sessionHandle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetInfoType(), other.isSetInfoType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInfoType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.infoType, other.infoType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetInfoReq(");
    boolean first = true;

    sb.append("sessionHandle:");
    if (this.sessionHandle == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionHandle);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("infoType:");
    if (this.infoType == null) {
      sb.append("null");
    } else {
      sb.append(this.infoType);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetSessionHandle()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'sessionHandle' is unset! Struct:" + toString());
    }

    if (!isSetInfoType()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'infoType' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (sessionHandle != null) {
      sessionHandle.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TGetInfoReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetInfoReqStandardScheme getScheme() {
      return new TGetInfoReqStandardScheme();
    }
  }

  private static class TGetInfoReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetInfoReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetInfoReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SESSION_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sessionHandle = new TSessionHandle();
              struct.sessionHandle.read(iprot);
              struct.setSessionHandleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INFO_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.infoType = org.apache.hive.service.rpc.thrift.TGetInfoType.findByValue(iprot.readI32());
              struct.setInfoTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetInfoReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sessionHandle != null) {
        oprot.writeFieldBegin(SESSION_HANDLE_FIELD_DESC);
        struct.sessionHandle.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.infoType != null) {
        oprot.writeFieldBegin(INFO_TYPE_FIELD_DESC);
        oprot.writeI32(struct.infoType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetInfoReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetInfoReqTupleScheme getScheme() {
      return new TGetInfoReqTupleScheme();
    }
  }

  private static class TGetInfoReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetInfoReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetInfoReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sessionHandle.write(oprot);
      oprot.writeI32(struct.infoType.getValue());
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetInfoReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sessionHandle = new TSessionHandle();
      struct.sessionHandle.read(iprot);
      struct.setSessionHandleIsSet(true);
      struct.infoType = org.apache.hive.service.rpc.thrift.TGetInfoType.findByValue(iprot.readI32());
      struct.setInfoTypeIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


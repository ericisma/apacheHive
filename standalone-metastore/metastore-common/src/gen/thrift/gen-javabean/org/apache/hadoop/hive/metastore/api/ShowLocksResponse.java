/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class ShowLocksResponse implements org.apache.thrift.TBase<ShowLocksResponse, ShowLocksResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ShowLocksResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ShowLocksResponse");

  private static final org.apache.thrift.protocol.TField LOCKS_FIELD_DESC = new org.apache.thrift.protocol.TField("locks", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ShowLocksResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ShowLocksResponseTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<ShowLocksResponseElement> locks; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOCKS((short)1, "locks");

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
        case 1: // LOCKS
          return LOCKS;
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
    tmpMap.put(_Fields.LOCKS, new org.apache.thrift.meta_data.FieldMetaData("locks", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ShowLocksResponseElement.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ShowLocksResponse.class, metaDataMap);
  }

  public ShowLocksResponse() {
  }

  public ShowLocksResponse(
    java.util.List<ShowLocksResponseElement> locks)
  {
    this();
    this.locks = locks;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ShowLocksResponse(ShowLocksResponse other) {
    if (other.isSetLocks()) {
      java.util.List<ShowLocksResponseElement> __this__locks = new java.util.ArrayList<ShowLocksResponseElement>(other.locks.size());
      for (ShowLocksResponseElement other_element : other.locks) {
        __this__locks.add(new ShowLocksResponseElement(other_element));
      }
      this.locks = __this__locks;
    }
  }

  public ShowLocksResponse deepCopy() {
    return new ShowLocksResponse(this);
  }

  @Override
  public void clear() {
    this.locks = null;
  }

  public int getLocksSize() {
    return (this.locks == null) ? 0 : this.locks.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<ShowLocksResponseElement> getLocksIterator() {
    return (this.locks == null) ? null : this.locks.iterator();
  }

  public void addToLocks(ShowLocksResponseElement elem) {
    if (this.locks == null) {
      this.locks = new java.util.ArrayList<ShowLocksResponseElement>();
    }
    this.locks.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<ShowLocksResponseElement> getLocks() {
    return this.locks;
  }

  public void setLocks(@org.apache.thrift.annotation.Nullable java.util.List<ShowLocksResponseElement> locks) {
    this.locks = locks;
  }

  public void unsetLocks() {
    this.locks = null;
  }

  /** Returns true if field locks is set (has been assigned a value) and false otherwise */
  public boolean isSetLocks() {
    return this.locks != null;
  }

  public void setLocksIsSet(boolean value) {
    if (!value) {
      this.locks = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case LOCKS:
      if (value == null) {
        unsetLocks();
      } else {
        setLocks((java.util.List<ShowLocksResponseElement>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LOCKS:
      return getLocks();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LOCKS:
      return isSetLocks();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ShowLocksResponse)
      return this.equals((ShowLocksResponse)that);
    return false;
  }

  public boolean equals(ShowLocksResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_locks = true && this.isSetLocks();
    boolean that_present_locks = true && that.isSetLocks();
    if (this_present_locks || that_present_locks) {
      if (!(this_present_locks && that_present_locks))
        return false;
      if (!this.locks.equals(that.locks))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetLocks()) ? 131071 : 524287);
    if (isSetLocks())
      hashCode = hashCode * 8191 + locks.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ShowLocksResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetLocks(), other.isSetLocks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locks, other.locks);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowLocksResponse(");
    boolean first = true;

    sb.append("locks:");
    if (this.locks == null) {
      sb.append("null");
    } else {
      sb.append(this.locks);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class ShowLocksResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ShowLocksResponseStandardScheme getScheme() {
      return new ShowLocksResponseStandardScheme();
    }
  }

  private static class ShowLocksResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<ShowLocksResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ShowLocksResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOCKS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list884 = iprot.readListBegin();
                struct.locks = new java.util.ArrayList<ShowLocksResponseElement>(_list884.size);
                @org.apache.thrift.annotation.Nullable ShowLocksResponseElement _elem885;
                for (int _i886 = 0; _i886 < _list884.size; ++_i886)
                {
                  _elem885 = new ShowLocksResponseElement();
                  _elem885.read(iprot);
                  struct.locks.add(_elem885);
                }
                iprot.readListEnd();
              }
              struct.setLocksIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ShowLocksResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.locks != null) {
        oprot.writeFieldBegin(LOCKS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.locks.size()));
          for (ShowLocksResponseElement _iter887 : struct.locks)
          {
            _iter887.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ShowLocksResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ShowLocksResponseTupleScheme getScheme() {
      return new ShowLocksResponseTupleScheme();
    }
  }

  private static class ShowLocksResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<ShowLocksResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ShowLocksResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLocks()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLocks()) {
        {
          oprot.writeI32(struct.locks.size());
          for (ShowLocksResponseElement _iter888 : struct.locks)
          {
            _iter888.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ShowLocksResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list889 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.locks = new java.util.ArrayList<ShowLocksResponseElement>(_list889.size);
          @org.apache.thrift.annotation.Nullable ShowLocksResponseElement _elem890;
          for (int _i891 = 0; _i891 < _list889.size; ++_i891)
          {
            _elem890 = new ShowLocksResponseElement();
            _elem890.read(iprot);
            struct.locks.add(_elem890);
          }
        }
        struct.setLocksIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class AddPartitionsResult implements org.apache.thrift.TBase<AddPartitionsResult, AddPartitionsResult._Fields>, java.io.Serializable, Cloneable, Comparable<AddPartitionsResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AddPartitionsResult");

  private static final org.apache.thrift.protocol.TField PARTITIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("partitions", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField IS_STATS_COMPLIANT_FIELD_DESC = new org.apache.thrift.protocol.TField("isStatsCompliant", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField PARTITION_COL_SCHEMA_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionColSchema", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AddPartitionsResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AddPartitionsResultTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<Partition> partitions; // optional
  private boolean isStatsCompliant; // optional
  private @org.apache.thrift.annotation.Nullable java.util.List<FieldSchema> partitionColSchema; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITIONS((short)1, "partitions"),
    IS_STATS_COMPLIANT((short)2, "isStatsCompliant"),
    PARTITION_COL_SCHEMA((short)3, "partitionColSchema");

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
        case 1: // PARTITIONS
          return PARTITIONS;
        case 2: // IS_STATS_COMPLIANT
          return IS_STATS_COMPLIANT;
        case 3: // PARTITION_COL_SCHEMA
          return PARTITION_COL_SCHEMA;
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
  private static final int __ISSTATSCOMPLIANT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PARTITIONS,_Fields.IS_STATS_COMPLIANT,_Fields.PARTITION_COL_SCHEMA};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITIONS, new org.apache.thrift.meta_data.FieldMetaData("partitions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Partition.class))));
    tmpMap.put(_Fields.IS_STATS_COMPLIANT, new org.apache.thrift.meta_data.FieldMetaData("isStatsCompliant", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PARTITION_COL_SCHEMA, new org.apache.thrift.meta_data.FieldMetaData("partitionColSchema", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FieldSchema.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AddPartitionsResult.class, metaDataMap);
  }

  public AddPartitionsResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddPartitionsResult(AddPartitionsResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPartitions()) {
      java.util.List<Partition> __this__partitions = new java.util.ArrayList<Partition>(other.partitions.size());
      for (Partition other_element : other.partitions) {
        __this__partitions.add(new Partition(other_element));
      }
      this.partitions = __this__partitions;
    }
    this.isStatsCompliant = other.isStatsCompliant;
    if (other.isSetPartitionColSchema()) {
      java.util.List<FieldSchema> __this__partitionColSchema = new java.util.ArrayList<FieldSchema>(other.partitionColSchema.size());
      for (FieldSchema other_element : other.partitionColSchema) {
        __this__partitionColSchema.add(new FieldSchema(other_element));
      }
      this.partitionColSchema = __this__partitionColSchema;
    }
  }

  public AddPartitionsResult deepCopy() {
    return new AddPartitionsResult(this);
  }

  @Override
  public void clear() {
    this.partitions = null;
    setIsStatsCompliantIsSet(false);
    this.isStatsCompliant = false;
    this.partitionColSchema = null;
  }

  public int getPartitionsSize() {
    return (this.partitions == null) ? 0 : this.partitions.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<Partition> getPartitionsIterator() {
    return (this.partitions == null) ? null : this.partitions.iterator();
  }

  public void addToPartitions(Partition elem) {
    if (this.partitions == null) {
      this.partitions = new java.util.ArrayList<Partition>();
    }
    this.partitions.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<Partition> getPartitions() {
    return this.partitions;
  }

  public void setPartitions(@org.apache.thrift.annotation.Nullable java.util.List<Partition> partitions) {
    this.partitions = partitions;
  }

  public void unsetPartitions() {
    this.partitions = null;
  }

  /** Returns true if field partitions is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitions() {
    return this.partitions != null;
  }

  public void setPartitionsIsSet(boolean value) {
    if (!value) {
      this.partitions = null;
    }
  }

  public boolean isIsStatsCompliant() {
    return this.isStatsCompliant;
  }

  public void setIsStatsCompliant(boolean isStatsCompliant) {
    this.isStatsCompliant = isStatsCompliant;
    setIsStatsCompliantIsSet(true);
  }

  public void unsetIsStatsCompliant() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISSTATSCOMPLIANT_ISSET_ID);
  }

  /** Returns true if field isStatsCompliant is set (has been assigned a value) and false otherwise */
  public boolean isSetIsStatsCompliant() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISSTATSCOMPLIANT_ISSET_ID);
  }

  public void setIsStatsCompliantIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISSTATSCOMPLIANT_ISSET_ID, value);
  }

  public int getPartitionColSchemaSize() {
    return (this.partitionColSchema == null) ? 0 : this.partitionColSchema.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<FieldSchema> getPartitionColSchemaIterator() {
    return (this.partitionColSchema == null) ? null : this.partitionColSchema.iterator();
  }

  public void addToPartitionColSchema(FieldSchema elem) {
    if (this.partitionColSchema == null) {
      this.partitionColSchema = new java.util.ArrayList<FieldSchema>();
    }
    this.partitionColSchema.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<FieldSchema> getPartitionColSchema() {
    return this.partitionColSchema;
  }

  public void setPartitionColSchema(@org.apache.thrift.annotation.Nullable java.util.List<FieldSchema> partitionColSchema) {
    this.partitionColSchema = partitionColSchema;
  }

  public void unsetPartitionColSchema() {
    this.partitionColSchema = null;
  }

  /** Returns true if field partitionColSchema is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionColSchema() {
    return this.partitionColSchema != null;
  }

  public void setPartitionColSchemaIsSet(boolean value) {
    if (!value) {
      this.partitionColSchema = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PARTITIONS:
      if (value == null) {
        unsetPartitions();
      } else {
        setPartitions((java.util.List<Partition>)value);
      }
      break;

    case IS_STATS_COMPLIANT:
      if (value == null) {
        unsetIsStatsCompliant();
      } else {
        setIsStatsCompliant((java.lang.Boolean)value);
      }
      break;

    case PARTITION_COL_SCHEMA:
      if (value == null) {
        unsetPartitionColSchema();
      } else {
        setPartitionColSchema((java.util.List<FieldSchema>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITIONS:
      return getPartitions();

    case IS_STATS_COMPLIANT:
      return isIsStatsCompliant();

    case PARTITION_COL_SCHEMA:
      return getPartitionColSchema();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PARTITIONS:
      return isSetPartitions();
    case IS_STATS_COMPLIANT:
      return isSetIsStatsCompliant();
    case PARTITION_COL_SCHEMA:
      return isSetPartitionColSchema();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof AddPartitionsResult)
      return this.equals((AddPartitionsResult)that);
    return false;
  }

  public boolean equals(AddPartitionsResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_partitions = true && this.isSetPartitions();
    boolean that_present_partitions = true && that.isSetPartitions();
    if (this_present_partitions || that_present_partitions) {
      if (!(this_present_partitions && that_present_partitions))
        return false;
      if (!this.partitions.equals(that.partitions))
        return false;
    }

    boolean this_present_isStatsCompliant = true && this.isSetIsStatsCompliant();
    boolean that_present_isStatsCompliant = true && that.isSetIsStatsCompliant();
    if (this_present_isStatsCompliant || that_present_isStatsCompliant) {
      if (!(this_present_isStatsCompliant && that_present_isStatsCompliant))
        return false;
      if (this.isStatsCompliant != that.isStatsCompliant)
        return false;
    }

    boolean this_present_partitionColSchema = true && this.isSetPartitionColSchema();
    boolean that_present_partitionColSchema = true && that.isSetPartitionColSchema();
    if (this_present_partitionColSchema || that_present_partitionColSchema) {
      if (!(this_present_partitionColSchema && that_present_partitionColSchema))
        return false;
      if (!this.partitionColSchema.equals(that.partitionColSchema))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPartitions()) ? 131071 : 524287);
    if (isSetPartitions())
      hashCode = hashCode * 8191 + partitions.hashCode();

    hashCode = hashCode * 8191 + ((isSetIsStatsCompliant()) ? 131071 : 524287);
    if (isSetIsStatsCompliant())
      hashCode = hashCode * 8191 + ((isStatsCompliant) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetPartitionColSchema()) ? 131071 : 524287);
    if (isSetPartitionColSchema())
      hashCode = hashCode * 8191 + partitionColSchema.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(AddPartitionsResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPartitions(), other.isSetPartitions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitions, other.partitions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsStatsCompliant(), other.isSetIsStatsCompliant());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsStatsCompliant()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isStatsCompliant, other.isStatsCompliant);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartitionColSchema(), other.isSetPartitionColSchema());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionColSchema()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionColSchema, other.partitionColSchema);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AddPartitionsResult(");
    boolean first = true;

    if (isSetPartitions()) {
      sb.append("partitions:");
      if (this.partitions == null) {
        sb.append("null");
      } else {
        sb.append(this.partitions);
      }
      first = false;
    }
    if (isSetIsStatsCompliant()) {
      if (!first) sb.append(", ");
      sb.append("isStatsCompliant:");
      sb.append(this.isStatsCompliant);
      first = false;
    }
    if (isSetPartitionColSchema()) {
      if (!first) sb.append(", ");
      sb.append("partitionColSchema:");
      if (this.partitionColSchema == null) {
        sb.append("null");
      } else {
        sb.append(this.partitionColSchema);
      }
      first = false;
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AddPartitionsResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AddPartitionsResultStandardScheme getScheme() {
      return new AddPartitionsResultStandardScheme();
    }
  }

  private static class AddPartitionsResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<AddPartitionsResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AddPartitionsResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list634 = iprot.readListBegin();
                struct.partitions = new java.util.ArrayList<Partition>(_list634.size);
                @org.apache.thrift.annotation.Nullable Partition _elem635;
                for (int _i636 = 0; _i636 < _list634.size; ++_i636)
                {
                  _elem635 = new Partition();
                  _elem635.read(iprot);
                  struct.partitions.add(_elem635);
                }
                iprot.readListEnd();
              }
              struct.setPartitionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_STATS_COMPLIANT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isStatsCompliant = iprot.readBool();
              struct.setIsStatsCompliantIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARTITION_COL_SCHEMA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list637 = iprot.readListBegin();
                struct.partitionColSchema = new java.util.ArrayList<FieldSchema>(_list637.size);
                @org.apache.thrift.annotation.Nullable FieldSchema _elem638;
                for (int _i639 = 0; _i639 < _list637.size; ++_i639)
                {
                  _elem638 = new FieldSchema();
                  _elem638.read(iprot);
                  struct.partitionColSchema.add(_elem638);
                }
                iprot.readListEnd();
              }
              struct.setPartitionColSchemaIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AddPartitionsResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partitions != null) {
        if (struct.isSetPartitions()) {
          oprot.writeFieldBegin(PARTITIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partitions.size()));
            for (Partition _iter640 : struct.partitions)
            {
              _iter640.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIsStatsCompliant()) {
        oprot.writeFieldBegin(IS_STATS_COMPLIANT_FIELD_DESC);
        oprot.writeBool(struct.isStatsCompliant);
        oprot.writeFieldEnd();
      }
      if (struct.partitionColSchema != null) {
        if (struct.isSetPartitionColSchema()) {
          oprot.writeFieldBegin(PARTITION_COL_SCHEMA_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partitionColSchema.size()));
            for (FieldSchema _iter641 : struct.partitionColSchema)
            {
              _iter641.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddPartitionsResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AddPartitionsResultTupleScheme getScheme() {
      return new AddPartitionsResultTupleScheme();
    }
  }

  private static class AddPartitionsResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<AddPartitionsResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AddPartitionsResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPartitions()) {
        optionals.set(0);
      }
      if (struct.isSetIsStatsCompliant()) {
        optionals.set(1);
      }
      if (struct.isSetPartitionColSchema()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPartitions()) {
        {
          oprot.writeI32(struct.partitions.size());
          for (Partition _iter642 : struct.partitions)
          {
            _iter642.write(oprot);
          }
        }
      }
      if (struct.isSetIsStatsCompliant()) {
        oprot.writeBool(struct.isStatsCompliant);
      }
      if (struct.isSetPartitionColSchema()) {
        {
          oprot.writeI32(struct.partitionColSchema.size());
          for (FieldSchema _iter643 : struct.partitionColSchema)
          {
            _iter643.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AddPartitionsResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list644 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.partitions = new java.util.ArrayList<Partition>(_list644.size);
          @org.apache.thrift.annotation.Nullable Partition _elem645;
          for (int _i646 = 0; _i646 < _list644.size; ++_i646)
          {
            _elem645 = new Partition();
            _elem645.read(iprot);
            struct.partitions.add(_elem645);
          }
        }
        struct.setPartitionsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.isStatsCompliant = iprot.readBool();
        struct.setIsStatsCompliantIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list647 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.partitionColSchema = new java.util.ArrayList<FieldSchema>(_list647.size);
          @org.apache.thrift.annotation.Nullable FieldSchema _elem648;
          for (int _i649 = 0; _i649 < _list647.size; ++_i649)
          {
            _elem648 = new FieldSchema();
            _elem648.read(iprot);
            struct.partitionColSchema.add(_elem648);
          }
        }
        struct.setPartitionColSchemaIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


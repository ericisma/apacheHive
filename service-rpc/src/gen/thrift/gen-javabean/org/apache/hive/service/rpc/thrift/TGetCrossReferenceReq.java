/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.rpc.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.hive.common.classification.InterfaceAudience.Public @org.apache.hadoop.hive.common.classification.InterfaceStability.Stable public class TGetCrossReferenceReq implements org.apache.thrift.TBase<TGetCrossReferenceReq, TGetCrossReferenceReq._Fields>, java.io.Serializable, Cloneable, Comparable<TGetCrossReferenceReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetCrossReferenceReq");

  private static final org.apache.thrift.protocol.TField SESSION_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionHandle", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PARENT_CATALOG_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("parentCatalogName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PARENT_SCHEMA_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("parentSchemaName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PARENT_TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("parentTableName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField FOREIGN_CATALOG_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("foreignCatalogName", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField FOREIGN_SCHEMA_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("foreignSchemaName", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField FOREIGN_TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("foreignTableName", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetCrossReferenceReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetCrossReferenceReqTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable TSessionHandle sessionHandle; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String parentCatalogName; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String parentSchemaName; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String parentTableName; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String foreignCatalogName; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String foreignSchemaName; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String foreignTableName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SESSION_HANDLE((short)1, "sessionHandle"),
    PARENT_CATALOG_NAME((short)2, "parentCatalogName"),
    PARENT_SCHEMA_NAME((short)3, "parentSchemaName"),
    PARENT_TABLE_NAME((short)4, "parentTableName"),
    FOREIGN_CATALOG_NAME((short)5, "foreignCatalogName"),
    FOREIGN_SCHEMA_NAME((short)6, "foreignSchemaName"),
    FOREIGN_TABLE_NAME((short)7, "foreignTableName");

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
        case 2: // PARENT_CATALOG_NAME
          return PARENT_CATALOG_NAME;
        case 3: // PARENT_SCHEMA_NAME
          return PARENT_SCHEMA_NAME;
        case 4: // PARENT_TABLE_NAME
          return PARENT_TABLE_NAME;
        case 5: // FOREIGN_CATALOG_NAME
          return FOREIGN_CATALOG_NAME;
        case 6: // FOREIGN_SCHEMA_NAME
          return FOREIGN_SCHEMA_NAME;
        case 7: // FOREIGN_TABLE_NAME
          return FOREIGN_TABLE_NAME;
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
  private static final _Fields optionals[] = {_Fields.PARENT_CATALOG_NAME,_Fields.PARENT_SCHEMA_NAME,_Fields.PARENT_TABLE_NAME,_Fields.FOREIGN_CATALOG_NAME,_Fields.FOREIGN_SCHEMA_NAME,_Fields.FOREIGN_TABLE_NAME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SESSION_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("sessionHandle", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSessionHandle.class)));
    tmpMap.put(_Fields.PARENT_CATALOG_NAME, new org.apache.thrift.meta_data.FieldMetaData("parentCatalogName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TIdentifier")));
    tmpMap.put(_Fields.PARENT_SCHEMA_NAME, new org.apache.thrift.meta_data.FieldMetaData("parentSchemaName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TIdentifier")));
    tmpMap.put(_Fields.PARENT_TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("parentTableName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TIdentifier")));
    tmpMap.put(_Fields.FOREIGN_CATALOG_NAME, new org.apache.thrift.meta_data.FieldMetaData("foreignCatalogName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TIdentifier")));
    tmpMap.put(_Fields.FOREIGN_SCHEMA_NAME, new org.apache.thrift.meta_data.FieldMetaData("foreignSchemaName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TIdentifier")));
    tmpMap.put(_Fields.FOREIGN_TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("foreignTableName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TIdentifier")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetCrossReferenceReq.class, metaDataMap);
  }

  public TGetCrossReferenceReq() {
  }

  public TGetCrossReferenceReq(
    TSessionHandle sessionHandle)
  {
    this();
    this.sessionHandle = sessionHandle;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetCrossReferenceReq(TGetCrossReferenceReq other) {
    if (other.isSetSessionHandle()) {
      this.sessionHandle = new TSessionHandle(other.sessionHandle);
    }
    if (other.isSetParentCatalogName()) {
      this.parentCatalogName = other.parentCatalogName;
    }
    if (other.isSetParentSchemaName()) {
      this.parentSchemaName = other.parentSchemaName;
    }
    if (other.isSetParentTableName()) {
      this.parentTableName = other.parentTableName;
    }
    if (other.isSetForeignCatalogName()) {
      this.foreignCatalogName = other.foreignCatalogName;
    }
    if (other.isSetForeignSchemaName()) {
      this.foreignSchemaName = other.foreignSchemaName;
    }
    if (other.isSetForeignTableName()) {
      this.foreignTableName = other.foreignTableName;
    }
  }

  public TGetCrossReferenceReq deepCopy() {
    return new TGetCrossReferenceReq(this);
  }

  @Override
  public void clear() {
    this.sessionHandle = null;
    this.parentCatalogName = null;
    this.parentSchemaName = null;
    this.parentTableName = null;
    this.foreignCatalogName = null;
    this.foreignSchemaName = null;
    this.foreignTableName = null;
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

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getParentCatalogName() {
    return this.parentCatalogName;
  }

  public void setParentCatalogName(@org.apache.thrift.annotation.Nullable java.lang.String parentCatalogName) {
    this.parentCatalogName = parentCatalogName;
  }

  public void unsetParentCatalogName() {
    this.parentCatalogName = null;
  }

  /** Returns true if field parentCatalogName is set (has been assigned a value) and false otherwise */
  public boolean isSetParentCatalogName() {
    return this.parentCatalogName != null;
  }

  public void setParentCatalogNameIsSet(boolean value) {
    if (!value) {
      this.parentCatalogName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getParentSchemaName() {
    return this.parentSchemaName;
  }

  public void setParentSchemaName(@org.apache.thrift.annotation.Nullable java.lang.String parentSchemaName) {
    this.parentSchemaName = parentSchemaName;
  }

  public void unsetParentSchemaName() {
    this.parentSchemaName = null;
  }

  /** Returns true if field parentSchemaName is set (has been assigned a value) and false otherwise */
  public boolean isSetParentSchemaName() {
    return this.parentSchemaName != null;
  }

  public void setParentSchemaNameIsSet(boolean value) {
    if (!value) {
      this.parentSchemaName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getParentTableName() {
    return this.parentTableName;
  }

  public void setParentTableName(@org.apache.thrift.annotation.Nullable java.lang.String parentTableName) {
    this.parentTableName = parentTableName;
  }

  public void unsetParentTableName() {
    this.parentTableName = null;
  }

  /** Returns true if field parentTableName is set (has been assigned a value) and false otherwise */
  public boolean isSetParentTableName() {
    return this.parentTableName != null;
  }

  public void setParentTableNameIsSet(boolean value) {
    if (!value) {
      this.parentTableName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getForeignCatalogName() {
    return this.foreignCatalogName;
  }

  public void setForeignCatalogName(@org.apache.thrift.annotation.Nullable java.lang.String foreignCatalogName) {
    this.foreignCatalogName = foreignCatalogName;
  }

  public void unsetForeignCatalogName() {
    this.foreignCatalogName = null;
  }

  /** Returns true if field foreignCatalogName is set (has been assigned a value) and false otherwise */
  public boolean isSetForeignCatalogName() {
    return this.foreignCatalogName != null;
  }

  public void setForeignCatalogNameIsSet(boolean value) {
    if (!value) {
      this.foreignCatalogName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getForeignSchemaName() {
    return this.foreignSchemaName;
  }

  public void setForeignSchemaName(@org.apache.thrift.annotation.Nullable java.lang.String foreignSchemaName) {
    this.foreignSchemaName = foreignSchemaName;
  }

  public void unsetForeignSchemaName() {
    this.foreignSchemaName = null;
  }

  /** Returns true if field foreignSchemaName is set (has been assigned a value) and false otherwise */
  public boolean isSetForeignSchemaName() {
    return this.foreignSchemaName != null;
  }

  public void setForeignSchemaNameIsSet(boolean value) {
    if (!value) {
      this.foreignSchemaName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getForeignTableName() {
    return this.foreignTableName;
  }

  public void setForeignTableName(@org.apache.thrift.annotation.Nullable java.lang.String foreignTableName) {
    this.foreignTableName = foreignTableName;
  }

  public void unsetForeignTableName() {
    this.foreignTableName = null;
  }

  /** Returns true if field foreignTableName is set (has been assigned a value) and false otherwise */
  public boolean isSetForeignTableName() {
    return this.foreignTableName != null;
  }

  public void setForeignTableNameIsSet(boolean value) {
    if (!value) {
      this.foreignTableName = null;
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

    case PARENT_CATALOG_NAME:
      if (value == null) {
        unsetParentCatalogName();
      } else {
        setParentCatalogName((java.lang.String)value);
      }
      break;

    case PARENT_SCHEMA_NAME:
      if (value == null) {
        unsetParentSchemaName();
      } else {
        setParentSchemaName((java.lang.String)value);
      }
      break;

    case PARENT_TABLE_NAME:
      if (value == null) {
        unsetParentTableName();
      } else {
        setParentTableName((java.lang.String)value);
      }
      break;

    case FOREIGN_CATALOG_NAME:
      if (value == null) {
        unsetForeignCatalogName();
      } else {
        setForeignCatalogName((java.lang.String)value);
      }
      break;

    case FOREIGN_SCHEMA_NAME:
      if (value == null) {
        unsetForeignSchemaName();
      } else {
        setForeignSchemaName((java.lang.String)value);
      }
      break;

    case FOREIGN_TABLE_NAME:
      if (value == null) {
        unsetForeignTableName();
      } else {
        setForeignTableName((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SESSION_HANDLE:
      return getSessionHandle();

    case PARENT_CATALOG_NAME:
      return getParentCatalogName();

    case PARENT_SCHEMA_NAME:
      return getParentSchemaName();

    case PARENT_TABLE_NAME:
      return getParentTableName();

    case FOREIGN_CATALOG_NAME:
      return getForeignCatalogName();

    case FOREIGN_SCHEMA_NAME:
      return getForeignSchemaName();

    case FOREIGN_TABLE_NAME:
      return getForeignTableName();

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
    case PARENT_CATALOG_NAME:
      return isSetParentCatalogName();
    case PARENT_SCHEMA_NAME:
      return isSetParentSchemaName();
    case PARENT_TABLE_NAME:
      return isSetParentTableName();
    case FOREIGN_CATALOG_NAME:
      return isSetForeignCatalogName();
    case FOREIGN_SCHEMA_NAME:
      return isSetForeignSchemaName();
    case FOREIGN_TABLE_NAME:
      return isSetForeignTableName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TGetCrossReferenceReq)
      return this.equals((TGetCrossReferenceReq)that);
    return false;
  }

  public boolean equals(TGetCrossReferenceReq that) {
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

    boolean this_present_parentCatalogName = true && this.isSetParentCatalogName();
    boolean that_present_parentCatalogName = true && that.isSetParentCatalogName();
    if (this_present_parentCatalogName || that_present_parentCatalogName) {
      if (!(this_present_parentCatalogName && that_present_parentCatalogName))
        return false;
      if (!this.parentCatalogName.equals(that.parentCatalogName))
        return false;
    }

    boolean this_present_parentSchemaName = true && this.isSetParentSchemaName();
    boolean that_present_parentSchemaName = true && that.isSetParentSchemaName();
    if (this_present_parentSchemaName || that_present_parentSchemaName) {
      if (!(this_present_parentSchemaName && that_present_parentSchemaName))
        return false;
      if (!this.parentSchemaName.equals(that.parentSchemaName))
        return false;
    }

    boolean this_present_parentTableName = true && this.isSetParentTableName();
    boolean that_present_parentTableName = true && that.isSetParentTableName();
    if (this_present_parentTableName || that_present_parentTableName) {
      if (!(this_present_parentTableName && that_present_parentTableName))
        return false;
      if (!this.parentTableName.equals(that.parentTableName))
        return false;
    }

    boolean this_present_foreignCatalogName = true && this.isSetForeignCatalogName();
    boolean that_present_foreignCatalogName = true && that.isSetForeignCatalogName();
    if (this_present_foreignCatalogName || that_present_foreignCatalogName) {
      if (!(this_present_foreignCatalogName && that_present_foreignCatalogName))
        return false;
      if (!this.foreignCatalogName.equals(that.foreignCatalogName))
        return false;
    }

    boolean this_present_foreignSchemaName = true && this.isSetForeignSchemaName();
    boolean that_present_foreignSchemaName = true && that.isSetForeignSchemaName();
    if (this_present_foreignSchemaName || that_present_foreignSchemaName) {
      if (!(this_present_foreignSchemaName && that_present_foreignSchemaName))
        return false;
      if (!this.foreignSchemaName.equals(that.foreignSchemaName))
        return false;
    }

    boolean this_present_foreignTableName = true && this.isSetForeignTableName();
    boolean that_present_foreignTableName = true && that.isSetForeignTableName();
    if (this_present_foreignTableName || that_present_foreignTableName) {
      if (!(this_present_foreignTableName && that_present_foreignTableName))
        return false;
      if (!this.foreignTableName.equals(that.foreignTableName))
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

    hashCode = hashCode * 8191 + ((isSetParentCatalogName()) ? 131071 : 524287);
    if (isSetParentCatalogName())
      hashCode = hashCode * 8191 + parentCatalogName.hashCode();

    hashCode = hashCode * 8191 + ((isSetParentSchemaName()) ? 131071 : 524287);
    if (isSetParentSchemaName())
      hashCode = hashCode * 8191 + parentSchemaName.hashCode();

    hashCode = hashCode * 8191 + ((isSetParentTableName()) ? 131071 : 524287);
    if (isSetParentTableName())
      hashCode = hashCode * 8191 + parentTableName.hashCode();

    hashCode = hashCode * 8191 + ((isSetForeignCatalogName()) ? 131071 : 524287);
    if (isSetForeignCatalogName())
      hashCode = hashCode * 8191 + foreignCatalogName.hashCode();

    hashCode = hashCode * 8191 + ((isSetForeignSchemaName()) ? 131071 : 524287);
    if (isSetForeignSchemaName())
      hashCode = hashCode * 8191 + foreignSchemaName.hashCode();

    hashCode = hashCode * 8191 + ((isSetForeignTableName()) ? 131071 : 524287);
    if (isSetForeignTableName())
      hashCode = hashCode * 8191 + foreignTableName.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TGetCrossReferenceReq other) {
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
    lastComparison = java.lang.Boolean.compare(isSetParentCatalogName(), other.isSetParentCatalogName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParentCatalogName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parentCatalogName, other.parentCatalogName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetParentSchemaName(), other.isSetParentSchemaName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParentSchemaName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parentSchemaName, other.parentSchemaName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetParentTableName(), other.isSetParentTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParentTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parentTableName, other.parentTableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetForeignCatalogName(), other.isSetForeignCatalogName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetForeignCatalogName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.foreignCatalogName, other.foreignCatalogName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetForeignSchemaName(), other.isSetForeignSchemaName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetForeignSchemaName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.foreignSchemaName, other.foreignSchemaName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetForeignTableName(), other.isSetForeignTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetForeignTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.foreignTableName, other.foreignTableName);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetCrossReferenceReq(");
    boolean first = true;

    sb.append("sessionHandle:");
    if (this.sessionHandle == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionHandle);
    }
    first = false;
    if (isSetParentCatalogName()) {
      if (!first) sb.append(", ");
      sb.append("parentCatalogName:");
      if (this.parentCatalogName == null) {
        sb.append("null");
      } else {
        sb.append(this.parentCatalogName);
      }
      first = false;
    }
    if (isSetParentSchemaName()) {
      if (!first) sb.append(", ");
      sb.append("parentSchemaName:");
      if (this.parentSchemaName == null) {
        sb.append("null");
      } else {
        sb.append(this.parentSchemaName);
      }
      first = false;
    }
    if (isSetParentTableName()) {
      if (!first) sb.append(", ");
      sb.append("parentTableName:");
      if (this.parentTableName == null) {
        sb.append("null");
      } else {
        sb.append(this.parentTableName);
      }
      first = false;
    }
    if (isSetForeignCatalogName()) {
      if (!first) sb.append(", ");
      sb.append("foreignCatalogName:");
      if (this.foreignCatalogName == null) {
        sb.append("null");
      } else {
        sb.append(this.foreignCatalogName);
      }
      first = false;
    }
    if (isSetForeignSchemaName()) {
      if (!first) sb.append(", ");
      sb.append("foreignSchemaName:");
      if (this.foreignSchemaName == null) {
        sb.append("null");
      } else {
        sb.append(this.foreignSchemaName);
      }
      first = false;
    }
    if (isSetForeignTableName()) {
      if (!first) sb.append(", ");
      sb.append("foreignTableName:");
      if (this.foreignTableName == null) {
        sb.append("null");
      } else {
        sb.append(this.foreignTableName);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetSessionHandle()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'sessionHandle' is unset! Struct:" + toString());
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

  private static class TGetCrossReferenceReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetCrossReferenceReqStandardScheme getScheme() {
      return new TGetCrossReferenceReqStandardScheme();
    }
  }

  private static class TGetCrossReferenceReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetCrossReferenceReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetCrossReferenceReq struct) throws org.apache.thrift.TException {
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
          case 2: // PARENT_CATALOG_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.parentCatalogName = iprot.readString();
              struct.setParentCatalogNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARENT_SCHEMA_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.parentSchemaName = iprot.readString();
              struct.setParentSchemaNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PARENT_TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.parentTableName = iprot.readString();
              struct.setParentTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FOREIGN_CATALOG_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.foreignCatalogName = iprot.readString();
              struct.setForeignCatalogNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // FOREIGN_SCHEMA_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.foreignSchemaName = iprot.readString();
              struct.setForeignSchemaNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // FOREIGN_TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.foreignTableName = iprot.readString();
              struct.setForeignTableNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetCrossReferenceReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sessionHandle != null) {
        oprot.writeFieldBegin(SESSION_HANDLE_FIELD_DESC);
        struct.sessionHandle.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.parentCatalogName != null) {
        if (struct.isSetParentCatalogName()) {
          oprot.writeFieldBegin(PARENT_CATALOG_NAME_FIELD_DESC);
          oprot.writeString(struct.parentCatalogName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.parentSchemaName != null) {
        if (struct.isSetParentSchemaName()) {
          oprot.writeFieldBegin(PARENT_SCHEMA_NAME_FIELD_DESC);
          oprot.writeString(struct.parentSchemaName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.parentTableName != null) {
        if (struct.isSetParentTableName()) {
          oprot.writeFieldBegin(PARENT_TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.parentTableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.foreignCatalogName != null) {
        if (struct.isSetForeignCatalogName()) {
          oprot.writeFieldBegin(FOREIGN_CATALOG_NAME_FIELD_DESC);
          oprot.writeString(struct.foreignCatalogName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.foreignSchemaName != null) {
        if (struct.isSetForeignSchemaName()) {
          oprot.writeFieldBegin(FOREIGN_SCHEMA_NAME_FIELD_DESC);
          oprot.writeString(struct.foreignSchemaName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.foreignTableName != null) {
        if (struct.isSetForeignTableName()) {
          oprot.writeFieldBegin(FOREIGN_TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.foreignTableName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetCrossReferenceReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetCrossReferenceReqTupleScheme getScheme() {
      return new TGetCrossReferenceReqTupleScheme();
    }
  }

  private static class TGetCrossReferenceReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetCrossReferenceReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetCrossReferenceReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sessionHandle.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetParentCatalogName()) {
        optionals.set(0);
      }
      if (struct.isSetParentSchemaName()) {
        optionals.set(1);
      }
      if (struct.isSetParentTableName()) {
        optionals.set(2);
      }
      if (struct.isSetForeignCatalogName()) {
        optionals.set(3);
      }
      if (struct.isSetForeignSchemaName()) {
        optionals.set(4);
      }
      if (struct.isSetForeignTableName()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetParentCatalogName()) {
        oprot.writeString(struct.parentCatalogName);
      }
      if (struct.isSetParentSchemaName()) {
        oprot.writeString(struct.parentSchemaName);
      }
      if (struct.isSetParentTableName()) {
        oprot.writeString(struct.parentTableName);
      }
      if (struct.isSetForeignCatalogName()) {
        oprot.writeString(struct.foreignCatalogName);
      }
      if (struct.isSetForeignSchemaName()) {
        oprot.writeString(struct.foreignSchemaName);
      }
      if (struct.isSetForeignTableName()) {
        oprot.writeString(struct.foreignTableName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetCrossReferenceReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sessionHandle = new TSessionHandle();
      struct.sessionHandle.read(iprot);
      struct.setSessionHandleIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.parentCatalogName = iprot.readString();
        struct.setParentCatalogNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.parentSchemaName = iprot.readString();
        struct.setParentSchemaNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.parentTableName = iprot.readString();
        struct.setParentTableNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.foreignCatalogName = iprot.readString();
        struct.setForeignCatalogNameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.foreignSchemaName = iprot.readString();
        struct.setForeignSchemaNameIsSet(true);
      }
      if (incoming.get(5)) {
        struct.foreignTableName = iprot.readString();
        struct.setForeignTableNameIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

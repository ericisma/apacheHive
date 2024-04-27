/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.rpc.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.hive.common.classification.InterfaceAudience.Public @org.apache.hadoop.hive.common.classification.InterfaceStability.Stable public class TProgressUpdateResp implements org.apache.thrift.TBase<TProgressUpdateResp, TProgressUpdateResp._Fields>, java.io.Serializable, Cloneable, Comparable<TProgressUpdateResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TProgressUpdateResp");

  private static final org.apache.thrift.protocol.TField HEADER_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("headerNames", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("rows", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField PROGRESSED_PERCENTAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("progressedPercentage", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField FOOTER_SUMMARY_FIELD_DESC = new org.apache.thrift.protocol.TField("footerSummary", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("startTime", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TProgressUpdateRespStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TProgressUpdateRespTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> headerNames; // required
  private @org.apache.thrift.annotation.Nullable java.util.List<java.util.List<java.lang.String>> rows; // required
  private double progressedPercentage; // required
  private @org.apache.thrift.annotation.Nullable TJobExecutionStatus status; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String footerSummary; // required
  private long startTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER_NAMES((short)1, "headerNames"),
    ROWS((short)2, "rows"),
    PROGRESSED_PERCENTAGE((short)3, "progressedPercentage"),
    /**
     * 
     * @see TJobExecutionStatus
     */
    STATUS((short)4, "status"),
    FOOTER_SUMMARY((short)5, "footerSummary"),
    START_TIME((short)6, "startTime");

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
        case 1: // HEADER_NAMES
          return HEADER_NAMES;
        case 2: // ROWS
          return ROWS;
        case 3: // PROGRESSED_PERCENTAGE
          return PROGRESSED_PERCENTAGE;
        case 4: // STATUS
          return STATUS;
        case 5: // FOOTER_SUMMARY
          return FOOTER_SUMMARY;
        case 6: // START_TIME
          return START_TIME;
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
  private static final int __PROGRESSEDPERCENTAGE_ISSET_ID = 0;
  private static final int __STARTTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADER_NAMES, new org.apache.thrift.meta_data.FieldMetaData("headerNames", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ROWS, new org.apache.thrift.meta_data.FieldMetaData("rows", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
    tmpMap.put(_Fields.PROGRESSED_PERCENTAGE, new org.apache.thrift.meta_data.FieldMetaData("progressedPercentage", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TJobExecutionStatus.class)));
    tmpMap.put(_Fields.FOOTER_SUMMARY, new org.apache.thrift.meta_data.FieldMetaData("footerSummary", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.START_TIME, new org.apache.thrift.meta_data.FieldMetaData("startTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TProgressUpdateResp.class, metaDataMap);
  }

  public TProgressUpdateResp() {
  }

  public TProgressUpdateResp(
    java.util.List<java.lang.String> headerNames,
    java.util.List<java.util.List<java.lang.String>> rows,
    double progressedPercentage,
    TJobExecutionStatus status,
    java.lang.String footerSummary,
    long startTime)
  {
    this();
    this.headerNames = headerNames;
    this.rows = rows;
    this.progressedPercentage = progressedPercentage;
    setProgressedPercentageIsSet(true);
    this.status = status;
    this.footerSummary = footerSummary;
    this.startTime = startTime;
    setStartTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TProgressUpdateResp(TProgressUpdateResp other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHeaderNames()) {
      java.util.List<java.lang.String> __this__headerNames = new java.util.ArrayList<java.lang.String>(other.headerNames);
      this.headerNames = __this__headerNames;
    }
    if (other.isSetRows()) {
      java.util.List<java.util.List<java.lang.String>> __this__rows = new java.util.ArrayList<java.util.List<java.lang.String>>(other.rows.size());
      for (java.util.List<java.lang.String> other_element : other.rows) {
        java.util.List<java.lang.String> __this__rows_copy = new java.util.ArrayList<java.lang.String>(other_element);
        __this__rows.add(__this__rows_copy);
      }
      this.rows = __this__rows;
    }
    this.progressedPercentage = other.progressedPercentage;
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetFooterSummary()) {
      this.footerSummary = other.footerSummary;
    }
    this.startTime = other.startTime;
  }

  public TProgressUpdateResp deepCopy() {
    return new TProgressUpdateResp(this);
  }

  @Override
  public void clear() {
    this.headerNames = null;
    this.rows = null;
    setProgressedPercentageIsSet(false);
    this.progressedPercentage = 0.0;
    this.status = null;
    this.footerSummary = null;
    setStartTimeIsSet(false);
    this.startTime = 0;
  }

  public int getHeaderNamesSize() {
    return (this.headerNames == null) ? 0 : this.headerNames.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getHeaderNamesIterator() {
    return (this.headerNames == null) ? null : this.headerNames.iterator();
  }

  public void addToHeaderNames(java.lang.String elem) {
    if (this.headerNames == null) {
      this.headerNames = new java.util.ArrayList<java.lang.String>();
    }
    this.headerNames.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getHeaderNames() {
    return this.headerNames;
  }

  public void setHeaderNames(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> headerNames) {
    this.headerNames = headerNames;
  }

  public void unsetHeaderNames() {
    this.headerNames = null;
  }

  /** Returns true if field headerNames is set (has been assigned a value) and false otherwise */
  public boolean isSetHeaderNames() {
    return this.headerNames != null;
  }

  public void setHeaderNamesIsSet(boolean value) {
    if (!value) {
      this.headerNames = null;
    }
  }

  public int getRowsSize() {
    return (this.rows == null) ? 0 : this.rows.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.util.List<java.lang.String>> getRowsIterator() {
    return (this.rows == null) ? null : this.rows.iterator();
  }

  public void addToRows(java.util.List<java.lang.String> elem) {
    if (this.rows == null) {
      this.rows = new java.util.ArrayList<java.util.List<java.lang.String>>();
    }
    this.rows.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.util.List<java.lang.String>> getRows() {
    return this.rows;
  }

  public void setRows(@org.apache.thrift.annotation.Nullable java.util.List<java.util.List<java.lang.String>> rows) {
    this.rows = rows;
  }

  public void unsetRows() {
    this.rows = null;
  }

  /** Returns true if field rows is set (has been assigned a value) and false otherwise */
  public boolean isSetRows() {
    return this.rows != null;
  }

  public void setRowsIsSet(boolean value) {
    if (!value) {
      this.rows = null;
    }
  }

  public double getProgressedPercentage() {
    return this.progressedPercentage;
  }

  public void setProgressedPercentage(double progressedPercentage) {
    this.progressedPercentage = progressedPercentage;
    setProgressedPercentageIsSet(true);
  }

  public void unsetProgressedPercentage() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PROGRESSEDPERCENTAGE_ISSET_ID);
  }

  /** Returns true if field progressedPercentage is set (has been assigned a value) and false otherwise */
  public boolean isSetProgressedPercentage() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PROGRESSEDPERCENTAGE_ISSET_ID);
  }

  public void setProgressedPercentageIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PROGRESSEDPERCENTAGE_ISSET_ID, value);
  }

  /**
   * 
   * @see TJobExecutionStatus
   */
  @org.apache.thrift.annotation.Nullable
  public TJobExecutionStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see TJobExecutionStatus
   */
  public void setStatus(@org.apache.thrift.annotation.Nullable TJobExecutionStatus status) {
    this.status = status;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getFooterSummary() {
    return this.footerSummary;
  }

  public void setFooterSummary(@org.apache.thrift.annotation.Nullable java.lang.String footerSummary) {
    this.footerSummary = footerSummary;
  }

  public void unsetFooterSummary() {
    this.footerSummary = null;
  }

  /** Returns true if field footerSummary is set (has been assigned a value) and false otherwise */
  public boolean isSetFooterSummary() {
    return this.footerSummary != null;
  }

  public void setFooterSummaryIsSet(boolean value) {
    if (!value) {
      this.footerSummary = null;
    }
  }

  public long getStartTime() {
    return this.startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
  }

  public void unsetStartTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STARTTIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case HEADER_NAMES:
      if (value == null) {
        unsetHeaderNames();
      } else {
        setHeaderNames((java.util.List<java.lang.String>)value);
      }
      break;

    case ROWS:
      if (value == null) {
        unsetRows();
      } else {
        setRows((java.util.List<java.util.List<java.lang.String>>)value);
      }
      break;

    case PROGRESSED_PERCENTAGE:
      if (value == null) {
        unsetProgressedPercentage();
      } else {
        setProgressedPercentage((java.lang.Double)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((TJobExecutionStatus)value);
      }
      break;

    case FOOTER_SUMMARY:
      if (value == null) {
        unsetFooterSummary();
      } else {
        setFooterSummary((java.lang.String)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER_NAMES:
      return getHeaderNames();

    case ROWS:
      return getRows();

    case PROGRESSED_PERCENTAGE:
      return getProgressedPercentage();

    case STATUS:
      return getStatus();

    case FOOTER_SUMMARY:
      return getFooterSummary();

    case START_TIME:
      return getStartTime();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HEADER_NAMES:
      return isSetHeaderNames();
    case ROWS:
      return isSetRows();
    case PROGRESSED_PERCENTAGE:
      return isSetProgressedPercentage();
    case STATUS:
      return isSetStatus();
    case FOOTER_SUMMARY:
      return isSetFooterSummary();
    case START_TIME:
      return isSetStartTime();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TProgressUpdateResp)
      return this.equals((TProgressUpdateResp)that);
    return false;
  }

  public boolean equals(TProgressUpdateResp that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_headerNames = true && this.isSetHeaderNames();
    boolean that_present_headerNames = true && that.isSetHeaderNames();
    if (this_present_headerNames || that_present_headerNames) {
      if (!(this_present_headerNames && that_present_headerNames))
        return false;
      if (!this.headerNames.equals(that.headerNames))
        return false;
    }

    boolean this_present_rows = true && this.isSetRows();
    boolean that_present_rows = true && that.isSetRows();
    if (this_present_rows || that_present_rows) {
      if (!(this_present_rows && that_present_rows))
        return false;
      if (!this.rows.equals(that.rows))
        return false;
    }

    boolean this_present_progressedPercentage = true;
    boolean that_present_progressedPercentage = true;
    if (this_present_progressedPercentage || that_present_progressedPercentage) {
      if (!(this_present_progressedPercentage && that_present_progressedPercentage))
        return false;
      if (this.progressedPercentage != that.progressedPercentage)
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_footerSummary = true && this.isSetFooterSummary();
    boolean that_present_footerSummary = true && that.isSetFooterSummary();
    if (this_present_footerSummary || that_present_footerSummary) {
      if (!(this_present_footerSummary && that_present_footerSummary))
        return false;
      if (!this.footerSummary.equals(that.footerSummary))
        return false;
    }

    boolean this_present_startTime = true;
    boolean that_present_startTime = true;
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHeaderNames()) ? 131071 : 524287);
    if (isSetHeaderNames())
      hashCode = hashCode * 8191 + headerNames.hashCode();

    hashCode = hashCode * 8191 + ((isSetRows()) ? 131071 : 524287);
    if (isSetRows())
      hashCode = hashCode * 8191 + rows.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(progressedPercentage);

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.getValue();

    hashCode = hashCode * 8191 + ((isSetFooterSummary()) ? 131071 : 524287);
    if (isSetFooterSummary())
      hashCode = hashCode * 8191 + footerSummary.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(startTime);

    return hashCode;
  }

  @Override
  public int compareTo(TProgressUpdateResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetHeaderNames(), other.isSetHeaderNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeaderNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.headerNames, other.headerNames);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRows(), other.isSetRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rows, other.rows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetProgressedPercentage(), other.isSetProgressedPercentage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProgressedPercentage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.progressedPercentage, other.progressedPercentage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStatus(), other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFooterSummary(), other.isSetFooterSummary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFooterSummary()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.footerSummary, other.footerSummary);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStartTime(), other.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startTime, other.startTime);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TProgressUpdateResp(");
    boolean first = true;

    sb.append("headerNames:");
    if (this.headerNames == null) {
      sb.append("null");
    } else {
      sb.append(this.headerNames);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("rows:");
    if (this.rows == null) {
      sb.append("null");
    } else {
      sb.append(this.rows);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("progressedPercentage:");
    sb.append(this.progressedPercentage);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("footerSummary:");
    if (this.footerSummary == null) {
      sb.append("null");
    } else {
      sb.append(this.footerSummary);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("startTime:");
    sb.append(this.startTime);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetHeaderNames()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'headerNames' is unset! Struct:" + toString());
    }

    if (!isSetRows()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'rows' is unset! Struct:" + toString());
    }

    if (!isSetProgressedPercentage()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'progressedPercentage' is unset! Struct:" + toString());
    }

    if (!isSetStatus()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' is unset! Struct:" + toString());
    }

    if (!isSetFooterSummary()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'footerSummary' is unset! Struct:" + toString());
    }

    if (!isSetStartTime()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'startTime' is unset! Struct:" + toString());
    }

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

  private static class TProgressUpdateRespStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TProgressUpdateRespStandardScheme getScheme() {
      return new TProgressUpdateRespStandardScheme();
    }
  }

  private static class TProgressUpdateRespStandardScheme extends org.apache.thrift.scheme.StandardScheme<TProgressUpdateResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TProgressUpdateResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HEADER_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list200 = iprot.readListBegin();
                struct.headerNames = new java.util.ArrayList<java.lang.String>(_list200.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem201;
                for (int _i202 = 0; _i202 < _list200.size; ++_i202)
                {
                  _elem201 = iprot.readString();
                  struct.headerNames.add(_elem201);
                }
                iprot.readListEnd();
              }
              struct.setHeaderNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list203 = iprot.readListBegin();
                struct.rows = new java.util.ArrayList<java.util.List<java.lang.String>>(_list203.size);
                @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> _elem204;
                for (int _i205 = 0; _i205 < _list203.size; ++_i205)
                {
                  {
                    org.apache.thrift.protocol.TList _list206 = iprot.readListBegin();
                    _elem204 = new java.util.ArrayList<java.lang.String>(_list206.size);
                    @org.apache.thrift.annotation.Nullable java.lang.String _elem207;
                    for (int _i208 = 0; _i208 < _list206.size; ++_i208)
                    {
                      _elem207 = iprot.readString();
                      _elem204.add(_elem207);
                    }
                    iprot.readListEnd();
                  }
                  struct.rows.add(_elem204);
                }
                iprot.readListEnd();
              }
              struct.setRowsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROGRESSED_PERCENTAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.progressedPercentage = iprot.readDouble();
              struct.setProgressedPercentageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = org.apache.hive.service.rpc.thrift.TJobExecutionStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FOOTER_SUMMARY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.footerSummary = iprot.readString();
              struct.setFooterSummaryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.startTime = iprot.readI64();
              struct.setStartTimeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TProgressUpdateResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.headerNames != null) {
        oprot.writeFieldBegin(HEADER_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.headerNames.size()));
          for (java.lang.String _iter209 : struct.headerNames)
          {
            oprot.writeString(_iter209);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.rows != null) {
        oprot.writeFieldBegin(ROWS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.rows.size()));
          for (java.util.List<java.lang.String> _iter210 : struct.rows)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, _iter210.size()));
              for (java.lang.String _iter211 : _iter210)
              {
                oprot.writeString(_iter211);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PROGRESSED_PERCENTAGE_FIELD_DESC);
      oprot.writeDouble(struct.progressedPercentage);
      oprot.writeFieldEnd();
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.footerSummary != null) {
        oprot.writeFieldBegin(FOOTER_SUMMARY_FIELD_DESC);
        oprot.writeString(struct.footerSummary);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(START_TIME_FIELD_DESC);
      oprot.writeI64(struct.startTime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TProgressUpdateRespTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TProgressUpdateRespTupleScheme getScheme() {
      return new TProgressUpdateRespTupleScheme();
    }
  }

  private static class TProgressUpdateRespTupleScheme extends org.apache.thrift.scheme.TupleScheme<TProgressUpdateResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TProgressUpdateResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.headerNames.size());
        for (java.lang.String _iter212 : struct.headerNames)
        {
          oprot.writeString(_iter212);
        }
      }
      {
        oprot.writeI32(struct.rows.size());
        for (java.util.List<java.lang.String> _iter213 : struct.rows)
        {
          {
            oprot.writeI32(_iter213.size());
            for (java.lang.String _iter214 : _iter213)
            {
              oprot.writeString(_iter214);
            }
          }
        }
      }
      oprot.writeDouble(struct.progressedPercentage);
      oprot.writeI32(struct.status.getValue());
      oprot.writeString(struct.footerSummary);
      oprot.writeI64(struct.startTime);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TProgressUpdateResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list215 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
        struct.headerNames = new java.util.ArrayList<java.lang.String>(_list215.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _elem216;
        for (int _i217 = 0; _i217 < _list215.size; ++_i217)
        {
          _elem216 = iprot.readString();
          struct.headerNames.add(_elem216);
        }
      }
      struct.setHeaderNamesIsSet(true);
      {
        org.apache.thrift.protocol.TList _list218 = iprot.readListBegin(org.apache.thrift.protocol.TType.LIST);
        struct.rows = new java.util.ArrayList<java.util.List<java.lang.String>>(_list218.size);
        @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> _elem219;
        for (int _i220 = 0; _i220 < _list218.size; ++_i220)
        {
          {
            org.apache.thrift.protocol.TList _list221 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
            _elem219 = new java.util.ArrayList<java.lang.String>(_list221.size);
            @org.apache.thrift.annotation.Nullable java.lang.String _elem222;
            for (int _i223 = 0; _i223 < _list221.size; ++_i223)
            {
              _elem222 = iprot.readString();
              _elem219.add(_elem222);
            }
          }
          struct.rows.add(_elem219);
        }
      }
      struct.setRowsIsSet(true);
      struct.progressedPercentage = iprot.readDouble();
      struct.setProgressedPercentageIsSet(true);
      struct.status = org.apache.hive.service.rpc.thrift.TJobExecutionStatus.findByValue(iprot.readI32());
      struct.setStatusIsSet(true);
      struct.footerSummary = iprot.readString();
      struct.setFooterSummaryIsSet(true);
      struct.startTime = iprot.readI64();
      struct.setStartTimeIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

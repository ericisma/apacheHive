/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
public enum GetTablesExtRequestFields implements org.apache.thrift.TEnum {
  ACCESS_TYPE(1),
  PROCESSOR_CAPABILITIES(2),
  ALL(2147483647);

  private final int value;

  private GetTablesExtRequestFields(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static GetTablesExtRequestFields findByValue(int value) { 
    switch (value) {
      case 1:
        return ACCESS_TYPE;
      case 2:
        return PROCESSOR_CAPABILITIES;
      case 2147483647:
        return ALL;
      default:
        return null;
    }
  }
}

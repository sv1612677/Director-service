// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: direct.proto

package vn.com.director.api;

public interface DirectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:director.api.DirectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string requestID = 1;</code>
   */
  java.lang.String getRequestID();
  /**
   * <code>string requestID = 1;</code>
   */
  com.google.protobuf.ByteString
      getRequestIDBytes();

  /**
   * <pre>
   * idMedia, list ServiceType  =4
   * </pre>
   *
   * <code>string data = 2;</code>
   */
  java.lang.String getData();
  /**
   * <pre>
   * idMedia, list ServiceType  =4
   * </pre>
   *
   * <code>string data = 2;</code>
   */
  com.google.protobuf.ByteString
      getDataBytes();

  /**
   * <code>int32 clientID = 3;</code>
   */
  int getClientID();

  /**
   * <code>int64 requestDate = 4;</code>
   */
  long getRequestDate();

  /**
   * <code>string sig = 5;</code>
   */
  java.lang.String getSig();
  /**
   * <code>string sig = 5;</code>
   */
  com.google.protobuf.ByteString
      getSigBytes();
}

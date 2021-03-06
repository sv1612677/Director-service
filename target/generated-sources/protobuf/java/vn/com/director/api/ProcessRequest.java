// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gateway.proto

package vn.com.director.api;

/**
 * Protobuf type {@code api.gateway.v1.ProcessRequest}
 */
public  final class ProcessRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.gateway.v1.ProcessRequest)
    ProcessRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProcessRequest.newBuilder() to construct.
  private ProcessRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProcessRequest() {
    data_ = "";
    sig_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProcessRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            clientId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            data_ = s;
            break;
          }
          case 24: {

            requestDate_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            sig_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return vn.com.director.api.Gateway.internal_static_api_gateway_v1_ProcessRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return vn.com.director.api.Gateway.internal_static_api_gateway_v1_ProcessRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            vn.com.director.api.ProcessRequest.class, vn.com.director.api.ProcessRequest.Builder.class);
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  private int clientId_;
  /**
   * <code>int32 client_id = 1;</code>
   */
  public int getClientId() {
    return clientId_;
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private volatile java.lang.Object data_;
  /**
   * <pre>
   * data is JSON string, has field id, event_type
   * </pre>
   *
   * <code>string data = 2;</code>
   */
  public java.lang.String getData() {
    java.lang.Object ref = data_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      data_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * data is JSON string, has field id, event_type
   * </pre>
   *
   * <code>string data = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDataBytes() {
    java.lang.Object ref = data_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      data_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUEST_DATE_FIELD_NUMBER = 3;
  private long requestDate_;
  /**
   * <code>int64 request_date = 3;</code>
   */
  public long getRequestDate() {
    return requestDate_;
  }

  public static final int SIG_FIELD_NUMBER = 4;
  private volatile java.lang.Object sig_;
  /**
   * <pre>
   * sig == sha256(client_id|trans_id|request_date|client_key)
   * </pre>
   *
   * <code>string sig = 4;</code>
   */
  public java.lang.String getSig() {
    java.lang.Object ref = sig_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sig_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * sig == sha256(client_id|trans_id|request_date|client_key)
   * </pre>
   *
   * <code>string sig = 4;</code>
   */
  public com.google.protobuf.ByteString
      getSigBytes() {
    java.lang.Object ref = sig_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sig_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (clientId_ != 0) {
      output.writeInt32(1, clientId_);
    }
    if (!getDataBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, data_);
    }
    if (requestDate_ != 0L) {
      output.writeInt64(3, requestDate_);
    }
    if (!getSigBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, sig_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, clientId_);
    }
    if (!getDataBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, data_);
    }
    if (requestDate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, requestDate_);
    }
    if (!getSigBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, sig_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof vn.com.director.api.ProcessRequest)) {
      return super.equals(obj);
    }
    vn.com.director.api.ProcessRequest other = (vn.com.director.api.ProcessRequest) obj;

    if (getClientId()
        != other.getClientId()) return false;
    if (!getData()
        .equals(other.getData())) return false;
    if (getRequestDate()
        != other.getRequestDate()) return false;
    if (!getSig()
        .equals(other.getSig())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId();
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (37 * hash) + REQUEST_DATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRequestDate());
    hash = (37 * hash) + SIG_FIELD_NUMBER;
    hash = (53 * hash) + getSig().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static vn.com.director.api.ProcessRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static vn.com.director.api.ProcessRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static vn.com.director.api.ProcessRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static vn.com.director.api.ProcessRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static vn.com.director.api.ProcessRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static vn.com.director.api.ProcessRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static vn.com.director.api.ProcessRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static vn.com.director.api.ProcessRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static vn.com.director.api.ProcessRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static vn.com.director.api.ProcessRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static vn.com.director.api.ProcessRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static vn.com.director.api.ProcessRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(vn.com.director.api.ProcessRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code api.gateway.v1.ProcessRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.gateway.v1.ProcessRequest)
      vn.com.director.api.ProcessRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return vn.com.director.api.Gateway.internal_static_api_gateway_v1_ProcessRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return vn.com.director.api.Gateway.internal_static_api_gateway_v1_ProcessRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              vn.com.director.api.ProcessRequest.class, vn.com.director.api.ProcessRequest.Builder.class);
    }

    // Construct using vn.com.director.api.ProcessRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      clientId_ = 0;

      data_ = "";

      requestDate_ = 0L;

      sig_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return vn.com.director.api.Gateway.internal_static_api_gateway_v1_ProcessRequest_descriptor;
    }

    @java.lang.Override
    public vn.com.director.api.ProcessRequest getDefaultInstanceForType() {
      return vn.com.director.api.ProcessRequest.getDefaultInstance();
    }

    @java.lang.Override
    public vn.com.director.api.ProcessRequest build() {
      vn.com.director.api.ProcessRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public vn.com.director.api.ProcessRequest buildPartial() {
      vn.com.director.api.ProcessRequest result = new vn.com.director.api.ProcessRequest(this);
      result.clientId_ = clientId_;
      result.data_ = data_;
      result.requestDate_ = requestDate_;
      result.sig_ = sig_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof vn.com.director.api.ProcessRequest) {
        return mergeFrom((vn.com.director.api.ProcessRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(vn.com.director.api.ProcessRequest other) {
      if (other == vn.com.director.api.ProcessRequest.getDefaultInstance()) return this;
      if (other.getClientId() != 0) {
        setClientId(other.getClientId());
      }
      if (!other.getData().isEmpty()) {
        data_ = other.data_;
        onChanged();
      }
      if (other.getRequestDate() != 0L) {
        setRequestDate(other.getRequestDate());
      }
      if (!other.getSig().isEmpty()) {
        sig_ = other.sig_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      vn.com.director.api.ProcessRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (vn.com.director.api.ProcessRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int clientId_ ;
    /**
     * <code>int32 client_id = 1;</code>
     */
    public int getClientId() {
      return clientId_;
    }
    /**
     * <code>int32 client_id = 1;</code>
     */
    public Builder setClientId(int value) {
      
      clientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 client_id = 1;</code>
     */
    public Builder clearClientId() {
      
      clientId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object data_ = "";
    /**
     * <pre>
     * data is JSON string, has field id, event_type
     * </pre>
     *
     * <code>string data = 2;</code>
     */
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        data_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * data is JSON string, has field id, event_type
     * </pre>
     *
     * <code>string data = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * data is JSON string, has field id, event_type
     * </pre>
     *
     * <code>string data = 2;</code>
     */
    public Builder setData(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * data is JSON string, has field id, event_type
     * </pre>
     *
     * <code>string data = 2;</code>
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * data is JSON string, has field id, event_type
     * </pre>
     *
     * <code>string data = 2;</code>
     */
    public Builder setDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      data_ = value;
      onChanged();
      return this;
    }

    private long requestDate_ ;
    /**
     * <code>int64 request_date = 3;</code>
     */
    public long getRequestDate() {
      return requestDate_;
    }
    /**
     * <code>int64 request_date = 3;</code>
     */
    public Builder setRequestDate(long value) {
      
      requestDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 request_date = 3;</code>
     */
    public Builder clearRequestDate() {
      
      requestDate_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object sig_ = "";
    /**
     * <pre>
     * sig == sha256(client_id|trans_id|request_date|client_key)
     * </pre>
     *
     * <code>string sig = 4;</code>
     */
    public java.lang.String getSig() {
      java.lang.Object ref = sig_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sig_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * sig == sha256(client_id|trans_id|request_date|client_key)
     * </pre>
     *
     * <code>string sig = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSigBytes() {
      java.lang.Object ref = sig_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sig_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * sig == sha256(client_id|trans_id|request_date|client_key)
     * </pre>
     *
     * <code>string sig = 4;</code>
     */
    public Builder setSig(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sig_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * sig == sha256(client_id|trans_id|request_date|client_key)
     * </pre>
     *
     * <code>string sig = 4;</code>
     */
    public Builder clearSig() {
      
      sig_ = getDefaultInstance().getSig();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * sig == sha256(client_id|trans_id|request_date|client_key)
     * </pre>
     *
     * <code>string sig = 4;</code>
     */
    public Builder setSigBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sig_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.gateway.v1.ProcessRequest)
  }

  // @@protoc_insertion_point(class_scope:api.gateway.v1.ProcessRequest)
  private static final vn.com.director.api.ProcessRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new vn.com.director.api.ProcessRequest();
  }

  public static vn.com.director.api.ProcessRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProcessRequest>
      PARSER = new com.google.protobuf.AbstractParser<ProcessRequest>() {
    @java.lang.Override
    public ProcessRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProcessRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProcessRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProcessRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public vn.com.director.api.ProcessRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


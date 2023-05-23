// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/testing.proto

package com.google.showcase.v1beta1;

/**
 * <pre>
 * The request for the CreateSession method.
 * </pre>
 *
 * Protobuf type {@code google.showcase.v1beta1.CreateSessionRequest}
 */
public final class CreateSessionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.CreateSessionRequest)
    CreateSessionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSessionRequest.newBuilder() to construct.
  private CreateSessionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSessionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSessionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_CreateSessionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_CreateSessionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.CreateSessionRequest.class, com.google.showcase.v1beta1.CreateSessionRequest.Builder.class);
  }

  public static final int SESSION_FIELD_NUMBER = 1;
  private com.google.showcase.v1beta1.Session session_;
  /**
   * <pre>
   * The session to be created.
   * Sessions are immutable once they are created (although they can
   * be deleted).
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Session session = 1;</code>
   * @return Whether the session field is set.
   */
  @java.lang.Override
  public boolean hasSession() {
    return session_ != null;
  }
  /**
   * <pre>
   * The session to be created.
   * Sessions are immutable once they are created (although they can
   * be deleted).
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Session session = 1;</code>
   * @return The session.
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.Session getSession() {
    return session_ == null ? com.google.showcase.v1beta1.Session.getDefaultInstance() : session_;
  }
  /**
   * <pre>
   * The session to be created.
   * Sessions are immutable once they are created (although they can
   * be deleted).
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Session session = 1;</code>
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.SessionOrBuilder getSessionOrBuilder() {
    return session_ == null ? com.google.showcase.v1beta1.Session.getDefaultInstance() : session_;
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
    if (session_ != null) {
      output.writeMessage(1, getSession());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (session_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSession());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.showcase.v1beta1.CreateSessionRequest)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.CreateSessionRequest other = (com.google.showcase.v1beta1.CreateSessionRequest) obj;

    if (hasSession() != other.hasSession()) return false;
    if (hasSession()) {
      if (!getSession()
          .equals(other.getSession())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasSession()) {
      hash = (37 * hash) + SESSION_FIELD_NUMBER;
      hash = (53 * hash) + getSession().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.CreateSessionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.CreateSessionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.CreateSessionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.CreateSessionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.CreateSessionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.CreateSessionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.CreateSessionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.CreateSessionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.CreateSessionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.CreateSessionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.CreateSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.CreateSessionRequest parseFrom(
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
  public static Builder newBuilder(com.google.showcase.v1beta1.CreateSessionRequest prototype) {
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
   * <pre>
   * The request for the CreateSession method.
   * </pre>
   *
   * Protobuf type {@code google.showcase.v1beta1.CreateSessionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.CreateSessionRequest)
      com.google.showcase.v1beta1.CreateSessionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_CreateSessionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_CreateSessionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.CreateSessionRequest.class, com.google.showcase.v1beta1.CreateSessionRequest.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.CreateSessionRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      session_ = null;
      if (sessionBuilder_ != null) {
        sessionBuilder_.dispose();
        sessionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_CreateSessionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.CreateSessionRequest getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.CreateSessionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.CreateSessionRequest build() {
      com.google.showcase.v1beta1.CreateSessionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.CreateSessionRequest buildPartial() {
      com.google.showcase.v1beta1.CreateSessionRequest result = new com.google.showcase.v1beta1.CreateSessionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.showcase.v1beta1.CreateSessionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.session_ = sessionBuilder_ == null
            ? session_
            : sessionBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.showcase.v1beta1.CreateSessionRequest) {
        return mergeFrom((com.google.showcase.v1beta1.CreateSessionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.CreateSessionRequest other) {
      if (other == com.google.showcase.v1beta1.CreateSessionRequest.getDefaultInstance()) return this;
      if (other.hasSession()) {
        mergeSession(other.getSession());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getSessionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.showcase.v1beta1.Session session_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.showcase.v1beta1.Session, com.google.showcase.v1beta1.Session.Builder, com.google.showcase.v1beta1.SessionOrBuilder> sessionBuilder_;
    /**
     * <pre>
     * The session to be created.
     * Sessions are immutable once they are created (although they can
     * be deleted).
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Session session = 1;</code>
     * @return Whether the session field is set.
     */
    public boolean hasSession() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The session to be created.
     * Sessions are immutable once they are created (although they can
     * be deleted).
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Session session = 1;</code>
     * @return The session.
     */
    public com.google.showcase.v1beta1.Session getSession() {
      if (sessionBuilder_ == null) {
        return session_ == null ? com.google.showcase.v1beta1.Session.getDefaultInstance() : session_;
      } else {
        return sessionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The session to be created.
     * Sessions are immutable once they are created (although they can
     * be deleted).
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Session session = 1;</code>
     */
    public Builder setSession(com.google.showcase.v1beta1.Session value) {
      if (sessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        session_ = value;
      } else {
        sessionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The session to be created.
     * Sessions are immutable once they are created (although they can
     * be deleted).
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Session session = 1;</code>
     */
    public Builder setSession(
        com.google.showcase.v1beta1.Session.Builder builderForValue) {
      if (sessionBuilder_ == null) {
        session_ = builderForValue.build();
      } else {
        sessionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The session to be created.
     * Sessions are immutable once they are created (although they can
     * be deleted).
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Session session = 1;</code>
     */
    public Builder mergeSession(com.google.showcase.v1beta1.Session value) {
      if (sessionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          session_ != null &&
          session_ != com.google.showcase.v1beta1.Session.getDefaultInstance()) {
          getSessionBuilder().mergeFrom(value);
        } else {
          session_ = value;
        }
      } else {
        sessionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The session to be created.
     * Sessions are immutable once they are created (although they can
     * be deleted).
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Session session = 1;</code>
     */
    public Builder clearSession() {
      bitField0_ = (bitField0_ & ~0x00000001);
      session_ = null;
      if (sessionBuilder_ != null) {
        sessionBuilder_.dispose();
        sessionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The session to be created.
     * Sessions are immutable once they are created (although they can
     * be deleted).
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Session session = 1;</code>
     */
    public com.google.showcase.v1beta1.Session.Builder getSessionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSessionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The session to be created.
     * Sessions are immutable once they are created (although they can
     * be deleted).
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Session session = 1;</code>
     */
    public com.google.showcase.v1beta1.SessionOrBuilder getSessionOrBuilder() {
      if (sessionBuilder_ != null) {
        return sessionBuilder_.getMessageOrBuilder();
      } else {
        return session_ == null ?
            com.google.showcase.v1beta1.Session.getDefaultInstance() : session_;
      }
    }
    /**
     * <pre>
     * The session to be created.
     * Sessions are immutable once they are created (although they can
     * be deleted).
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Session session = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.showcase.v1beta1.Session, com.google.showcase.v1beta1.Session.Builder, com.google.showcase.v1beta1.SessionOrBuilder> 
        getSessionFieldBuilder() {
      if (sessionBuilder_ == null) {
        sessionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.showcase.v1beta1.Session, com.google.showcase.v1beta1.Session.Builder, com.google.showcase.v1beta1.SessionOrBuilder>(
                getSession(),
                getParentForChildren(),
                isClean());
        session_ = null;
      }
      return sessionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.CreateSessionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.CreateSessionRequest)
  private static final com.google.showcase.v1beta1.CreateSessionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.CreateSessionRequest();
  }

  public static com.google.showcase.v1beta1.CreateSessionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSessionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSessionRequest>() {
    @java.lang.Override
    public CreateSessionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CreateSessionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSessionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.CreateSessionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


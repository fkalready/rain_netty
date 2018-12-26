// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Students.proto

package com.rain.netty.grpc;

public final class Students {
  private Students() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rain_netty_grpc_MyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rain_netty_grpc_MyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rain_netty_grpc_MyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rain_netty_grpc_MyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rain_netty_grpc_StudentsAge_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rain_netty_grpc_StudentsAge_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rain_netty_grpc_StreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rain_netty_grpc_StreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rain_netty_grpc_StreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rain_netty_grpc_StreamResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\016Students.proto\022\023com.rain.netty.grpc\"\035\n" +
      "\tMyRequest\022\020\n\010username\030\001 \001(\t\"\036\n\nMyRespon" +
      "se\022\020\n\010realname\030\001 \001(\t\"\032\n\013StudentsAge\022\013\n\003a" +
      "ge\030\001 \001(\005\"%\n\rStreamRequest\022\024\n\014request_inf" +
      "o\030\001 \001(\t\"\'\n\016StreamResponse\022\025\n\rresponse_in" +
      "fo\030\001 \001(\t2\373\002\n\017StudentsService\022Z\n\025GetRealN" +
      "ameByUsername\022\036.com.rain.netty.grpc.MyRe" +
      "quest\032\037.com.rain.netty.grpc.MyResponse\"\000" +
      "\022Y\n\020GetStudentsByAge\022 .com.rain.netty.gr" +
      "pc.StudentsAge\032\037.com.rain.netty.grpc.MyR" +
      "esponse\"\0000\001\022V\n\016GetStudentsAge\022\036.com.rain" +
      ".netty.grpc.MyRequest\032 .com.rain.netty.g" +
      "rpc.StudentsAge\"\000(\001\022Y\n\010BiStream\022\".com.ra" +
      "in.netty.grpc.StreamRequest\032#.com.rain.n" +
      "etty.grpc.StreamResponse\"\000(\0010\001B!\n\023com.ra" +
      "in.netty.grpcB\010StudentsP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_rain_netty_grpc_MyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_rain_netty_grpc_MyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rain_netty_grpc_MyRequest_descriptor,
        new String[] { "Username", });
    internal_static_com_rain_netty_grpc_MyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_rain_netty_grpc_MyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rain_netty_grpc_MyResponse_descriptor,
        new String[] { "Realname", });
    internal_static_com_rain_netty_grpc_StudentsAge_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_rain_netty_grpc_StudentsAge_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rain_netty_grpc_StudentsAge_descriptor,
        new String[] { "Age", });
    internal_static_com_rain_netty_grpc_StreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_rain_netty_grpc_StreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rain_netty_grpc_StreamRequest_descriptor,
        new String[] { "RequestInfo", });
    internal_static_com_rain_netty_grpc_StreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_rain_netty_grpc_StreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rain_netty_grpc_StreamResponse_descriptor,
        new String[] { "ResponseInfo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
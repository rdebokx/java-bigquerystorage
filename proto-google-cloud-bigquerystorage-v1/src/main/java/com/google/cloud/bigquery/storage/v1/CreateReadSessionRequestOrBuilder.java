/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/storage/v1/storage.proto

package com.google.cloud.bigquery.storage.v1;

public interface CreateReadSessionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.storage.v1.CreateReadSessionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The request project that owns the session, in the form of
   * `projects/{project_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The request project that owns the session, in the form of
   * `projects/{project_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Session to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the readSession field is set.
   */
  boolean hasReadSession();
  /**
   *
   *
   * <pre>
   * Required. Session to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The readSession.
   */
  com.google.cloud.bigquery.storage.v1.ReadSession getReadSession();
  /**
   *
   *
   * <pre>
   * Required. Session to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.bigquery.storage.v1.ReadSessionOrBuilder getReadSessionOrBuilder();

  /**
   *
   *
   * <pre>
   * Max initial number of streams. If unset or zero, the server will
   * provide a value of streams so as to produce reasonable throughput. Must be
   * non-negative. The number of streams may be lower than the requested number,
   * depending on the amount parallelism that is reasonable for the table.
   * There is a default system max limit of 1,000.
   * This must be greater than or equal to preferred_min_stream_count.
   * Typically, clients should either leave this unset to let the system to
   * determine an upper bound OR set this a size for the maximum "units of work"
   * it can gracefully handle.
   * </pre>
   *
   * <code>int32 max_stream_count = 3;</code>
   *
   * @return The maxStreamCount.
   */
  int getMaxStreamCount();
}

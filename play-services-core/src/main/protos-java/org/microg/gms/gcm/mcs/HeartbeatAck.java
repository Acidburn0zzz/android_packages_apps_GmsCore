// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/mcs.proto
package org.microg.gms.gcm.mcs;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;

/**
 * TAG: 1
 */
public final class HeartbeatAck extends Message {

  public static final Integer DEFAULT_STREAM_ID = 0;
  public static final Integer DEFAULT_LAST_STREAM_ID_RECEIVED = 0;
  public static final Long DEFAULT_STATUS = 0L;

  @ProtoField(tag = 1, type = INT32)
  public final Integer stream_id;

  @ProtoField(tag = 2, type = INT32)
  public final Integer last_stream_id_received;

  @ProtoField(tag = 3, type = INT64)
  public final Long status;

  public HeartbeatAck(Integer stream_id, Integer last_stream_id_received, Long status) {
    this.stream_id = stream_id;
    this.last_stream_id_received = last_stream_id_received;
    this.status = status;
  }

  private HeartbeatAck(Builder builder) {
    this(builder.stream_id, builder.last_stream_id_received, builder.status);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof HeartbeatAck)) return false;
    HeartbeatAck o = (HeartbeatAck) other;
    return equals(stream_id, o.stream_id)
        && equals(last_stream_id_received, o.last_stream_id_received)
        && equals(status, o.status);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = stream_id != null ? stream_id.hashCode() : 0;
      result = result * 37 + (last_stream_id_received != null ? last_stream_id_received.hashCode() : 0);
      result = result * 37 + (status != null ? status.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<HeartbeatAck> {

    public Integer stream_id;
    public Integer last_stream_id_received;
    public Long status;

    public Builder() {
    }

    public Builder(HeartbeatAck message) {
      super(message);
      if (message == null) return;
      this.stream_id = message.stream_id;
      this.last_stream_id_received = message.last_stream_id_received;
      this.status = message.status;
    }

    public Builder stream_id(Integer stream_id) {
      this.stream_id = stream_id;
      return this;
    }

    public Builder last_stream_id_received(Integer last_stream_id_received) {
      this.last_stream_id_received = last_stream_id_received;
      return this;
    }

    public Builder status(Long status) {
      this.status = status;
      return this;
    }

    @Override
    public HeartbeatAck build() {
      return new HeartbeatAck(this);
    }
  }
}

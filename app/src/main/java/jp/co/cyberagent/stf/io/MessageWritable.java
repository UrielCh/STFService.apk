package jp.co.cyberagent.stf.io;

import com.google.protobuf.GeneratedMessageLite;

public interface MessageWritable {
    void write(final GeneratedMessageLite message);
}

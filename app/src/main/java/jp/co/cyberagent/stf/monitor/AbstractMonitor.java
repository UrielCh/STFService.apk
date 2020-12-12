package jp.co.cyberagent.stf.monitor;

import android.content.Context;

import jp.co.cyberagent.stf.io.MessageWritable;

abstract public class AbstractMonitor extends Thread {
    final Context context;
    final MessageWritable writer;

    public AbstractMonitor(Context context, MessageWritable writer) {
        this.context = context;
        this.writer = writer;
    }

    public void peek() {
        peek(writer);
    }

    abstract public void peek(MessageWritable writer);
}

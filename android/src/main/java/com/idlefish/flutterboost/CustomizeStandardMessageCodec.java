package com.idlefish.flutterboost;

import java.io.ByteArrayOutputStream;

import io.flutter.plugin.common.StandardMessageCodec;

public class CustomizeStandardMessageCodec extends StandardMessageCodec {
    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value) {
        if (value instanceof Boolean) {
            stream.write(((Boolean) value).booleanValue() ? 1 : 2);
        }else {
            super.writeValue(stream, value);
        }
    }
}
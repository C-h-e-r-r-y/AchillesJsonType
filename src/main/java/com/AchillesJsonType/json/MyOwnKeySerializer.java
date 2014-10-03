package com.AchillesJsonType.json;

import com.AchillesJsonType.MyOwnKey;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class MyOwnKeySerializer extends JsonSerializer<MyOwnKey> {
    @Override
    public void serialize(MyOwnKey key, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(key.getId());
    }
}

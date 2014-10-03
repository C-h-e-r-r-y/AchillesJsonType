package com.AchillesJsonType.json;

import com.AchillesJsonType.MyOwnKey;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class MyOwnKeyDeserializer extends JsonDeserializer<MyOwnKey> {

    @Override
    public MyOwnKey deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return new MyOwnKey(jsonParser.getText());
    }
}

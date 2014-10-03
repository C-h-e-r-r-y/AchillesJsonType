package com.AchillesJsonType.json;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyMapper extends ObjectMapper {

    public MyMapper() {
        registerModule(new MyOwnKeyModule());
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}

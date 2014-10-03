package com.AchillesJsonType.json;

import com.AchillesJsonType.MyOwnKey;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class MyOwnKeyModule extends SimpleModule {

    public MyOwnKeyModule() {
        super();
        addSerializer(MyOwnKey.class, new MyOwnKeySerializer());
        addDeserializer(MyOwnKey.class, new MyOwnKeyDeserializer());
    }
}
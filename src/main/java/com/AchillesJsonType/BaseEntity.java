package com.AchillesJsonType;

import com.fasterxml.jackson.annotation.JsonProperty;
import info.archinnov.achilles.annotations.Column;
import info.archinnov.achilles.annotations.Entity;
import info.archinnov.achilles.annotations.Id;
import info.archinnov.achilles.annotations.Index;

@Entity(table = "base_table")
public class BaseEntity {

    @Id
    @JsonProperty(required = true)
    private MyOwnKey id;

    @Index
    @Column(name = "clientId")
    @JsonProperty(required = true)
    private MyOwnKey clientId;

    public MyOwnKey getId() {
        return id;
    }

    public void setId(final MyOwnKey id) {
        this.id = id;
    }

    public MyOwnKey getClientId() {
        return clientId;
    }

    public void setClientId(final MyOwnKey clientId) {
        this.clientId = clientId;
    }
}

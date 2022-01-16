package com.example.Ago.Entity.JSONEntities;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
public class TimeSeries <T>{

    @Getter @Setter private Map<String, T> properties = new HashMap<>();

    @JsonAnySetter
    public void add(String key, T value) {
        properties.put(key, value);
    }

    @Override
    public String toString() {
        return "TimeSeries{" +
                "properties=" + properties +
                '}';
    }
}

package com.example.Ago.Entity.JSONEntities;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public class JSONdayQuote <T>  extends JSONEntity{

    @JsonProperty("Meta Data")
    public MetaData metaData;
    @JsonProperty("Time Series (Daily)")
    public TimeSeries timeSeries;

    public JSONdayQuote() {
    }


    @Override
    public String toString() {
        return "JQuote{" +
                "metaData=" + metaData +
                ", timeSeries=" + timeSeries +
                '}';
    }
}

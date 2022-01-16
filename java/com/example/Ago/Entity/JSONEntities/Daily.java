package com.example.Ago.Entity.JSONEntities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

public class Daily {

    @JsonProperty("1. open")
    @Getter @Setter private String open;
    @JsonProperty("2. high")
    @Getter @Setter private String high;
    @JsonProperty("3. low")
    @Getter @Setter private String low;
    @JsonProperty("4. close")
    @Getter @Setter private String close;
    @JsonProperty("5. volume")
    @Getter @Setter private String volume;

    public Daily() {
    }

    @Override
    public String toString() {
        return "Daily{" +
                "open='" + open + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", close='" + close + '\'' +
                ", volume='" + volume + '\'' +
                '}';
    }


}

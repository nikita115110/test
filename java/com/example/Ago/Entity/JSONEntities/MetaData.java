package com.example.Ago.Entity.JSONEntities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

public class MetaData {

    @JsonProperty("1. Information")
    @Setter @Getter private String information;
    @JsonProperty("2. Symbol")
    @Setter @Getter private String symbol;
    @JsonProperty("3. Last Refreshed")
    @Setter @Getter private String lastRefreshed;
    @JsonProperty("4. Output Size")
    @Setter @Getter private String outputSize;
    @JsonProperty("5. Time Zone")
    @Setter @Getter private String timeZone;

    public MetaData() {
    }

    @Override
    public String toString() {
        return "metaData{" +
                "information='" + information + '\'' +
                ", symbol='" + symbol + '\'' +
                ", lastRefreshed='" + lastRefreshed + '\'' +
                ", outputSize='" + outputSize + '\'' +
                ", timeZone='" + timeZone + '\'' +
                '}';
    }

}

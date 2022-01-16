package com.example.Ago.FileMeneger.JSONParser;

import com.example.Ago.Entity.JSONEntities.JSONEntity;
import com.example.Ago.Entity.JSONEntities.JSONdayQuote;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.nio.file.Paths;

@Component
public class jSONParser {

    public JSONEntity parseJson(String file, eJSONentities typeEntity) {
        ObjectMapper mapper = new ObjectMapper();
        JSONEntity entity = null;
        try {
            switch (typeEntity){
                case OTHER -> System.out.println();
                case JSONDAYQUOTE -> {
                    entity = mapper.readValue(Paths.get(file).toFile(), JSONdayQuote.class);
                }
                default -> System.out.println("defoult");
            }

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }finally {
            return entity;
        }

    }



}

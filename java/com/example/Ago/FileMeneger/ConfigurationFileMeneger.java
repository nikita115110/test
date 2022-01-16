package com.example.Ago.FileMeneger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Column;

@Configuration
public class ConfigurationFileMeneger {

    @Bean
    public FileMenegerJSON fileMenegerJSON(){
        FileMenegerJSON fileMenegerJSON = new FileMenegerJSON();
        fileMenegerJSON.setFolder("C:\\Users\\User\\Desktop\\Ago\\src\\main\\resources\\JSON");
        return fileMenegerJSON;
    }





}

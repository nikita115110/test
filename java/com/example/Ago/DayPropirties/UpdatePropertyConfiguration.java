package com.example.Ago.DayPropirties;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdatePropertyConfiguration {

    @Bean
    public UpdateStateCompanies updateStateCompanies(){
        return new UpdateStateCompanies();
    }

    @Bean
    public UpdateStateDayIdeas updateStateDayIdeas(){
        return new UpdateStateDayIdeas();
    }

    @Bean
    public  UpdateStateQuotes updateStateQuotes(){
        return new UpdateStateQuotes();
    }

}

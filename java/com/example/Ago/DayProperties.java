package com.example.Ago;

import com.example.Ago.FileMeneger.Readers.Reader;
import com.example.Ago.FileMeneger.Readers.ReaderProperies;
import com.example.Ago.DayPropirties.UpdateStateCompanies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;

@Component
public class DayProperties {

    public static boolean isUpdatedCompanies = true;
    public static boolean isUpdatedQuotes = false;
    public static boolean isUpdatedDayIdeas = false;

    public static byte stateUpdatedCompanies = 0;
    public static byte stateUpdatedQuotes = 0;
    public static byte stateUpdatedDayIdeas = 0;

    public static String key = "8VF5Y4S25Q5SH10D";

    @Autowired
    private UpdateStateCompanies updateStateCompanies;

    public void startUpdate(){
        if(isUpdatedCompanies == false){
            updateStateCompanies.update();
        }
    }

    public void readProperty()throws IOException {
        Reader reader = new ReaderProperies();
        Properties properties = (Properties) reader.read("C:\\Users\\User\\Desktop\\Ago\\src\\main\\resources\\update.properties");
        for (String key : properties.stringPropertyNames()){
            String value = (String) properties.get(key);
            switch (key){
                case "day.isUpdatedCompanies" ->{
                    if(value.equals("false")){
                        isUpdatedCompanies = false;
                    }else if(value.equals("true")){
                        isUpdatedCompanies = true;
                    }
                }
            }
        }
    }



}

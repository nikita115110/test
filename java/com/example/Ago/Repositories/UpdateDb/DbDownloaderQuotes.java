package com.example.Ago.Repositories.UpdateDb;

import com.example.Ago.Entity.DBEntities.Quote;
import com.example.Ago.Entity.JSONEntities.Daily;
import com.example.Ago.Entity.JSONEntities.JSONEntity;
import com.example.Ago.Entity.JSONEntities.JSONdayQuote;
import com.example.Ago.FileMeneger.JSONParser.eJSONentities;
import com.example.Ago.FileMeneger.JSONParser.jSONParser;
import com.example.Ago.FileMeneger.Readers.ReaderJSON;
import com.example.Ago.Repositories.QuoteRepository;
import com.example.Ago.Repositories.RepositoryMeneger;
import com.example.Ago.Utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Component
public class DbDownloaderQuotes implements RepositoryDownloader{

    @Autowired
    private RepositoryMeneger repositoryMeneger;

    @Override
    public void save(String ticker) {
        String path = "C:\\Users\\User\\Desktop\\Ago\\src\\main\\resources\\JSON\\" + ticker +".json";
        ReaderJSON readerJSON = new ReaderJSON();
        try {
            List<Quote> quotes = readerJSON.read(path);
            for (Quote q : quotes){
                repositoryMeneger.addRecord(q);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

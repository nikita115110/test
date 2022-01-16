package com.example.Ago.Starter;

import com.example.Ago.Core.AgoAnalyzerCore.GeneratorsIdeas.Strategies.ListStrategy.SearchConfiguration;
import com.example.Ago.Core.AgoAnalyzerCore.GeneratorsIdeas.Strategies.ListStrategy.ValueStrategy;
import com.example.Ago.DayProperties;
import com.example.Ago.Entity.DBEntities.Quote;
import com.example.Ago.Repositories.QuoteRepositoryAggregateQuery;
import com.example.Ago.Repositories.UpdateDb.DbDownloaderQuotes;
import com.example.Ago.TaskMeneger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class Starter  implements ApplicationRunner {

    @Autowired
    private TaskMeneger taskMeneger;
    @Autowired
    private DayProperties dayProperties;


    @Autowired
    private QuoteRepositoryAggregateQuery quoteRepository;
    @Autowired
    private DbDownloaderQuotes downloaderQuotes;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        taskMeneger.createListUpdateQuotes();
        dayProperties.readProperty();
        dayProperties.startUpdate();

        List<String> listCompanies = new ArrayList<>();
        listCompanies.add("MSFT");


        for (String s :listCompanies){
            test(s);
            //tets2(s);
        }
    }

    private void tets2 (String a){
        String stringDate="2020-10-00";
        Date date= null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String stringDate1="2022-01-10";
        Date date1= null;
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(stringDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        SearchConfiguration searchConfiguration = new SearchConfiguration();
        searchConfiguration.setAfter(date);
        searchConfiguration.setBefore(date1);
        searchConfiguration.setTicker(a);
        searchConfiguration.setLenght(45);

        ValueStrategy valueStrategy = new ValueStrategy();
        valueStrategy.setQuoteRepositoryAggregateQuery(quoteRepository);
        valueStrategy.setSearchConfiguration(searchConfiguration);
        valueStrategy.launchStrategy();
    }

    private void test(String a){
        downloaderQuotes.save(a);

    }

}

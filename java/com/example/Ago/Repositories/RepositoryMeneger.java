package com.example.Ago.Repositories;

import com.example.Ago.Utils.SorterQuotes;
import com.example.Ago.FileMeneger.JSONParser.eJSONentities;
import com.example.Ago.FileMeneger.JSONParser.jSONParser;
import com.example.Ago.Entity.DBEntities.Company;
import com.example.Ago.Entity.DBEntities.Quote;
import com.example.Ago.Entity.DBEntities.UpdateQuote;
import com.example.Ago.Entity.JSONEntities.Daily;
import com.example.Ago.Entity.JSONEntities.JSONdayQuote;
import com.example.Ago.FileMeneger.FileMenegerJSON;
import com.example.Ago.Utils.DateUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

@Component
@NoArgsConstructor
public class RepositoryMeneger {

    @Autowired
    @Setter @Getter
    private FileMenegerJSON fileMenegerJSON;
    @Autowired
    private jSONParser jsonParser;
    @Autowired
    private QuoteRepositoryAggregateQuery quoteRepository;
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private UpdateQuoteRepository updateQuoteRepository;


    public  void  addRecord(Quote quote ){
        if(quoteRepository.findByDayAndTicker(quote.getDay(),quote.getTicker()).size() == 0) {
            quoteRepository.save(quote);

        }

    }

    public void addRecord(Company company){
        if(companyRepository.findCompany(company.getTicker()).size() == 0){
            companyRepository.save(company);
        }
    }

//    public  void updateRecord(UpdateQuote updateQuote){
//        int size =updateQuoteRepository.findByTicker(updateQuote.getTicker()).size() ;
//        if(size <1){
//            updateQuoteRepository.save(updateQuote);
//        }else if(size == 1){
//            UpdateQuote  savedUpdateQuote =  updateQuoteRepository.findByTicker(updateQuote.getTicker()).get(0);
//            savedUpdateQuote.setDateUpdateRecord(updateQuote.getDateUpdateRecord());
//            savedUpdateQuote.setDateUpdateJsonFile(updateQuote.getDateUpdateJsonFile());
//            updateQuoteRepository.save(savedUpdateQuote);
//        }
//    }











}

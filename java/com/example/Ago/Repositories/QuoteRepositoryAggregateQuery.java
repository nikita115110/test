package com.example.Ago.Repositories;

import com.example.Ago.Entity.DBEntities.Quote;

import java.util.Date;
import java.util.List;

public interface QuoteRepositoryAggregateQuery extends QuoteRepository{

    default int sumByVolume(String ticker, Date after, Date before){
        int  result= 0;
        List<Quote> list = findByTickerAndDayBetween(ticker,after,before);
        for (Quote quote:list){
            result = result + quote.getVolume();
        }
        return  result;
    }

    default int avgByVolume(String ticker, Date after, Date before){
        int result = 0;
        List<Quote> list = findByTickerAndDayBetween(ticker,after,before);
        for(Quote q : list){
            result+=q.getVolume();
        }
        result = result/list.size();
        return result;
    }

    default Quote maxByValue(String ticker, Date after, Date before){
        List<Quote> list = findByTickerAndDayBetween(ticker,after,before);
        Quote result = list.get(0);
        for(Quote quote : list){
            if(quote.getVolume() >result.getVolume()){
                result = quote;
            }
        }
        return result;
    }

    default Quote minByValue(String ticker, Date after, Date before){
        List<Quote> list = findByTickerAndDayBetween(ticker,after,before);
        Quote result = list.get(0);
        for(Quote quote : list){
            if(quote.getVolume() <result.getVolume()){
                result = quote;
            }
        }
        return result;
    }

}

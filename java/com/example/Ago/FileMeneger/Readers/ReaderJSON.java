package com.example.Ago.FileMeneger.Readers;

import com.example.Ago.Utils.Sorter;
import com.example.Ago.FileMeneger.JSONParser.eJSONentities;
import com.example.Ago.FileMeneger.JSONParser.jSONParser;
import com.example.Ago.Entity.DBEntities.Quote;
import com.example.Ago.Entity.JSONEntities.JSONdayQuote;
import com.example.Ago.Utils.DateUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class ReaderJSON  implements Reader{


    @Override
    public List <Quote> read(String file) throws IOException {
        ArrayList<Quote> quotes  = new ArrayList<>() ;
        jSONParser a = new jSONParser();
        var  f = a.parseJson(file, eJSONentities.JSONDAYQUOTE);
        if(f instanceof JSONdayQuote<?>) {
            var mapa = ((JSONdayQuote<?>) f).timeSeries.getProperties();
            Set<String> listdayli = mapa.keySet();
            for (String d : listdayli) {
                LinkedHashMap daily = (LinkedHashMap) mapa.get(d);
                Quote quote = generateDBEntity(daily);
                quote.setDay(new DateUtils().convertStringTodate(d));
                quote.setTicker(((JSONdayQuote<?>) f).metaData.getSymbol());
                quotes.add(quote);
            }
            Sorter sorter = new Sorter();
            sorter.sortByDate(quotes);
        }
        return quotes;
    }


    private   Quote generateDBEntity(LinkedHashMap values){
        Quote quote = new Quote();
        quote.setOpen(Float.parseFloat((String) values.get("1. open")));
        quote.setClose(Float.parseFloat((String) values.get("2. high")));
        quote.setHigt(Float.parseFloat((String) values.get("3. low")));
        quote.setLow(Float.parseFloat((String) values.get("4. close")));
        quote.setVolume(Integer.parseInt((String) values.get("5. volume")));
        return quote;
    }

}

package com.example.Ago.Utils.ChartsConverter;

import com.example.Ago.Entity.DBEntities.Quote;

import java.util.ArrayList;
import java.util.List;

public class CandlestickChartsConverter   implements Converter{

    @Override
    public Object[] convert(Object[] list) {
        return new Object[0];
    }

    @Override
    public Object[] convert(List list) {
        Object [] listQuotes = new Object[list.size()];
        int count = 0;
        for(Quote q : (ArrayList<Quote>)list){
            Object [] quote = new Object []
                    {
                            q.getDay(),
                            q.getOpen(),
                            q.getLow(),
                            q.getHigt(),
                            q.getClose()
                    };
            listQuotes[count] = quote;
            count++;
        }
        return  listQuotes;
    }



}

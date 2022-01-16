package com.example.Ago.Utils;

import com.example.Ago.Entity.DBEntities.Quote;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class SorterQuotes  implements SortingByDate {

    @Override
    public void sortByDate(List list) {
        bubbleSort(list);
    }

    private void bubbleSort(List<Quote> listQuotes) {
        boolean isSorted = false;
        Quote buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < listQuotes.size()-1; i++) {
                if(checkDate(listQuotes.get(i),listQuotes.get(i+1))){
                    isSorted = false;
                    buf = listQuotes.get(i);
                    listQuotes.set(i,listQuotes.get(i+1));
                    listQuotes.set(i+1,buf);
                }
            }
        }

    }

    private boolean checkDate(Quote fQuote, Quote sQuote){
        Date one = fQuote.getDay();
        Date two = sQuote.getDay();
        if(one.after(two)){
            return true;
        }else {
            return false;
        }
    }

    private Date generateDate(String _srt){
        Date date = null;
        try {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            date = format.parse(_srt);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }



}

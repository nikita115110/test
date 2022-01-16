package com.example.Ago.Utils;

import com.example.Ago.Entity.DBEntities.Quote;

import java.util.List;

public class Sorter  {

    public void sortByDate(List<Quote> quotes){
        var _sorter = new SorterQuotes();
        _sorter.sortByDate(quotes);
    }

}

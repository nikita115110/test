package com.example.Ago.Core.AgoAnalyzerCore.GeneratorsIdeas.Strategies.ListStrategy;

import com.example.Ago.Core.AgoAnalyzerCore.GeneratorsIdeas.Strategies.Strategy;
import com.example.Ago.Entity.DBEntities.Quote;
import com.example.Ago.Repositories.QuoteRepositoryAggregateQuery;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class ValueStrategy extends Strategy {

    @Setter @Getter
    private SearchConfiguration searchConfiguration;
    @Setter @Getter
    private QuoteRepositoryAggregateQuery quoteRepositoryAggregateQuery;

    @Override
    public void launchStrategy() {
        super.start();
    }

    @Override
    public void run() {
        List<Quote> quoteList =
                quoteRepositoryAggregateQuery
                        .findByTickerAndDayBetween(
                                searchConfiguration.getTicker(),
                                searchConfiguration.getAfter(),
                                searchConfiguration.getBefore());
        List<SumQuotes> sumQuotesList = go(quoteList);
        bubbleSort(sumQuotesList);


    }

    private List<SumQuotes> go(List<Quote> list){
        List<SumQuotes> sumQuotesList = new ArrayList<>();

        int start = 0;
        int end = searchConfiguration.getLenght();
        int count = list.size() - searchConfiguration.getLenght();

        for (int a=0;a <count ; a++){

            SumQuotes sumQuotes = new SumQuotes();
            for(Quote q : list.subList(start,end)){
                sumQuotes.addQuote(q);
            }
            sumQuotes.calculateAVG();
            sumQuotesList.add(sumQuotes);

            start++;
            end++;
        }

        return sumQuotesList;
    }


    private class SumQuotes{

        @Getter
        private int avg = 0;
        @Getter
        private List<Quote> listQuotes = new ArrayList<>();

        public void addQuote(Quote quote){
            listQuotes.add(quote);
        }

        public void calculateAVG(){
            for(Quote q : listQuotes){
                avg = avg + q.getVolume();
            }
        }

    }

    private void bubbleSort(List<SumQuotes> listQuotes) {
        boolean isSorted = false;
        SumQuotes buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < listQuotes.size()-1; i++) {
                if(listQuotes.get(i).avg<listQuotes.get(i+1).avg){
                    isSorted = false;
                    buf = listQuotes.get(i);
                    listQuotes.set(i,listQuotes.get(i+1));
                    listQuotes.set(i+1,buf);
                }
            }
        }


    }

}

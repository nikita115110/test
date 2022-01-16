package com.example.Ago.Core.AgoAnalyzerCore.GeneratorsIdeas.Strategies.ListStrategy.CandlePatternStrategyModules;

import com.example.Ago.Entity.DBEntities.Quote;

public interface CandlePatternFinder{

    boolean findCandlePattern(Quote quote);

    default boolean checkQuoteSentiment(Quote quote){
        if(quote.getClose() > quote.getOpen())return true;
        else return false;
    }



}

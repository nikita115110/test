package com.example.Ago.Core.AgoAnalyzerCore.GeneratorsIdeas.Strategies.ListStrategy.CandlePatternStrategyModules;

import com.example.Ago.Entity.DBEntities.Quote;

public class DojiFinder implements CandlePatternFinder {

    @Override
    public boolean findCandlePattern(Quote quote) {
        if (checkQuoteSentiment(quote)) {
            if(quote.getHigt() - quote.getClose() >quote.getClose()-quote.getOpen()
                    && quote.getOpen() -quote.getLow() > quote.getClose()-quote.getOpen()) return true;
        } else if (checkQuoteSentiment(quote) == false) {
            if(quote.getHigt() - quote.getOpen() >quote.getOpen()-quote.getClose()
                    && quote.getClose() -quote.getLow() > quote.getOpen()-quote.getClose()) return true;
        }
        return false;
    }


}

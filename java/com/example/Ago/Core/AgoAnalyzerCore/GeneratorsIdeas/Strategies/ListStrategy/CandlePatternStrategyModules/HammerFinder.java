package com.example.Ago.Core.AgoAnalyzerCore.GeneratorsIdeas.Strategies.ListStrategy.CandlePatternStrategyModules;

import com.example.Ago.Entity.DBEntities.Quote;

public class HammerFinder implements CandlePatternFinder {

    @Override
    public boolean findCandlePattern(Quote quote) {
        if (checkQuoteSentiment(quote)) {
            if (quote.getOpen() - quote.getLow() > quote.getHigt() - quote.getOpen()) return true;
        } else if (checkQuoteSentiment(quote) == false) {
            if (quote.getClose() - quote.getLow() > quote.getHigt() - quote.getClose()) return true;
        }
        return false;
    }

}

package com.example.Ago.Repositories;

import com.example.Ago.Entity.DBEntities.Quote;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface QuoteRepository extends CrudRepository<Quote, Integer> {


    List<Quote> findByDayAndTicker(Date day,String ticker);

    List<Quote>findByTickerAndDayAfter(String ticker, Date day);

    List<Quote> findByTickerAndDayBefore(String ticker , Date day);

    List<Quote> findByTickerAndDayBetween(String ticker , Date after,Date before);



}

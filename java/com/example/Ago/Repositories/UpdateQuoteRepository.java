package com.example.Ago.Repositories;

import com.example.Ago.Entity.DBEntities.UpdateQuote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UpdateQuoteRepository extends CrudRepository<UpdateQuote , Integer> {

    @Query(value = "SELECT * from UPDATEQUOTES where TICKER = :TICKER",nativeQuery = true)
    List<UpdateQuote> findByTicker(@Param("TICKER") String ticker);



}

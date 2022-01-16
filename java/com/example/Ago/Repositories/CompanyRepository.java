package com.example.Ago.Repositories;

import com.example.Ago.Entity.DBEntities.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompanyRepository  extends CrudRepository<Company,Integer> {

    @Query(value = "SELECT * from  COMPANIES where CURRENCY = 'USD'",nativeQuery = true)
    List<Company> findCompaniesInUSD();

    @Query (value = "SELECT * from  COMPANIES where CURRENCY = 'RUB'",nativeQuery = true)
    List<Company> findCompaniesInRUB();

    @Query (value = "SELECT * from  COMPANIES where CURRENCY = 'EUR'",nativeQuery = true)
    List<Company> findCompaniesInEUR();

    @Query (value = "SELECT * from COMPANIES where TICKER = :ticker ",nativeQuery = true)
    List<Company> findCompany ( @Param("ticker") String ticker);

    @Query(value = "SELECT TICKER from COMPANIES" ,nativeQuery = true)
    List<String> findAllTickerCompanies();

}



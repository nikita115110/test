package com.example.Ago.Downloader;

import com.example.Ago.FileMeneger.FileMenegerJSON;
import com.example.Ago.Repositories.CompanyRepository;
import com.example.Ago.Repositories.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Downloader {


    @Autowired
    private DownloaderEconomicIndicators downloaderEconomicIndicators;
    @Autowired
    private DownloaderQuotes downloaderQuotes;
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private FileMenegerJSON fileMenegerJSON;

    public  void  downloadQuoters(){

    }

    public void downCompanies(){

    }


    public void dowloadAllTicker(){

    }

}

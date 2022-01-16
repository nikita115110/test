package com.example.Ago.Downloader;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DownloaderConfiguration {

    @Bean
    public  DownloaderQuotes downloaderQuotes(){
        return new DownloaderQuotes();
    }

    @Bean
    public DownloaderEconomicIndicators downloaderEconomicIndicators(){
        return new DownloaderEconomicIndicators();
    }

}

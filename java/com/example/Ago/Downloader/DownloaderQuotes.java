package com.example.Ago.Downloader;


import com.example.Ago.DayProperties;
import com.example.Ago.Repositories.RepositoryMeneger;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DownloaderQuotes extends Thread implements DownloaderData{

    @Autowired
    private RepositoryMeneger repositoryMeneger;

    public List<String> urls =new ArrayList<>();

    @Override
    public void run() {
        int count = 0;
        for (String s : urls){
            try {
                try {
                    download(s);
                }catch (Exception e){

                }
                Thread.sleep(13000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;

        }
    }

    @Override
    public void download(String ticker)  {
        String url = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol="+ ticker+"&outputsize=full&apikey="+ DayProperties.key;
        Loader loader = new Loader();
        try {
            String d = loader.run(url);
            try(FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\Ago\\src\\main\\resources\\JSON\\"+ticker + ".json", false))
            {
                writer.write(d);
                writer.flush();
            }
            catch(IOException ex){
            }
        } catch (IOException e) {
                e.printStackTrace();
        }
    }


    @Override
    public void downloadByTicker(List<String> tickers) {

    }

    @Override
    public void downloadAllTicker() {

    }


}

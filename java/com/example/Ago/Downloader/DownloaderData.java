package com.example.Ago.Downloader;

import java.util.List;

public interface DownloaderData {

    void download(String url);

    void downloadByTicker(List<String> tickers);

    void downloadAllTicker();

}

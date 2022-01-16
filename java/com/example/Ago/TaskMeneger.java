package com.example.Ago;

import com.example.Ago.FileMeneger.Readers.Reader;
import com.example.Ago.FileMeneger.Readers.ReaderCSV;
import com.example.Ago.Entity.DBEntities.Company;
import com.example.Ago.FileMeneger.FileMenegerJSON;
import com.example.Ago.Repositories.CompanyRepository;
import com.example.Ago.Repositories.QuoteRepository;
import com.example.Ago.Repositories.RepositoryMeneger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class TaskMeneger {
    @Autowired
    private FileMenegerJSON fileMenegerJSON;
    @Autowired
    private RepositoryMeneger repositoryMeneger;
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private QuoteRepository quoteRepository;

    public  void createListUpdateQuotes(){
        List<String> list = new ArrayList<>(); // файлы для записи
        Set<String> downloadlist = new HashSet<>(); //Файлы из папки
        for(String s : fileMenegerJSON.findAll()){
            String [] arr  =s.split("\\.");
            downloadlist.add(arr[0]);
        }
        Reader reader = new ReaderCSV();
        try {
            List <Company> companyList = (List<Company>) reader.read("C:\\Users\\User\\Desktop\\Ago\\src\\main\\resources\\CSV\\ListingSecurityList.csv");
            for (Company company : companyList){
                repositoryMeneger.addRecord(company);
            }
            for(Company company : companyRepository.findCompaniesInUSD()){
                if(downloadlist.contains(company.getTicker()) == false){
                    list.add(company.getTicker());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try(FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\Ago\\src\\main\\resources\\Other\\plane.txt", false))
        {
            for(String s : list){
                writer.append(s);
                writer.append('\n');
            }
            writer.flush();
        }
        catch(IOException ex){

        }

    }



}

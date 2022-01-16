package com.example.Ago.DayPropirties;

import com.example.Ago.FileMeneger.Readers.Reader;
import com.example.Ago.FileMeneger.Readers.ReaderCSV;
import com.example.Ago.DayProperties;
import com.example.Ago.Entity.DBEntities.Company;
import com.example.Ago.Repositories.RepositoryMeneger;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;


public class UpdateStateCompanies implements UpdateStateProperties {


    @Autowired
    private RepositoryMeneger repositoryMeneger ;

    @Override
    public void update() {
        Reader reader = new ReaderCSV();
        try {
            List<Company> companies = (List<Company>) reader.read("C:\\Users\\User\\Desktop\\Ago\\src\\main\\resources\\CSV\\ListingSecurityList.csv");
            for (Company company: companies) {
               repositoryMeneger.addRecord(company);
            }
            updateState();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateState() {
        DayProperties.stateUpdatedCompanies = 100;
    }



}

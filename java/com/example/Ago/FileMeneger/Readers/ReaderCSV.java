package com.example.Ago.FileMeneger.Readers;

import com.example.Ago.Entity.DBEntities.Company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderCSV implements Reader{

    @Override
    public List<Company> read(String file) throws IOException {
        List <Company> list = new ArrayList<>();
        String line = null;
        Scanner scanner = null;
        int index = 0;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int count = 0;
        while ((line = reader.readLine()) != null) {
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            Company  company = new Company();
            while (scanner.hasNext()){
                String data = scanner.next();
                switch (index) {
                    case 2 -> company.setFullname(data);
                    case 6 -> company.setTicker(data);
                    case 11 -> company.setCurrency(data);
                }
                index++;
            }
            list.add(company);

            index = 0;
        }
        return list;

    }

}

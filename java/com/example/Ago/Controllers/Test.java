package com.example.Ago.Controllers;


import com.example.Ago.Entity.DBEntities.Quote;
import com.example.Ago.Repositories.QuoteRepository;
import com.example.Ago.Utils.ChartsConverter.CandlestickChartsConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
public class Test {

    @Autowired
    private QuoteRepository quoteRepository;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test (Model model){

        String stringDate="2020-10-00";
        Date date= null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String stringDate1="2022-01-10";
        Date date1= null;
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(stringDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<Quote> list =quoteRepository.findByTickerAndDayBetween("MSFT",date,date1);
        var listQuotes = new CandlestickChartsConverter().convert(list);
        model.addAttribute("list" , listQuotes);

        return "t";
    }



}

package com.example.Ago.Core.AgoAnalyzerCore.GeneratorsIdeas.Strategies.ListStrategy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
public class SearchConfiguration {

    @Setter @Getter
    private String ticker;
    @Setter @Getter
    private Date after;
    @Setter @Getter
    private Date before;
    @Setter @Getter
    private int lenght;

}

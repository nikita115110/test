package com.example.Ago.Core.AgoAnalyzerCore.GeneratorsIdeas.Strategies;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public abstract class Strategy extends Thread {

    abstract public void launchStrategy();



}

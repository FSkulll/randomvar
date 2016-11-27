package edu.randomvar.mvc.service;

import java.util.Map;

public interface GenerateNumbers {

    //return generated random numbers
    Map<String, Integer> getNumbers();

    //generate random numbers
    void generateSet(int n);

    //return curr n value
    int getN();
}

package edu.randomvar.mvc.service.impl;

import edu.randomvar.mvc.service.GenerateNumbers;

import java.util.*;

/**
 * Created by FSkul on 09.12.2016.
 */
public class MonteCarlo implements GenerateNumbers {
    private int n = 10000;
    @Override
    public Map<Double, Integer> getNumbers() {
        Double key=0.0;
        Map<Double, Integer> map = new HashMap<Double, Integer>();

        for(int i=0;i<n;i++){
            for(int j=0; j<5;j++){
                key += Math.random();
            }
            key/=5;
            key = Math.round(key* Math.pow(10,1))/Math.pow(10,1);
            Integer temp = map.get(key);
            map.put(key, temp == null ? 1 : temp + 1);
        }


        SortedMap<Double, Integer> test = new TreeMap<Double, Integer>(map);
        return test;
    }

    @Override
    public void generateSet(int n) {
        this.n = n;
    }

    @Override
    public int getN() {
        return n;
    }
}

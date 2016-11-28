package edu.randomvar.mvc.service.impl;

import edu.randomvar.mvc.service.GenerateNumbers;

import java.util.*;

/**
 * Created by FSkul on 29.10.2016.
 */
public class NativeRandom implements GenerateNumbers {

    private int n = 10000;
    private Random random;

    @Override
    public Map<Double, Integer> getNumbers() {
        random = new Random();
        Map<Double, Integer> map = new HashMap<Double, Integer>();
        for(int i = 0; i < n; i++){
            Double key = Math.random();
            key = Math.round(key* Math.pow(10,1))/Math.pow(10,1);
            Integer temp = map.get(key);
            map.put(key, temp == null ? 1 : temp + 1);
        }
        SortedMap<Double, Integer> test = new TreeMap<Double, Integer>(map);
        return test;
    }

    @Override
    public void generateSet(int n) {

        //set n from request
        this.n = n;
    }

    @Override
    public int getN() {
        return n;
    }
}

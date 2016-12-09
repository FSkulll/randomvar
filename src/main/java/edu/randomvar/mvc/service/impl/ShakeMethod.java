package edu.randomvar.mvc.service.impl;

import edu.randomvar.mvc.service.GenerateNumbers;

import java.util.*;

/**
 * Created by FSkul on 09.12.2016.
 */
public class ShakeMethod implements GenerateNumbers {

    private int n = 10000;
    private Random random;


    @Override
    public Map<Double, Integer> getNumbers() {
        Map<Double, Integer> map = new HashMap<Double, Integer>();
        Double a = Math.random();
        String str = a.toString().substring(2,8);
        int key = Integer.parseInt(str);
        for(int i=0; i < n; i++){
            int left = key << 8;
            int right = key >> 8;
            key = left + right;
            if(key < 0) key = -key;
            Double keyd = Double.parseDouble("0."+key);

            Double tmp = Math.round(keyd* Math.pow(10,1))/Math.pow(10,1);
            Integer temp = map.get(tmp);
            map.put(tmp, temp == null ? 1 : temp + 1);
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

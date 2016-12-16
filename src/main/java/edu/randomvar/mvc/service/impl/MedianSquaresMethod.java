package edu.randomvar.mvc.service.impl;

import edu.randomvar.mvc.service.GenerateNumbers;

import java.util.*;

/**
 * Created by FSkul on 28.11.2016.
 */
public class MedianSquaresMethod implements GenerateNumbers {

    private int n = 10000;
    private Random random;

    @Override
    public Map<Double, Integer> getNumbers() {
        random = new Random();
        Map<Double, Integer> map = new HashMap<Double, Integer>();
        Double key = Math.random();
        key = Math.round(key* Math.pow(10,4))/Math.pow(10,4);
        for(int i = 0; i < n; i++){
            Integer a = Integer.parseInt(key.toString().replace("0.",""));
            key = Math.pow(a,2);
            key = Math.round(key* Math.pow(10,8))/Math.pow(10,8);

            Long ln = Double.valueOf(key).longValue();
            String str;
            if(ln.toString().length() < 6) str = "0." + ln.toString()+"000000";
            else str = "0." + ln.toString().substring(2, 6);
            key = Double.parseDouble(str);


            //transform to 0.?
            Double tmp = Math.round(key* Math.pow(10,1))/Math.pow(10,1);
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

    @Override
    public Double getM() {
        return null;
    }

    @Override
    public Double getD() {
        return null;
    }
}

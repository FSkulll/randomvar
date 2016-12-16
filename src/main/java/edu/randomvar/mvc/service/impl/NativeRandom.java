package edu.randomvar.mvc.service.impl;

import edu.randomvar.mvc.service.GenerateNumbers;

import java.util.*;

/**
 * Created by FSkul on 29.10.2016.
 */
public class NativeRandom implements GenerateNumbers {

    private int n = 10000;
    private Random random;
    private Double sum = 0.0;

    @Override
    public Map<Double, Integer> getNumbers() {
        random = new Random();
        Map<Double, Integer> map = new HashMap<Double, Integer>();
        for(int i = 0; i < n; i++){
            Double key = 0.0 + Math.random()*1.0;

            key = Math.round(key* Math.pow(10,1))/Math.pow(10,1);
            sum += key*0.1;
            Integer temp = map.get(key);
            map.put(key, temp == null ? 1 : temp + 1);


//            if(key >=0.0 && key < 0.1){
//                Integer temp = map.get(0.1);
//                map.put(0.1, temp == null ? 1 : temp + 1);
//            }
//            if(key >=0.1 && key < 0.2){
//                Integer temp = map.get(0.2);
//                map.put(0.2, temp == null ? 1 : temp + 1);
//            }
//            if(key >=0.2 && key < 0.3){
//                Integer temp = map.get(0.3);
//                map.put(0.3, temp == null ? 1 : temp + 1);
//            }
//            if(key >=0.3 && key < 0.4){
//                Integer temp = map.get(0.4);
//                map.put(0.4, temp == null ? 1 : temp + 1);
//            }
//            if(key >=0.4 && key < 0.5){
//                Integer temp = map.get(0.5);
//                map.put(0.5, temp == null ? 1 : temp + 1);
//            }
//            if(key >=0.5 && key < 0.6){
//                Integer temp = map.get(0.6);
//                map.put(0.6, temp == null ? 1 : temp + 1);
//            }
//            if(key >=0.6 && key < 0.7){
//                Integer temp = map.get(0.7);
//                map.put(0.7, temp == null ? 1 : temp + 1);
//            }
//            if(key >=0.7 && key < 0.8){
//                Integer temp = map.get(0.8);
//                map.put(0.8, temp == null ? 1 : temp + 1);
//            }
//            if(key >=0.8 && key < 0.9){
//                Integer temp = map.get(0.9);
//                map.put(0.9, temp == null ? 1 : temp + 1);
//            }
//            if(key >=0.9 && key < 1.0){
//                Integer temp = map.get(1.0);
//                map.put(1.0, temp == null ? 1 : temp + 1);
//            }
        }
//        map.remove(0.0);
//        map.remove(1.0);
//        map.put(1.0, map.get(0.4));

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

    @Override
    public Double getM() {
        return sum;
    }

    @Override
    public Double getD() {
        return sum;
    }
}

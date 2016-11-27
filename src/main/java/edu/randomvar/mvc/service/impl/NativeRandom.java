package edu.randomvar.mvc.service.impl;

import edu.randomvar.mvc.service.GenerateNumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by FSkul on 29.10.2016.
 */
public class NativeRandom implements GenerateNumbers {

    private int n = 10000;

    @Override
    public Map<String, Integer> getNumbers() {
        Random random = new Random();
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("1",random.nextInt());
        map.put("2",random.nextInt());
        map.put("3",random.nextInt());
        map.put("4",random.nextInt());
        map.put("Не еба",random.nextInt());
        return map;
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

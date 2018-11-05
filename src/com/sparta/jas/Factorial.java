package com.sparta.jas;

public class Factorial {
    public long getFact(int number){
        if (number == 0){
            return 1;
        }
        return number * getFact((number - 1));
    }
}

package com.generics;

public class FindMaximum {
    public static <E extends Comparable<E>> E testMaximum(E x,E y,E z){
        E Tmax=x;
        if(y.compareTo(Tmax) >0){
            Tmax=y;
        }
        if(z.compareTo(Tmax) >0){
            Tmax=z;
        }
        return Tmax;

    }
}

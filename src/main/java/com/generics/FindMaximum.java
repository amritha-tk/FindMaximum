package com.generics;

public class FindMaximum {

    public static int testMaximum(Integer x, Integer y, Integer z) {
        Integer max=x;
        if(y.compareTo(max) >0){
            max=y;
        }
        if(z.compareTo(max) >0){
            max=z;
        }
        return max;
    }

    public static float testMaximum(Float x,Float y,Float z) {
        Float max=x;
        if(y.compareTo(max) >0){
            max=y;
        }
        if(z.compareTo(max) >0){
            max=z;
        }
        return max;
    }

    public static String testMaximum(String x,String y,String z) {
        String max=x;
        if(y.compareTo(max) >0){
            max=y;
        }
        if(z.compareTo(max) >0){
            max=z;
        }
        return max;
    }
}

package com.generics;

import java.util.Arrays;

public class FindMaximum<E extends Comparable<E>>{
     E[] optionalInputs;
    E firstValue,secondValue,thirdValue;

    public FindMaximum(E firstValue, E secondValue, E thirdValue,E ...optionalInputs) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        this.optionalInputs=optionalInputs;
    }

    public E testMaximum(){
        return testMaximum(firstValue,secondValue,thirdValue,optionalInputs);
    }

    public static <E extends Comparable<E>> E testMaximum(E firstInput, E secondInput, E thirdInput,E ...optionalInputs){
        E Tmax=firstInput;
        if(secondInput.compareTo(Tmax) >0){
            Tmax=secondInput;
        }
        if(thirdInput.compareTo(Tmax) >0){
            Tmax=thirdInput;
        }
        for(E value:optionalInputs){
            if(value.compareTo(Tmax)>0)
                Tmax=value;
        }
        printMax(Tmax);

        return Tmax;

    }

    public static <E> void printMax(E max){
        System.out.println("Max of all values is "+max);
    }
    public static void main(String[] args){
        Integer xInt=10,yInt=20,zInt=30,optInt1=40;
        Float xFl=30.56f,yFl=20.54f,zFl=10.57f,optFl1=40.56f;
        String xStr="Apple",yStr="Peach",zStr="Banana",optStr1="Grapes";

        new FindMaximum<Integer>(xInt,yInt,zInt,optInt1).testMaximum();
        new FindMaximum<Float>(xFl,yFl,zFl,optFl1).testMaximum();
        new FindMaximum<String>(xStr,yStr,zStr,optStr1).testMaximum();
    }

}

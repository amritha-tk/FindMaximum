package com.generics;

public class FindMaximum<E extends Comparable<E>>{
    E inputX,inputY,inputZ;

    public FindMaximum(E inputX, E inputY, E inputZ) {
        this.inputX = inputX;
        this.inputY = inputY;
        this.inputZ = inputZ;
    }

    public E testMaximum(){
        return testMaximum(inputX,inputY,inputZ);
    }

    public static <E extends Comparable<E>> E testMaximum(E x, E y, E z){
        E Tmax=x;
        if(y.compareTo(Tmax) >0){
            Tmax=y;
        }
        if(z.compareTo(Tmax) >0){
            Tmax=z;
        }
        return Tmax;

    }
    public static void main(String args[]){
        Integer xInt=10,yInt=20,zInt=30;
        Float xFl=30.56f,yFl=20.54f,zFl=10.57f;
        String xStr="Apple",yStr="Peach",zStr="Banana";

        new FindMaximum<Integer>(xInt,yInt,zInt);
        new FindMaximum<Float>(xFl,yFl,zFl);
        new FindMaximum<String>(xStr,yStr,zStr);
    }

}

package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void givenMaxIntegerNumber_AtPositionOne_ReturnsSameNumber() {
        Integer maxInteger=new FindMaximum<>(40,20,30,10).testMaximum();
        Integer expectedMax=40;
        Assert.assertEquals(expectedMax,maxInteger);
    }

    @Test
    public void givenMaxIntegerNumber_AtPositionTwo_ReturnSameNumber() {
        Integer maxInteger=new FindMaximum<>(20,40,30,10).testMaximum();
        Integer expectedMax=40;
        Assert.assertEquals(expectedMax,maxInteger);
    }

    @Test
    public void givenMaxIntegerNumber_AtPositionThree_ReturnSameNumber() {
        Integer maxInteger=new FindMaximum<>(30,20,40,10).testMaximum();
        Integer expectedMax=40;
        Assert.assertEquals(expectedMax,maxInteger);
    }

    @Test
    public void givenMaxFloatNumber_AtPositionOne_ReturnSameNumber() {
        Float maxFloat=new FindMaximum<>(40.56f,20.54f,30.56f,10.57f).testMaximum();
        Float expectedMax=40.56f;
        Assert.assertEquals(expectedMax,maxFloat);
    }

    @Test
    public void givenMaxFloatNumber_AtPositionTwo_ReturnSameNumber() {
        Float maxFloat=new FindMaximum<>(20.54f, 40.56f, 10.57f,30.56f).testMaximum();
        Float expectedMax=40.56f;
        Assert.assertEquals(expectedMax,maxFloat);
    }

    @Test
    public void givenMaxFloatNumber_AtPositionThree_ReturnSameNumber() {
        Float maxFloat=new FindMaximum<>(20.54f, 10.57f, 40.56f,30.56f).testMaximum();
        Float expectedMax=40.56f;
        Assert.assertEquals(expectedMax,maxFloat);
    }

    @Test
    public void givenStringMax_AtPositionOne_ReturnSameString() {
        String maximum = new FindMaximum<>("Peach", "Apple", "Banana","Grapes").testMaximum();
        String expectedMax ="Peach";
        Assert.assertEquals(expectedMax,maximum);
    }

    @Test
    public void givenStringMax_AtPositionTwo_ReturnSameString() {
        String maximum = new FindMaximum<>("Apple", "Peach", "Banana","Grapes").testMaximum();
        String expectedMax ="Peach";
        Assert.assertEquals(expectedMax,maximum);
    }

    @Test
    public void givenStringMax_AtPositionThree_ReturnSameString() {
        String maximum = new FindMaximum<>("Banana", "Apple", "Peach","Grapes").testMaximum();
        String expectedMax ="Peach";
        Assert.assertEquals(expectedMax,maximum);
    }
}



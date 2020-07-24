package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void givenMaxIntegerNumber_AtPositionOne_ReturnsSameNumber() {
        FindMaximum maximum = new FindMaximum();
        int result = maximum.testMaximum(30, 20, 10);
        Assert.assertEquals(30,result);

    }

    @Test
    public void givenMaxIntegerNumber_AtPositionTwo_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum();
        int result = maximum.testMaximum(10, 30, 20);
        Assert.assertEquals(30,result);

    }

    @Test
    public void givenMaxIntegerNumber_AtPositionThree_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum();
        int result = maximum.testMaximum(10, 20, 30);
        Assert.assertEquals(30,result);
    }

    @Test
    public void givenMaxFloatNumber_AtPositionOne_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum();
        float result = maximum.testMaximum(30.56f, 20.54f, 10.57f);
        Assert.assertEquals(30.56f,result,0.001);
    }

    @Test
    public void givenMaxFloatNumber_AtPositionTwo_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum();
        float result = maximum.testMaximum(20.54f, 30.56f, 10.57f);
        Assert.assertEquals(30.56f,result,0.001);
    }

    @Test
    public void givenMaxFloatNumber_AtPositionThree_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum();
        float result = maximum.testMaximum(10.57f, 20.54f, 30.56f);
        Assert.assertEquals(30.56f,result,0.001);
    }
}


package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void givenMaxIntegerNumber_AtPositionOne_ReturnsSameNumber() {
        FindMaximum maximum = new FindMaximum(30, 20, 10);
        int result = maximum.testMaximum(30, 20, 10);
        Assert.assertEquals(30,result);

    }

    @Test
    public void givenMaxIntegerNumber_AtPositionTwo_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum(10, 30, 20);
        int result = maximum.testMaximum(10, 30, 20);
        Assert.assertEquals(30,result);

    }

    @Test
    public void givenMaxIntegerNumber_AtPositionThree_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum(10, 20, 30);
        int result = maximum.testMaximum(10, 20, 30);
        Assert.assertEquals(30,result);
    }

    @Test
    public void givenMaxFloatNumber_AtPositionOne_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum(30.56f, 20.54f, 10.57f);
        float result = maximum.testMaximum(30.56f, 20.54f, 10.57f);
        Assert.assertEquals(30.56f,result,0.001);
    }

    @Test
    public void givenMaxFloatNumber_AtPositionTwo_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum(20.54f, 30.56f, 10.57f);
        float result = maximum.testMaximum(20.54f, 30.56f, 10.57f);
        Assert.assertEquals(30.56f,result,0.001);
    }

    @Test
    public void givenMaxFloatNumber_AtPositionThree_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum(10.57f, 20.54f, 30.56f);
        float result = maximum.testMaximum(10.57f, 20.54f, 30.56f);
        Assert.assertEquals(30.56f,result,0.001);
    }

    @Test
    public void givenStringMax_AtPositionOne_ReturnSameString() {
        FindMaximum maximum = new FindMaximum("Peach", "Apple", "Banana");
        String result = maximum.testMaximum("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void givenStringMax_AtPositionTwo_ReturnSameString() {
        FindMaximum maximum = new FindMaximum("Apple", "Peach", "Banana");
        String result = maximum.testMaximum("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void givenStringMax_AtPositionThree_ReturnSameString() {
        FindMaximum maximum = new FindMaximum("Apple", "Banana", "Peach");
        String result = maximum.testMaximum("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach",result);
    }

}


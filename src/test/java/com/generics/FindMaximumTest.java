package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void givenMaxNumber_AtPositionOne_ReturnsSameNumber() {
        FindMaximum maximum = new FindMaximum();
        int result = maximum.testMaximum(30, 20, 10);
        Assert.assertEquals(30,result);

    }

    @Test
    public void givenMaxNumber_AtPositionTwo_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum();
        int result = maximum.testMaximum(10, 30, 20);
        Assert.assertEquals(30,result);

    }

    @Test
    public void givenMaxNumber_AtPositionThree_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum();
        int result = maximum.testMaximum(10, 20, 30);
        Assert.assertEquals(30,result);
    }
}


package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void givenMaxIntegerNumber_AtPositionOne_ReturnsSameNumber() {
        FindMaximum maximum = new FindMaximum(30, 20, 10);
        Comparable result = maximum.testMaximum();
        Assert.assertEquals(30,result);
    }

    @Test
    public void givenMaxIntegerNumber_AtPositionTwo_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum(10, 30, 20);
        Comparable result = maximum.testMaximum();
        Assert.assertEquals(30,result);
    }

    @Test
    public void givenMaxIntegerNumber_AtPositionThree_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum(10, 20, 30);
        Comparable result = maximum.testMaximum();
        Assert.assertEquals(30,result);
    }

    @Test
    public void givenMaxFloatNumber_AtPositionOne_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum(30.56f, 20.54f, 10.57f);
        Comparable result = maximum.testMaximum();
        Assert.assertEquals(30.56f,result);
    }

    @Test
    public void givenMaxFloatNumber_AtPositionTwo_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum(20.54f, 30.56f, 10.57f);
        Comparable result = maximum.testMaximum();
        Assert.assertEquals(30.56f,result);
    }

    @Test
    public void givenMaxFloatNumber_AtPositionThree_ReturnSameNumber() {
        FindMaximum maximum = new FindMaximum(10.57f, 20.54f, 30.56f);
        Comparable result = maximum.testMaximum();
        Assert.assertEquals(30.56f,result);
    }

    @Test
    public void givenStringMax_AtPositionOne_ReturnSameString() {
        FindMaximum maximum = new FindMaximum("Peach", "Apple", "Banana");
        Comparable result = maximum.testMaximum();
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void givenStringMax_AtPositionTwo_ReturnSameString() {
        FindMaximum maximum = new FindMaximum("Apple", "Peach", "Banana");
        Comparable result = maximum.testMaximum();
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void givenStringMax_AtPositionThree_ReturnSameString() {
        FindMaximum maximum = new FindMaximum("Apple", "Banana", "Peach");
        Comparable result = maximum.testMaximum();
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void givenMaxIntegerNumber_AtOptionalPosition_ReturnsSameNumber(){
        FindMaximum maximum=new FindMaximum(10,20,30,40);
        Comparable result=maximum.testMaximum();
        Assert.assertEquals(40,result);
    }

    @Test
    public void givenMaxFloatNumber_AtOptionalPosition_ReturnsSameNumber(){
        FindMaximum maximum=new FindMaximum(30.56f,20.54f,10.57f,40.56f);
        Comparable result=maximum.testMaximum();
        Assert.assertEquals(40.56f,result);
    }

    @Test
    public void givenStringMax_AtOptionalPosition_ReturnsSameString(){
        FindMaximum maximum=new FindMaximum("Grapes","Apple","Banana","Peach");
        Comparable result=maximum.testMaximum();
        Assert.assertEquals("Peach",result);
    }

}


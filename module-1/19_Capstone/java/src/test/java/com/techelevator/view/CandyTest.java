package com.techelevator.view;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * CandyTest
 */
public class CandyTest {

    private static Class<?> candy;

    @BeforeClass
    public static void setup() {
        try {
            candy = Class.forName("com.techelevator.Candy");
        } catch (ClassNotFoundException e) {
            fail("com.techelevator.Candy class not found");
        }
    }

    @Test
    public void testCandyConstructor()
            throws IllegalAccessException, InvocationTargetException, InstantiationException {
        try {
            Constructor<?> constructor = candy.getConstructor(String.class, String.class, BigDecimal.class, String.class);
            Object sut = constructor.newInstance("TESTID", "TESTPNAME", 1, "TESTCATE");
            assertNotNull(sut);
            assertEquals("TESTID", sut.getClass().getMethod("getSlotId").invoke(sut));
            assertEquals("TESTPNAME", sut.getClass().getMethod("getProductName").invoke(sut));
            assertEquals(1, sut.getClass().getMethod("getPrice").invoke(sut));
            assertEquals("TESTCATE", sut.getClass().getMethod("getCategory").invoke(sut));
        } catch (NoSuchMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testIsAnItem() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        try {
            Constructor<?> constructor = candy.getConstructor(String.class, String.class, BigDecimal.class, String.class);
            Object sut = constructor.newInstance("TESTID", "TESTPNAME", 1, "TESTCATE");
            assertNotNull(sut);
            assertEquals("com.techelevator.Item", sut.getClass().getSuperclass().getTypeName());
        } catch (NoSuchMethodException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testStringMessageSound()
    {
        //Candy candy = new Candy(String.class, String.class, BigDecimal.class, String.class); // you didn't supply the object, so I guessed
        boolean expected = "super.getCategory() + \" Munch Munch, Yum!\"" != null; // put the expected value here
        Assert.assertFalse(expected);
    }
}
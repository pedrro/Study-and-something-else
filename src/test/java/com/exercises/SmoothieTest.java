package com.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmoothieTest {
    @Test
    public void classicSmoothie() {
        assertEquals("banana,honey,mango,peach,pineapple,strawberry",
                Smoothie.ingredients("Classic"));
    }

    @Test
    public void classicSmoothieWithoutStrawberry() {
        assertEquals("banana,honey,mango,peach,pineapple",
                Smoothie.ingredients("Classic,-strawberry"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfSmoothieDoesntExist() {
        Smoothie.ingredients("Vitamin smoothie");
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfOrderIsEmpty() {
        Smoothie.ingredients("");
    }

}
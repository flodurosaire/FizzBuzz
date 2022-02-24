package org.example;

import static org.junit.Assert.assertTrue;

import junit.framework.Assert;
import org.junit.Test;

public class AppTest
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testDoFizzBuzz_NumberDivisibleBy3_ShouldReturnFizz(){
        int nombre = 9;
        String outputExpected = "Fizz";
        Fizzbuzz fb = new Fizzbuzz();

        String result = fb.doFizzBuzz(nombre);
        Assert.assertEquals(outputExpected, result);
    }

    @Test
    public void testDoFizzBuzz_NumberDivisibleBy5_ShouldReturnBuzz(){
        int nombre = 25;
        String outputExpected = "Buzz";
        Fizzbuzz fb = new Fizzbuzz();

        String result = fb.doFizzBuzz(nombre);
        Assert.assertEquals(outputExpected, result);
    }

    @Test
    public void testDoFizzBuzz_NumberDivisibleBy3And5_ShouldReturnFizzBuzz(){
        int nombre = 15;
        String outputExpected = "FizzBuzz";
        Fizzbuzz fb = new Fizzbuzz();

        String result = fb.doFizzBuzz(nombre);
        Assert.assertEquals(outputExpected, result);
    }

    @Test
    public void testDoFizzBuzz_NumberNotDivisibleBy3Or5_ShouldReturnEmpty(){
        int nombre = 2;
        String outputExpected = "2";
        Fizzbuzz fb = new Fizzbuzz();

        String result = fb.doFizzBuzz(nombre);
        Assert.assertEquals(outputExpected, result);
    }
}
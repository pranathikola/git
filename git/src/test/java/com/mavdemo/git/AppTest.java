package com.mavdemo.git;

import static org.junit.Assert.assertTrue;


import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
   /**
    * Create the test case
    *
    * @param testName name of the test case
    */
   public AppTest(String testName)
   {
       super(testName);
   }

   /**
    * @return the suite of tests being tested
    */
   public static Test suite()
   {
       return (Test)new TestSuite(AppTest.class);
   }


	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue(true);
    }
}

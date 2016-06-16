/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sqaproject.IntToTextMutation2;

/**
 *
 * @author yongdeng
 */
public class TestIntToTextMutation2 {

    public TestIntToTextMutation2() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //below are test cases for mutation 1
    @Test
    public void testMutation2_1() {
        assertEquals(IntToTextMutation2.convertToText(55).toLowerCase(), "fifty five");
    }

    @Test
    public void testMutation2_2() {
        assertEquals(IntToTextMutation2.convertToText(-55).toLowerCase(), "negative fifty five");
    }

    @Test
    public void testMutation2_3() {
        assertEquals(IntToTextMutation2.convertToText(50).toLowerCase(), "fifty");
    }

    @Test
    public void testMutation2_4() {
        assertEquals(IntToTextMutation2.convertToText(50).toLowerCase(), "negative fifty");
    }
}

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
import sqaproject.IntToTextMutation5;

/**
 *
 * @author yongdeng
 */
public class TestIntToTextMutation5 {

    public TestIntToTextMutation5() {
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

    //below are test cases for mutation 5
    @Test
    public void testMutation5_1() {
        assertEquals(IntToTextMutation5.convertToText(5555555).toLowerCase(), "five million five hundred fifty five thousand five hundred fifty five");
    }

    @Test
    public void testMutation5_2() {
        assertEquals(IntToTextMutation5.convertToText(-5555555).toLowerCase(), "negative five million five hundred fifty five thousand five hundred fifty five");
    }

    @Test
    public void testMutation5_3() {
        assertEquals(IntToTextMutation5.convertToText(5000000).toLowerCase(), "five million");
    }

    @Test
    public void testMutation5_4() {
        assertEquals(IntToTextMutation5.convertToText(-5000000).toLowerCase(), "negative five million");
    }
}

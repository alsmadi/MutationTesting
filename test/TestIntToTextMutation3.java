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
import sqaproject.IntToTextMutation3;

/**
 *
 * @author yongdeng
 */
public class TestIntToTextMutation3 {

    public TestIntToTextMutation3() {
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

    //below are test cases for mutation 3
    @Test
    public void testMutation3_1() {
        assertEquals(IntToTextMutation3.convertToText(555).toLowerCase(), "five hundred fifty five");
    }

    @Test
    public void testMutation3_2() {
        assertEquals(IntToTextMutation3.convertToText(-555).toLowerCase(), "negative five hundred fifty five");
    }

    @Test
    public void testMutation3_3() {
        assertEquals(IntToTextMutation3.convertToText(500).toLowerCase(), "five hundred");
    }

    @Test
    public void testMutation3_4() {
        assertEquals(IntToTextMutation3.convertToText(-500).toLowerCase(), "negative five hundred");
    }
}

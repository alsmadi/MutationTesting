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
import sqaproject.IntToTextMutation1;

/**
 *
 * @author yongdeng
 */
public class TestIntToTextMutation1 {

    public TestIntToTextMutation1() {
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
    public void testMutation1_1() {
        assertEquals(IntToTextMutation1.convertToText(0).toLowerCase(), "zero");
    }

    @Test
    public void testMutation1_2() {
        assertEquals(IntToTextMutation1.convertToText(-1).toLowerCase(), "negative one");
    }

    @Test
    public void testMutation1_3() {
        assertEquals(IntToTextMutation1.convertToText(1).toLowerCase(), "one");
    }
}

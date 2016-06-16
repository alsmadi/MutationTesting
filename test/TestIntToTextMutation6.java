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
import sqaproject.IntToTextMutation6;

/**
 *
 * @author yongdeng
 */
public class TestIntToTextMutation6 {

    public TestIntToTextMutation6() {
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
    public void testMutation6_1() {
        assertEquals(IntToTextMutation6.convertToText(1111111111).toLowerCase(), "one billion one hundred eleven million one hundred eleven thousand one hundred eleven");
    }

    @Test
    public void testMutation6_2() {
        assertEquals(IntToTextMutation6.convertToText(-1111111111).toLowerCase(), "negative one billion one hundred eleven million one hundred eleven thousand one hundred eleven");
    }

    @Test
    public void testMutation6_3() {
        assertEquals(IntToTextMutation6.convertToText(1000000000).toLowerCase(), "one billion");
    }

    @Test
    public void testMutation6_4() {
        assertEquals(IntToTextMutation6.convertToText(-1000000000).toLowerCase(), "negative one billion");
    }
}

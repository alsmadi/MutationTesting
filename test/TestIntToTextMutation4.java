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
import sqaproject.IntToTextMutation4;

/**
 *
 * @author yongdeng
 */
public class TestIntToTextMutation4 {

    public TestIntToTextMutation4() {
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

    //below are test cases for mutation 4
    @Test
    public void testMutation4_1() {
        assertEquals(IntToTextMutation4.convertToText(5555).toLowerCase(), "five thousand five hundred fifty five");
    }

    @Test
    public void testMutation4_2() {
        assertEquals(IntToTextMutation4.convertToText(-5555).toLowerCase(), "negative five thousand five hundred fifty five");
    }

    @Test
    public void testMutation4_3() {
        assertEquals(IntToTextMutation4.convertToText(5000).toLowerCase(), "five thousand");
    }

    @Test
    public void testMutation4_4() {
        assertEquals(IntToTextMutation4.convertToText(-5000).toLowerCase(), "negative five thousand");
    }
}

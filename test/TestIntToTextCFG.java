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
import sqaproject.IntToTextCFG;

/**
 *
 * @author yongdeng
 */
public class TestIntToTextCFG {

    public TestIntToTextCFG() {
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

    //Test cases start here (total 16 test cases)
    //test control flow graph coverage
    //***********************************************************************************
    //test E1
    @Test
    public void testE1() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(0), "E1");
    }

    //test positive
    @Test
    public void testE2() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(-1), "E2E4E15");
    }

    @Test
    public void testE3() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(1), "E3E4E16");
    }

    @Test
    public void testE4() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(15), "E3E4E16");
    }

    @Test
    public void testE5() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(25), "E3E5E16");
    }

    @Test
    public void testE6() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(30), "E3E6E16");
    }

    @Test
    public void testE7() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(111), "E3E7E3E4E16E16");
    }

    @Test
    public void testE8() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(200), "E3E8E16");
    }

    @Test
    public void testE9() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(1111), "E3E9E3E4E16E3E7E3E4E16E16E16");
    }

    @Test
    public void testE10() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(2000), "E3E10E3E4E16E16");
    }

    @Test
    public void testE11() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(1111111), "E3E11E3E4E16E3E9E3E7E3E4E16E16E3E7E3E4E16E16E16E16");
    }

    @Test
    public void testE12() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(10000000), "E3E12E3E4E16E16");
    }

    @Test
    public void testE13() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(1000000001), "E3E13E3E4E16E3E4E16E16");
    }

    @Test
    public void testE14() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(1000000000), "E3E14E3E4E16E16");
    }

    @Test
    public void testE15() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(-2), "E2E4E15");
    }

    @Test
    public void testE16() {
        IntToTextCFG.sb = new StringBuilder("");
        assertEquals(IntToTextCFG.convertToText(2), "E3E4E16");
    }
}

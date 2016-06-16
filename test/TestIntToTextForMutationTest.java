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
import sqaproject.IntToTextForMutationTest;

/**
 *
 * @author yongdeng
 */
public class TestIntToTextForMutationTest {

    public TestIntToTextForMutationTest() {
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
        assertEquals(IntToTextForMutationTest.convertToText(0).toLowerCase(), "zero");
    }

    @Test
    public void testMutation1_2() {
        assertEquals(IntToTextForMutationTest.convertToText(-1).toLowerCase(), "negative one");
    }

    @Test
    public void testMutation1_3() {
        assertEquals(IntToTextForMutationTest.convertToText(1).toLowerCase(), "one");
    }

    //below are test cases for mutation 2
    @Test
    public void testMutation2_1() {
        assertEquals(IntToTextForMutationTest.convertToText(55).toLowerCase(), "fifty five");
    }

    @Test
    public void testMutation2_2() {
        assertEquals(IntToTextForMutationTest.convertToText(-55).toLowerCase(), "negative fifty five");
    }

    @Test
    public void testMutation2_3() {
        assertEquals(IntToTextForMutationTest.convertToText(50).toLowerCase(), "fifty");
    }

    @Test
    public void testMutation2_4() {
        assertEquals(IntToTextForMutationTest.convertToText(-50).toLowerCase(), "negative fifty");
    }

    //below are test cases for mutation 3
    @Test
    public void testMutation3_1() {
        assertEquals(IntToTextForMutationTest.convertToText(555).toLowerCase(), "five hundred fifty five");
    }

    @Test
    public void testMutation3_2() {
        assertEquals(IntToTextForMutationTest.convertToText(-555).toLowerCase(), "negative five hundred fifty five");
    }

    @Test
    public void testMutation3_3() {
        assertEquals(IntToTextForMutationTest.convertToText(500).toLowerCase(), "five hundred");
    }

    @Test
    public void testMutation3_4() {
        assertEquals(IntToTextForMutationTest.convertToText(-500).toLowerCase(), "negative five hundred");
    }

    //below are test cases for mutation 4
    @Test
    public void testMutation4_1() {
        assertEquals(IntToTextForMutationTest.convertToText(5555).toLowerCase(), "five thousand five hundred fifty five");
    }

    @Test
    public void testMutation4_2() {
        assertEquals(IntToTextForMutationTest.convertToText(-5555).toLowerCase(), "negative five thousand five hundred fifty five");
    }

    @Test
    public void testMutation4_3() {
        assertEquals(IntToTextForMutationTest.convertToText(5000).toLowerCase(), "five thousand");
    }

    @Test
    public void testMutation4_4() {
        assertEquals(IntToTextForMutationTest.convertToText(-5000).toLowerCase(), "negative five thousand");
    }
    
        //below are test cases for mutation 5
    @Test
    public void testMutation5_1() {
        assertEquals(IntToTextForMutationTest.convertToText(5555555).toLowerCase(), "five million five hundred fifty five thousand five hundred fifty five");
    }

    @Test
    public void testMutation5_2() {
        assertEquals(IntToTextForMutationTest.convertToText(-5555555).toLowerCase(), "negative five million five hundred fifty five thousand five hundred fifty five");
    }

    @Test
    public void testMutation5_3() {
        assertEquals(IntToTextForMutationTest.convertToText(5000000).toLowerCase(), "five million");
    }

    @Test
    public void testMutation5_4() {
        assertEquals(IntToTextForMutationTest.convertToText(-5000000).toLowerCase(), "negative five million");
    }
    
    
            //below are test cases for mutation 5
    @Test
    public void testMutation6_1() {
        assertEquals(IntToTextForMutationTest.convertToText(1111111111).toLowerCase(), "one billion one hundred eleven million one hundred eleven thousand one hundred eleven");
    }

    @Test
    public void testMutation6_2() {
        assertEquals(IntToTextForMutationTest.convertToText(-1111111111).toLowerCase(), "negative one billion one hundred eleven million one hundred eleven thousand one hundred eleven");
    }

    @Test
    public void testMutation6_3() {
        assertEquals(IntToTextForMutationTest.convertToText(1000000000).toLowerCase(), "one billion");
    }

    @Test
    public void testMutation6_4() {
        assertEquals(IntToTextForMutationTest.convertToText(-1000000000).toLowerCase(), "negative one billion");
    }
}

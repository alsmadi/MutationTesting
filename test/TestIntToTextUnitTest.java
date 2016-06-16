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
import sqaproject.IntToTextUnitTest;

/**
 *
 * @author yongdeng
 */
public class TestIntToTextUnitTest {

    public TestIntToTextUnitTest() {
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

    //Test cases start here (total 57 test cases)
    //Unit test
    //covers all possible valid input and output
    //invalid inputs have been gurantteed to never allowed in the main function 
    //***********************************************************************************
    //test zero
    @Test
    public void testZero() {
        assertEquals(IntToTextUnitTest.convertToText(0).toLowerCase(), "zero");
    }

    //***********************************************************************************
    //test abs less than 10  
    //positive
    @Test
    public void testPositiveLessThanTen() {
        assertEquals(IntToTextUnitTest.convertToText(4).toLowerCase(), "four");
    }

    //negative
    @Test
    public void testNegativeLessThanTen() {
        assertEquals(IntToTextUnitTest.convertToText(-4).toLowerCase(), "negative four");
    }

    //***********************************************************************************
    //test abs less than twenty
    //positive
    @Test
    public void testPositiveLessThanTwenty1() {
        assertEquals(IntToTextUnitTest.convertToText(18).toLowerCase(), "eighteen");
    }

    @Test
    public void testPositiveLessThanTwenty2() {
        assertEquals(IntToTextUnitTest.convertToText(10).toLowerCase(), "ten");
    }

    //negative
    @Test
    public void testNegativeLessThanTwenty1() {
        assertEquals(IntToTextUnitTest.convertToText(-18).toLowerCase(), "negative eighteen");
    }

    @Test
    public void testNegativeLessThanTwenty2() {
        assertEquals(IntToTextUnitTest.convertToText(-10).toLowerCase(), "negative ten");
    }

    //***********************************************************************************
    //test abs less than hundred
    //positive
    @Test
    public void testPositiveLessThanHundred1() {
        assertEquals(IntToTextUnitTest.convertToText(88).toLowerCase(), "eighty eight");
    }

    @Test
    public void testPositiveLessThanHundred2() {
        assertEquals(IntToTextUnitTest.convertToText(20).toLowerCase(), "twenty");
    }

    //negative
    @Test
    public void testNegativeLessThanHundred1() {
        assertEquals(IntToTextUnitTest.convertToText(-88).toLowerCase(), "negative eighty eight");
    }

    @Test
    public void testNegativeLessThanHundred2() {
        assertEquals(IntToTextUnitTest.convertToText(-20).toLowerCase(), "negative twenty");
    }

    //***********************************************************************************
    //test abs less than thousand
    //positive
    @Test
    public void testPositiveLessThanThousand1() {
        assertEquals(IntToTextUnitTest.convertToText(111).toLowerCase(), "one hundred eleven");
    }

    @Test
    public void testPositiveLessThanThousand2() {
        assertEquals(IntToTextUnitTest.convertToText(108).toLowerCase(), "one hundred eight");
    }

    @Test
    public void testPositiveLessThanThousand3() {
        assertEquals(IntToTextUnitTest.convertToText(155).toLowerCase(), "one hundred fifty five");
    }

    @Test
    public void testPositiveLessThanThousand4() {
        assertEquals(IntToTextUnitTest.convertToText(990).toLowerCase(), "nine hundred ninety");
    }

    @Test
    public void testPositiveLessThanThousand5() {
        assertEquals(IntToTextUnitTest.convertToText(100).toLowerCase(), "one hundred");
    }

    //negative
    @Test
    public void testmNegativeLessThanThousand1() {
        assertEquals(IntToTextUnitTest.convertToText(-111).toLowerCase(), "negative one hundred eleven");
    }

    @Test
    public void testmNegativeLessThanThousand2() {
        assertEquals(IntToTextUnitTest.convertToText(-108).toLowerCase(), "negative one hundred eight");
    }

    @Test
    public void testmNegativeLessThanThousand3() {
        assertEquals(IntToTextUnitTest.convertToText(-155).toLowerCase(), "negative one hundred fifty five");
    }

    @Test
    public void testmNegativeLessThanThousand4() {
        assertEquals(IntToTextUnitTest.convertToText(-990).toLowerCase(), "negative nine hundred ninety");
    }

    @Test
    public void testmNegativeLessThanThousand5() {
        assertEquals(IntToTextUnitTest.convertToText(-100).toLowerCase(), "negative one hundred");
    }

    //***********************************************************************************
    //test abs less than million
    //positive
    @Test
    public void testPositiveLessThanMillion1() {
        assertEquals(IntToTextUnitTest.convertToText(1111).toLowerCase(), "one thousand one hundred eleven");
    }

    @Test
    public void testPositiveLessThanMillion2() {
        assertEquals(IntToTextUnitTest.convertToText(1001).toLowerCase(), "one thousand one");
    }

    @Test
    public void testPositiveLessThanMillion3() {
        assertEquals(IntToTextUnitTest.convertToText(9000).toLowerCase(), "nine thousand");
    }

    @Test
    public void testPositiveLessThanMillion4() {
        assertEquals(IntToTextUnitTest.convertToText(9090).toLowerCase(), "nine thousand ninety");
    }

    @Test
    public void testPositiveLessThanMillion5() {
        assertEquals(IntToTextUnitTest.convertToText(11111).toLowerCase(), "eleven thousand one hundred eleven");
    }

    @Test
    public void testPositiveLessThanMillion6() {
        assertEquals(IntToTextUnitTest.convertToText(10001).toLowerCase(), "ten thousand one");
    }

    @Test
    public void testPositiveLessThanMillion7() {
        assertEquals(IntToTextUnitTest.convertToText(10101).toLowerCase(), "ten thousand one hundred one");
    }

    @Test
    public void testPositiveLessThanMillion8() {
        assertEquals(IntToTextUnitTest.convertToText(90090).toLowerCase(), "ninety thousand ninety");
    }

    @Test
    public void testPositiveLessThanMillion9() {
        assertEquals(IntToTextUnitTest.convertToText(90000).toLowerCase(), "ninety thousand");
    }

    //negative
    @Test
    public void testNegativeLessThanMillion1() {
        assertEquals(IntToTextUnitTest.convertToText(-1111).toLowerCase(), "negative one thousand one hundred eleven");
    }

    @Test
    public void testNegativeLessThanMillion2() {
        assertEquals(IntToTextUnitTest.convertToText(-1001).toLowerCase(), "negative one thousand one");
    }

    @Test
    public void testNegativeLessThanMillion3() {
        assertEquals(IntToTextUnitTest.convertToText(-9000).toLowerCase(), "negative nine thousand");
    }

    @Test
    public void testNegativeLessThanMillion4() {
        assertEquals(IntToTextUnitTest.convertToText(-9090).toLowerCase(), "negative nine thousand ninety");
    }

    @Test
    public void testNegativeLessThanMillion5() {
        assertEquals(IntToTextUnitTest.convertToText(-11111).toLowerCase(), "negative eleven thousand one hundred eleven");
    }

    @Test
    public void testNegativeLessThanMillion6() {
        assertEquals(IntToTextUnitTest.convertToText(-10001).toLowerCase(), "negative ten thousand one");
    }

    @Test
    public void testNegativeLessThanMillion7() {
        assertEquals(IntToTextUnitTest.convertToText(-10101).toLowerCase(), "negative ten thousand one hundred one");
    }

    @Test
    public void testNegativeLessThanMillion8() {
        assertEquals(IntToTextUnitTest.convertToText(-90090).toLowerCase(), "negative ninety thousand ninety");
    }

    @Test
    public void testNegativeLessThanMillion9() {
        assertEquals(IntToTextUnitTest.convertToText(-90000).toLowerCase(), "negative ninety thousand");
    }

    //***********************************************************************************
    //test abs less than billion
    //positive
    @Test
    public void testPositiveLessThanBillion1() {
        assertEquals(IntToTextUnitTest.convertToText(1000000).toLowerCase(), "one million");
    }

    @Test
    public void testPositiveLessThanBillion2() {
        assertEquals(IntToTextUnitTest.convertToText(900000000).toLowerCase(), "nine hundred million");
    }

    @Test
    public void testPositiveLessThanBillion3() {
        assertEquals(IntToTextUnitTest.convertToText(1000001).toLowerCase(), "one million one");
    }

    @Test
    public void testPositiveLessThanBillion4() {
        assertEquals(IntToTextUnitTest.convertToText(999999999).toLowerCase(), "nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine");
    }

    @Test
    public void testPositiveLessThanBillion5() {
        assertEquals(IntToTextUnitTest.convertToText(90000900).toLowerCase(), "ninety million nine hundred");
    }

    @Test
    public void testPositiveLessThanBillion6() {
        assertEquals(IntToTextUnitTest.convertToText(90909090).toLowerCase(), "ninety million nine hundred nine thousand ninety");
    }

    //negative
    @Test
    public void testNegativeLessThanBillion1() {
        assertEquals(IntToTextUnitTest.convertToText(-1000000).toLowerCase(), "negative one million");
    }

    @Test
    public void testNegativeLessThanBillion2() {
        assertEquals(IntToTextUnitTest.convertToText(-900000000).toLowerCase(), "negative nine hundred million");
    }

    @Test
    public void testNegativeLessThanBillion3() {
        assertEquals(IntToTextUnitTest.convertToText(-1000001).toLowerCase(), "negative one million one");
    }

    @Test
    public void testNegativeLessThanBillion4() {
        assertEquals(IntToTextUnitTest.convertToText(-999999999).toLowerCase(), "negative nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine");
    }

    @Test
    public void testNegativeLessThanBillion5() {
        assertEquals(IntToTextUnitTest.convertToText(-90000900).toLowerCase(), "negative ninety million nine hundred");
    }

    @Test
    public void testNegativeLessThanBillion6() {
        assertEquals(IntToTextUnitTest.convertToText(-90909090).toLowerCase(), "negative ninety million nine hundred nine thousand ninety");
    }

    //***********************************************************************************
    //test abs beyond billion
    //positive
    @Test
    public void testPositiveBeyondBillion1() {
        assertEquals(IntToTextUnitTest.convertToText(1000000000).toLowerCase(), "one billion");
    }

    @Test
    public void testPositiveBeyondBillion2() {
        assertEquals(IntToTextUnitTest.convertToText(1000000001).toLowerCase(), "one billion one");
    }

    @Test
    public void testPositiveBeyondBillion3() {
        assertEquals(IntToTextUnitTest.convertToText(2020202002).toLowerCase(), "two billion twenty million two hundred two thousand two");
    }

    //negative
    @Test
    public void testNegativeBeyondBillion1() {
        assertEquals(IntToTextUnitTest.convertToText(-1000000000).toLowerCase(), "negative one billion");
    }

    @Test
    public void testNegativeBeyondBillion2() {
        assertEquals(IntToTextUnitTest.convertToText(-1000000001).toLowerCase(), "negative one billion one");
    }

    @Test
    public void testNegativeBeyondBillion3() {
        assertEquals(IntToTextUnitTest.convertToText(-2020202002).toLowerCase(), "negative two billion twenty million two hundred two thousand two");
    }
}

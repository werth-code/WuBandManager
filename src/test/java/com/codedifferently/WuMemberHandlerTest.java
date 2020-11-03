package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class WuMemberHandlerTest {
    BandManager bandManager;
    private String expected;

    @Before
    public void setup() {
        // : Given
        WuMember wuMember1 = new WuMember("Robert", "Diggs", "Rza");
        WuMember wuMember2 = new WuMember("Cliford", "Smith", "Method Man");
        WuMember wuMember3 = new WuMember("Corey", "Woods", "Raekwon");
        WuMember[] wuMemberArray = {wuMember1, wuMember2, wuMember3};

        this.bandManager = new BandManager(wuMemberArray);
        this.expected = "\nMy first name is Robert\n" +
                "My last name is Diggs\n" +
                "My stage name is Rza\n"+
                "My first name is Cliford\n" +
                "My last name is Smith\n" +
                "My stage name is Method Man\n"+
                "My first name is Corey\n" +
                "My last name is Woods\n"+
                "My stage name is Raekwon";
    }

    @Test
    public void testWhileLoop() {
        // : When
        String actual = bandManager.whileLoop();

        // : Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testForLoop() {
        // : When
        String actual = bandManager.forLoop();

        // : Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testForEachLoop() {
        // : When
        String actual = bandManager.forEachLoop();

        // : Then
        Assert.assertEquals(expected, actual);
    }


}

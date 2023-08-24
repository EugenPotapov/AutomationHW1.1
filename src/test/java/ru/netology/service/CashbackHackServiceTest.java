package ru.netology.service;

import org.testng.Assert;


public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void test1000 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void test900 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void test0 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void test1200 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;
        Assert.assertEquals(actual, expected);
    }

}

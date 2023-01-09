package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldManyAddPayment() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(800);
        int expected = 200;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldNoAddPayment() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
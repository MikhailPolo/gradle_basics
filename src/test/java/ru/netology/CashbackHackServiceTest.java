package ru.netology;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldManyAddPayment() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(900);
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoAddPayment() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}
package ru.netology;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testOneThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testMinMoney() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testOneHungreed() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }
}

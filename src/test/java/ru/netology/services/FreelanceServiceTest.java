package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FreelanceServiceTest {
    @Test
    public void testThreeMonthsRest() {

        FreelanceService service = new FreelanceService();

        int actual = service.calculate(10000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testTwoMonthsRest() {

        FreelanceService service = new FreelanceService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
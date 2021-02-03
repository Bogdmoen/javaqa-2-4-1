package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSalesSum() {

        long expected = 180;
        long actual = service.calculateSalesSum(sales);

        assertEquals(expected,actual);
    }

    @Test
    void shouldCalculateAvgAmount() {

        long expected = 15;
        long actual = service.calculateAvgAmount(sales);

        assertEquals(expected,actual);
    }

    @Test
    void shouldFindMaxMonth() {

        long expected = 8;
        long actual = service.findMaxMonth(sales);

        assertEquals(expected,actual);

    }

    @Test
    void shouldFindMinMonth() {
        
        long expected = 9;
        long actual = service.findMinMonth(sales);

        assertEquals(expected,actual);

    }
}
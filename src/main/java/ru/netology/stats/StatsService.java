package ru.netology.stats;

public class StatsService {

    public long calculateSalesSum(long[] sales) {
        long sum = 0;
        for(long sale : sales) {

            sum += sale;
        }
        return sum;


    }
}


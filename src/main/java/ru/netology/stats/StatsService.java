package ru.netology.stats;

public class StatsService {

    public long calculateSalesSum(long[] sales) {
        long sum = 0;
        for(long sale : sales) {

            sum += sale;
        }
        return sum;


    }

    public long calculateAvgAmount(long[] sales) {

        long sumValue = calculateSalesSum(sales);
        long AvgAmount = sumValue / sales.length;

        return AvgAmount;

    }
}


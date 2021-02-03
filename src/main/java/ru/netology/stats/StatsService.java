package ru.netology.stats;

public class StatsService {

    public long calculateSalesSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {

            sum += sale;
        }
        return sum;


    }

    public long calculateAvgAmount(long[] sales) {

        long sumValue = calculateSalesSum(sales);
        long AvgAmount = sumValue / sales.length;

        return AvgAmount;

    }

    public long findMaxMonth(long[] sales) {

        long currentMax = findMaxAmount(sales);
        long monthWithMax = 0;
        long monthCount = 0;
        for (long sale : sales) {

            monthCount++;
            if (sale == currentMax) {
                monthWithMax = monthCount;
            }

        }
        return monthWithMax;

    }

    public long findMinMonth(long[] sales) {

        long currentMin = findMinAmount(sales);
        long monthWithMin = 0;
        long monthCount = 0;
        for (long sale : sales) {

            monthCount++;
            if (sale == currentMin) {
                monthWithMin = monthCount;
            }

        }
        return monthWithMin;

    }


    public long findMaxAmount(long[] sales) {
        long currentMax = sales[0];

        for (long sale : sales) {
            if (currentMax < sale) {

                currentMax = sale;
            }
        }
        return currentMax;
    }

    public long findMinAmount(long[] sales) {
        long currentMin = sales[0];

        for (long sale : sales) {
            if (currentMin > sale) {

                currentMin = sale;
            }
        }
        return currentMin;
    }


    public long findMonthLowerThanAvg(long[] sales) {

        long avgSales = calculateAvgAmount(sales);
        long monthCount = 0;

        for (long sale : sales) {
            if (sale < avgSales) {
                monthCount++;
            }

        }
        return monthCount;
    }

    public long findMonthHigherThanAvg(long[] sales) {
        long avgSales = calculateAvgAmount(sales);
        long monthCount = 0;

        for (long sale : sales) {
            if (sale < avgSales) {
                monthCount++;
            }

        }
        return monthCount;

    }
}


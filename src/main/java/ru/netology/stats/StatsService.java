package ru.netology.stats;

public class StatsService {
    //сумма всех продаж
    public long sumOfSales(long[] sales) {
        long amount = 0;
        for (long s : sales) {
            amount = amount + s;
        }
        return amount;
    }

    //среднее значание продаж за период
    public long avgOfSales(long[] sales) {
        long average = sumOfSales(sales) / sales.length;
        return average;
    }

    //ближайший месяц с максимальными продажами
    public int monthWithMaxSale(long[] sales) {
        int numberMonthMax = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[numberMonthMax]) {
                numberMonthMax = month;
            }
            month = month + 1;
        }
        return numberMonthMax + 1;
    }

    //ближайший месяц с минимальными продажами
    public int monthWithMinSale(long[] sales) {
        int numberMonthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[numberMonthMin]) {
                numberMonthMin = i;
            }
        }
        return numberMonthMin + 1;
    }

    //кол-во месяцев с продажами ниже среднего за период
    public int amountOfMonthBelowAvgSales(long[] sales) {
        int amountMonthBelow = 0;
        for (long s : sales) {
            if (s < avgOfSales(sales)) {
                amountMonthBelow = amountMonthBelow + 1;
            }
        }
        return amountMonthBelow;
    }

    //кол-во месяцев с продажами выше среднего за период
    public int amountOfMonthAboveAvgSales(long[] sales) {
        int amountMonthAbove = 0;
        for (long s : sales) {
            if (s > avgOfSales(sales)) {
                amountMonthAbove = amountMonthAbove + 1;
            }
        }
        return amountMonthAbove;
    }
}


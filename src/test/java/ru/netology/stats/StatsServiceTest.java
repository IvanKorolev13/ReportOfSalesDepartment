package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    //проверка суммы продаж
    public void testCalcTotalSales() {
        StatsService service = new StatsService();
        //не понял как перенести данные для теста в файл csv- ожидаемый результат и массив с продажами,
        //пробовал массив указывать в {}, [], с пробелами, но ничего не читается из такого файла
        long expectedTotal = 180;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualTotal = service.sumOfSales(sales);
        Assertions.assertEquals(expectedTotal, actualTotal);
    }

    @Test
    //проверка средних продаж
    public void testCalcAvgSales() {
        StatsService service = new StatsService();
        long expectedAvg = 15;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualAvg = service.avgOfSales(sales);
        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    //проверка номера месяца с максимальными продажами
    public void testNumberMonthWithMaxSales() {
        StatsService service = new StatsService();
        int expectedMax = 8;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualMax = service.monthWithMaxSale(sales);
        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    //проверка номера месяца с минимальными продажами
    public void testNumberMonthWithMinSales() {
        StatsService service = new StatsService();
        int expectedMin = 9;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualMin = service.monthWithMinSale(sales);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    //проверка кол-во месяцев с продажами меньше средних продаж за период
    public void testAmountOfMonthWithSaleBelowAvg() {
        StatsService service = new StatsService();
        int expectedBelowAvg = 5;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualBelowAvg = service.amountOfMonthBelowAvgSales(sales);
        Assertions.assertEquals(expectedBelowAvg, actualBelowAvg);
    }

    @Test
    //проверка кол-во месяцев с продажами меньше средних продаж за период
    public void testAmountOfMonthWithSaleAboveAvg() {
        StatsService service = new StatsService();
        int expectedAboveAvg = 5;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualAboveAvg = service.amountOfMonthAboveAvgSales(sales);
        Assertions.assertEquals(expectedAboveAvg, actualAboveAvg);
    }
}

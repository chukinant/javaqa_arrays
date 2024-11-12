package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    // сумму всех продаж;
    public void TestCalcSalesTotalRevenue() {
        StatsService service = new StatsService();
        long[] sales = {(long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9)};

        long actual = service.calcSalesTotalRevenue(sales);
        long expected = (long) (60e9);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    // среднюю сумму продаж в месяц;
    public void TestCalcAverageMonthSale() {
        StatsService service = new StatsService();
        long[] sales = {(long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9)};

        long actual = service.calcAverageMonthSale(sales);
        long expected = (long) (5e9);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public void TestGetHighestSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {(long) (5e9), (long) (5e9), (long) (10e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9)};

        int actual = service.getHighestSalesMonth(sales);
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }


    @Test
    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public void TestGetLowestSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {(long) (5e9), (long) (5e9), (long) (3e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9)};

        int actual = service.getLowestSalesMonth(sales);
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    // количество месяцев, в которых продажи были ниже среднего
    public void TestGetMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {(long) (5e9), (long) (5e9), (long) (3e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9)};

        int actual = service.getMonthsBelowAverage(sales);
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    // количество месяцев, в которых продажи были выше среднего
    public void TestGetMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {(long) (5e9), (long) (5e9), (long) (3e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9), (long) (5e9)};

        int actual = service.getMonthsAboveAverage(sales);
        int expected = 11;

        Assertions.assertEquals(actual, expected);
    }
}
package ru.netology.stats;

public class StatsService {

    // сумму всех продаж;
    public long calcSalesTotalRevenue(long[] sales) {
        long salesTotalRevenue = 0;

        for (long sale : sales) {
            salesTotalRevenue += sale;
        }
        return salesTotalRevenue;
    }

    // среднюю сумму продаж в месяц;
    public long calcAverageMonthSale(long[] sales) {
        return calcSalesTotalRevenue(sales) / sales.length;
    }


    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int getHighestSalesMonth(long[] sales) {
        int highestSalesMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[highestSalesMonth] <= sales[i]) {
                highestSalesMonth = i;
            }
        }
        return highestSalesMonth;
    }

    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int getLowestSalesMonth(long[] sales) {
        int lowestSalesMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[lowestSalesMonth] >= sales[i]) {
                lowestSalesMonth = i;
            }
        }
        return lowestSalesMonth;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public int getMonthsBelowAverage(long[] sales) {
        int monthsBelowAverage = 0;
        long averageSale = calcAverageMonthSale(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale) {
                monthsBelowAverage += 1;
            }
        }
        return monthsBelowAverage;
    }

    // количество месяцев, в которых продажи были выше среднего
    public int getMonthsAboveAverage(long[] sales) {
        int monthsAboveAverage = 0;
        long averageSale = calcAverageMonthSale(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) {
                monthsAboveAverage += 1;
            }
        }
        return monthsAboveAverage;
    }

}

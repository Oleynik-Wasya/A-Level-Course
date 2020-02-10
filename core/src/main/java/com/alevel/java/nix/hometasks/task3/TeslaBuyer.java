package com.alevel.java.nix.hometasks.task3;

import java.time.DayOfWeek;

public class TeslaBuyer {
    public DayOfWeek[] profit(final double[] salesReport) {

        if (salesReport.length != 7) {
            throw new Error("Error: Size of the sales report should be 7!");
        }

        int dayOfBuyCurrent = 0;
        int dayOfBuy = 0;
        int dayOfSaleCurrent = 0;
        int dayOfSale = 0;

        for (int i = 1; i < salesReport.length; i++) {
            if (salesReport[dayOfBuyCurrent] > salesReport[i]) {
                if (salesReport[dayOfSaleCurrent] - salesReport[dayOfBuyCurrent] > salesReport[dayOfSale] - salesReport[dayOfBuy]) {
                    dayOfBuy = dayOfBuyCurrent;
                    dayOfSale = dayOfSaleCurrent;
                }
                dayOfBuyCurrent = i;
                dayOfSaleCurrent = i;
            } else {
                if (salesReport[dayOfSaleCurrent] < salesReport[i]) {
                    dayOfSaleCurrent = i;
                }
            }
        }
        if (salesReport[dayOfSaleCurrent] - salesReport[dayOfBuyCurrent] > salesReport[dayOfSale] - salesReport[dayOfBuy]) {
            dayOfBuy = dayOfBuyCurrent;
            dayOfSale = dayOfSaleCurrent;
        }

        DayOfWeek[] daysOfWeeks = {DayOfWeek.of(dayOfBuy + 1), DayOfWeek.of(dayOfSale + 1)};
        return daysOfWeeks;
    }
}
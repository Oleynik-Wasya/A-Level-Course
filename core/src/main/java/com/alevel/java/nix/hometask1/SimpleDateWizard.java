package com.alevel.java.nix.hometask1;

import java.time.LocalDate;

class SimpleDateWizard implements DateWizard {

    @Override
    public LocalDate getDateOfYear(int year, int day) {
        return LocalDate.ofYearDay(year, day);
    }
}

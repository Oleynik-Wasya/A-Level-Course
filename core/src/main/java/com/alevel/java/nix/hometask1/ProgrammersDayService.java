package com.alevel.java.nix.hometask1;

import java.time.LocalDate;

public class ProgrammersDayService {

    public static  final int PROGRAMMERS_DAY = 256;

    private final DateWizard dateWizard;

    public ProgrammersDayService(DateWizard dateWizard) {
        this.dateWizard = dateWizard;
    }

    public LocalDate getProgrammingDay(int year){
        return dateWizard.getDateOfYear(year, PROGRAMMERS_DAY);
    }

}

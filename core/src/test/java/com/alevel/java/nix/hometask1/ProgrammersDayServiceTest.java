package com.alevel.java.nix.hometask1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProgrammersDayServiceTest {

    private DateWizard dateWizard;

    private ProgrammersDayService programmersDayService;

    @BeforeEach
    void setUp() {
        dateWizard = mock(DateWizard.class);
        programmersDayService = new ProgrammersDayService(dateWizard);
    }

    @Test
    void testGetProgrammersDay() {
        assertProgrammersDay(2019, 13);
        assertProgrammersDay(2018, 13);
        assertProgrammersDay(2017, 13);
        assertProgrammersDay(2016, 12);
        assertProgrammersDay(2015, 13);
        assertProgrammersDay(2014, 13);
        assertProgrammersDay(2013, 13);
        assertProgrammersDay(2012, 12);
        assertProgrammersDay(2011, 13);
        assertProgrammersDay(2010, 13);
    }

    private void assertProgrammersDay(int year, int dayInSeptember) {
        LocalDate expected = LocalDate.of(year, 9, dayInSeptember);
        when(dateWizard.getDateOfYear(year, ProgrammersDayService.PROGRAMMERS_DAY))
                .thenReturn(expected);
        LocalDate actual = programmersDayService.getProgrammingDay(year);
        assertEquals(expected, actual);
        verify(dateWizard, only()).getDateOfYear(year, ProgrammersDayService.PROGRAMMERS_DAY);
        reset(dateWizard);
    }
}
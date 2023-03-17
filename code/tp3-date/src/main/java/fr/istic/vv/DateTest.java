package fr.istic.vv;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    @Test
    public void test1() {
        assertTrue(Date.isValidDate(6, 9, 2000));
    }

    @Test
    public void test2() {
        assertFalse(Date.isValidDate(0, -1, 2000));
    }

    @Test
    public void test3() {
        assertTrue(Date.isLeapYear(2024));
    }

    @Test
    public void test4() {
        assertFalse(Date.isLeapYear(2023));
    }


    @Test
    public void test5() {
        Date attendu = new Date(6, 9, 2000);
        assertEquals(new Date(5, 9, 2000).nextDate().compareTo(attendu), 0 );
    }


    @Test
    public void test6() {
        Date attendu = new Date(6, 9, 2000);
        assertTrue(new Date(7, 9, 2000).previousDate().compareTo(attendu) == 0 );
    }


}

package gliderifle.calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isLeapYear(int year) {
		if(year % 400 == 0) {
			return true;
		} else if(year % 100 == 0) {
			return false;
		} else if(year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year)) {
			return LEAP_MAX_DAYS[month-1];
		} else {
			return MAX_DAYS[month-1];
		}		
	}
	
	public void printSampleCalendar() {
		System.out.println("일   월   화   수   목   금   토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public void printCalendar(int year, int month) {
		System.out.println("일   월   화   수   목   금   토");
		System.out.println("--------------------");
		
		for(int i=1;i<=this.getMaxDaysOfMonth(year, month);i++) {
			System.out.printf("%2d ",i);
			if(i%7==0) {
				System.out.printf("\n");
			}
		}
		
		System.out.printf("\n\n");
	}

}

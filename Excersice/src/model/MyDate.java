package model;

public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int diffYears(MyDate actual) {
		int diff;
		if (month > actual.getMonth()) {
			diff = actual.getYear() - year - 1;
		} else {
			if (month < actual.getMonth()) {
				diff = actual.getYear() - year;
			} else {
				if (day > actual.getDay()) {
					diff = actual.getYear() - year - 1;
				} else {
					diff = actual.getYear() - year;
				}
			}

		}
		return diff;
	}

	public int diffSemester(MyDate actual) {
		int diff = ((actual.getYear() - year) * 2);
		if (actual.getMonth() >= 6) {
			diff += 2;
		} else {
			diff += 1;
		}
		if (month >= 6) {
			diff -= 1;
		}
		return diff;
	}

	public int getYear() {
		return year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}
}

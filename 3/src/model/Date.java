package model;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String convertion() {
		String date = "";
		switch(month) { 
		case 1: date = "de enero de";
		break;
		case 2: date = "de febrero de";
		break;
		case 3: date = "de marzo de";
		break;
		case 4: date = "de abril de";
		break;
		case 5: date = "de mayo de";
		break;
		case 6: date = "de junio de";
		break;
		case 7: date = "de julio de";
		break;
		case 8: date = "de agosto de";
		break;
		case 9: date = "de septiembre de";
		break;
		case 10: date = "de octubre de";
		break;
		case 11: date = "de noviembre de";
		break;
		case 12: date = "de diciembre de";
		break;
		default: date = "indefinido";
		break;
		
		} 
		return date;
	}
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
    public String toString(){
    	String text = day + " "+ convertion() + " " +year ;
    	return text;
    }
}

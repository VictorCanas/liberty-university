//<Programming Assignment 7 - Employee 7.13>
//Displays the month, day, and year separated by forward slashes
//CSIS 212-001
//Victor Canas

public class Date {

	private int month;
    private int day;
    private int year;
     
    public Date (int monthValue, int dayValue, int yearValue) {
        month = monthValue;
        day = dayValue;
        year = yearValue;
    }
     
    public void setMonth (int monthValue) {
        month = monthValue; 
    }
     
    public int getMonth() {
        return month;
    }
     
    public void setday (int dayValue) {
        day = dayValue;
    }
     
    public int getDay() {
        return day;
    }
     
    public void setYear (int yearValue ) {
        year = yearValue;
    }
     
    public int getYear() {
        return year;
    }
     
    public void displayDate () {
        System.out.printf ("%d/%d/%d\n", getMonth(), getDay(), getYear());
    }
	
}

//<Programming Assignment 7 - Employee 7.13>
//Displays the month, day, and year separated by forward slashes
//CSIS 212-001
//Victor Canas

public class DateTest {
	
	public static void main (String [] args) {
    
		System.out.println("Victor Canas - Excersie 7.13\n");
		
		//create new data object
		Date newDate = new Date( 12, 9, 1995);
		
		System.out.print("Initial date is: ");
		newDate.displayDate();
		
		//changes data values
		newDate.setMonth( 4 );
		newDate.setday( 20 );
		newDate.setYear( 2016 );
		
		System.out.print( "Change date value is: " );
		newDate.displayDate();
		
    }
}

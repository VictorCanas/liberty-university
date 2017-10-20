//<Programming Assignment 7 - Employee 7.12>
//Calculates the year salary of an employee and gives each Employee a 10% raise. 
//CSIS 212-001
//Victor Canas

//class declaration
public class Employee {

	//three instance variables 
	private String firstName; 
    private String lastName; 
    private double monthlySalary;
 
    //constructor 
    public Employee(String first, String last, double salary) {
        firstName = first;
        lastName = last;
        
        if (salary >= 0.0) //determines if salary is positive
        monthlySalary = salary;
    } //ends constructor 
 

    public void setFirstName(String first) {
        firstName = first;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setLastName(String last) {
        lastName = last;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setmonthlySalary(double salary) {
        if (salary >= 0.0) //determines if salary is positive
    	monthlySalary = salary;
    }
    
    public double getMonthlySalary() {
    	return monthlySalary;
    }
  
}

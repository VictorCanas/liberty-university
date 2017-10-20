//<Programming Assignment 7 - Employee 7.12>
//Calculates the year salary of an employee and gives each Employee a 10% raise. 
//CSIS 212-001
//Victor Canas

public class EmployeeTest {

	public static void main(String[] args) {
        //employee objects 
        Employee employee1 = new Employee("Victor", "Canas", 2401.00);
        Employee employee2 = new Employee("Jacob", "Muller", 1874.00);
 
        System.out.println("Victor Canas - Excersie 7.12\n");
        
        //display employees 
        System.out.printf( "Employee 1 - %s %s | Yearly Salary:%.2f\n",
        		employee1.getFirstName(), employee1.getLastName(),       
        		12 * employee1.getMonthlySalary() );
        System.out.printf( "Employee 2 - %s %s | Yearly Salary:%.2f\n",       
        	employee2.getFirstName(), employee2.getLastName(),
        	12 * employee2.getMonthlySalary() );
        
        //increase salary of employees by 10%
        System.out.println( "\nEmployees increase by 10%" );
        employee1.setmonthlySalary( employee1.getMonthlySalary() * 1.10 );
        employee2.setmonthlySalary( employee2.getMonthlySalary() * 1.10 );
        
        
        //increase salary of employees by 10%
        System.out.printf( "Employee 1 - %s %s | Yearly Salary:%.2f\n",
        		employee1.getFirstName(), employee1.getLastName(),
        		12 * employee1.getMonthlySalary() );
        System.out.printf( "Employee 2 - %s %s | Yearly Salary:%.2f\n",
        		employee2.getFirstName(), employee2.getLastName(),
        		12 * employee2.getMonthlySalary() );
 
    }	
	
}

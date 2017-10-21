/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commissionemployee;

/**
 *
 * @author vscanas
 */

public class Employee {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee() {
		
	}

	public Employee(String fName, String lName, String ssNumber) {
		this.firstName = fName;
		this.lastName = lName;
		this.socialSecurityNumber = ssNumber;
	}

   // first name
	public String getFirstName() {
		return firstName;
	}

   // last name
	public String getLastName() {
		return lastName;
	}
	
   // return social security number
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n", 
		         "commission employee", getFirstName(), getLastName(), 
		         "social security number", getSocialSecurityNumber());
	}

}

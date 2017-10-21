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

// Fig. 9.10: CommissionEmployee.java
// CommissionEmployee class uses methods to manipulate its 
// private instance variables.

//The class has to be extend to employee for the employee class to use it 
public class CommissionEmployee extends Employee
{
    
   //should contain only the instance variables and methods that are not declared in superclass Employee 
   private double grossSales;     
   private double commissionRate; 
   
   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate)
   {
	  super(firstName, lastName, socialSecurityNumber);

      //throw exception
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      // throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } // end constructor 

   
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   } 

   public double getGrossSales()
   {
      return grossSales;
   } 

   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   } 

   public double getCommissionRate()
   {
      return commissionRate;
   }

   public double earnings()
   {
      return getCommissionRate() * getGrossSales();
   } 

   @Override 
   public String toString()
   {
      return String.format("%s%s: %.2f%n%s: %.2f", super.toString(), 
         "gross sales", getGrossSales(), 
         "commission rate", getCommissionRate());
   } 
} // end class CommissionEmployee

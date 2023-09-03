package com;
import java.util.Scanner;
public class TotalAndAverange {

	public static void main(String[] args) {
	
		  System.out.println("Enter three grades: ");
	
	        //Import three numbers
	        double num1 =new Scanner(System.in).nextDouble();
	        double num2 =new Scanner(System.in).nextDouble();
	        double num3 =new Scanner(System.in).nextDouble();
	       
	       //calculate total 
	   double total = num1 + num2 + num3;
	       //calculate averange
	   double avg =total/3;
	     
	      //check condition and print Grade
	   if (avg>90 )
	    System.out.println("Grade is A+");
	   else
		   if (avg>75)
			   System.out.println("Grade is A");
		   else
			   if (avg>60)
				   System.out.println("Grade is B");
			   else
				   System.out.println("Grade is c");
		   
	   }
	   
	     
	        

	}


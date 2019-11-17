package inputPackage;

import java.util.Scanner;
import numberPackage.numberClass;

public class inputClass {

	public static void main(String[] args) {
	
       String loop = "Y";
		
	   do {		
	   
	      Scanner data = new Scanner(System.in);
	      numberClass number = new numberClass(0,0,0);
	      boolean status = true;	   
	      System.out.println("\n----------------------------------------------------");
	   
	      do {	   
		     status = true;
	         System.out.print("\nEnter first number: ");   
	         try { number.setFirstnum(Integer.parseInt(data.next())); } 
	         catch(Exception e) { status = false; System.out.println("Please input an integer"); }	     
	      }while(status==false);
	   
	      do {	   
		     status = true;  
	         System.out.print("\nEnter second number: ");   
	         try { number.setSecondnum(Integer.parseInt(data.next())); } 
	         catch(Exception e) { status = false; System.out.println("Please input an integer"); }
	      }while(status==false);	   
	   
	      do {	   
		     status = true;
	         System.out.print("\nChoose an operation\n1 - add\n2 - minus\n3 - multiply\n4 - divide\n:");   
	         try { number.setOperation(Integer.parseInt(data.next())); } 
	         catch(Exception e) { status = false; System.out.println("Please input an integer"); }	      
	      }while( !(number.getOperation()>=1) || !(number.getOperation()<=4) );	 
	      
	      System.out.println(number.toString());	   
	   
	      do {
	         System.out.print("\nNew Calculation? (Y/N) : ");
	         loop = data.next().toUpperCase();	
	      }while( !(loop.equals("Y")) && !(loop.equals("N"))  );
	   
	  }while( loop.equals("Y") );
	
	}

}

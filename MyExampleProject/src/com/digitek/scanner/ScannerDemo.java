package com.digitek.scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	    performAddition();
        readlines();
        readline();
	}

	public static void performAddition(){
				
		Scanner scannerObject= new Scanner(System.in);
		
		System.out.println("Enter the first NO");
		
	
		int no1 = scannerObject.nextInt();
		
		System.out.println("Enter The Second No");
		
		int no2 = scannerObject.nextInt();
		
		int sum = no1+no2;
		System.out.println("result "+sum);
		scannerObject.close();
		
	}
	      public static void readline(){
		  Scanner scannerObject= new Scanner(System.in);
		  
		  System.out.println("Enter The text: ");
		  
		  String input = scannerObject.nextLine();
		  
		  System.out.println(" your text is :" + input);
		  
		  scannerObject.close();
		  
	  }
	
	  public static void readlines(){
		  Scanner scannerObject= new Scanner(System.in);
		  
		  while(true){
			  
		    
		  System.out.println("Enter The text: ");
		 
		  
		  String input = scannerObject.nextLine();
		  if (input.isEmpty()){
			  break;
		  }
		  
		  System.out.println(" your text is :" + input);
		  
		  scannerObject.close();
	  }
		 
}
	  
}
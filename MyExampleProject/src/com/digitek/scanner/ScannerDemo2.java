package com.digitek.scanner;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        readlines();
	}

	      /*public static void readline(){
		  Scanner scannerObject= new Scanner(System.in);
		  
		  System.out.println("Enter The text: ");
		  
		  String input = scannerObject.nextLine();
		  
		  System.out.println(" your text is :" + input);
		  
		  scannerObject.close();
		  
	  }*/
	
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
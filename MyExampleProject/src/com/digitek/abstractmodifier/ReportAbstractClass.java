package com.digitek.abstractmodifier;

public abstract class ReportAbstractClass {

	public void generatHeader(){
		
		System.out.println(" ********* Header ********");
		
	}

	   public void subHeader(){
		   System.out.println ("******** SubHeader ********");
	   }
      
	
	public void generateLogo(){
		
		System.out.println(" ********* Logo ********");
		
	}
     
	public abstract void generateBody();

    public void generateFooter(){
    	
    	
    	System.out.println(" ********* Footer ********");
    }

}



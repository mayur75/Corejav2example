package com.digitek.abstractmodifier;

public class ReportClientClass {

	public static void main(String[] args) {
		
        csvReportsclient();
        xmlReportsclient();
		
		
	}

	public static void csvReportsclient(){
		CSVReportGenerator csvreport = new CSVReportGenerator();
		csvreport.generatHeader();
		csvreport.subHeader();
		csvreport.generateLogo();
		csvreport.generateBody();
		csvreport.generateFooter();
		
	}
	
	public static void xmlReportsclient(){
		XMLReportGenerator xmlreport = new XMLReportGenerator();
		xmlreport.generatHeader();
		xmlreport.subHeader();
		xmlreport.generateLogo();
		xmlreport.generateBody();
		xmlreport.generateFooter();
	
	}
	
}

package pratics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseTest.BaseTest;

public class SelectValues {
	
public static void main(String[]args) {
		
		WebDriver driver=BaseTest.initBrowser("https://www.facebook.com/signup");
		
		WebElement day=driver.findElement(By.xpath("//*[@id='day']"));
	
	
		Select sel=new Select(day);
		 sel.selectByVisibleText("21");
		 
		 
		 //To Find Count
		 List<WebElement> element=sel.getOptions();
		 int count=element.size();
			 
			 System.out.println(count);
		      
		 
				
			//To Print all Vaules from element
			 
			 for(int i=0;i<count;i++) {
	           String value=element.get(i).getText();
	           
	           System.out.println(value);
	       
	  		 
			 }
			 
			 System.out.println("");
			 
			 
			 WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
			  
			 Select month2=new Select(month);
			 month2.selectByVisibleText("Sep");
			 
			 List<WebElement> monthcount=month2.getOptions();
			 
			 int monthcountvalue=monthcount.size();
			 
			 System.out.println(monthcountvalue);
		  
			 
			 for(int i=0;i<monthcountvalue;i++) {
				 String monthtext = monthcount.get(i).getText();
				 
				 System.out.println(monthtext);
			      
			 }
			 System.out.println("");
			 
			 
			 
			 WebElement year=driver.findElement(By.xpath("//*[@id='year']"));
			  
			 Select Year2=new Select(year);
			 
			 Year2.selectByVisibleText("2022");
			 
             System.out.println(Year2);
             
             
             List<WebElement> yearcount=Year2.getOptions();
             
             int yearcountvalue =yearcount.size();
             
             System.out.println(yearcountvalue);
             
             
             
             for(int i=0;i<yearcountvalue;i++) {
            	 
            	 String yearText=yearcount.get(i).getText();  
            	 
            	 System.out.println(yearText);
               
             
             }
             System.out.println("");
             
             WebElement year2=driver.findElement(By.xpath("//*[@id='year']"));
			  
			 Select Year3=new Select(year);
			 
			 Year3.selectByVisibleText("2022");
			 
			 
			 List<WebElement>options3=Year3.getOptions();
			 
			 int count9=options3.size();
			 
			 for(int i=0;i<count9;i++) {
				 
				 String year7=options3.get(i).getText();
				 
				 System.out.println(year7);
				 
			 }
             
             
             
             
             driver.quit();
             
             
}
}

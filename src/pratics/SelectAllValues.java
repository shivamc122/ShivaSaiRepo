package pratics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseTest.BaseTest;

public class SelectAllValues {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver=BaseTest.initBrowser("https://www.facebook.com/signup");
		
		WebElement day=driver.findElement(By.xpath("//*[@id='day']"));
	
	
		Select sel=new Select(day);
		 sel.selectByVisibleText("21");
		 
		 Thread.sleep(2000);
		 
		 
		 //To Find Count
		 
		 List<WebElement> options = driver.findElements(By.xpath("//*[@id='day']"));
		 
		 for(WebElement allelements:options) {
			 
			 String text2=allelements.getText();
			 //System.out.println(text2);
			 
			 if(text2.equals("21")) {
				 allelements.click();
				 break;
			 }
			 
			// System.out.println(text2);
		 
		 
		 
//		 List<WebElement> element=sel.getOptions();
//		 int count=element.size();
//			 
//			 System.out.println("count");
//		 
//				
//			//To Print all Vaules from element
//			 
//			 for(int i=0;i<count;i++) {
//	           String value=element.get(i).getText();
//	           
//	           System.out.println(value);
//	  		 
			 }
			 
			 
	
	}
	

}

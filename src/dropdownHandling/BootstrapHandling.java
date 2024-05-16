package dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseTest.BaseTest;

public class BootstrapHandling {
	public static void main(String[] args) throws InterruptedException {
		
//		WebDriver driver = BaseTest.initBrowser("https://paytm.com/recharge");
//	
//		
//		driver.findElement(By.xpath("//*[text()='Operator']/preceding-sibling::input")).click();
//		
//		
//		driver.findElement(By.xpath("//ul//li//span[text()='BSNL']")).click();
		
		WebDriver driver=BaseTest.initBrowser("https://paytm.com/recharge");
	driver.findElement(By.xpath("//*[text()='Operator']/preceding-sibling::input")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//ul//li//span[text()='BSNL']")).click();
		
		 //List<WebElement> allOperator = driver.findElements(By.xpath("//*[text()='Operator']/preceding-sibling::input"));
		 
////		 for(WebElement textallOpertor:allOperator) {
////			  String text2=textallOpertor.getText();
////			 
//		  }
		       
		
		 
		 
	}
}


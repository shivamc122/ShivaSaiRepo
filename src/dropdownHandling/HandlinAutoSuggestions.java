package dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseTest.BaseTest;

public class HandlinAutoSuggestions {
	
public static void main(String[] args) throws InterruptedException {
		
//		WebDriver driver = BaseTest.initBrowser("https://www.google.com/");
//		
//		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
//		
//		Thread.sleep(2000);
//		
		
		WebDriver driver=BaseTest.initBrowser("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("selenium");
		
		Thread.sleep(2000);
		
		List<WebElement> allelements = driver.findElements(By.xpath("//*[text()='selenium']"));
		
		//System.out.println(allelements);
		
		for(WebElement ele :allelements) {
			
			String text=ele.getText();
			
			
			
			if (text.equals("selenium webdriver")) {
				ele.click();
				break;
			}
			System.out.println(text);
		}
		
		
//		List<WebElement> allelements = driver.findElements(By.xpath("//*[text()='selenium']"));
		
//	
//	
//		
//		for(WebElement ele :allelements)
//		{
//			String text = ele.getText();
//			
//			if(text.equals("selenium testing"))
//			{
//				ele.click();
//				break;
//				
//			}
//			System.out.println(text);
//		}
//	
     }

}

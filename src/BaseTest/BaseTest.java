package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
static WebDriver driver; 
	
	public static WebDriver initBrowser(String url)
	System.out.println("1111");
	System.out.println("2222 ");
	{
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		return driver;
		
		
		System.out.println("New Final Commit1 ");
		System.out.println("Last  Commit1 ");
		
		System.out.println("3333");
		System.out.println("4444 ");
		
		System.out.println("5555");
		System.out.println("6666 ");
		
	}

}

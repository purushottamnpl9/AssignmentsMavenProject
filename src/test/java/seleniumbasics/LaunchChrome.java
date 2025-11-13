package seleniumbasics;

import static org.testng.Assert.assertEquals;

import java.awt.Window;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		String actualTittle = driver.getTitle();
		
		String expectedTittle = "Google";
		
	   // assertEquals(actualTittle, expectedTittle);
		
		driver.manage().deleteAllCookies()	;
		
		driver.manage().window().maximize();
		
	   driver.manage().window().getSize();
	   
	   driver.manage().window().setSize(new Dimension(900, 1000));
	   
	  // driver.navigate().newWindow(WindowType.TAB);
	   
	   driver.manage().window().maximize();
	   
	   driver.navigate().refresh();
	   
	   driver.navigate().back();
	   
	   driver.navigate().forward();
	   
	 String currentWindow=  driver.getWindowHandle();
	 String newUrl = "https://www.google.com";
	 
	 driver.navigate().to(newUrl);
	 
	 Thread.sleep(5000);
	 
	 driver.switchTo().window(currentWindow);
	 
	
		
		
		
		

		//Thread.sleep(5000);

		//driver.close();
	}

}

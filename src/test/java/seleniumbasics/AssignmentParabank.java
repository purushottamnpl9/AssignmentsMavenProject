package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentParabank {

	
	public static void main(String[] args) throws InterruptedException {
		
		// 1. Launch the Browser
		
		WebDriver driver = new ChromeDriver();
		
		// 2. Maximize the window 
		
		driver.manage().window().maximize();
		
		// 3. Delete Cookies
		
		driver.manage().deleteAllCookies();
		
		// 4. Launch expected URL in chrome Browser
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=3A348ACBC30A591E76E31E28FD0EDD74");
		
		// 5. Locate the Parabank logo
		
		driver.findElement(By.className("logo"));
		
		// 6. Locate the Solution link
		
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li > [class='Solutions']"));
		
		// 7. Locate About us link 
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li > a[href='about.htm']"));
		
		// 8. Locate Services link 
		
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li > a[href='services.htm']"));
		
		// 9. Locate Products
		
		driver.findElement(By.cssSelector("a[target='_blank']"));
		
		// 10. Locate Locations  Having doubt in creating another selectors
		
		driver.findElement(By.cssSelector("/html[1]/body[1]/div[1]/div[2]/ul[1]/li[5]/a[1]"));
		
		// 11. Locate Admin Page 
		
		driver.findElement(By.cssSelector("a[xpath='1']"));
		
		// 12 . ATM Services> Withdraw Funds
		
		driver.findElement(By.linkText("Withdraw Funds"));
		
		// 13. Transfer Funds Doubt in creating 
		
		// 14. Check balance locators
		
		driver.findElement(By.linkText("Check balance"));
		
		// 15. Make Deposit 
		
		driver.findElement(By.linkText("Make Deposits"));
		
		// 16. Online Service > Bill pay
		
		driver.findElement(By.linkText("Online Bill pay"));
		
		// 17. Account History
		
		driver.findElement(By.linkText("Account history"));
		
		// 18. Transfer Funds doubt
		
		// 19 . Read more doubt
		
		// 20. Parabank is now re opened
		
		driver.findElement(By.linkText("ParaBank Is Now Re-Opened"));
		
		driver.findElement(By.linkText("New! Online Bill Pay"));
		
		driver.findElement(By.linkText("New! Online Account Transfers"));
		
		// Welcome to parabank doubt in 3 button home page and other buttons
		
		
		
		
		
		
		
	}

}

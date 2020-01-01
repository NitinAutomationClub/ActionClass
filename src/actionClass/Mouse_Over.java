package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse_Over {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:/driver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.spicejet.com");
	
	Thread.sleep(10000);
	
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();

	Thread.sleep(4000);
	
	driver.findElement(By.linkText("Hot Meals")).click();
	
	
	
	

	}

}

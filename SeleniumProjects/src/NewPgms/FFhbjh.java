package NewPgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FFhbjh {
	
	@Test(priority=1)
	public void dell() {
		System.setProperty("webdriver.chrome.Drivers","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dell.com/en-in");
		driver.quit();
	}
	@Test(priority=-1,invocationCount=2,threadPoolSize=0)
	public void lenscart() {
		System.setProperty("webdriver.chrome.Drivers","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lenskart.com");
		driver.quit();

}
}

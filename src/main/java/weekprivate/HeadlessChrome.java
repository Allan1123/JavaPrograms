package weekprivate;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeadlessChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive", "./drivers/chromedriver");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1200x600");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
	
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		

	}

}

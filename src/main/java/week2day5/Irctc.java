package week2day5;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {
		// Load driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// Load URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().fullscreen();
		String options = driver.findElementById("userRegistrationForm:countries").getText();
		System.out.println(options);
		driver.close();

	}

}

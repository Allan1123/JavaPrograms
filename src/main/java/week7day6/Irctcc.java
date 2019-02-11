package week7day6;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctcc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		WebElement eleDate = driver.findElementById("userRegistrationForm:dobDay");
		Select eD = new Select(eleDate);
		eD.selectByVisibleText("76");
		driver.close();

	}

}

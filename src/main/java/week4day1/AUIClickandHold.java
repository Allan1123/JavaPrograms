package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AUIClickandHold {

	public static void main(String[] args) throws InterruptedException {

		// Load driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// Load URL
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		// Thread.sleep(1000);
		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement item3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		WebElement item5 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		WebElement item7 = driver.findElementByXPath("//ol[@id='selectable']/li[7]");

		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.COMMAND);
		builder.click(item1).click(item3).click(item5).click(item7).perform();

	}

}

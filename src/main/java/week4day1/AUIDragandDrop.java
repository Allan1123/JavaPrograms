package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AUIDragandDrop {

	public static void main(String[] args) throws InterruptedException {

		// Load driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// Load URL
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);

		driver.switchTo().frame(0);

		Actions builder = new Actions(driver);
		WebElement file1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		Point loc1 = driver.findElementByXPath("//ul[@id='sortable']/li[4]").getLocation();

		builder.dragAndDropBy(file1, loc1.getX(), loc1.getY()).perform();

	}

}

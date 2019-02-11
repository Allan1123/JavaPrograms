package week10day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class ToolTip {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String ele2="Search in";
		System.setProperty("Webdriver.chrome.driver", ".driver/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//select[@title='Search in']"));
		Actions actions= new Actions(driver);
		actions.moveToElement(ele).build().perform();
		WebElement ele1 = driver.findElement(By.xpath("//select[@title='Search in']"));
		System.out.println("Tootl tip is "+ele1.getText());
		Assert.assertEquals(ele1.getText(), ele2);

	}

}

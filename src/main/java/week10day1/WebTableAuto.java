package week10day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAuto {

	public static void main(String[] args) {
		boolean bMatch=false;
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().fullscreen();
		WebElement table = driver.findElementByXPath("//*[@class='innerblock']//table");
		List<WebElement> rows = table.findElements(By.tagName("tr"));//FOR ROWS SELECTION
		for (WebElement eachrow : rows) {
			List<WebElement> columns=eachrow.findElements(By.tagName("td"));
			for (WebElement eachColumn : columns) {
				String text = eachColumn.getText();
				System.out.println(text);
				if (text.contains("Handle")) {
					driver.findElement(By.xpath("(//td/input[@name='vital'])[3]")).click();	
				}
				else {
					
				}
			}
		}
	}

}

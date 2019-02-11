package week10day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		driver.get("https://www.amazon.in/");
		driver.manage().window().fullscreen();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 1; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}

	}

}

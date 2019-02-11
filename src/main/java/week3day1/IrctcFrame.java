package week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcFrame {

	public static void main(String[] args) {
		// Load driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// Load URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().fullscreen();
		driver.findElementByXPath("//div//li/a[text()='Contact Us']").click();

		// convert SET to LIST - Import Array and list
		Set<String> allwindows = driver.getWindowHandles();
		List<String> listOfWindows = new ArrayList<String>();
		listOfWindows.addAll(allwindows);
		driver.switchTo().window(listOfWindows.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().window(listOfWindows.get(0));
		driver.close();

	}

}

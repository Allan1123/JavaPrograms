package week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// Load driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// Load URL
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().fullscreen();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM/SFA").click();
		driver.findElementByPartialLinkText("Leads").click();
		driver.findElementByPartialLinkText("Find Leads").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div//li/a[text()='Merge Leads']").click();
		driver.findElementByXPath("(//a/img[@alt='Lookup'])[1]").click();
		// new window
		Set<String> setWindow = driver.getWindowHandles();
		List<String> allwindows = new ArrayList<String>();
		allwindows.addAll(setWindow);
		driver.switchTo().window(allwindows.get(1));
		Thread.sleep(4000);
		driver.findElementByXPath("//div/input[@name='id']").sendKeys("10037");
		driver.findElementByXPath("//tbody//td/em/button[text()='Find Leads']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("(//tbody//td/div/a)[1]").click();
		Thread.sleep(3000);
		// switch to first window
		driver.switchTo().window(allwindows.get(0));
		driver.findElementByXPath("(//a/img[@alt='Lookup'])[2]").click();
		// new window
		Set<String> setWindow1 = driver.getWindowHandles();
		List<String> allwindows1 = new ArrayList<String>();
		allwindows1.addAll(setWindow1);
		driver.switchTo().window(allwindows1.get(1));
		driver.findElementByXPath("//div/input[@name='id']").sendKeys("10037");
		driver.findElementByXPath("//tbody//td/em/button[text()='Find Leads']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("(//tbody//td/div/a)[1]").click();
		driver.switchTo().window(allwindows1.get(0));
		// click on Merge Button
		driver.findElementByXPath("//tr/td/a[text()='Merge']").click();
		// Click ok on Alert
		driver.switchTo().alert().accept();
		driver.findElementByPartialLinkText("Find Leads").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div/input[@name='id']").sendKeys("10212");
		driver.findElementByXPath("//tbody//td/em/button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String text = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if (text.contains("No records to display")) {
			System.out.println("The text is verified");
		} else {
			System.out.println("The text is incorrect");
		}

		// driver.close();
	}

}

package week2homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElementByXPath("//ul//div/a[text()='Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//div//li/a[text()='Find Leads']").click();
		driver.findElementByXPath("//div//li//a//span[text()='Phone']").click();
		driver.findElementByXPath("//table//tbody//td//div/input[@name='phoneNumber']").sendKeys("9884516877");
		driver.findElementByXPath("//div//li/a[text()='Find Leads']").click();
		Thread.sleep(3000);
		WebElement findEle = driver.findElementByXPath("(//div//tbody/tr//div/a)[1]");
		String WebText = findEle.getText();
		System.out.println(WebText);
		driver.findElementByXPath("(//div//tbody/tr//div/a)[1]").click();
		driver.findElementByXPath("//div/a[text()='Delete']").click();
		driver.findElementByXPath("//div//li/a[text()='Find Leads']").click();
		driver.findElementByXPath("//div/input[@name='id']").sendKeys(WebText);
		driver.findElementByXPath("//div//li/a[text()='Find Leads']").click();
		Thread.sleep(4000);
		String text = driver.findElementByXPath("//div//tbody//td//button[text()='Find Leads']").getText();
		if (text.contains("No records to display")) {
			System.out.println("The record is correct");
		} else {
			System.out.println("The record is incorrect");
		}
		driver.close();
		
		

	}

}

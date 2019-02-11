package week2homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElementByXPath("//div/a[text()='Leads']").click();
		driver.findElementByXPath("//div//li/a[text()='Find Leads']").click();
		Thread.sleep(4000);
		// driver.findElementByXPath("(//div/input[@name='firstName'])[3]").sendKeys("Allan");
		driver.findElementByXPath("//li//span[text()='Email']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//div//input[@name='emailAddress']").sendKeys("allandavid35@gmail.com");
		driver.findElementByXPath("//div//tbody//td//button[text()='Find Leads']").click();
		Thread.sleep(4000);
		// Get the first name and store it
		WebElement gettext = driver
				.findElementByXPath("(//div//tbody//td/div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]");
		String firstName = gettext.getText();
		System.out.println("The captured lead name" + firstName);

		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//div/a[text()='Duplicate Lead']").click();
		String title = driver.getTitle();
		if (title.contains("Duplicate Lead")) {
			System.out.println("The title is correct");
		} else {
			System.out.println("The title is incorrect");
		}
		driver.findElementByXPath("//tr//input[@name='submitButton']").click();
		Thread.sleep(3000);
		String Duptext = driver.findElementById("viewLead_firstName_sp").getText();
		if (Duptext.contains(firstName)) {
			System.out.println("The first name matches");
		} else {
			System.out.println("The first name does not matches");
		}
		driver.close();

	}

}

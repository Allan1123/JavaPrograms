package week3day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClasswork {

	public static void main(String[] args) {
		// Load driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// Load URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().fullscreen();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//body/button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys("Allan");
		driver.switchTo().alert().accept();
		String text = driver.findElementById("demo").getText();
		if (text.contains("Allan")) {
			System.out.println("The name is correct");
		} else {
			System.out.println("The name is incorrect");
		}
		driver.close();
	}

}

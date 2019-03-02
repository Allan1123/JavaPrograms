package week10day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("Webdriver.chrome.driver", ".driver/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.get("https://www.guru99.com/compatibility-testing.html");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//img[@alt='Tools, Safety, TMI and Robo - Upto 50% off'])[1]")).click();
//		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();



	}

}

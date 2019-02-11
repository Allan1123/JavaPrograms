package week10day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingChrome {

	public static void main(String[] args) {
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://javatutorial.net/java-abstraction-example");
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		
		//driver.get("https://javatutorial.net/java-abstraction-example");

	}

}

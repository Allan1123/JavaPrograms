package week10day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

		
		ChromeDriver driver = new ChromeDriver();
		
		public void switchToWindow(int index) throws InterruptedException {
		Set<String> newWindow = driver.getWindowHandles();
		
		
		List<String> allWindows=new ArrayList<String>();
		allWindows.addAll(newWindow);
		driver.switchTo().window(allWindows.get(index));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	
		}
	}

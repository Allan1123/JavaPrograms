package week10day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	ChromeDriver driver = new ChromeDriver();
	public void SwitchtoWindow(int index) {
		Set<String> newWindow= driver.getWindowHandles();
		List<String> allWindows= new ArrayList<String>();
		allWindows.addAll(newWindow);
		driver.switchTo().window(allWindows.get(index));
	}

}

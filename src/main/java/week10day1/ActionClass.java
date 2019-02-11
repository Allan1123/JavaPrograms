package week10day1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.mongodb.client.model.ReturnDocument;

public class ActionClass {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		Actions builder = new Actions(driver);
		//builder.contextClick(item1).sendKeys(keys)
		
		builder.doubleClick().build().perform();
		
		
		builder.click().perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		String txt1 = js.executeScript("return document.getElementById('tdToOnly').innerText").toString();		
		System.out.println(txt1);
		
		
		
	}

}

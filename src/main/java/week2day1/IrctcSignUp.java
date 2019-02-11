package week2day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		// Login
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().fullscreen();
		driver.findElementById("userRegistrationForm:userName").sendKeys("Allan");
		driver.findElementById("userRegistrationForm:password").sendKeys("Allan123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Allan123");
		WebElement RegSecurity = driver.findElementById("userRegistrationForm:securityQ");
		Select rs = new Select(RegSecurity);
		rs.selectByVisibleText("What was the name of your first school?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Alpha");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Allan");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("A");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("David");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement dobDay = driver.findElementById("userRegistrationForm:dobDay");
		Select dD = new Select(dobDay);
		dD.selectByVisibleText("11");
		WebElement dobMay = driver.findElementById("userRegistrationForm:dobMonth");
		Select dM = new Select(dobMay);
		dM.selectByVisibleText("MAR");
		WebElement dobYay = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dY = new Select(dobYay);
		dY.selectByVisibleText("1989");
		WebElement RegOcc = driver.findElementById("userRegistrationForm:occupation");
		Select ro = new Select(RegOcc);
		ro.selectByVisibleText("Private");

		driver.findElementById("userRegistrationForm:uidno").sendKeys("121212121");
		driver.findElementById("userRegistrationForm:idno").sendKeys("AYAPA2123");

		// country drop down
		// (//div//table/tbody//td/select/option[text()='Egypt'])[1]
		WebElement RegCount = driver.findElementById("userRegistrationForm:countries");
		Select rc = new Select(RegCount);
		rc.selectByValue("56");

		driver.findElementById("userRegistrationForm:email").sendKeys("allandavid35@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9884516877");

		// drop down for nationality
		WebElement RegNationl = driver.findElementById("userRegistrationForm:nationalityId");
		Select rn = new Select(RegNationl);
		rn.selectByValue("94");

		// Resident Address
		driver.findElementById("userRegistrationForm:address").sendKeys("No 9,a jeevan nagar");
		driver.findElementById("userRegistrationForm:street").sendKeys("Jeevan nagar");
		driver.findElementById("userRegistrationForm:area").sendKeys("Chennai");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600088", Keys.TAB);
		Thread.sleep(5000);
		WebElement RegCity = driver.findElementById("userRegistrationForm:cityName");
		Select rct = new Select(RegCity);
		rct.selectByValue("Kanchipuram");
		Thread.sleep(5000);

		WebElement RegPost = driver.findElementById("userRegistrationForm:postofficeName");
		Select rp = new Select(RegPost);
		rp.selectByValue("Adambakkam S.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("9884516877");

		driver.close();

	}

}

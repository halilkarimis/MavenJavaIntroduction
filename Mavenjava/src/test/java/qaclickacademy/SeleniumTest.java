package qaclickacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void browserAutomation() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\halil\\Downloads\\00Programs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		System.out.println("browserAutomation");
		
	}

	@Test
	public void elementsUI() {
		System.out.println("elementsUI");
	}

}

package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {
  WebDriver driver;
	@Before
	public void setUpBeforeClass() throws Exception {
		driver = new FirefoxDriver();
		driver.get("https://in.yahoo.com/?p=us");
		driver.manage().window().maximize();
		
	}

	@After
	public  void tearDownAfterClass() throws Exception {
	//	driver.quit();
	}

	@Test
	public void test() {
		System.out.println(driver.getTitle());
		
	}

}

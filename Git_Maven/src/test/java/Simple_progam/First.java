package Simple_progam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First {

	@Test
	public void url() {
		WebDriver d = new ChromeDriver();
		d.get("http://www.saucedemo.com");

	}

}

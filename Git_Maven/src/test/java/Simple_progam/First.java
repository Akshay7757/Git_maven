package Simple_progam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("http://www.saucedemo.com");

	}

}

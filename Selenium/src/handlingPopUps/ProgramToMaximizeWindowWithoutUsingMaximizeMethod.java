package handlingPopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProgramToMaximizeWindowWithoutUsingMaximizeMethod {

	public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--start-maximized");
    WebDriver driver=new ChromeDriver(options);
    driver.get("https://www.yatra.com");
	}

}

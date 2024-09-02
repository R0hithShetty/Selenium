package handlingPopUps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications","--start-maximized","-incognito");
	WebDriver d=new ChromeDriver(options);
	d.get("https://www.yatra.com");
}
}

package handlingPopUps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//driver.get("https://the-internet.herokuapp.com/basic_auth");
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	//admin is the username and another admin is password , here we are sending un
	// and pass in the url itself to handle the authentication popup.
}
}

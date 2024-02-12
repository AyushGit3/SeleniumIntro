import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BD225VJ\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String appurl2 = "https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
		driver.get(appurl2);
		//driver.findElement(By.id("ap_email")).sendKeys("917222974279");
		driver.findElement(By.id("ap_email")).sendKeys("918106066055");
		driver.findElement(By.id("ap_password")).sendKeys("14252525");
		driver.findElement(By.id("signInSubmit")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("auth-fpp-link-bottom")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("ap_email")).sendKeys("");
		driver.findElement(By.id("continue")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath(//input[@name="918106066055Satwika"));
		driver.close();
		
	}

}//id("continue")).sendKeys(Keys.ENTER);
//918106066055
//input[@name="918106066055Satwika"]
//continue
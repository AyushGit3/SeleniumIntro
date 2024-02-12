import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class Sele6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BD225VJ\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String a = "https://www.google.com/";
		driver.get(a);
		driver.findElement(By.className("gLFyf")).sendKeys("lol");
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);

	}

}

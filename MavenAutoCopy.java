import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MavenAutoCopy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BD225VJ\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String a = "https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java";
		driver.get(a);
		driver.findElement(By.xpath("//a[@href='selenium-java/4.17.0']")).click();
		driver.findElement(By.id("maven-a")).click();


	}

}

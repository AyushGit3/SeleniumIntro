import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class Assign2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BD225VJ\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String a = "https://www.ironspider.ca/forms/checkradio.htm";
		driver.get(a);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='red']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,750)", "");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='radio'][2]")).click();
		Thread.sleep(3000);
		driver.close(); 
	}

}

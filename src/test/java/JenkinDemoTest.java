import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class JenkinDemoTest {
	
	public static String eXptTite="Dashboard / nopCommerce administration";
	@Test
	public static void jenkTest()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://admin-demo.nopcommerce.com/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//input[@type=\"email\"]")).clear();
	driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("admin@yourstore.com");
	driver.findElement(By.xpath("//input[@id=\"Password\"]")).clear();
	driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	String acTtitle=driver.getTitle();
	
	System.out.println(acTtitle);
	if(acTtitle.equals(eXptTite))
	{
		System.out.println("user logged in successfully");
	}
	else
	{
		System.out.println("user Not  logged in successfully");
	}

	}

	}



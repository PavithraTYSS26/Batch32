package bluestone.pavithra.github;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class $11_BluestoneTopIcon {

	
		@Test
		public void f() {
			System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.get("https://www.bluestone.com");
			driver.manage().window().maximize();

			js.executeScript("window.scrollBy(0,3000);");
			Assert.assertTrue(driver.findElement(By.xpath("//span[@class='logo-icon']")).isDisplayed());

			driver.findElement(By.xpath("//span[@class='logo-icon']")).click();
			driver.close();

		}
	}


package bluestone.pavithra.github;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class $2_BluestoneGoldCoin50gm {
	
	  @Test
	  public void f() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\git\\Batch32\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Actions act = new Actions(driver);
			driver.get("https://www.bluestone.com");
			driver.manage().window().maximize();

			act.moveToElement(driver.findElement(By.xpath("//li[@id='goldCoins']/a"))).build().perform();
			act.moveToElement(driver.findElement(By.xpath("//span[text()='Plain Gold Coins']"))).build().perform();
			driver.findElement(
					By.xpath("//span[text()='Plain Gold Coins']/parent::div/parent::div/ul/li/span[text()='50 gram']")).click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()='(50 gram)']")).isDisplayed());
			Assert.assertEquals(driver.findElement(By.xpath("//span[text()='(50 gram)']")).getText(), "(50 gram)");
			System.out.println("50 gram gold coin is diplayed......");
			driver.close();

	  
	}

}

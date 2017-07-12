package RifatTest.RifatTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class chase {
	 WebDriver driver;
  @Test
  public void ChaseBank() {
	 ChromeDriverManager.getInstance().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.chase.com/");
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 String AdvPresnt = driver.findElement(By.xpath(".//*[contains(@id,'DA_')]")).getText();//dynamic page
	 System.out.println(AdvPresnt);
	 driver.navigate().refresh();
	 String AdvPresnt1 = driver.findElement(By.xpath(".//*[contains(@id,'DA_')]")).getText();
	 System.out.println(AdvPresnt1);
	 String AdvPresnt2 = driver.findElement(By.xpath(".//*[contains(@id,'DA_')]")).getText();
	// System.out.println(AdvPresnt2);
	// WebDriverWait wait = new WebDriverWait(driver,20);
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='DA_649260303933']/div[2]"))).click();
	 driver.findElement(By.xpath(".//*[@id='userId-input-field'][@placeholder='Username']")).sendKeys("debazroy2");
	 driver.findElement(By.id("password-input-field")).sendKeys("Nabonita2");
	 driver.findElement(By.xpath(".//*[@id='signin-module']/div/div/div/div/form/div/div/a[contains(text(),'Sign in')]")).click();
  }
  
  
}

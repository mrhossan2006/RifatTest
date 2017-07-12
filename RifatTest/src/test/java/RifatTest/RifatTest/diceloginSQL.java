package RifatTest.RifatTest;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class diceloginSQL {
	@Test
	public void dice() throws SQLException, Exception {
		ChromeDriverManager.getInstance().setup();
		 WebDriver driver = new ChromeDriver();
		 //try{
		 driver.get("http://www.dice.com/");
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 
		 /* 
		 driver.findElement(By.id("search-field-keyword")).sendKeys("IT");
		 driver.findElement(By.id("search-field-location")).clear();
		 driver.findElement(By.id("search-field-location")).sendKeys("33126");
		 driver.findElement(By.id("Login_1")).click();
		 driver.findElement(By.id("Email_1")).sendKeys("mrhossan2006@gmail.com");
		 driver.findElement(By.id("Password_1")).sendKeys("md436845");
		 driver.findElement(By.id("Log")).click();
		 
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testcasesql","root","root");
		 Statement stmt = conn.createStatement();
		 ResultSet rs = stmt.executeQuery("select * from findjob");
		 while(rs.next()) {
			System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5)+","+rs.getString(6)+","+rs.getString(7));
		 }
		 
		 String SQL_JobTitle = rs.getString(2);
		 driver.findElement(By.id("search-field-keyword")).sendKeys(SQL_JobTitle);
		 Thread.sleep(3000);
		 driver.findElement(By.id("search-field-location")).clear();
		 String SQL_ZipCode = rs.getString(3);
		 driver.findElement(By.id("search-field-location")).sendKeys(SQL_ZipCode);
		 
		 String SQL_userName = rs.getString(4);
		 driver.findElement(By.id("Email_1")).sendKeys(SQL_userName);
		 
		 String SQL_Password = rs.getString(5);
		 driver.findElement(By.id("Password_1")).sendKeys(SQL_Password);
		 Thread.sleep(3000);
		 driver.findElement(By.id("LoginBtn_1")).click();
		 } catch (Exception e) {
		 File ScrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(ScrFile, new File("C:\\Eclipse Java\\Myworkspace\\RifatTest\\SnapShot.bmp"));
		 }
		 */
		 
		 WebElement ImageFile = driver.findElement(By.xpath(".//img[@alt='Dell logo']"));
		 Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth ! = \"undefined\" && arguments[0].naturalWidth >0", ImageFile);
		 if (ImagePresent){
			 System.out.println("Image not displyed");
		 }
		 else{
			 System.out.println("Image displayed is: Dell")
		 }
	}
	
	 

}

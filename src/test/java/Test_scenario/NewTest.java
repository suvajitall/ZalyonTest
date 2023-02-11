package Test_scenario;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import object.LoginObjects;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;



public class NewTest {
	public WebDriver driver1;
	public String expected_url;
	public String actual_url;
	
	
	

	
	@BeforeTest
	public void before_test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
	}
	
	  @BeforeMethod
	  public void beforeMethod() {
		  driver1 = new ChromeDriver();
	  }
	  
	  


		
  @Test(priority=0)

  public void screenShot() throws InterruptedException, IOException {
		driver1.get("https://zalyon.track-progress.com/account/login");
		driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		LoginObjects loginUsername = new LoginObjects();
		loginUsername.login_email(driver1).sendKeys("zalyonadmin@gmail.com");
		loginUsername.login_password(driver1).sendKeys("code1234");
		loginUsername.login_bttn(driver1).click();
		
		driver1.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		expected_url="https://zalyon.track-progress.com/";
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[1]/div[2]/div[1]/div[1]")));
		
		TakesScreenshot scrshot = ((TakesScreenshot)driver1);
		File src_file = scrshot.getScreenshotAs(OutputType.FILE);
		
		File dest_file = new File("C://Users//USER//Desktop//New Folder (2)//ppsScreenShot//test"+Math.random()+".png");
		// FileUtils.copyFile(src_file, dest_file);
		FileHandler.copy(src_file, dest_file);
		
}
  



  @AfterMethod
  public void afterMethod() {
	  
  }

  @AfterTest
  public void after_test() {
	  driver1.quit();
  }
}

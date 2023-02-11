package Test_scenario;

import org.testng.annotations.Test;

import object.LoginObjects;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TrainigModule {
	WebDriver driver;
	WebElement expected_url;
	WebElement actual_url;
	
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver =new ChromeDriver();
	  }
	  
  @Test
  public void f() {
	  driver.get("https://zalyon.track-progress.com/account/login");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		LoginObjects loginUsername = new LoginObjects();
		loginUsername.login_email(driver).sendKeys("zalyonadmin@gmail.com");
		loginUsername.login_password(driver).sendKeys("code1234");
		loginUsername.login_bttn(driver).click();
		
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Dashboard')]")));
	//	System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//span[contains(text(),'Training')]")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")));
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[4]")).click();
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("User1");
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/textarea[1]")).sendKeys("Test address");
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'2023')]")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		WebElement year = driver.findElement(By.className("active"));
		String year_name = year.getText();
		if(year_name.equals("2023")) {
			//year.click();
			System.out.println(year_name);
		}else {
			System.out.println(year_name);
		}
		
  
  }


  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  System.out.println("after method is passed");
	  Thread.sleep(5000);
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

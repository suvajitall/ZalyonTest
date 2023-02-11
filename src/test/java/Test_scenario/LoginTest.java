package Test_scenario;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import object.LoginObjects;

public class LoginTest {
	
	public String expected_url;
	public String actual_url;
	public WebDriver driver1;
	
	@BeforeTest
	public void before_login_test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		
	}
	
	@BeforeMethod
	public void before_method() {
		driver1 = new ChromeDriver();
	}
	@Test(priority = 1)
	public void login_test() throws InterruptedException {
		
		driver1.get("https://zalyon.track-progress.com/account/login");
		driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		LoginObjects loginUsername = new LoginObjects();
		loginUsername.login_email(driver1).sendKeys("zalyonadmin@gmail.com");
		loginUsername.login_password(driver1).sendKeys("code1234");
		loginUsername.login_bttn(driver1).click();
		//driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		expected_url="https://zalyon.track-progress.com/";
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Upgrade Account!')]")));
		
		actual_url=driver1.getCurrentUrl();
		//System.out.println(actual_url);
		Assert.assertEquals(expected_url, actual_url);
		Thread.sleep(10000);
		//driver1.quit();
	}
	
	@Test(priority = 2)
	public void login_test_wrongEmail() throws InterruptedException {
		driver1.get("https://zalyon.track-progress.com/account/login");
		driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		LoginObjects loginUsername = new LoginObjects();
		loginUsername.login_email(driver1).sendKeys("zalyonadmin@gmail1.com");
		loginUsername.login_password(driver1).sendKeys("123456");
		loginUsername.login_bttn(driver1).click();
		//driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		expected_url="https://zalyon.track-progress.com/account/login";
		actual_url=driver1.getCurrentUrl();
		//System.out.println(actual_url);
		Assert.assertEquals(expected_url, actual_url);
		Thread.sleep(10000);
		driver1.quit();
	}
	
	@Test(priority = 3)
	public void login_test_wrongPassword() throws InterruptedException {
		driver1.get("https://zalyon.track-progress.com/account/login");
		driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		LoginObjects loginUsername = new LoginObjects();
		loginUsername.login_email(driver1).sendKeys("zalyonadmin@gmail1.com");
		loginUsername.login_password(driver1).sendKeys("12345");
		loginUsername.login_bttn(driver1).click();
		//driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		expected_url="https://zalyon.track-progress.com/account/login";
		actual_url=driver1.getCurrentUrl();
		//System.out.println(actual_url);
		Assert.assertEquals(expected_url, actual_url);
		Thread.sleep(10000);
		driver1.quit();
	}
	
	@Test(priority = 4)
	public void login_test_blank() throws InterruptedException {
		driver1.get("https://zalyon.track-progress.com/account/login");
		driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		LoginObjects loginUsername = new LoginObjects();
		loginUsername.login_email(driver1).sendKeys("");
		loginUsername.login_password(driver1).sendKeys("");
		loginUsername.login_bttn(driver1).click();
		//driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		expected_url="https://zalyon.track-progress.com/account/login";
		actual_url=driver1.getCurrentUrl();
		//System.out.println(actual_url);
		Assert.assertEquals(expected_url, actual_url);
		Thread.sleep(10000);
		driver1.quit();
	}
	
		
}

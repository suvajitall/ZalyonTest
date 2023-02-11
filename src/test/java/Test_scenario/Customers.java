package Test_scenario;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Customers {
	
	WebDriver driver;
    String number_of_customers;
	String expected_url;
	String actual_url;
	
	 
	@BeforeTest 
	public void before_test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	  @BeforeMethod
	  public void beforeMethod() {
		  driver.get("https://zalyon.track-progress.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("zalyonadmin@gmail.com");
		  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")).sendKeys("code1234");
		  driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		 
		  WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(50));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")));
		 
		  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")));
	  }

  @Test(priority=1,enabled=false)
  public void total_number_of_customers() {
	 
	  WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(50));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")));
	 
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  number_of_customers = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]/span[1]")).getText();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  System.out.println(number_of_customers);
	 
	
  }
  
  @Test(priority=2)
  public void add_customer() {
	  
	  try {
		  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[4]")).click();
	  }catch(Exception e) {
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[4]")).click();
	  }
	  
	  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Organosation A");
	  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
	  driver.findElement(By.xpath("//li[@id='vs1__option-1']")).click();
	  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/input[1]")).sendKeys("9028338091");
	  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[5]/div[1]/input[1]")).sendKeys("abcde@gmail.com");
	  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
	  
	  WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(70));
	  
	  try {
		  driver.findElement(By.xpath("//li[@id='vs19__option-0']")).click();
	  }catch(Exception e) {
		  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='vs19__option-0']")));
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//li[contains(text(),'India')]")).click();
	  }
	 
	  
	  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
	  
	  try {
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//li[@id='vs20__option-0']")).click();
	  }catch(Exception e) {
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//ul[contains(text(),'Andaman and Nicobar Islands')]")).click();
	  }
	  
	  
	  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
	  driver.findElement(By.xpath("//li[@id='vs21__option-0']")).click();
	  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[9]/div[1]/input[1]")).sendKeys("ABCDE1234F");
	  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[10]/div[1]/input[1]")).sendKeys("700078");
	  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[11]/div[1]/textarea[1]")).sendKeys("Portblair address");
	  driver.findElement(By.xpath("//div[@id='vs22__combobox']")).click();
	  driver.findElement(By.xpath("//li[@id='vs22__option-1']")).click();
	  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[14]/div[1]/textarea[1]")).sendKeys("Address 1");
	 
  }


  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
	 
  }

	@AfterTest
	public void after_test() {
		
	}

}

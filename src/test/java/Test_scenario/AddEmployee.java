package Test_scenario;
import object.EmployeePage;
import object.LoginObjects;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import Test_scenario.LoginTest;

public class AddEmployee {
	WebDriver driver1;
	public String expected_url;
	public String actual_url;
	@BeforeTest
	public void setProperty() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
	}
	@BeforeMethod
	public void setDriver() {
		driver1 = new ChromeDriver();
		
	}
	@Test
	public void addEmployee() throws InterruptedException {
		
		expected_url = "https://zalyon.track-progress.com/employees";
		
		driver1.get("https://zalyon.track-progress.com/account/login");
		driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver1.manage().window().maximize();
		LoginObjects loginUsername = new LoginObjects();
		loginUsername.login_email(driver1).sendKeys("zalyonadmin@gmail.com");
		loginUsername.login_password(driver1).sendKeys("code1234");
		loginUsername.login_bttn(driver1).click();
		WebElement emp = driver1.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]"));
		emp.click();
		Thread.sleep(1000);
		actual_url= driver1.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url);
		
		EmployeePage add_employee_button = new EmployeePage();
		add_employee_button.addEmployeeButton(driver1).click();
		
		
		EmployeePage add_emp = new EmployeePage();
		
		
		//profile_picture.profile_picture(driver1).click();
		
		add_emp.send_keys(driver1).sendKeys("C:\\Users\\USER\\Desktop\\Screenshot_1.png");
		add_emp.first_name(driver1).sendKeys("Robot");
		add_emp.last_name(driver1).sendKeys("User");
		add_emp.gender(driver1).sendKeys("Male");
		driver1.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
		
		add_emp.marital_status(driver1).sendKeys("Married");
		driver1.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
		
		add_emp.dob(driver1).click();
		add_emp.dob(driver1).sendKeys("05-12-1995");
		
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(10));
		
		add_emp.office_email(driver1).sendKeys("8989898987");
		
		//add_emp.language(driver1).click();
		
		WebElement lnaguage  = driver1.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Actions actions = new Actions(driver1);
		actions.moveToElement(lnaguage).click().build().perform();
		List<WebElement> languageList = driver1.findElements(By.className("vs__dropdown-menu"));
		
		System.out.println(languageList.size());
		
		Thread.sleep(10000);
	
	}
	
	
}

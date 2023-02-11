package Test_scenario;
import object.MenuOptions;
import object.LoginObjects;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class MenuOptionCheck {
	WebDriver driver;
	public String expected_url;
	public String actual_url;
	
	@BeforeTest
	public void set_properties() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		//driver = new ChromeDriver();
	}
	@BeforeMethod
	public void driver_setUp() {
		driver = new ChromeDriver();
		System.out.println("before method");
	}
	@Test (priority=1, enabled=true)
	public void menuOptionsTest() throws InterruptedException {
		driver.get("https://zalyon.track-progress.com/");
		LoginObjects login_cred = new LoginObjects();
		login_cred.login_email(driver).sendKeys("zalyonadmin@gmail.com");
		login_cred.login_password(driver).sendKeys("code1234");
		List <String> inventory_submenu = new ArrayList<String>();
		Boolean stock_under_inventory;
		Boolean item_master_under_inventory;
		Boolean itemIssues_under_inventory;
		Boolean itemReturn_under_inventory;
		Boolean inventoryReport_under_inventory;
		String expected_array[] = new String[20];
		String actual_array[] = new String[20];
		login_cred.login_bttn(driver).click();
		
		MenuOptions employees = new MenuOptions();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Employees')]")));
		employees.employees(driver).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/button[4]")));
		expected_url = "https://zalyon.track-progress.com/employees";
		actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url);
		
		MenuOptions customer = new MenuOptions();
		customer.customer(driver).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[4]")));
		expected_url = "https://zalyon.track-progress.com/customers";
		actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url);
		
		Thread.sleep(1000);
		
		
		MenuOptions leave = new MenuOptions();
		leave.leave(driver).click();
		Thread.sleep(1000);
		/*expected_url = "https://zalyon.track-progress.com/customers";
		actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url);*/
		Boolean find_element = driver.findElement(By.className("mm-show")).isDisplayed();
		
		
		MenuOptions leaveCalender = new MenuOptions();
		leaveCalender.leaveCalender(driver).click();
		Thread.sleep(1000);
		
		MenuOptions inventory = new MenuOptions();
		inventory.inventory(driver).click();
		Thread.sleep(1000);
		Boolean find_element_under_inventory = driver.findElement(By.className("mm-show")).isDisplayed();
		//System.out.println(find_element_under_inventory);
		if(find_element_under_inventory=true) {
			System.out.println("Inventory submenu is opening");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[1]/a[1]")));
			stock_under_inventory = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[2]/a[1]")).isDisplayed();
			item_master_under_inventory = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[3]/a[1]")).isDisplayed();
			itemIssues_under_inventory = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[3]/a[1]")).isDisplayed();
			itemReturn_under_inventory = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[4]/a[1]")).isDisplayed();
			inventoryReport_under_inventory = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[5]/a[1]")).isDisplayed();
			
			if(stock_under_inventory==true && item_master_under_inventory==true && itemIssues_under_inventory==true && itemReturn_under_inventory==true && inventoryReport_under_inventory==true) {
				inventory_submenu.add( driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[1]/a[1]")).getText());
				inventory_submenu.add(driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[2]/a[1]")).getText());
				inventory_submenu.add(driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[3]/a[1]")).getText());
				inventory_submenu.add(driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[4]/a[1]")).getText());
				inventory_submenu.add(driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[5]/a[1]")).getText());
				
				for(int i=0; i<inventory_submenu.size();i++) {
					System.out.println(inventory_submenu.get(i));
					actual_array[i]=inventory_submenu.get(i);
					
				}
				expected_array[0]="Item Master";
				expected_array[1]="Stock";
				expected_array[2]="Item Issue";
				expected_array[3]="Item Return";
				expected_array[4]="Inventory Report";
				
				if(Arrays.equals(actual_array, expected_array)) {
					System.out.println("Test is passed");
				}else {
					System.out.println("Test is not passed");
				}

			}	
			
			
			
			
		}else {
			System.out.println("Inventory submenu is not opening");
		}
		Thread.sleep(1000);
		driver.quit();
	
	}
	
	@Test(priority=2, enabled=true)
	public void paginationTestForEmployee() throws InterruptedException {
		
		LoginObjects login_cred = new LoginObjects();
		driver.get("https://zalyon.track-progress.com/account/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Remember Me')]")));
		login_cred.login_email(driver).sendKeys("zalyonadmin@gmail.com");
		login_cred.login_password(driver).sendKeys("code1234");
		LoginObjects login_bttn = new LoginObjects();
		login_bttn.login_bttn(driver).click();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/a[1]/span[2]/img[1]")));
		MenuOptions emp = new MenuOptions();
		emp.employees(driver).click();
		
		//List<WebElement> paginationClass = new ArrayList<WebElement>(); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/a[1]/span[2]/img[1]")));
		Thread.sleep(1000);
		WebElement total_number_of_pages = driver.findElement(By.className("ag-paging-page-summary-panel"));
		String page_number_word = total_number_of_pages.getText();
		String[] page_text_split = new String[10];
		page_text_split = page_number_word.split(" of ",2);
		int total_page = Integer.parseInt(page_text_split[1]);
		
		for(int pagenum=1;pagenum<total_page;pagenum++) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/a[1]/span[2]/img[1]")));
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]/div[3]/span[1]")).click();
	
		}
		
		Thread.sleep(10000);
		driver.quit();
		
		
		
	}
	
	
	@Test (priority=3, enabled=true)
	public void fetchEmployeeFromPage() throws InterruptedException {
		LoginObjects login_cred = new LoginObjects();
		driver.get("https://zalyon.track-progress.com/account/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Remember Me')]")));
		login_cred.login_email(driver).sendKeys("zalyonadmin@gmail.com");
		login_cred.login_password(driver).sendKeys("code1234");
		LoginObjects login_bttn = new LoginObjects();
		login_bttn.login_bttn(driver).click();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/a[1]/span[2]/img[1]")));
		MenuOptions emp = new MenuOptions();
		emp.employees(driver).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/a[1]/span[2]/img[1]")));
		Thread.sleep(1000);
		WebElement total_number_of_pages = driver.findElement(By.className("ag-paging-page-summary-panel"));
		String page_number_word = total_number_of_pages.getText();
		String[] page_text_split = new String[10];
		page_text_split = page_number_word.split(" of ",2);
		int total_page = Integer.parseInt(page_text_split[1]);
		String oddElement[] = new String[30];
		int count = 0;
		//int arr=0;
		for(int pagenum=0;pagenum<total_page;pagenum++) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/a[1]/span[2]/img[1]")));
				
				
				for(int arr=1;arr<=10;arr++) {
					
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/a[1]/span[2]/img[1]")));
					
					int checkEmployee = driver.findElements(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div["+arr+"]")).size();
					
					if(checkEmployee==1) {
						
						oddElement[arr] = ((WebElement) driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div["+arr+"]"))).getText();
						
						count ++;
					}
				}
				
				
				driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]/div[3]/span[1]")).click();
				
				//Thread.sleep(1000);
				
				
			}
		String totla_employee = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h4[1]/span[1]")).getText();
		System.out.println(count);
		Assert.assertEquals(count,Integer.parseInt(totla_employee));
		Thread.sleep(1000);
		driver.quit();
		
		
	}
	
	
}

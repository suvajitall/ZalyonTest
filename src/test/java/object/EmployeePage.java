package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeePage {
	public static WebElement addEmployeeButton(WebDriver driver) {
		WebElement add_employee_button = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/button[4]"));
		return add_employee_button;
	}
	
	public static WebElement profile_picture(WebDriver driver) {
		WebElement profile_picture = driver.findElement(By.xpath("//label[contains(text(),'Choose File')]"));
		return profile_picture;
	}
	
	public static WebElement first_name(WebDriver driver) {
		WebElement first_name = driver.findElement(By.xpath("//input[@id='employeeName']"));
		return first_name;
	}
	public static WebElement last_name(WebDriver driver) {
		WebElement last_name = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/input[1]"));
		return last_name;
	}
	public static WebElement gender(WebDriver driver) {
		WebElement gender = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		return gender;
	}
	public static WebElement marital_status(WebDriver driver) {
		WebElement marital_status = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		return marital_status;
	}
	public static WebElement dob(WebDriver driver) {
		WebElement dob = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		return dob;
	}
	public static WebElement contact_numb(WebDriver driver) {
		WebElement contact_numb = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/input[1]"));
		return contact_numb;
	}
	public static WebElement office_email(WebDriver driver) {
		WebElement office_email = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/input[1]"));
		return office_email;
	}
	public static WebElement country(WebDriver driver) {
		WebElement country = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		return country;
	}
	public static WebElement state(WebDriver driver) {
		WebElement state = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		return state;
	} 
	public static WebElement city(WebDriver driver) {
		WebElement city = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		return city;
	} 
	public static WebElement pin_code(WebDriver driver) {
		WebElement pin_code = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[7]/div[3]/div[1]/div[1]/input[1]"));
		return pin_code;
	} 
	
	public static WebElement language(WebDriver driver) {
		WebElement language = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		return language;
	} 
	
	public static WebElement salary_account(WebDriver driver) {
		WebElement salary_account = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		return salary_account;
	}
	public static WebElement uan(WebDriver driver) {
		WebElement uan = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]"));
		return uan;
	}
	public static WebElement joining_date(WebDriver driver) {
		WebElement joining_date = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		return joining_date;
	}
	public static WebElement depertment(WebDriver driver) {
		WebElement depertment = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		return depertment;
	}
	public static WebElement accessroll(WebDriver driver) {
		WebElement accessroll = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		return accessroll;
	}
	public static WebElement password(WebDriver driver) {
		WebElement password = driver.findElement(By.xpath("//input[@id='input-2']"));
		return password;
	}
	public static WebElement branch(WebDriver driver) {
		WebElement branch = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		return branch;
	}

	public WebElement send_keys(WebDriver driver) {
		WebElement send_keys = driver.findElement(By.id("upload"));
		//send_keys.sendKeys("C:\\Users\\USER\\Pictures\\iPhone12ProMax(1)");
		return send_keys;
	}


	
	
	
}

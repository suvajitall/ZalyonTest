package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjects {
	
	
	
	public static WebElement login_email(WebDriver driver) {
		 WebElement email = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		return email;
	}
	
	public static WebElement login_password(WebDriver driver) {
		WebElement password = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]"));
		return password;
	}
	
	public static WebElement login_bttn(WebDriver driver) {
		WebElement password = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
		return password;
		
	}
	
	
}

package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuOptions {
	
	public static WebElement dashboard(WebDriver driver) {
		WebElement dashboard = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
		return dashboard;
	}
	
	public static WebElement employees(WebDriver driver) {
		WebElement employees = driver.findElement(By.xpath("//span[contains(text(),'Employees')]"));
		return employees;
	}
	public static WebElement customer(WebDriver driver) {
		WebElement customer = driver.findElement(By.xpath("//span[contains(text(),'Customers')]"));
		return customer;
	}
	public static WebElement sites(WebDriver driver) {
		WebElement sites = driver.findElement(By.xpath("//span[contains(text(),'Sites')]"));
		return sites;
	}
	public static WebElement attendance(WebDriver driver) {
		WebElement attendance = driver.findElement(By.xpath("//span[contains(text(),'Attendance')]"));
		return attendance;
	}
	public static WebElement leave(WebDriver driver) {
		WebElement leave = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]"));
		return leave;
	}
	public static WebElement leaveCalender(WebDriver driver) {
		WebElement leaveCalender = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/ul[1]/li[1]/a[1]"));
		return leaveCalender;
	}
	public static WebElement training(WebDriver driver) {
		WebElement training = driver.findElement(By.xpath("//span[contains(text(),'Training')]"));
		return training;
	}
	public static WebElement inventory(WebDriver driver) {
		WebElement inventory = driver.findElement(By.xpath("//span[contains(text(),'Inventory')]"));
		return inventory;
	}
	
	
	
	public static WebElement itemMaster(WebDriver driver) {
		WebElement itemMaster = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[1]/a[1]"));
		return itemMaster;
	}
	public static WebElement stock(WebDriver driver) {
		WebElement stock = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[2]/a[1]"));
		return stock;
	}
	public static WebElement itemIssue(WebDriver driver) {
		WebElement itemIssue = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[3]/a[1]"));
		return itemIssue;
	}
	public static WebElement itemReturn(WebDriver driver) {
		WebElement itemReturn = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[4]/a[1]"));
		return itemReturn;
	}
	public static WebElement inventoryReport(WebDriver driver) {
		WebElement inventoryReport = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[5]/a[1]"));
		return inventoryReport;
	}
	public static WebElement master(WebDriver driver) {
		WebElement master = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/a[1]"));
		return master;
	}
	public static WebElement branchTypes(WebDriver driver) {
		WebElement branchTypes = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/ul[1]/li[1]/a[1]"));
		return branchTypes;
	}
	public static WebElement branches(WebDriver driver) {
		WebElement branches = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/ul[1]/li[2]/a[1]"));
		return branches;
	}
	public static WebElement roles(WebDriver driver) {
		WebElement roles = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/ul[1]/li[3]/a[1]"));
		return roles;
	}
	public static WebElement departments(WebDriver driver) {
		WebElement departments = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/ul[1]/li[4]/a[1]"));
		return departments;
	}
	public static WebElement shiftSchedule(WebDriver driver) {
		WebElement shiftSchedule = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/ul[1]/li[5]/a[1]"));
		return shiftSchedule;
	}
	public static WebElement designation(WebDriver driver) {
		WebElement designation = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/ul[1]/li[6]/a[1]"));
		return designation;
	}
	public static WebElement settings(WebDriver driver) {
		WebElement settings = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[10]/a[1]"));
		return settings;
	}
	public static WebElement organization(WebDriver driver) {
		WebElement organization = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[10]/ul[1]/li[1]/a[1]"));
		return organization;
	}
	public static WebElement dynamicField(WebDriver driver) {
		WebElement dynamicField = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[10]/ul[1]/li[2]/a[1]"));
		return dynamicField;
	}
	
	public static WebElement dynamicTable(WebDriver driver) {
		WebElement dynamicTable = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[10]/ul[1]/li[3]/a[1]"));
		return dynamicTable;
	}
	
}

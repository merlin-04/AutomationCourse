package com.obsqura.automationcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	WebDriver driver;

	public void intializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91623\\eclipse-workspace\\AutomationCourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\91623\\eclipse-workspace\\AutomationCourse\\src\\main\\java\\Resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\91623\\eclipse-workspace\\AutomationCourse\\src\\main\\java\\Resources\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}

	public void driverCloseOrQuit() {
		// driver.close();
		driver.quit();
	}

	public static void main(String args[]) {
		Base base = new Base();
		base.intializeBrowser();

	}
}

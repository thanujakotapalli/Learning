package com.PerStoreAutomation.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.PerStoreAutomation.utilities.ReadProperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverHelper {
	static WebDriver driver;

	public WebDriver getDriver() {
		if (driver == null) {
			String browser = ReadProperties.getProperty("browser");
			if (browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browser.equals("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}

		}
		driver.manage().window().maximize();
		return driver;
	}
}
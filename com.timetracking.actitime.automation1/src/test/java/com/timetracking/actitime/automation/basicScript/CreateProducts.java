package com.timetracking.actitime.automation.basicScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.timetracking.actitime.automation1.genericUtility.FileUtility;
import com.timetracking.actitime.automation1.pomrepo.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProducts {
	@Test
	public void createProductsAndVerifyProductName() throws IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		FileUtility fUtils=new FileUtility();
		String url=fUtils.fetchDataFromPropertyFile("url");
		String username=fUtils.fetchDataFromPropertyFile("username");
		String password=fUtils.fetchDataFromPropertyFile("password");
		driver.get(url);
		LoginPage login=new LoginPage(driver);
		login.loginAction(username, password);
	}

}

package com.testcases;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DataDrivenTest extends BaseClass {

	@Test(dataProvider = "credentals")
	public void loginTest(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();

	}
}

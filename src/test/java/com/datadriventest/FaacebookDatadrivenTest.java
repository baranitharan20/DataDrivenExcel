package com.datadriventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Xls_Reader;

public class FaacebookDatadrivenTest {

	public static void main(String[] args) throws InterruptedException  {

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\Rhombus Labs\\eclipse-workspace\\selenium\\Bharani\\btharan\\DataDriven\\src\\test\\resources\\TestData\\data.xlsx");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rhombus Labs\\eclipse-workspace\\selenium\\Bharani\\btharan\\DataDriven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		String username = reader.getCellData("login", "Email", 2);
		System.out.println(username);

		String password = reader.getCellData("login", "Password", 2);
		System.out.println(password);

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();

	}
}
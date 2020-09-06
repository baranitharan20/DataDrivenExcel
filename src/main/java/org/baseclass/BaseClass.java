package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseClass {

	public static WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rhombus Labs\\eclipse-workspace\\selenium\\Bharani\\btharan\\DataDriven\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/ ");
	}

	@AfterMethod

	public void tearDown() {
		driver.quit();

	}
    @DataProvider(name="credentals")
	public Object[][] getData() {

		Object[][] data = new Object[4][2];

		data[0][0] = "barani";
		data[0][1] = "barani20";

		data[1][0] = "barani1";
		data[1][1] = "barani30";

		data[2][0] = "barani2";
		data[2][1] = "barani12";

		data[3][0] = "sbarani46";
		data[3][1] = "barani@20";

		return data;

	}

}

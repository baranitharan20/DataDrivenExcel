package com.datadriventest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.utility.Xls_Reader;

public class datadrivenTest {

	public static void main(String[] args) throws InterruptedException {

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\Rhombus Labs\\eclipse-workspace\\selenium\\Bharani\\btharan\\DataDriven\\src\\test\\resources\\TestData\\data.xlsx");

		String firstname = reader.getCellData("RegTestData", "FIRSTNAME", 2);
		System.out.println(firstname);

		String lastname = reader.getCellData("RegTestData", "LASTNAME", 2);
		System.out.println(lastname);

		String address = reader.getCellData("RegTestData", "Address", 2);
		System.out.println(address);

		String email = reader.getCellData("RegTestData", "Email Address", 2);
		System.out.println(email);

		String phone = reader.getCellData("RegTestData", "Phone", 2);
		System.out.println(phone);

		String gender = reader.getCellData("RegTestData", "Gender", 2);
		System.out.println(gender);

		String hobbies = reader.getCellData("RegTestData", "Hobbies", 2);
		System.out.println(hobbies);

		String language = reader.getCellData("RegTestData", "Languages", 2);
		System.out.println(language);

		String skill = reader.getCellData("RegTestData", "Skills", 2);
		System.out.println(skill);

		String country = reader.getCellData("RegTestData", "Country", 2);
		System.out.println(country);

		String Scountry = reader.getCellData("RegTestData", "SelectCountry", 2);
		System.out.println(Scountry);

		String DobYear = reader.getCellData("RegTestData", "Year", 2);
		System.out.println(DobYear);

		String Dobmonth = reader.getCellData("RegTestData", "Month", 2);
		System.out.println(Dobmonth);

		String Dobdate = reader.getCellData("RegTestData", "Date", 2);
		System.out.println(Dobdate);

		String Fpassword = reader.getCellData("RegTestData", "firstpassword", 2);
		System.out.println(Fpassword);

		String Spassword = reader.getCellData("RegTestData", "secondpassword", 2);
		System.out.println(Spassword);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rhombus Labs\\eclipse-workspace\\selenium\\Bharani\\btharan\\DataDriven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(address);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.name("radiooptions")).click();
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(phone);
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("msdd")).click();
	//	driver.findElement(By.xpath("//a[contains(text(),'English')]")).sendKeys(keysToSend);
		

		Select S = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		S.selectByVisibleText(skill);
		Thread.sleep(2000);
		Select S1 = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
		S1.selectByValue(country);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		WebElement countrybtn = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		countrybtn.sendKeys(Scountry);
		countrybtn.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		Select S2 = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		S2.selectByVisibleText(DobYear);
		Thread.sleep(2000);
		Select S3 = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		S3.selectByVisibleText(Dobmonth);
		Thread.sleep(2000);
		Select S4 = new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
		S4.selectByVisibleText(Dobdate);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(Fpassword);
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(Spassword);

		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();

	}

}

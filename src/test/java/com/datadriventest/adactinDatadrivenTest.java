package com.datadriventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Xls_Reader;

public class adactinDatadrivenTest {

	public static void main(String[] args) throws InterruptedException {

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\Rhombus Labs\\eclipse-workspace\\selenium\\Bharani\\btharan\\DataDriven\\src\\test\\resources\\TestData\\data.xlsx");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rhombus Labs\\eclipse-workspace\\selenium\\Bharani\\btharan\\DataDriven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");

		String UserName = reader.getCellData("adactin", "username", 2);
		System.out.println(UserName);

		String PassWord = reader.getCellData("adactin", "password", 2);
		System.out.println(PassWord);

		String Location = reader.getCellData("adactin", "location", 2);
		System.out.println(Location);

		String Hotels = reader.getCellData("adactin", "hotels", 2);
		System.out.println(Hotels);

		String RoomType = reader.getCellData("adactin", "roomtype", 2);
		System.out.println(RoomType);

		String NoofRooms = reader.getCellData("adactin", "numberofrroms", 2);
		System.out.println(NoofRooms);

		String CheckInDate = reader.getCellData("adactin", "checkIndate", 2);
		System.out.println(CheckInDate);

		String CheckOutDate = reader.getCellData("adactin", "checkoutdate", 2);
		System.out.println(CheckOutDate);

		String AdultsPerRoom = reader.getCellData("adactin", "Adultsperroom", 2);
		System.out.println(AdultsPerRoom);

		String ChildrenPerRoom = reader.getCellData("adactin", "childrenperroom", 2);
		System.out.println(ChildrenPerRoom);

		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.id("password")).sendKeys(PassWord);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("location")).sendKeys(Location);
		driver.findElement(By.id("hotels")).sendKeys(Hotels);
		driver.findElement(By.id("room_type")).sendKeys(RoomType);
		driver.findElement(By.id("room_nos")).sendKeys(NoofRooms);
		Thread.sleep(2000);
		driver.findElement(By.id("datepick_in")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("datepick_in")).sendKeys(CheckInDate);
		Thread.sleep(2000);
		driver.findElement(By.id("datepick_in")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("datepick_out")).sendKeys(CheckOutDate);
		driver.findElement(By.id("adult_room")).sendKeys(AdultsPerRoom);
		driver.findElement(By.id("child_room")).sendKeys(ChildrenPerRoom);
		driver.findElement(By.id("Submit")).click();

	}
}
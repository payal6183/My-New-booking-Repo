package Expedia.Booking.Booking.Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelBooking {
	
	protected WebDriver driver = null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");

		driver.findElement(By.id("tab-hotel-tab-hp")).click();

		driver.findElement(By.className("clear-btn-input gcw-storeable text gcw-destination gcw-required "))
				.sendKeys("London (LHR-Heathrow");

		driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys("110\05\2019");
		driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys("11/07/2019");
		driver.findElement(By.className(
				"trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized"))
				.click();
		// driver.findElement(By.xpath("//*[@id="\traveler-selector-hp-hotel\"]/div/ul/li/button"\)).click();
		driver.findElement(By.className("btn-primary btn-action  gcw-submit")).click();

	}

}

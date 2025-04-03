package jusPayPayment;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Bharath");
		driver.findElement(By.id("last-name")).sendKeys("reddy");
		driver.findElement(By.id("postal-code")).sendKeys("1234556");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		// title of the page
		System.out.println(driver.getTitle());
		
		
	}

}

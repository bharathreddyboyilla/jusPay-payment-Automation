package jusPayPayment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpayment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(Duration.ofSeconds(10));
		
		//login function
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email_login']")).sendKeys("bharathreddychu@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("#@passworD$97");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		//homepage
		// search required
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("lego f1");
		
		//add required product(s) to cart 
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']")).click();
		//Thread.sleep(2);
		
		// navigate to cart directly
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		
		// proceed for the checkout for the items added to cart at once
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		driver.findElement(By.xpath("//input[@data-csa-c-slot-id='checkout-secondary-continue-payselect']")).click();		
		driver.findElement(By.xpath("//span[@id='submitOrderButtonId']//input[@id='placeOrder']")).click();
		//driver.findElement(By.xpath("//span[@id='submitOrderButtonId']//input[@id='placeOrder']")).click();
		//driver.findElement(By.xpath("//a[@id='prime-interstitial-nothanks-button']")).click();
		driver.quit();
		
	}

}

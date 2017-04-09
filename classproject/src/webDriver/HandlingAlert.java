package webDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.jna.platform.FileUtils;


public class HandlingAlert {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Handling Alerts
		
		//WebDriver driver = new FirefoxDriver();
		//to download chromedriver
		//
		//we need to put it in proprties
		
		System.setProperty("chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		java.io.File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(src, new File("D:\\screenshots\\error.jpg"));
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Alert
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText(); // alert mesg text
		alert.accept(); //to click on OK
		//alert.dismiss(); // to click on cancel button
		
		System.out.println("messgae : "+msg);
		//driver.quit();
		driver.close();
		
		//implicit and Explicit Wait
		
		// explicit wait
		
		//fluent wait
//		Wait wait = new FluentWait(driver)
//				.withTimeout(30, TimeUnit.SECONDS)
//				.pollingEvery(4, TimeUnit.MILLISECONDS)
//				.ignoring(Exception.class);
		//StaleElementReferenceException
//		
//		WebElement a = wait.until(new Function<WebDriver, WebElement>() {
//			public WebElement apply(WebDriver driver ) {
//				return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
//			}
//
//		});
		
		//button
		//explicitwait till country field enabled
		//Country -->
		// explicit Wait
		//State -->
		//Explicit Wait
		//City-->
		
		//Actions
		
		
		
		
		

	}

}

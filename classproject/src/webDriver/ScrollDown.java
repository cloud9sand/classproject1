package webDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(100000, TimeUnit.MILLISECONDS);		
		//driver.navigate().to("https://www.flipkart.com/");
		driver.get("https://www.flipkart.com/mobiles/samsung~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Samsung");
		WebElement price = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[22]/section/div/div"));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView(true)", price);
		

	}

}

package webDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Attach {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//Comment to test push
		System.setProperty("webdriver.chrome", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1000000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		//driver.get("https://www.naukri.com/");
		
		driver.get("https://my.naukri.com/account/createaccount?othersrcp=16201&err=1");
		
		WebElement f = driver.findElement(By.xpath("//button[@value='fresher']"));
		Actions a = new Actions(driver);
		a.moveToElement(f);
		a.click(f).build().perform();
		////
		driver.findElement(By.id("fname")).sendKeys("selenium");
		driver.findElement(By.id("email")).sendKeys("selenium2@yahoo.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Selweb_5");
		driver.findElement(By.name("number")).sendKeys("9966980890");
		driver.findElement(By.name("city")).sendKeys("Hyderabad/Secunderabad");
		driver.findElement(By.xpath("//input[@type='file']")).click();
		
		
		
		Runtime.getRuntime().exec("E:\\Selenium feb batch\\WebDriver\\AutoIt\\NautoItSrc");
//		WebElement botton= driver.findElement(By.id("getjob"));
//		JavascriptExecutor je = (JavascriptExecutor)driver;
//		je.executeScript("argumetns[0].click();", botton);
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("getjob")));
//		driver.findElement(By.id("getjob")).click();
//		System.out.println("***********");
//		Thread.sleep(1000);
//		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input_8']")));
//		//driver.findElement(By.xpath("//input[@id='input_8']")).click();
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//input[@id='input_8']")));
//		Runtime.getRuntime().exec("E:\\Selenium feb batch\\WebDriver\\AutoIt\\autoItSrc");
	}

}

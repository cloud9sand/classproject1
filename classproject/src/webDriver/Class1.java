package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expectedErrorMsg = "You can't leave this empty.";
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://accounts.google.com/SignUp?hl=en-GB");
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("class");
		driver.findElement(By.xpath("//input[@id='GmailAddress']")).sendKeys("seleniumclass2x");
		driver.findElement(By.xpath("//div[@role='listbox' and @title='Birthday']")).click();
		driver.findElement(By.xpath("//div[@class='goog-menu goog-menu-vertical']//div[text()='January']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='submitbutton']")).click();
		Thread.sleep(1000);
		String errormsg = driver.findElement(By.xpath("//span[@role='alert']")).getText().trim();
		System.out.println(errormsg);
		if(expectedErrorMsg.equals(errormsg)){
			System.out.println("Expected and actual error msg are same");
		}else{
			System.out.println("Expected and actual error msg are not same");
		}
		
		//checkbox
		driver.findElement(By.xpath("xpath")).click();
		WebElement chbox = driver.findElement(By.xpath("xpath"));
		chbox.click();
		
		
		//select class to select option in a dropdown
		WebElement  dropdown = driver.findElement(By.xpath("adfggf"));
		Select s = new Select(dropdown);
		
		//set<WindowIds> = driver.getHandleWindow()
		
	}

}

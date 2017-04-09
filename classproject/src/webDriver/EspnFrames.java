package webDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EspnFrames {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(100000, TimeUnit.MILLISECONDS);	
		
		driver.get("http://www.espncricinfo.com/");
//		driver.switchTo().frame("google_ads_iframe_/6444/espn.cricinfo.com/homepage_2");
//		driver.findElement(By.id("img107703694377")).click();
		WebElement e;
		List f = driver.findElements(By.tagName("iFrame"));
		for(int i=0;i<f.size();i++){
			driver.switchTo().frame(i);
			try{
				e = driver.findElement(By.xpath("asasd"));
			}catch(Exception e1){
				e1.printStackTrace();
			}
		}
		
		driver.findElement(By.id("zccvv")).getAttribute("title");
		

	}

}

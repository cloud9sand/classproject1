package webDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Set s = driver.getWindowHandles();
		System.out.println(s);
		Iterator i = s.iterator();
		while(i.hasNext()){
			String wid = (String) i.next();
			driver.switchTo().window(wid);
			String title = driver.getTitle();
			if(title.contains("J P Morgan")){
				driver.findElement(By.xpath("//img[@alt='J P Morgan']")).click();
			}
		}
		
		
		

	}

}

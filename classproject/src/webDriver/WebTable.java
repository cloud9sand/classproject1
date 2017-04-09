package webDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(100000, TimeUnit.MILLISECONDS);
		driver.get("http://www.espncricinfo.com/india-v-australia-2016-17/engine/match/1062575.html");
		
		driver.findElement(By.linkText("Full scorecard")).click();
		
		List<WebElement> batsmanName = driver.findElements(By.xpath("//table[@class='batting-table innings']//th[text()='Australia 1st innings   ']/ancestor::tr/ancestor::tbody/tr/td[@class='batsman-name']"));
		List<WebElement> score = driver.findElements(By.xpath("//table[@class='batting-table innings']//th[text()='Australia 1st innings   ']/ancestor::tr/ancestor::tbody/tr/td[@class='bold']"));
		
		for(int i=0;i<batsmanName.size();i++){
			String bt =batsmanName.get(i).getText();
			String sc = score.get(i).getText();
			
			System.out.println(bt+"--------"+sc);
		}
		
	}

}

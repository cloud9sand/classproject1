package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.calculator.net/age-calculator.html");
		driver.findElement(By.id("Email")).sendKeys("asjhgfjh"); // One WebElement
		//driver.findElement(By.tagName("select")) -> First Webelement 
		//driver.findElements(By.tagName("select")); //--> List<WebElement>
		WebElement month = driver.findElement(By.cssSelector("select[id='today_Month_ID']"));
				month.sendKeys("Mar");
		driver.findElement(By.xpath(""));
		//Locators
		//id ==>directly
		//class Name => directly
		//name
				
				//Relative xpath
		//xpath =>  //select[@id='ageat_Month_ID']
				    //select[@id='today_Day_ID']
				//input[@value='Calculate']
	//--			/html/body/div[3]/div/table/tbody/tr[3]/td[2]/input
				//absolute XPath
		
		//Methods/functions in XPath
//		text()
//		contains(String)
//		endsWith()
//		
//		Ancestor
//		following-sibling
		
		
		
		
		
		
		//cssselector
		

	}//Assertions -> to compare actual value with expectedvalue ->in your testdata
	//Accessers -->to fetch value from the application - > Actual value
	

}

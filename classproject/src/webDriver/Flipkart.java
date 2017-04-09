package webDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	private static By priveMaxRange = By.xpath("locator for Max price");
	private static By priveminRange = By.xpath("locator for Max price");
	private static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(100000, TimeUnit.MILLISECONDS);		
		//driver.navigate().to("https://www.flipkart.com/");
		driver.get("https://www.flipkart.com/mobiles/samsung~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Samsung");
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
//		
		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(electronics).build().perform();
		
//		WebElement samsung = driver.findElement(By.xpath("//a/span[text()='Samsung']"));
//		actions.click(samsung).build().perform();
//		Thread.sleep(1000);
		List<WebElement> price = driver.findElements(By.xpath("//div//a/div[contains(@class,'_1-2Iqu')]/div[@class='col col-5-12 _2o7WAb']//div[@class='_1vC4OE _2rQ-NK']"));
		String aprice;
		char[] p;
		String actual = "";
		for(WebElement e : price){
			System.out.println("price is :"+e.getText());
			aprice=e.getText();
			p=aprice.toCharArray();
			for(int i=1;i<p.length;i++){
				actual=actual+p[i];
			}
			System.out.println(actual);
			p = actual.toCharArray();
			actual="";
			for(int i=0; i<p.length;i++){
				if(p[i]!=','){
					actual= actual+p[i];
				}
			}
			System.out.println("actual price is"+actual);
			
			Integer a =Integer.valueOf(actual);
			if((a<35000)&&(a>1)){
				System.out.println("Passed");
			}else System.out.println("Failed");
			
			actual="";
			
		}

		
		
		
			
	}
	public void setMobilePriceRange(String max, String min){
		driver.findElement(priveMaxRange).sendKeys(max);;
	}
}

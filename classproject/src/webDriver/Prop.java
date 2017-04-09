package webDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.internal.PropertiesFile;

public class Prop {
	static WebDriver driver;
	
	public static String getProp(String key) {
		// TODO Auto-generated method stub
		Properties p = null;
		try{
				File a = new File("conf.properties");
				p = new Properties();
				FileInputStream f = new FileInputStream(a);
				p.load(f);
		}catch(Exception e){
			
		}
		return p.getProperty(key);
	}

	public static void main(String[] args) throws IOException {
		System.out.println(getProp("browser"));
		if(getProp("browser").equals("Firefox"))
			driver = new FirefoxDriver();
		else
			driver = new ChromeDriver();
		
	}

}

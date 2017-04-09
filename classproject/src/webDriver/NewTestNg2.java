package webDriver;

import java.lang.reflect.Method;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTestNg2 {
	private static String currentTestName;
	
	@DataProvider(name = "testSource")
	public Iterator<Object[]> getTestDataSet(Method method) {
		setCurrentTestName(method);
		DataFactory dataFactory = new DataFactory();
		return dataFactory.getTestDataSet(method);
	}
  private String setCurrentTestName(Method method) {
	currentTestName=method.getName();
	System.out.println("************"+currentTestName);
	return currentTestName;
		// TODO Auto-generated method stub
	  
		
	}
	
//	@DataProvider(name = "testSource")
//	public Object[][] test_method1(){
//		Object[][] data = new Object[5][2];
//		
//		//1st row
//		data[0][0]="user1";
//		data[0][1]="password1";
//		
//		//2nd row
//		data[1][0]="user2";
//		data[1][1]="password2";
//		
//		//3rd row
//		data[2][0]="user3";
//		data[2][1]="password3";
//		
//		//4th row
//		data[3][0]="user4";
//		data[3][1]="password4";
//		
//		//5th row
//		data[4][0]="user5";
//		data[4][1]="password5";
//		
//		
//		
//		return data;
//		
//	}
@Test(dataProvider = "testSource")
  public void test_method1(String username, String password, String abc) {
	  System.out.println("f1");
	  System.out.println(username);
	  System.out.println(password);
	  System.out.println(abc);
  }
  
@Test(dataProvider = "testSource")
public void test_method2(String username, String password) {
	  System.out.println("f2");
	  System.out.println(username);
	  System.out.println(password);
  }
  
  @Test
  public void f3(){
	  System.out.println("f3");
  }
  @Test
  public void f4(){
	  System.out.println("f4");
  }
}

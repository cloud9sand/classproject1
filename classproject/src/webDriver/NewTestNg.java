package webDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestNg {
  @Test(priority=3, dependsOnMethods={"f1"},timeOut=100)
  public void f4() {
	  System.out.println("test");
	  //click on login
	  
	  //Assert.assertTrue(false, "not as given");
	  //compose button functionality
	  
	  
  }
  
  @Test(priority=1)
  public void f1(){
	  System.out.println("f1");
	  //login
  }
  
  @Test(priority=2)
  public void f3(){
	  System.out.println("f3");
  }
  
  @Test(priority=4)
  public void f2(){
	  System.out.println("f2");
  }
  
//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("Before Method");
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  System.out.println("after method");
//  }
//
//  @BeforeClass
//  public void beforeClass() {
//	  System.out.println("Before Class");
//  }
//
//  @AfterClass
//  public void afterClass() {
//	  System.out.println("After class");
//  }
//
//  @BeforeTest
//  public void beforeTest() {
//	  System.out.println("Before Test");
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  System.out.println("After Tesst");
//  }
//
//  @BeforeSuite
//  public void beforeSuite() {
//	  System.out.println("Before Suite");
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//	  System.out.println("After Suite");
//  }

}

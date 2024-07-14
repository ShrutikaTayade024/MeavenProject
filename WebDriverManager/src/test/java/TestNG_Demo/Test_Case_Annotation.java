package TestNG_Demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Case_Annotation {
@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");

	}
@BeforeTest
public void beforeTest() {
	System.out.println("Before Test");
}

@BeforeMethod
public void beforemthd()
{
	System.out.println("Before method");

}
	
@Test
	public void test1() {
		System.out.println("test Case 1");
	}
@Test
public void test2() {
	System.out.println("test Case 2");
}

@AfterMethod
public void afterMethod() {
	System.out.println("After Method");

}


}

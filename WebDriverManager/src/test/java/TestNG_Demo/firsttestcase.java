package TestNG_Demo;

import org.testng.annotations.Test;

//open App
//Login App
//Exit
public class firsttestcase {
@Test
	void openApp() {
		System.out.println("Open Application");
	}
@Test
	void loginApp() {
		System.out.println("Login Application");
	}
@Test
	void ExitApp() {
		System.out.println("Exit Application");
	}
}

package annotationTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass3 {
	
	@BeforeMethod
	public void test1c() {
	System.out.println("This is test1c in Class 3. BeforeMethod");
	}

	@Test
	public void test2c() {
	System.out.println("This is test2c in Class 3.");
	}

	@Test
	public void test3c() {
	System.out.println("This is test3c in Class 3.");
	}

	@Test
	public void test4c() {
	System.out.println("This is test4c in Class 3.");
	}

	@Test
	public void test5c() {
	System.out.println("This is test5c in Class 3.");
	}

	@Test
	public void test6c() {
	System.out.println("This is test6c in Class 3.");
	}

	@Test
	public void test7c() {
	System.out.println("This is test7c in Class 3.");
	}

	@AfterMethod
	public void test8c() {
	System.out.println("This is test8c in Class 3. AfterMetod");
	}

	@Test
	public void test9c() {
	System.out.println("This is test9c in Class 3.");
	}

	@Test
	public void test10c() {
	System.out.println("This is test10c in Class 3.");
	}

	@Test
	public void test11c() {
	System.out.println("This is test11c in Class 3.");
	}

	@Test
	public void test12c() {
	System.out.println("This is test12c in Class 3.");
	}

}

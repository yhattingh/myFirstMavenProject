package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@Test
	public void test1b() {
	System.out.println("This is test1b in Class 2.");
	}

	@Test
	public void test2b() {
	System.out.println("This is test2b in Class 2.");
	}

	@Test
	public void test3b() {
	System.out.println("This is test3b in Class 2.");
	}

	@Test
	public void test4b() {
	System.out.println("This is test4b in Class 2.");
	}

	@BeforeTest
	public void test5b() {
	System.out.println("This is test5b in Class 2. BeforeTest");
	}

	@Test
	public void test6b() {
	System.out.println("This is test6b in Class 2.");
	}

	@BeforeSuite
	public void test7b() {
	System.out.println("This is test7b in Class 2. BeforeSuite");
	}

	@Test
	public void test8b() {
	System.out.println("This is test8b in Class 2.");
	}

	@Test
	public void test9b() {
	System.out.println("This is test9b in Class 2.");
	}

	@Test
	public void test10b() {
	System.out.println("This is test10b in Class 2.");
	}

	@Test
	public void test11b() {
	System.out.println("This is test11b in Class 2.");
	}

	@Test
	public void test12b() {
	System.out.println("This is test12b in Class 2.");
	}

}

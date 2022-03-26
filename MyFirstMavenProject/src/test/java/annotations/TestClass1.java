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

public class TestClass1 {
	
	@Test
	public void test1a() {
	System.out.println("This is test1a in Class 1.");
	}

	@Test
	public void test2a() {
	System.out.println("This is test2a in Class 1.");
	}

	@Test
	public void test3a() {
	System.out.println("This is test3a in Class 1.");
	}

	@Test
	public void test4a() {
	System.out.println("This is test4a in Class 1.");
	}

	@Test
	public void test5a() {
	System.out.println("This is test5a in Class 1.");
	}

	@Test
	public void test6a() {
	System.out.println("This is test6a in Class 1.");
	}

	@BeforeClass
	public void test7a() {
	System.out.println("This is test7a in Class 1. BeforeClass");
	}

	@Test
	public void test8a() {
	System.out.println("This is test8a in Class 1.");
	}

	@Test
	public void test9a() {
	System.out.println("This is test9a in Class 1.");
	}

	@Test
	public void test10a() {
	System.out.println("This is test10a in Class 1.");
	}

	@Test
	public void test11a() {
	System.out.println("This is test11a in Class 1.");
	}

	@Test
	public void test12a() {
	System.out.println("This is test12a in Class 1.");
	}

}

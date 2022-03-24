package first;

import org.testng.annotations.Test;

public class FirstTestNgTest {
	
	@Test// THIS DOES NOT NEED A METHOD
	public void first1() {
		System.out.println("First TestNG project");
	}

	@Test
	public void second2() {
		System.out.println("Second TestNG project");
	}
}

package practicalListeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PracTestListeners {
	

	@Test
	public void testPasses1() {
		System.out.println("This test passed - 1");
	}
	
	@Test
	public void testPasses2() {
		System.out.println("This test passed - 2");
	}
	
	@Test
	public void testFails1() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void testFails2() {
		Assert.assertTrue(false);
	}
		
	@Test
	public void testFails3() {
	Assert.assertFalse(true);
	}
	
	@Test(groups = {"Skipped Tests"})
	public void skippedTest1() {
		throw new SkipException("This test was skipped - 1");
	}
	
	@Test(groups = {"Skipped Tests"})
	public void skippedTest2() {
		throw new SkipException("This test was  skipped - 2");
	}

}

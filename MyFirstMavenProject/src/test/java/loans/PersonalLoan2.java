package loans;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PersonalLoan2 {

	@Test
	public void personalLoan3() {
		System.out.println("PersonalLoan2.3");
	}

	@Test
	public void personalLoan4() {
		System.out.println("PersonalLoan2.4");
	}
	
	@BeforeSuite
	public void globalVarsSet1() {
		System.out.println("PersonalLoan2 - Set the global variables for set1 - PersonalLoan2 - BeforeSuite");
	}
}

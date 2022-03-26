package loans;

import org.testng.annotations.Test;

public class PersonalLoan1 {

	@Test
	public void personalLoan1() {
		System.out.println("PersonalLoan1.1");
	}

	@Test (groups = {"Smoke"})
	public void personalLoan2() {
		System.out.println("PersonalLoan1.2");
	}
}

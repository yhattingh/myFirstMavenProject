package loans;

import org.testng.annotations.Test;

public class VehicleLoan1 {

	@Test
	public void vehicleLoan1() {
		System.out.println("VehicleLoan1.1");
	}

	@Test(groups = {"Smoke"})
	public void vehicleLoan2() {
		System.out.println("VehicleLoan1.2");
	}
}

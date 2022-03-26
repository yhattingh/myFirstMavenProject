package loans;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class VehicleLoan2 {

	@Test
	public void vehicleLoan3() {
		System.out.println("VehicleLoan2.3");
	}

	@Test(groups = {"Smoke"})
	public void vehicleLoan4() {
		System.out.println("VehicleLoan2.4");
	}
	
	@Test
	public void vehicleLoan5() {
		System.out.println("VehicleLoan2.5");
	}
		
	@BeforeSuite
	public void globalVarsSet2() {
		System.out.println("VehicleLoan2 - Set the global variables for set2 - VehicleLoan2 - BeforeSuite");
	}
	
	@AfterSuite
	public void resetAllVarsSet() {
		System.out.println("VehicleLoan2 - Reset all global variables - VehicleLoan2 - AfterSuite");
	}
}

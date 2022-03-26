package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeLoan1FraudTest {
	
	//Iterations:
	//1st user name and pass - good credit history
	//2nd user name and pass - no credit history
	//3rd user name and pass - fraudulent  credit history
	
	//define a multi dimensional object array with 3 rows and 2 columns (firstname and lastname)
	//3 rows for the number of test cases
	//2 columns for the number of values passed
	
	@Test(dataProvider="getMyData")
	public void homeLoan1FraudTest(String firstname, String lastname) {
		System.out.println("New!  Home Loan 1 Fraud Test");
		System.out.println(firstname + " " + lastname);
	}
	
	@DataProvider
	public Object[][] getMyData() {
		
		Object[][] data = new Object[3][2]; //setting up an empty array before we start looping through the array
		
		//1st set
		data[0][0]="row0Column0"; // index starts at [0][0] cell name
		data[0][1]="row0Column1";
		
		//2nd set
		data[1][0]="row1Column0";
		data[1][1]="row1Column1";
		
		//3rd set
		data[2][0]="row2Column0";
		data[2][1]="row2Column1";
		
		return data;
	}

}

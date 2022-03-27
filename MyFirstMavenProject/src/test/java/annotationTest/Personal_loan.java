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

public class Personal_loan  
{  
 @Test(groups= {"SmokeTest"})  
 public void WebLoginPersonalLoan()  
 {  
     System.out.println("Web Login Personal Loan");  
 }  
 @Test(groups= {"YH Test"})
 public void MobileLoginPersonalLoan()  
 {  
     System.out.println("Mobile Login Personal Loan - YH Test");  
 }  
 @Test  
 public void APILoginPersonalLoan()  
 {  
     System.out.println("API Login Personal Loan");  
 }  
}  

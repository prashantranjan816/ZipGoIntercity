



import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.Excel;
import utils.ExcelContext;

public class WebTests extends Assert {

  /*  @Test(dataProvider = "testData", groups = {TestGroups.SMOKE})
    public void loginTests(String username, String password, String isLoggedIn) {
        ZipGoWorkflows zgw = new ZipGoWorkFlowImplementations();
        SignInPage signInPage = zgw.openSignInPage();
        LoginPage loginPage = zgw.navigateToLoginPage(signInPage);
        DashboardPage dashboardPage = null;
        boolean isLoginSuccessful = Boolean.valueOf(isLoggedIn);
        if (isLoginSuccessful) {
            dashboardPage = (DashboardPage) zgw.loginToAsAdministrator(loginPage, username, password, DashboardPage.class);
        } else {
            signInPage = (SignInPage) zgw.loginToAsAdministrator(loginPage, username, password, SignInPage.class);
            assertTrue(signInPage.getErrorMessage().contains("Username or password did not match"));
        }
    }
*/
	 @Test(dataProvider = "testData")
	    public void loginTests(String username, String password, String isLoggedIn) {

//		 below line will check that we want to run proceed or not in boolean response from excel.
		 boolean isLoginSuccessful = Boolean.valueOf(isLoggedIn);
		 if (isLoginSuccessful)  
		 
		 {
			 
			 System.out.println("LoginSuccessful ");
			 
		 }
		 else {
			 System.out.println("Loginfail");
		 }
		 
	 
	 }
	
	
    @DataProvider(name = "testData", parallel = false)
    public static Object[][] getTestData() throws IOException, URISyntaxException {
        ExcelContext context = new ExcelContext();
        context.setExcelFile("testData/Web1.xlsx");
        context.setSheetName("logout");
//        context.setSheetName("login");
        Excel excelObj = new Excel(context);
        String[][] testData = excelObj.getData("username", "password", "isLoggedIn");
        return testData;
    }
}

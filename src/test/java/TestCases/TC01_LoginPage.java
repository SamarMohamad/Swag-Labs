package TestCases;


import Pages.P01_LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC01_LoginPage extends TestBase {

    // define test data
    String USER_TEXT = "standard_user";
    String PASSWORD_TEXT = "secret_sauce";

    // check login positive scenarios
    @Test(priority = 1, description = "Login with Valid Username and Password" , enabled = true)
    public void loginWithValidData_P() {
        new P01_LoginPage(driver).inputEmail(USER_TEXT).inputPassword(PASSWORD_TEXT).clickLoginButton();
   Assert.assertTrue(new P01_LoginPage(driver).VerifyLogin());
   Assert.assertFalse(!new P01_LoginPage(driver).VerifyLogin());
   Assert.assertEquals(new P01_LoginPage(driver).VerifyLogin2(),"Products");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(new P01_LoginPage(driver).VerifyLogin2(),"Products");
        softAssert.assertAll();
    } }
//
//    @Test(priority = 2, description = "Login with Invalid Username ")
//    public void loginWithInvalidUserName_N() {
//        new P01_LoginPage(driver).inputEmail(USER_TEXT).inputPassword(PASSWORD_TEXT).clickLoginButton();
//    }
//
//    @Test(priority = 3, description = "Login with Invalid Password")
//    public void loginWithInvalidPassword_N() {
//        new P01_LoginPage(driver).inputEmail(USER_TEXT).inputPassword(PASSWORD_TEXT).clickLoginButton();
//    }
//
//    @Test(priority = 4, description = "Login with Invalid email and Password")
//    public void loginWithValidData_N() {
//        new P01_LoginPage(driver).inputEmail(USER_TEXT).inputPassword(PASSWORD_TEXT).clickLoginButton();
//}
//}


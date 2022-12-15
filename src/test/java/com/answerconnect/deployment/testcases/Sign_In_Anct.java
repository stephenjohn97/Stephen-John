package test.java.com.answerconnect.deployment.testcases;

import org.testng.annotations.Test;

import main.java.com.answerconnect.app.base.AutomationTest;
import main.java.com.answerconnect.deployment.pages.Sign_In_Page;

public class Sign_In_Anct extends AutomationTest {

	@Test(description = "Sign_In_Anct")
	public static void sign_In_Page() throws Exception {
		try {
			test = reports.startTest("LoginPage").assignAuthor("Stephen").assignCategory("Smoke");
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("extent report");
		Sign_In_Page signinpage = new Sign_In_Page(test);
		signinpage.signIn();
	}

}

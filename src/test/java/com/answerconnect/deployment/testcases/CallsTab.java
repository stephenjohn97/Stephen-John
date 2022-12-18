package test.java.com.answerconnect.deployment.testcases;

import org.testng.annotations.Test;

import main.java.com.answerconnect.app.base.AutomationTest;
import main.java.com.answerconnect.deployment.pages.CallsPage;

public class CallsTab extends AutomationTest {

	@Test(description = "CallsTab")
	public void calls_Page() throws Exception {

		test = reports.startTest("CallsTab").assignAuthor("Stephen").assignCategory("Smoke");
		System.out.println("extent report");
		CallsPage callsPage = new CallsPage();
		callsPage.calls();
		System.out.println("CallsTab completed");


	}

}

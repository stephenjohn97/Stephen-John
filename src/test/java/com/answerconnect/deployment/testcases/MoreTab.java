package test.java.com.answerconnect.deployment.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import main.java.com.answerconnect.app.base.AutomationTest;
import main.java.com.answerconnect.deployment.pages.MorePage;

public class MoreTab extends AutomationTest {

	@Test(description = "MoreTab")
	public void more_Page() throws Exception {

		tests = reports.startTest("MoreTab").assignAuthor("Stephen").assignCategory("Smoke");
		System.out.println("extent report");
		MorePage morePage = new MorePage(tests);
		morePage.more();
		System.out.println("MoreTab completed");

	}

}

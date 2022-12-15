package test.java.com.answerconnect.deployment.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import main.java.com.answerconnect.app.base.AutomationTest;
import main.java.com.answerconnect.deployment.pages.StatusBarPage;

public class StatusBar extends AutomationTest {
	@Test(description = "StatusBarPage")
	public void statusBar() throws Exception {

		tests = reports.startTest("CallsTab").assignAuthor("Stephen").assignCategory("Smoke");
		System.out.println("extent report");
		StatusBarPage statusbarpage = new StatusBarPage(tests);
		statusbarpage.statusBar();
		System.out.println("statusbar completed");
	}
}

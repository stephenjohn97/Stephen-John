package test.java.com.answerconnect.deployment.testcases;

import org.testng.annotations.Test;

import main.java.com.answerconnect.app.base.AutomationTest;
import main.java.com.answerconnect.deployment.pages.InboxPage;

public class InboxTab extends AutomationTest {

	@Test(description = "InboxTab")
	public void inbox_Page() throws Exception {

		test = reports.startTest("Inbox_Tab").assignAuthor("Stephen").assignCategory("Smoke");
		System.out.println("extent report");
		InboxPage inboxPage = new InboxPage(test);
		inboxPage.inbox();
		System.out.println("InboxTab completed");
		
	}
}

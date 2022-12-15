package main.java.com.answerconnect.deployment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Sign_In_Page extends BasePages {

	public Sign_In_Page(ExtentTest test) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(id = "com.answerconnect.mobile:id/edt_email")
	private WebElement emailId;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/edt_password")
	private WebElement password;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/btn_login")
	private WebElement login;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/skip_tv")
	private WebElement skipTourPage;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/toolbar_heading")
	public WebElement header;

	public void signIn() throws InterruptedException {

		// tapOn("Email Id field", emailId);
		sendKeys(emailId, prop.getProperty("emailId"), "email id field");
		// tapOn("Password field", password);
		sendKeys(password, prop.getProperty("password"), "password field");
		tapOn("Login button", login);
		wait(skipTourPage);
		tapOn("Skip", skipTourPage);
		wait(header);
		assertEquals(header, "Inbox", "User Logged into the app successfully");

	}
}

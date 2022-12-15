package main.java.com.answerconnect.deployment.pages;

import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MorePage extends BasePages {

	public MorePage(ExtentTest tests) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "More")
	private WebElement moreTab;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileTeleportTV")
	private WebElement myTeleportOption;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/copyLinkTeleport")
	private WebElement copyTeleportLink;
	@AndroidFindBy(xpath = "//android.widget.Toast")
	private WebElement toastMessage;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileInviteTV")
	private WebElement invitePeopleOption;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/EmailET")
	private WebElement emailIP;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/NameET")
	private WebElement nameIP;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/Admin_button")
	private WebElement adminButton;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/save_tv")
	private WebElement inviteButton;
	@AndroidFindBy(xpath = "//*[@text='Invitations sent successfully.']")
	private WebElement sentSuccessfullyView;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/profileDirectoryTV")
	private WebElement myDirectory;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/team_info_iv")
	private WebElement contact_i_Icon;
	@AndroidFindBy(xpath = "//*[@resource-id='com.answerconnect.mobile:id/customer_name']")
	private WebElement customerName;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileChatIv")
	private WebElement chatCTA;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/toolbar_heading_tv")
	private WebElement act;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/AccountVerifyIcon")
	private WebElement contactVerifyToggle;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileMoreIv")
	private WebElement contactMoreIcon;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/EditProfileTv")
	private WebElement editProfile;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/EditProfileNameET")
	private WebElement contactName;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/EditProfileEmailEditTV")
	private WebElement contactEmail;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileNumberEditTV")
	private WebElement contactPhNum;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/addPhoneLayoutIV")
	private WebElement contactAddPhNum;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/country_iv")
	private WebElement countryCode;
	@AndroidFindBy(xpath = "//*[@text='United States']")
	private WebElement UnitedStates;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/save_contact_tv")
	private WebElement saveEditContact;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfilePhoneNoTV")
	private WebElement phoneNumberOverview;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/PhoneNoRow")
	private WebElement email_phBottomSheet;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileEmailTv")
	private WebElement emailOverview;
	@AndroidFindBy(accessibility = "Contacts")
	private WebElement contactsOption;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/create_new_contact")
	private WebElement createNewContact_MyDir;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/userNameET")
	private WebElement newContactName;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/emailEditext")
	private WebElement newContactEmail;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/phoneEditText")
	private WebElement newContactPhNum;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/countryCodeIV")
	private WebElement newContactCountryCode;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/addNewContactTV")
	private WebElement saveNewContact;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/addPhoneIV")
	private WebElement newContactaddNewPh;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/addEmailIV")
	private WebElement newContactaddNewEmail;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/profileNotificationTV")
	private WebElement notifications;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/notification_all")
	private WebElement notificationsAll;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/notification_focus_mode")
	private WebElement notificationsFocusMode;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/notification_none")
	private WebElement notificationsNone;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/savePreferenceMode")
	private WebElement notificationSave;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/profileBillingTV")
	private WebElement billings;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/feedback")
	private WebElement feedback;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/feedback_et")
	private WebElement addFeedback;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/send_feedback_bt")
	private WebElement sendFeedback;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/brand_name")
	private WebElement brandName;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/chat_support_option")
	private WebElement chatSupportMore;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/toolbar_heading_tv")
	private WebElement chatSupportheader;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/toolbar_status_tv")
	private WebElement chatSupportStatus;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/message_edt")
	private WebElement chatSupportTextField;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/send_bt")
	private WebElement chatSupportSend;
	@AndroidFindBy(xpath = "//*[@text='Logout']")
	private WebElement logout;
	@AndroidFindBy(id = "android:id/alertTitle")
	private WebElement logoutTitle;
	@AndroidFindBy(id = "android:id/button2")
	private WebElement logoutNo;
	@AndroidFindBy(id = "android:id/button1")
	private WebElement logoutYes;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/edt_email")
	private WebElement loginEmail;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/edt_password")
	private WebElement loginPassword;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileNameTV")
	private WebElement profileNameView;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileEditIV")
	private WebElement profileEditButton;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/profilePositionTV")
	private WebElement designationView;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/profileEmailTV")
	private WebElement emailView;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/profilePhoneNoTV")
	private WebElement phoneView;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfilePhoneNoTV")
	private WebElement phoneInside;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileEmailTv")
	private WebElement emailInside;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileMoreIv")
	private WebElement moreOptionInside;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/EditProfileNameParent")
	private WebElement editProfileName;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/EditProfilePositionParent")
	private WebElement editPosition;

	public void more() throws InterruptedException {

		// My Profile
//		tapOn("More tab", moreTab);
//		tapOn("Edit icon", profileEditButton);
//		
//		
//		
//		

		tapOn("More tab", moreTab);
		// Teleport
		try {
			tapOn("Teleport", myTeleportOption);
			tapOn("Copy teleport", copyTeleportLink);
			assertEquals(toastMessage, "Copied to clipboard", "My Teleport is successful");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "My Teleport is failed");
		}
		goBack();

		// Invite people
		try {
			tapOn("Invite people", invitePeopleOption);
			sendKeys(emailIP, getRandomEmail(), "Email ID");
			sendKeys(nameIP, "Steven", "Name");
			tapOn("Admin option", adminButton);
			tapOn("Invite button", inviteButton);
			assertEqualsString(sentSuccessfullyView.getText(), "Invitations sent successfully.", "Invitation success");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Invitation failed");
		}
		goBack();

		// My Directory
		tapOn("My Directory", myDirectory);
		try {
			String exp = customerName.getText().trim();
			tapOn("Customer Name", contact_i_Icon);
			tapOn("Chat CTA button", chatCTA);
			assertEqualsString(exp, act.getText().trim(), "Customer name validation successful");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Customer name validation unsuccessful");
		}
		goBack();

		tapOn("verify contact", contactVerifyToggle);
		try {
			if (phoneNumberOverview.isDisplayed()) {
				tapOn("Phone number", phoneNumberOverview);
				longPress("Phone number", email_phBottomSheet);
				test.log(LogStatus.PASS, "Phone number is copied to clipboard");
			} else {
				test.log(LogStatus.FAIL, "Phone number copy failed");
			}
		} catch (Exception e) {
			test.log(LogStatus.INFO, "Phone number is not available");
		}
		goBack();

		try {
			if (emailOverview.isDisplayed()) {
				tapOn("Email", emailOverview);
				longPress("Email ID", email_phBottomSheet);
				test.log(LogStatus.PASS, "Email is copied to clipboard");
			} else {
				test.log(LogStatus.FAIL, "Email ID copy failed");
			}
		} catch (Exception e) {
			test.log(LogStatus.INFO, "Email ID is not available");
		}
		goBack();
		goBack();

		// My Directory (Contacts)
		tapOn("Contacts", contactsOption);
		tapOn("Customer", customerName);
		try {
			tapOn("More option", contactMoreIcon);
			tapOn("Edit profile", editProfile);
			tapOn("Contact name", contactName);
			contactName.clear();
			sendKeys(contactName, getRandomName(), "Contact name");
			hideKeyboard();
			tapOn("Edit email", contactEmail);
			contactEmail.clear();
			sendKeys(contactEmail, getRandomEmail(), "Contact Email ID");
			hideKeyboard();
			tapOn("Edit Phone number", contactPhNum);
			contactPhNum.clear();
			sendKeys(contactPhNum, getRandomPhNum(), "Contact Phone number");
			hideKeyboard();
			tapOn("Change country code", countryCode);
			tapOn("United States", UnitedStates);
			tapOn("Add more Ph", contactAddPhNum);
			tapOn("Save contact", saveEditContact);
			assertEquals(toastMessage, "Updated successfully", "Contact edited successfully");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Contact edit failed");
		}

		try {
			if (phoneNumberOverview.isDisplayed()) {
				tapOn("Phone number", phoneNumberOverview);
				longPress("Phone number", email_phBottomSheet);
				test.log(LogStatus.PASS, "Phone number is copied to clipboard");
			} else {
				test.log(LogStatus.FAIL, "Phone number copy failed");
			}
		} catch (Exception e) {
			test.log(LogStatus.INFO, "Phone number is not available");
		}
		goBack();

		try {
			if (emailOverview.isDisplayed()) {
				tapOn("Email", emailOverview);
				longPress("Email ID", email_phBottomSheet);
				test.log(LogStatus.PASS, "Email is copied to clipboard");
			} else {
				test.log(LogStatus.FAIL, "Email ID copy failed");
			}
		} catch (Exception e) {
			test.log(LogStatus.INFO, "Email ID is not available");
		}
		goBack();
		goBack();

		tapOn("New Contact", createNewContact_MyDir);
		try {
			tapOn("Name field", newContactName);
			sendKeys(newContactName, getRandomName(), "Full name");
			tapOn("Email field", newContactEmail);
			sendKeys(newContactEmail, getRandomEmail(), "Email ID 1");
			tapOn("Email field 2", newContactaddNewEmail);
			hideKeyboard();
			tapOn("Phone number field", newContactPhNum);
			sendKeys(newContactPhNum, getRandomPhNum(), "Phone number");
			hideKeyboard();
			tapOn("Country code", newContactCountryCode);
			tapOn("United States", UnitedStates);
			tapOn("Phone number field 2", newContactaddNewPh);
			tapOn("Save", saveNewContact);
			assertEquals(toastMessage, "contact added successfully", "Contact created successfully");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Contact create failed");
		}

		goBack();
		scrollInto("Notifications");
		// Notifications
		try {
			if (notificationsAll.isSelected()) {
				tapOn("Focus mode", notificationsFocusMode);
				tapOn("Save", notificationSave);
				assertEquals(toastMessage, "Updated successfully", "All to Focus mode is successful");
			} else if (notificationsFocusMode.isSelected()) {
				tapOn("None", notificationsNone);
				tapOn("Save", notificationSave);
				assertEquals(toastMessage, "Updated successfully", "Focus mode to None is successful");
			} else if (notificationsNone.isSelected()) {
				tapOn("All", notificationsAll);
				tapOn("Save", notificationSave);
				assertEquals(toastMessage, "Updated successfully", "None to All is successful");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Notification is failed");
		}

		// Help and Support
		scrollInto("Help & Client Support");
		try {
			tapOn("Send feedback", feedback);
			sendKeys(addFeedback, prop.getProperty("testMessage"), "Feedback");
			tapOn("Send", sendFeedback);
			assertEquals(toastMessage, "Feedback sent successfully", "Feedback success");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Feedback failed");
		}

		try {
			assertEqualsString(brandName.getText(), "Team AnswerConnect", "Brand is AC");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "INCORRECT BRAND NAME APPEARS");
		}

		try {
			tapOn("Team AnswerConnect", chatSupportMore);
			assertEqualsString(chatSupportheader.getText(), "Team AnswerConnect", "Header");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "INCORRECT HEADER APPEARS");
		}

		try {
			assertEqualsString(chatSupportStatus.getText(), "Available", "Status");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "INCORRECT STATUS APPEARS");
		}

		try {
			tapOn("Text field", chatSupportTextField);
			sendKeys(chatSupportTextField, prop.getProperty("testMessage"), "Text");
			tapOn("Send", chatSupportSend);
			test.log(LogStatus.PASS, "Chat support message succeed");
			goBack();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Chat support message failed");
		}

		goBack();

		// Logout
		scrollInto("Logout");
		try {
			assertEqualsString(logoutTitle.getText(), "Logout", "Logout view succeeded");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Logout title mismatch");
		}

		try {
			tapOn("No", logoutNo);
			String log = logout.getText();
			tapOn("Logout", logout);
			assertEqualsString(log, logoutTitle.getText(), "Logout 'no' passed");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Logout 'no' failed");
		}

		try {
			// String logYes = logoutYes.getText();
			tapOn("Yes", logoutYes);
			assertNotEquals(loginEmail.getText(), loginPassword.getText(), "Logout success");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Logout failed");
		}
	}

}

package main.java.com.answerconnect.deployment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MorePage extends BasePages {

	public MorePage() {
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
	private WebElement saveEditContactOrProfile;
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
	@AndroidFindBy(id = "com.answerconnect.mobile:id/btn_login")
	private WebElement loginButton;
	@AndroidFindBy(xpath = "//*[@text='Help and Support']")
	private WebElement helpAndSupportView;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileEditIV")
	private WebElement profileEditButton;
	@AndroidFindBy(xpath = "//*[@resource-id='com.answerconnect.mobile:id/EditProfileNameParent']/*[@resource-id='com.answerconnect.mobile:id/EditProfileNameET']")
	private WebElement editProfileName;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/EditProfilePositionET")
	private WebElement editProfilePosition;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileNameTV")
	private WebElement profileNameOverview;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/profilePositionTV")
	private WebElement profilePositionOverview;
	@AndroidFindBy(xpath = "//*[@resource-id='com.answerconnect.mobile:id/EditProfileHeaderNameTV']/*[@resource-id='com.answerconnect.mobile:id/EditProfileEmailEditTV']")
	private WebElement editProfilePrimaryEmail;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/profileEmailTV")
	private WebElement primaryEmailOverview;
	@AndroidFindBy(xpath = "//*[@resource-id='com.answerconnect.mobile:id/EditProfileNameET']/*[@resource-id='com.answerconnect.mobile:id/EditProfileEmailEditTV']")
	private WebElement editProfileSecEmail;
	@AndroidFindBy(xpath = "//*[@resource-id='com.answerconnect.mobile:id/EditProfileNameErrorTV']/*[@resource-id='com.answerconnect.mobile:id/EditProfileEmailEditTV']")
	private WebElement editProfileThirdEmail;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/EditProfileAddEmailIv")
	private WebElement editProfileAddEmailIcon;
	@AndroidFindBy(xpath = "//*[@resource-id='com.answerconnect.mobile:id/EditProfileAddEmailIv']/*[@resource-id='com.answerconnect.mobile:id/ProfileNumberEditTV']")
	private WebElement editProfilePhNum1;
	@AndroidFindBy(xpath = "//*[@resource-id='com.answerconnect.mobile:id/EditProfileAddEmailIv']/*[@resource-id='com.answerconnect.mobile:id/country_iv']")
	private WebElement EPCountryCodePh1;
	@AndroidFindBy(xpath = "//*[@resource-id='com.answerconnect.mobile:id/EditProfileCollabImage']/*[@resource-id='com.answerconnect.mobile:id/ProfileNumberEditTV']")
	private WebElement editProfilePhNum2;
	@AndroidFindBy(xpath = "//*[@resource-id='com.answerconnect.mobile:id/EditProfileCollabImage']/*[@resource-id='com.answerconnect.mobile:id/country_iv']")
	private WebElement EPCountryCodePhNum2;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/addPhoneLayoutIV")
	private WebElement editProfileAddPhNumIcon;

	public void more() throws InterruptedException {

		tapOn("More tab", moreTab);
		// My Profile existing names validation
		try {
			String nameOut = profileNameOverview.getText().trim();
			String positionOut = profilePositionOverview.getText().trim();
			String primEmailOut = primaryEmailOverview.getText().trim();
			tapOn("Edit profile", profileEditButton);
			String nameIn = editProfileName.getText().trim();
			String positionIn = editProfilePosition.getText().trim();
			String primEmailIn = editProfilePrimaryEmail.getText().trim();
			assertEqualsString(nameOut, nameIn, "Existing name validation");
			assertEqualsString(positionOut, positionIn, "Existing position validation");
			assertEqualsString(primEmailOut, primEmailIn, "Existing primary email validation");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Existing change validation failed");
		}

		// My Profile
		tapOn("name field", editProfileName);
		editProfileName.clear();
		sendKeys(editProfileName, getRandomName(), "Profile name");
		hideKeyboard();
		tapOn("Position field", editProfilePosition);
		editProfilePosition.clear();
		sendKeys(editProfilePosition, "QA Engineer", "Position name");
		hideKeyboard();
		try {
			if (editProfileSecEmail.isDisplayed()) {
				tapOn("2nd Email field", editProfileSecEmail);
				editProfileSecEmail.clear();
				sendKeys(editProfileSecEmail, getRandomEmail(), "2nd Email");
				hideKeyboard();
				test.log(LogStatus.PASS, "Entered 2nd email without add icon");
			}
		} catch (Exception e) {
			tapOn("Add email", editProfileAddEmailIcon);
			tapOn("2nd Email field", editProfileSecEmail);
			editProfileSecEmail.clear();
			sendKeys(editProfileSecEmail, getRandomEmail(), "2nd Email");
			hideKeyboard();
			test.log(LogStatus.PASS, "Entered 2nd email with add icon");
		}

		try {
			if (editProfileThirdEmail.isDisplayed()) {
				tapOn("3rd email field", editProfileThirdEmail);
				editProfileThirdEmail.clear();
				sendKeys(editProfileThirdEmail, getRandomEmail(), "3rd email");
				hideKeyboard();
				test.log(LogStatus.PASS, "Entered 3rd email without add icon");
			}
		} catch (Exception e) {
			tapOn("Add email", editProfileAddEmailIcon);
			tapOn("3rd email field", editProfileThirdEmail);
			editProfileThirdEmail.clear();
			sendKeys(editProfileThirdEmail, getRandomEmail(), "3rd email");
			hideKeyboard();
			test.log(LogStatus.PASS, "Entered 3rd email with add icon");
		}

		try {
			if (editProfilePhNum1.isDisplayed()) {
				tapOn("1st phone field", editProfilePhNum1);
				editProfilePhNum1.clear();
				sendKeys(editProfilePhNum1, getRandomPhNum(), "1st phone number");
				hideKeyboard();
				tapOn("Country code 1", EPCountryCodePh1);
				tapOn("United States", UnitedStates);
				test.log(LogStatus.PASS, "Entered 1st phone number without add icon");
			}
		} catch (Exception e) {
			tapOn("Add Phone", editProfileAddPhNumIcon);
			tapOn("1st phone field", editProfilePhNum1);
			editProfilePhNum1.clear();
			sendKeys(editProfilePhNum1, getRandomPhNum(), "1st phone number");
			hideKeyboard();
			tapOn("Country code 1", EPCountryCodePh1);
			tapOn("United States", UnitedStates);
			test.log(LogStatus.PASS, "Entered 1st phone number with add icon");
		}

		try {
			if (editProfilePhNum2.isDisplayed()) {
				tapOn("2nd phone field", editProfilePhNum2);
				editProfilePhNum2.clear();
				sendKeys(editProfilePhNum2, getRandomPhNum(), "2nd phone number");
				hideKeyboard();
				tapOn("Country Code 2", EPCountryCodePhNum2);
				tapOn("United States", UnitedStates);
				test.log(LogStatus.PASS, "Entered 2nd phone number without add icon");
			}
		} catch (Exception e) {
			tapOn("Add Phone", editProfileAddPhNumIcon);
			tapOn("2nd phone field", editProfilePhNum2);
			editProfilePhNum2.clear();
			sendKeys(editProfilePhNum2, getRandomPhNum(), "2nd phone number");
			hideKeyboard();
			tapOn("Country Code 2", EPCountryCodePhNum2);
			tapOn("United States", UnitedStates);
			test.log(LogStatus.PASS, "Entered 2nd phone number with add icon");
		}
		scrollUntil("Save");

		try {
			if (saveEditContactOrProfile.isDisplayed()) {
				tapOn("Save", saveEditContactOrProfile);
				assertEquals(toastMessage, "Updated Successfully", "Profile saved successfully");
			}
		} catch (Exception e) {
			assertEquals(toastMessage, "Updated Successfully", "Profile saved successfully");
		}

		// My Profile new names
		try {
			String nameOutNew = profileNameOverview.getText().trim();
			String positionOutNew = profilePositionOverview.getText().trim();
			tapOn("Edit profile", profileEditButton);
			String nameInNew = editProfileName.getText().trim();
			String positionInNew = editProfilePosition.getText().trim();
			assertEqualsString(nameInNew, nameOutNew, "New name validation");
			assertEqualsString(positionOutNew, positionInNew, "New position validation");
			goBack();
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "New change validation failed");
		}

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
			tapOn("Save contact", saveEditContactOrProfile);
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
				goBack();
			} else {
				test.log(LogStatus.FAIL, "Email ID copy failed");
			}
		} catch (Exception e) {
			test.log(LogStatus.INFO, "Email ID is not available");
		}

		pressBackUntil(createNewContact_MyDir);

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

		pressBack(helpAndSupportView);

		// Logout
		scrollInto("Logout");
		try {
			assertEqualsString(logoutTitle.getText(), "Logout", "Logout view succeeded");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Logout title mismatch");
			getBase64();
		}

		try {
			tapOn("No", logoutNo);
			String log = logout.getText();
			tapOn("Logout", logout);
			assertEqualsString(log, logoutTitle.getText(), "Logout 'no' passed");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Logout 'no' failed");
			getBase64();
		}

		try {
			tapOn("Yes", logoutYes);
			if (loginButton.isDisplayed()) {
				test.log(LogStatus.PASS, "Logout passed");
			}
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL, "Logout failed");
			getBase64();
		}
	}

}

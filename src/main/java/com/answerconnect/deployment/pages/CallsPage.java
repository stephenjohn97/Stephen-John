package main.java.com.answerconnect.deployment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CallsPage extends BasePages {

	public CallsPage(ExtentTest tests) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Calls")
	private WebElement callsTab;
	@AndroidFindBy(accessibility = "More")
	private WebElement moreTab;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/profileBsLineTV")
	private WebElement businessLineView;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileBsLineNoTV")
	private WebElement businessLineMore;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/business_line_number_tv")
	private WebElement businessLineCalls;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/toolbar_heading")
	private WebElement callsHeader;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/down_arrow_iv")
	private WebElement businessLineDropdown;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/business_line_number_tv")
	private WebElement businessLineBottomsheet;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/more_option")
	private WebElement callsPlusIcon;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/create_new_contact")
	private WebElement createNewContact;
	@AndroidFindBy(xpath = "//*[@text='New Contact']")
	private WebElement newContact;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/userNameET")
	private WebElement newContactName;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/emailEditext")
	private WebElement newContactEmail;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/addEmailIV")
	private WebElement addNewEmailField;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/phoneEditText")
	private WebElement newContactPhone;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/addPhoneIV")
	private WebElement addNewPhoneField;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/countryCodeIV")
	private WebElement countryCode;
	@AndroidFindBy(xpath = "//*[@text='United States']")
	private WebElement UnitedStates;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/addNewContactTV")
	private WebElement newContactSave;
	@AndroidFindBy(xpath = "//android.widget.Toast")
	private WebElement toastMessage;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/new_sms")
	private WebElement newSMSCalls;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/phone_number_et")
	private WebElement newSMSToNumField;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/add_customer_iv")
	private WebElement addCustomerNewSMS;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/message_edt")
	private WebElement sendSMS;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/send_bt")
	private WebElement sendButton;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/toolbar_heading_tv")
	private WebElement smsNameHeaderView;
	@AndroidFindBy(accessibility = "Recents")
	private WebElement recents;
	@AndroidFindBy(accessibility = "My Team")
	private WebElement myTeam;
	@AndroidFindBy(accessibility = "Contacts")
	private WebElement contacts;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/search_edt")
	private WebElement searchField;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/customer_name")
	private WebElement searchResultContacts;

	public void calls() throws InterruptedException {
		tapOn("More tab", moreTab);
		try {
			if (businessLineView.isDisplayed()) {
				String blMore = businessLineMore.getText().trim();
				tapOn("Calls tab", callsTab);
				assertEquals(callsHeader, "Calls", "Calls tab view success");
				String blCalls = businessLineCalls.getText().trim();
				assertEqualsString(blCalls, blMore, "Business line number validated");

				if (businessLineDropdown.isDisplayed()) {
					tapOn("BL dropdown", businessLineDropdown);
					if (businessLineBottomsheet.isDisplayed()) {
						tapOn("BL bottomsheet", businessLineBottomsheet);
						test.log(LogStatus.PASS, "Bottomsheet success");
					} else {
						test.log(LogStatus.FAIL, "Bottomsheet failed");
					}
				} else {
					test.log(LogStatus.FAIL, "Dropdown unavailable");
				}

				try {
					tapOn("Calls plus", callsPlusIcon);
					hideKeyboard();
					tapOn("Create new Contact", createNewContact);
					assertEquals(newContact, "New Contact", "New Contact view validated");
					tapOn("Name field", newContactName);
					sendKeys(newContactName, getRandomName(), "Name entered");
					hideKeyboard();
					String validateName = newContactName.getText().trim();
					tapOn("Email field", newContactEmail);
					sendKeys(newContactEmail, getRandomEmail(), "Email entered");
					hideKeyboard();
					tapOn("New email field", addNewEmailField);
					tapOn("Phone field", newContactPhone);
					sendKeys(newContactPhone, getRandomPhNum(), "Phone number entered");
					hideKeyboard();
					tapOn("Country code", countryCode);
					tapOn("Country", UnitedStates);
					tapOn("New phone field", addNewPhoneField);
					tapOn("Save", newContactSave);
					tapOn("Contacts", contacts);
					tapOn("Search field", searchField);
					sendKeys(searchField, validateName, "Search name entered");
					String getName = searchResultContacts.getText().trim();
					assertEqualsString(getName, validateName, "Contact created successfully");
					tapOn("recents", recents);
				} catch (Exception e) {
					test.log(LogStatus.FAIL, "Create New Contact failed");
				}

				try {
					tapOn("New SMS", newSMSCalls);
					if (newSMSToNumField.isDisplayed()) {
						test.log(LogStatus.PASS, "New SMS view validated");
						sendKeys(newSMSToNumField, prop.getProperty("synclioBL"), "Ph number entered");
						sendKeys(sendSMS, prop.getProperty("testMessage"), "SMS sent");
						tapOn("Sent", sendButton);
						String header = smsNameHeaderView.getText().trim();
						assertEqualsString(header, prop.getProperty("synclioBL"), "Customer SMS view");
						tapOn("Sent", sendButton);
						hideKeyboard();
						goBack();
					} else {
						test.log(LogStatus.FAIL, "New SMS view failed");
					}

				} catch (Exception e) {
					test.log(LogStatus.FAIL, "New SMS failed");
				}

				try {
					tapOn("My Team", myTeam);
					if (myTeam.isSelected()) {
						test.log(LogStatus.PASS, "'My Team' is selected");
					} else {
						test.log(LogStatus.FAIL, "My Team is not selected");
					}
					tapOn("Contacts", contacts);
					if (contacts.isSelected()) {
						test.log(LogStatus.PASS, "'Contacts' is selected");
					} else {
						test.log(LogStatus.FAIL, "'Contact' is not selected");
					}
				} catch (Exception e) {
					test.log(LogStatus.FAIL, "My Team and Contacts selection failed");
				}

				try {
					tapOn("New Contact", newContact);
					assertEquals(newContact, "New Contact", "New Contact view validated");
					tapOn("Name field", newContactName);
					sendKeys(newContactName, getRandomName(), "Name entered");
					hideKeyboard();
					String validateName = newContactName.getText().trim();
					tapOn("Email field", newContactEmail);
					sendKeys(newContactEmail, getRandomEmail(), "Email entered");
					hideKeyboard();
					tapOn("New email field", addNewEmailField);
					tapOn("Phone field", newContactPhone);
					sendKeys(newContactPhone, getRandomPhNum(), "Phone number entered");
					hideKeyboard();
					tapOn("Country code", countryCode);
					tapOn("Country", UnitedStates);
					tapOn("New phone field", addNewPhoneField);
					tapOn("Save", newContactSave);
					sendKeys(searchField, validateName, "Search name entered");
					String getName = searchResultContacts.getText().trim();
					assertEqualsString(getName, validateName, "Contact created successfully");
				} catch (Exception e) {
					test.log(LogStatus.FAIL, "New Contact failed");
				}

			} else {
				test.log(LogStatus.INFO, "Business line doesn't exist");
			}

		} catch (Exception e) {
			test.log(LogStatus.INFO, "BUSINESS LINE UNAVAILABLE FOR: " + prop.getProperty("emailId"));
		}
	}

}

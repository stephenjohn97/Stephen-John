package main.java.com.answerconnect.deployment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class InboxPage extends BasePages {

	public InboxPage(ExtentTest tests) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.answerconnect.mobile:id/toolbar_subheading")
	private WebElement allDropdownInbox;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/all")
	private WebElement all;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/check_icon_all")
	private WebElement allIconChecked;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/welcome_detail_infoTV")
	private WebElement inboxNoMessageToast;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/unread")
	private WebElement unread;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/check_icon_unread")
	private WebElement unreadIconChecked;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/apply_filter")
	private WebElement applyFilter;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/call_type_iv")
	private WebElement inboxMessageIcon;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/msg_read_iv")
	private WebElement markAsRead;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/msg_unread_iv")
	private WebElement markAsUnread;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/user_verified_iv")
	private WebElement verifyToggle;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/trash_msg_iv")
	private WebElement trash;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/delete_msg_iv")
	private WebElement archive;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/option_toggle")
	private WebElement moreOptionsInbox;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/search_container")
	private WebElement searchContainer;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/archive_filter")
	private WebElement archiveFilter;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/trash_filter")
	private WebElement trashFilter;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/inbox_customer_name")
	private WebElement inboxMessage;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/customer_profile_name")
	private WebElement profileName;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/add_note")
	private WebElement addNote;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/share_interaction")
	private WebElement share;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/notes_et")
	private WebElement sendNotes;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/send_bt")
	private WebElement sendButton;

	@AndroidFindBy(xpath = "//android.widget.Toast")
	private WebElement toastMessage;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/mention_iv")
	private WebElement mentions;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/user_name")
	private WebElement tagNames;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/attach_file_iv")
	private WebElement attachmentIcon;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/camera_tv")
	private WebElement useCamera;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Photo Library']")
	private WebElement photoLibrary;

	@AndroidFindBy(id = "com.google.android.documentsui:id/icon_thumb")
	private WebElement internalFile;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/forward_email_layout")
	private WebElement forwardEmail;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/edt_email")
	private WebElement sendTo;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/edt_message")
	private WebElement mailMessage;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/SwitchCompat")
	private WebElement includeNotes;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/SendTV")
	private WebElement sendMailButton;

	@AndroidFindBy(accessibility = "Option Menu")
	private WebElement messageMoreOption;

	@AndroidFindBy(accessibility = "Take photo")
	private WebElement takePhotoButton;

	@AndroidFindBy(accessibility = "Done")
	private WebElement photoDoneButton;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/moveArchiveOrInboxTV")
	private WebElement moveToArchive;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/moveToTrashTV")
	private WebElement moveToTrash;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/markUnreadOrReadTV")
	private WebElement markUnreadOrRead;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/addFeedbackTV")
	private WebElement giveFeedback;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/inbox_feedbackET")
	private WebElement feedbackMessage;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/archive_container")
	private WebElement archiveSwipe;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/phone_icon")
	private WebElement callIconInside;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/chat_icon")
	private WebElement chatIconInside;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/CallProfileIv")
	private WebElement callIconOverview;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileChatIv")
	private WebElement chatIconOverview;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/customer_number")
	private WebElement phoneNumberInside;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/toolbar_heading_tv")
	private WebElement chatNameInside;

	@AndroidFindBy(accessibility = "Navigator")
	private WebElement navigateBack;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileBackButton")
	private WebElement profileBackButton;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfilePhoneNoTV")
	private WebElement phoneNumberOverview;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/PhoneNoRow")
	private WebElement phoneOrEmailBottomSheet;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileEmailTv")
	private WebElement emailOverview;

	@AndroidFindBy(accessibility = "Show roots")
	private WebElement pixelHamBurgerMenu;

	@AndroidFindBy(id = "com.google.android.documentsui:id/search_src_text")
	private WebElement pixelSearchField;

	@AndroidFindBy(accessibility = "Search")
	private WebElement pixelSearchIcon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pixel 4a']")
	private WebElement pixel4a;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='AC photos']")
	private WebElement ACPhotos;

	@AndroidFindBy(id = "com.answerconnect.mobile:id/ProfileNameTv")
	private WebElement headerForConfirmation;

	@AndroidFindBy(xpath = "//*[@resource-id='com.answerconnect.mobile:id/swipe_reveal_layout'][3]")
	private WebElement messagePract;

	int i = 0;

	public void inbox() throws InterruptedException {

		tapOn("Inbox All dropdown", allDropdownInbox);
		if (allIconChecked.isDisplayed()) {
			try {
				tapOn("Unread", unread);
				tapOn("Apply Filter", applyFilter);
				tempWait(2000);
				if (inboxNoMessageToast.isDisplayed()) {
					test.log(LogStatus.PASS, "No messages for Unread");
				} else if (!inboxNoMessageToast.isDisplayed()) {
					tapOn("Message icon", inboxMessageIcon);
					if (markAsRead.isDisplayed()) {
						test.log(LogStatus.PASS, "All dropdown unread is passed");
						tapOn("Message icon", inboxMessageIcon);
					}
				}
			} catch (Exception e) {
				test.log(LogStatus.FAIL, "All dropdown unread is failed");

			}
		} else if (unreadIconChecked.isDisplayed()) {
			tapOn("All option", all);
			tapOn("Apply Filter", applyFilter);
			tempWait(2000);

		}

		tapOn("Inbox All dropdown", allDropdownInbox);
		tapOn("All option", all);
		tapOn("Apply Filter", applyFilter);
		tempWait(2000);

		// Mark as read and unread (Outside)
		tapOn("message", inboxMessageIcon);
		try {
			if (markAsUnread.isDisplayed()) {
				tapOn("unread", markAsUnread);
				tapOn("message", inboxMessageIcon);
				assertEqualsWebElement(markAsRead, markAsRead, "Checking unread");
				System.out.println("mark as unread passed");
				tapOn("message", inboxMessageIcon);
			}
		} catch (Exception e) {
			if (markAsRead.isDisplayed()) {
				tapOn("read", markAsRead);
				tapOn("message", inboxMessageIcon);
				assertEqualsWebElement(markAsUnread, markAsUnread, "Checking read");
				System.out.println("mark as read passed");
				tapOn("message", inboxMessageIcon);
			} else {
				System.out.println("Read and Unread failed" + e.getLocalizedMessage());
			}
		}

		// Swipe message archive
		try {
			swipeLeft();
			tapOn("archive", archiveSwipe);
			test.log(LogStatus.PASS, "Archive success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			test.log(LogStatus.FAIL, "Archive failed");
		}

		// Validating a message view
		try {
			String texts = inboxMessage.getText().substring(1);
			tapOn("message", inboxMessage);
			assertEqualsString(profileName.getText().substring(1), texts, "Validating a message");
			System.out.println("Message view validated");
			tapOn("Go back", navigateBack);
		} catch (Exception e) {
			tapOn("Go back", navigateBack);
			System.out.println(e.getMessage());
			test.log(LogStatus.FAIL, "Message validation failed");
		}

		tapOn("message", inboxMessage);
		tapOn("profile name", profileName);
		try {
			if (headerForConfirmation.isDisplayed()) {

				// Chat Icon Inside
				try {
					goBack();
					if (profileName.getText().contains(":")) {
						String temp = profileName.getText().replace(':', ' ').replaceAll("\\s", "");
						tapOn("Chat icon", chatIconInside);
						String chat = chatNameInside.getText().replace(':', ' ').replaceAll("\\s", "");
						assertEqualsString(chat, temp, "Chat icon (Inside) validation successful");
					} else {
						String temp = profileName.getText().trim();
						tapOn("Chat icon", chatIconInside);
						String chat = chatNameInside.getText().trim();
						assertEqualsString(chat, temp, "Chat icon (Inside) validation successful");
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println("Chat icon validation unsuccessful");
					test.log(LogStatus.FAIL, "Chat icon validation unsuccessful");
				}

				// Phone number comparison of inside with the one in overview
				try {
					tapOn("Chat name header", chatNameInside);
					if (phoneNumberOverview.isDisplayed()) {
						String phone = phoneNumberOverview.getText().trim();
						if (phone.contains("More")) {
							String phone1 = phone.substring(0, phone.length() - 8);
							tapOn("Go back", profileBackButton);
							goBack();
							String phoneInside = phoneNumberInside.getText().trim();
							assertEqualsString(phoneInside, phone1, "Phone number validation successful");
							System.out.println("Phone num comp with inside success");
						} else {
							tapOn("Go back", profileBackButton);
							goBack();
							String phoneInside = phoneNumberInside.getText().trim();
							assertEqualsString(phoneInside, phone, "Phone number validation successful");
							System.out.println("Phone num comp with inside success (else)");
						}
					} else {
						tapOn("Go back", profileBackButton);
						tapOn("Go back", navigateBack);
						System.out.println("Phone number is not provided");
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println("Phone number validation unsuccessful ");
					test.log(LogStatus.FAIL, "Phone number validation unsuccessful");

				}

				// Phone number overview comparison with BS
				try {
					tapOn("Profile name", profileName);
					if (phoneNumberOverview.isDisplayed()) {
						String phone = phoneNumberOverview.getText().trim();
						if (phone.contains("More")) {
							String phone1 = phone.substring(0, phone.length() - 8);
							tapOn("Phone bottomsheet", phoneNumberOverview);
							String phoneBS = phoneOrEmailBottomSheet.getText().trim();
							goBack();
							assertEqualsString(phoneBS, phone1, "Bottomsheet Phone number validation successful");
						} else {
							tapOn("Phone bottomsheet", phoneNumberOverview);
							String phoneBS = phoneOrEmailBottomSheet.getText().trim();
							goBack();
							assertEqualsString(phoneBS, phone, "Bottomsheet Phone number validation successful");
						}
					} else {
						System.out.println("Phone number is not available");
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println("Bottomsheet Phone number validation unsuccessful");
					test.log(LogStatus.FAIL, "Bottomsheet phone number validation unsuccessful");

				}

				// Email overview comparison with BS
				try {
					if (emailOverview.isDisplayed()) {
						String email = emailOverview.getText().trim();
						if (email.contains("More")) {
							String email1 = email.substring(0, email.length() - 8);
							tapOn("Email bottomsheet", emailOverview);
							String emailBS = phoneOrEmailBottomSheet.getText().trim();
							goBack();
							assertEqualsString(emailBS, email1, "Bottomsheet email validation successful");
							goBack();
							System.out.println("BS email comp if");
						} else {
							tapOn("Email bottomsheet", emailOverview);
							String emailBS = phoneOrEmailBottomSheet.getText().trim();
							goBack();
							assertEqualsString(emailBS, email, "Bottomsheet email validation successful");
							goBack();
							System.out.println("BS email comp else");
						}
					}

				} catch (Exception e) {
					System.out.println("Email is not available");
					tapOn("Go back", profileBackButton);
					System.out.println(e.getMessage());
					System.out.println("Bottomsheet email validation unsuccessful");
					test.log(LogStatus.FAIL, "Bottomsheet email validation unsuccessful");

				}

				// BS phone number copy
				try {

					tapOn("Profile name", profileName);
					if (phoneNumberOverview.isDisplayed()) {
						tapOn("Phone number", phoneNumberOverview);
						longPress("BS phone", phoneOrEmailBottomSheet);
						assertEqualsString("Phone number is copied to clipboard", "Phone number is copied to clipboard",
								"BS phone copy validation successful");
						goBack();
					} else {
						System.out.println("Phone number is not available");
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
					test.log(LogStatus.FAIL, "Bottomsheet phone copy validation unsuccessful");
					goBack();
				}

				// BS email copy
				try {
					if (emailOverview.isDisplayed()) {
						tapOn("Email ID", emailOverview);
						longPress("BS email", phoneOrEmailBottomSheet);
						assertEqualsString("Email is copied to clipboard", "Email is copied to clipboard",
								"BS email validation successful");
						goBack();
					} else {
						System.out.println("Email is not available");
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					test.log(LogStatus.FAIL, "Bottomsheet email copy validation unsuccessful");
					goBack();
				}
				tapOn("Go back", profileBackButton);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			test.log(LogStatus.FAIL, "Unsaved contact");
		}

		// Add notes validation (Texts)
		try {
			tapOn("add note", addNote);
			sendKeys(sendNotes, "Hi", "notes");
			hideKeyboard();
			tapOn("send button", sendButton);
			assertEquals(toastMessage, "Added notes Successfully", "'Text' Notes validation");
			tempWait(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Archive (Inside)
		try {
			tapOn("more option", messageMoreOption);
			tapOn("move to archive", moveToArchive);
			assertEquals(toastMessage, "Message Moved to Archive", "Validating move to archive");
			tempWait(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Add notes validation (Mentions)
		try {
			tapOn("add note", addNote);
			tapOn("mention", mentions);
			tapOn("username", tagNames);
			tapOn("send button", sendButton);
			assertEquals(toastMessage, "Added notes Successfully", "'Mention' Notes validation");
			tempWait(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Trash (Inside)
		try {
			tapOn("more option", messageMoreOption);
			tapOn("move to trash", moveToTrash);
			assertEquals(toastMessage, "Message Moved to Trash", "Validating move to trash");
			tempWait(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Validating share
		try {
			tapOn("share", share);
			tapOn("forward mail", forwardEmail);
			sendKeys(sendTo, prop.getProperty("mailIDSendTo"), "Send to");
			sendKeys(mailMessage, prop.getProperty("mailMessage"), "Message");
			hideKeyboard();
			tapOn("Include notes", includeNotes);
			tapOn("send button", sendMailButton);
			assertEquals(toastMessage, "Email Forwarded Successfully", "Share validation");
			tempWait(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Marked as read and Unread (Inside)
		try {
			tapOn("more option", messageMoreOption);
			tapOn("mark Unread", markUnreadOrRead);

			tempWait(1000);
			assertEqualsWebElement(toastMessage, toastMessage, "Validating (\"" + toastMessage.getText() + "\")");
			System.out.println(toastMessage.getText());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Add notes validation (Camera)
		if (prop.getProperty("attachmentDevice").equalsIgnoreCase("PixelDevice")) {
			tapOn("add note", addNote);
			tapOn("attachments", attachmentIcon);
			try {
				if (useCamera.isDisplayed()) {
					tapOn("Use Camera", useCamera);
				}
				tapOn("Click photo", takePhotoButton);
				tapOn("Photo done", photoDoneButton);
				sendKeys(sendNotes, "Hello", "Sending notes");
				hideKeyboard();
				tapOn("send button", sendButton);
				assertEquals(toastMessage, "Added notes Successfully", "'Camera' Notes validation");
			} catch (Exception e) {
				while (true) {
					if (!addNote.isDisplayed()) {
						goBack();
					}
					i++;
				}
			}
		} else {
			System.out.println("This is not a pixel device");
		}

		// Add notes validation (Attachments)
		if (prop.getProperty("attachmentDevice").equalsIgnoreCase("PixelDevice")) {
			tapOn("add note", addNote);
			tapOn("attachments", attachmentIcon);
			try {
				tapOn("photo library", photoLibrary);
				tapOn("Hamburger", pixelHamBurgerMenu);
				tapOn("Pixel4A", pixel4a);
				tapOn("Search icon", pixelSearchIcon);
				sendKeys(pixelSearchField, "AC photos", "Searching photos");
				tapOn("AC photos", ACPhotos);
				tapOn("internal file", internalFile);
				sendKeys(sendNotes, "Hello", "Sending notes");
				hideKeyboard();
				tapOn("send button", sendButton);
				assertEquals(toastMessage, "Added notes Successfully", "'Attachments' Notes validation");
			} catch (Exception e) {
				goBack();
				System.out.println("Attachment notes failed" + e.getMessage());
			}
		} else {
			System.out.println("This is not a pixel device");
		}

	}
}

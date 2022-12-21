package main.java.com.answerconnect.deployment.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StatusBarPage extends BasePages {
	public StatusBarPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.answerconnect.mobile:id/status_layout")
	private WebElement statusLayout;
	@AndroidFindBy(xpath = "//*[@text=\"I'm Available\"]")
	private WebElement available;
	@AndroidFindBy(xpath = "//*[@text=\"I can take calls\"]")
	private WebElement cantakecalls;
	@AndroidFindBy(xpath = "//*[@text=\"I'm Unavailable\"]")
	private WebElement unavailable;
	@AndroidFindBy(xpath = "//*[@text=\"Not taking calls\"]")
	private WebElement nottakingcalls;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/status_title_tv")
	private WebElement otherStatuses;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/status_description_tv")
	private WebElement description;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/ripple_effect")
	private WebElement rippleEffect;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/drop_down_arrow")
	private WebElement statusBarArrow;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/status_meeting")
	private WebElement inAMeetingStatus;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/next_hour_tv")
	private WebElement nextHourAndDays_2;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/status_lunch")
	private WebElement atLunchStatus;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/until_further_tv")
	private WebElement minutes_15AndDay_1;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/status_vacation")
	private WebElement onVacationStatus;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/next_hour_tv")
	private WebElement twoDays;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/next_2_hour_tv")
	private WebElement week_1;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/status_custom")
	private WebElement customStatus;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/custom_tv")
	private WebElement custom;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/status_title_et")
	private WebElement customStatusTitle;
	@AndroidFindBy(id = "com.answerconnect.mobile:id/done_button")
	private WebElement statusDone;

	public void statusBar() throws InterruptedException {
		try {
			if (available.isDisplayed()) {
				doubleTap("Available", available);
				assertEquals(unavailable, "I'm Unavailable", "Verified I'm Unavailable successfully");
				assertEquals(nottakingcalls, "Not taking calls", "Verified Not taking calls successfully");
			}
		} catch (NoSuchElementException e) {
			if (unavailable.isDisplayed()) {
				doubleTap("Unavailable", unavailable);
				assertEquals(available, "I'm Available", "Verified I'm Available successfully");
				assertEquals(cantakecalls, "I can take calls", "Verified I can take calls successfully");
			}
		} catch (Exception e) {
			if (otherStatuses.isDisplayed()) {
				doubleTap("Other status", otherStatuses);
				assertEquals(available, "I'm Available", "Verified I'm Available successfully");
				assertEquals(cantakecalls, "I can take calls", "Verified I can take calls successfully");
			} else {
				test.log(LogStatus.FAIL, "Available & Unavailable failed");
			}
		}

		// In a meeting
		String statusDescription = driver.findElement(By.id("com.answerconnect.mobile:id/status_description_tv"))
				.getText();
		try {
			tapOn("Status arrow", statusBarArrow);
			tapOn("In a meeting", inAMeetingStatus);
			tapOn("Next hour", nextHourAndDays_2);
			tapOn("Done", statusDone);
			if (statusDescription.contains("PM") || (statusDescription.contains("AM"))) {
				statusDescription = statusDescription.substring(statusDescription.length() - 8).trim();
			}
			String[] spl = statusDescription.split(":");
			int appTime = Integer.parseInt(spl[0]);
			String[] spl1 = getCurrentTime().split(":");
			int deviceTime = Integer.parseInt(spl1[0]);
			if (deviceTime == 12) {
				deviceTime = 0;
			}
			assertIntEquals(deviceTime + 1, appTime, "In meeting nexthour is working");
			assertEqualsString(spl[1], spl1[1], "In meeting nextHour min is working");
			assertEquals(otherStatuses, "In Meeting", "Verified 'In meeting' successfully");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "In a meeting is failed");
		}

		// At Lunch
		try {
			tapOn("Status arrow", statusBarArrow);
			tapOn("At Lunch", atLunchStatus);
			tapOn("15 Minutes", minutes_15AndDay_1);
			tapOn("Done", statusDone);
			assertEquals(otherStatuses, "At Lunch", "Verified 'At Lunch' successfully");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "At Lunch is failed");
		}

		// On Vacation (1 day)
		try {
			tapOn("Status arrow", statusBarArrow);
			tapOn("On Vacation", onVacationStatus);
			tapOn("1 day", minutes_15AndDay_1);
			tapOn("Done", statusDone);
			String deviceDateDay_1 = validateDeviceTime(1);
			assertEquals(otherStatuses, "On Vacation", "Verified 'On Vacation' successfully");
			assertEqualsString(validateAppTime(description.getText()), deviceDateDay_1, "1 day validation successful");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "On Vacation (1 day) is failed");
		}

		// On Vacation (2 days)
		try {
			tapOn("Status arrow", statusBarArrow);
			tapOn("On Vacation", onVacationStatus);
			tapOn("2 days", nextHourAndDays_2);
			tapOn("Done", statusDone);
			String deviceDateDays_2 = validateDeviceTime(2);
			assertEquals(otherStatuses, "On Vacation", "Verified 'On Vacation' successfully");
			assertEqualsString(validateAppTime(description.getText()), deviceDateDays_2,
					"2 days validation successful");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "On Vacation (2 days) is failed");
		}

		// On Vacation (1 week)
		try {
			tapOn("Status arrow", statusBarArrow);
			tapOn("On Vacation", onVacationStatus);
			tapOn("1 week", week_1);
			tapOn("Done", statusDone);
			String deviceDateWeek_1 = validateDeviceTime(7);
			assertEquals(otherStatuses, "On Vacation", "Verified 'On Vacation' successfully");
			assertEqualsString(validateAppTime(description.getText()), deviceDateWeek_1,
					"1 week validation successful");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "On Vacation (1 week) is failed");
		}

//		// custom
//		try {
//			tapOn("Status arrow", statusBarArrow);
//			tapOn("Custom", customStatus);
//			sendKeys(customStatusTitle, prop.getProperty("CustomStatus"), "Custom Title");
//			hideKeyboard();
//			tapOn("CustomTime", custom);
//			timePicker(prop.getProperty("TimePickerHour"));
//			tapOn("Done", statusDone);
//			assertEquals(otherStatuses, "On leave indefinitely", "Verified 'On leave indefinitely' successfully");
//		} catch (Exception e) {
//			test.log(LogStatus.FAIL, "Custom is failed");
//
//		}

	}
}
package main.java.com.answerconnect.app.base;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AutomationTest {

	public static AndroidDriver<AndroidElement> driver;
	public static Properties prop = new Properties();
	static InputStream input = null;
	public static AppiumDriverLocalService service;
	public static AppiumServiceBuilder builder;
	public static ExtentReports reports = new ExtentReports("AC_report.html");
	public static ExtentTest test;
	public static List<String> testClasses = new ArrayList<String>();
	public static String userName = "stephenjohn_kgXWTI";
	public static String accessKey = "LW12ajdZ1xMzE4van3Sv";
	DesiredCapabilities capabilities;

	public static void main(String[] args) throws IOException, GeneralSecurityException, InterruptedException {

		startUp();
		TestNG testng = new TestNG();
		List<String> suites = new ArrayList<String>();
		String file = "./src/test/resources/properties/test-suites/deployment/deployment.xml";
		suites.add(file);
		testng.setTestSuites(suites);
		testng.run();
	}

	public static void startUp() throws IOException, GeneralSecurityException, InterruptedException {

		loadPropertiesFile();
		generateTestNGXml_Deployment();
		report_Deployment();
	}

	public static void report_Deployment() {
		final File CONF = new File("config.xml");
		reports.loadConfig(CONF);

	}

	public void beforeTest(Method method) throws Exception {
		String testcaseName = method.getName();
		try {
			test = reports.startTest(testcaseName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	@BeforeTest
	public void launchApp() throws InterruptedException, IOException {
		try {
			System.out.println("launch app started");
			loadPropertiesFile();
			String platformName = prop.getProperty("platformName");
			String deviceName = prop.getProperty("deviceName");
			String platformVersion = prop.getProperty("platformVersion");
			String appPackage = prop.getProperty("appPackage");
			String appActivity = prop.getProperty("appActivity");
			String automationName = prop.getProperty("automationName");
			capabilities = new DesiredCapabilities();
			if (prop.getProperty("deviceType").equalsIgnoreCase("RealDevice")) {
				System.out.println("In real device");
				capabilities.setCapability("platformName", platformName);
				capabilities.setCapability("deviceName", deviceName);
				capabilities.setCapability("platformVersion", platformVersion);
				capabilities.setCapability("appPackage", appPackage);
				capabilities.setCapability("appActivity", appActivity);
				capabilities.setCapability("automationName", automationName);
				capabilities.setCapability("noReset", false);
				capabilities.setCapability("autoGrantPermissions", true);
				capabilities.setCapability("autoAcceptAlerts", true);
				capabilities.setCapability("fullReset", true);
				capabilities.setCapability("skipUnlock", true);
				capabilities.setCapability("newCommandTimeout", 120);
				capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
				capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
				driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			} else if (prop.getProperty("deviceType").equalsIgnoreCase("Cloud")) {
				capabilities.setCapability("device", "Google Pixel 6 Pro");
				capabilities.setCapability("os_version", "13.0");
				capabilities.setCapability("project", "My AC Project");
				capabilities.setCapability("build", "My AC Build");
				capabilities.setCapability("name", "Bstack-[Java] Sample Test");
				capabilities.setCapability("app", "bs://190ae459fb5bef7a17ceadb419092cd54a93ee34");
				capabilities.setCapability("autoGrantPermissions", true);
				capabilities.setCapability("autoAcceptAlerts", true);
				capabilities.setCapability("noReset", false);
				capabilities.setCapability("fullReset", true);
				capabilities.setCapability("newCommandTimeout", 120);
				driver = new AndroidDriver<AndroidElement>(
						new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"),
						capabilities);
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			}
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("completed launch app");

	}

	public static void loadPropertiesFile() throws IOException {
		input = new FileInputStream("./src/test/resources/properties/mobileCapabilities/capabilities.properties");
		prop.load(input);
	}

	public static List<String> readSheet() {

		List<String> executionList = new ArrayList<String>();
		try

		{
			System.out.println("read sheet started");
			File file = new File(
					"/Users/stefan/Desktop/ANCT_Android_AutomationCheck/src/test/resources/sheet/AndroidTestModuleSheet.xlsx"); // creating
			// a
			// new
			// file
			// instance

			FileInputStream fis = new FileInputStream(file); // obtaining bytes from the file
			// creating Workbook instance that refers to .xlsx file
			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve object
			Iterator<Row> itr = sheet.iterator(); // iterating over excel file
			while (itr.hasNext()) {
				Row row = itr.next();
				Cell cell = row.getCell(1); // getting the cell representing the given column
				String value = cell.getStringCellValue();

				Cell cell2 = row.getCell(0);

				if (value.trim().equalsIgnoreCase("Yes")) {
					executionList.add(cell2.getStringCellValue());
				}
				System.out.println(value);
			}
			System.out.println(executionList.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("read sheet ended");

		return executionList;

	}

	public static void generateTestNGXml_Deployment() throws IOException, GeneralSecurityException {

		testClasses = readSheet();
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// Create <suite> element
			Document doc = docBuilder.newDocument();

			Element suiteElement = doc.createElement("suite");
			doc.appendChild(suiteElement);

			Attr rootNameAttribute = doc.createAttribute("name");
			System.out.println(prop.getProperty("BrowserName"));
			rootNameAttribute.setValue(prop.getProperty("TestSuite"));
			suiteElement.setAttributeNode(rootNameAttribute);

			Attr orderAttribute = doc.createAttribute("preserve-order");
			orderAttribute.setValue("true");
			suiteElement.setAttributeNode(orderAttribute);

			Element testEle = doc.createElement("test");
			testEle.setAttribute("name", prop.getProperty("ProjectName"));
			suiteElement.appendChild(testEle);

			testEle.setAttribute("preserve-order", "true");
			testEle.setAttribute("enabled", "true");

			Element classesNode = doc.createElement("classes");
			testEle.appendChild(classesNode);
			Element classEle;
			for (int i = 0; i < testClasses.size(); i++) {
				String className = testClasses.get(i);
				classEle = doc.createElement("class");
				classEle.setAttribute("name", "test.java.com.answerconnect.deployment.testcases." + className);
				classesNode.appendChild(classEle);
			}
			// for output to file, console
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "http://testng.org/testng-1.0.dtd");

			// for pretty print
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			DOMSource source = new DOMSource(doc);

			// write to console or file
			StreamResult console = new StreamResult(System.out);
			StreamResult file = new StreamResult(
					new File("./src/test/resources/properties/test-suites/deployment/deployment.xml"));

			// write data
			transformer.transform(source, console);
			transformer.transform(source, file);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void extentReports(ITestResult it) {
		try {
			if (it.getStatus() == ITestResult.SUCCESS) {
				String imagePath = takeScreenshot(it.getName());
				test.log(LogStatus.PASS, "Testcase passed", test.addScreenCapture(imagePath));
				reports.flush();
			} else if (it.getStatus() == ITestResult.FAILURE) {
				String imagePath = takeScreenshot(it.getName());
				test.log(LogStatus.FAIL, "Testcase failed", test.addScreenCapture(imagePath));
				reports.flush();
			} else if (it.getStatus() == ITestResult.SKIP) {
				String imagePath = takeScreenshot(it.getName());
				test.log(LogStatus.SKIP, "Testcase skipped", test.addScreenCapture(imagePath));
				reports.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterSuite
	public void tearDown() throws Exception {

		reports.endTest(test);
		reports.flush();
		System.out.println("INFO - ###################################");
		System.out.println("INFO - Script Execution Complete");
		System.out.println("INFO - ####################################");
		Desktop.getDesktop().browse(new File("AC_report.html").toURI());

	}

	public String takeScreenshot(String name) throws IOException {
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File path = new File(
				"/Users/stefan/Desktop/ANCT_Android_AutomationCheck/src/test/resources/screenshots/" + name + ".jpeg");
		FileHandler.copy(scr, path);
		return path.getAbsolutePath();
	}

}

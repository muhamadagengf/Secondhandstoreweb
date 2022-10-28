package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class Login {
	@Then("User input valid email {string}")
	public void user_input_valid_email(String email) {
		WebUI.callTestCase(findTestCase('Pages/UserLogin/Input Email'), [('email') : 'binarqae1@gmail.com'], FailureHandling.STOP_ON_FAILURE)
		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.navigateToUrl('https://deployed-five.vercel.app/');
	}

	@Then("User input valid password {string}")
	public void user_input_valid_password(String password) {
		WebUI.callTestCase(findTestCase('Pages/UserLogin/Input Password'), [('password') : 'students1234'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
		WebUI.callTestCase(findTestCase('Pages/UserLogin/Click login button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input invalid email {string}")
	public void user_input_invalid_username(String email) {
		WebUI.callTestCase(findTestCase('Pages/UserLogin/Input Email'), [('email') : 'binarqe1@gmail.com'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input invalid password {string}")
	public void user_input_invalid_password(String password) {
		WebUI.callTestCase(findTestCase('Pages/UserLogin/Input Password'), [('password') : 'students123'], FailureHandling.STOP_ON_FAILURE)
	}
}
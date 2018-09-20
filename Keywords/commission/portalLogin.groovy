package commission

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

import internal.GlobalVariable

public class portalLogin {

	@Keyword

	public void getLogin(){

		WebUI.navigateToUrl(url)

		WebUI.maximizeWindow()

		WebUI.setText(findTestObject('Portal Page/input_username'), userName)

		WebUI.setText(findTestObject('Portal Page/input_password'), password)

		WebUI.click(findTestObject('Portal Page/button_Login'))

		WebUI.click(findTestObject('Portal Page/span_Sales Performance Home'))

		WebUI.click(findTestObject('Portal Page/a_Commissions'))
	}
}

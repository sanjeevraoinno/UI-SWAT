import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//================================Creating two Positions==============================
WebUI.callTestCase(findTestCase('Commission Login'), [('Password') : 'India987&', ('Username') : 'sanrao@calliduscloud.com'
        , ('Url') : 'https://biz3-tst.callidusondemand.com/SalesPortal/#!/', ('Url2') : 'https://ca1-lvcomapp-int6.callidussoftware.com:444/SalesPortal/#!/'
        , ('Username2') : 'PortalAdmin', ('Password2') : 'PortalAdmin'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(90)

String str = WebUI.getWindowTitle()

System.out.println(str)

String commissionstitle = 'Callidus Cloud Commissions Management'

//Assert(str.equalsIgnoreCase(commissionstitle).TRUE)

WebUI.click(findTestObject('Organization/UI Swat Object Repository_Participant/Manage Organization Link'))

WebUI.scrollToElement(findTestObject('Organization/UI Swat Object Repository_Participant/Organization_Combo box'), 30)

WebUI.mouseOver(findTestObject('Organization/UI Swat Object Repository_Participant/Organization_Combo box'))

WebUI.waitForElementVisible(findTestObject('Organization/UI Swat Object Repository_Positions/Positions label'), 60)

WebUI.click(findTestObject('Organization/UI Swat Object Repository_Positions/Positions label'))

String str1 = 'Position002'

boolean b=true

boolean c

WebUI.click(findTestObject('Organization/UI Swat Object Repository_Participant/Add _icon'))

WebUI.waitForElementClickable(findTestObject('Organization/UI Swat Object Repository_Participant/Pop Up OK button'), 30)

WebUI.click(findTestObject('Organization/UI Swat Object Repository_Participant/Pop Up OK button'))

WebUI.waitForElementVisible(findTestObject('Organization/UI Swat Object Repository_Participant/Cancel button'), 60)

WebUI.sendKeys(findTestObject('Organization/UI Swat Object Repository_Positions/Positions_Name'), str1)

WebUI.click(findTestObject('Organization/UI Swat Object Repository_Positions/Title Combobox'))

WebUI.sendKeys(findTestObject('Organization/UI Swat Object Repository_Positions/Title_Search'), '*')

WebUI.waitForElementVisible(findTestObject('Organization/UI Swat Object Repository_Positions/Title_name'), 30)

WebUI.click(findTestObject('Organization/UI Swat Object Repository_Positions/Title_name'))

/*WebUI.click(findTestObject('Organization/UI Swat Object Repository_Positions/Participant combobox'))

WebUI.sendKeys(findTestObject('Organization/UI Swat Object Repository_Positions/Participant_search'), 'Auto_lname_v4')

WebUI.waitForElementVisible(findTestObject('Organization/UI Swat Object Repository_Positions/Participant_name'), 30)

Actions action = new Actions()
action.moveToElement(findTestObject('Organization/UI Swat Object Repository_Positions/Participant_name')).click().perform() 

WebUI.click(findTestObject('Organization/UI Swat Object Repository_Positions/Participant_name'))*/

WebUI.click(findTestObject('Organization/UI Swat Object Repository_Participant/Participant Save Button'))

try {
    c = WebUI.waitForElementVisible(findTestObject('Organization/UI Swat Object Repository_Positions/Errors'), 
        30)
	   
}
catch (Exception e) {
    System.out.println(e)
} 

WebUI.waitForPageLoad(30)

if (c==b) {
    AssertionError
} else {
    System.out.println('No Error found:the test passed')
}

//WebUI.callTestCase(findTestCase('Commission Logout'), [:], FailureHandling.STOP_ON_FAILURE)


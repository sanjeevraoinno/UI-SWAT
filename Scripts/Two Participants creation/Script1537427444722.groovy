import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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

//================================Creating two Participants==============================

WebUI.callTestCase(findTestCase('Commission Login - Copy'), [('CallidusPortalUrl') : 'https://biz3-tst.callidusondemand.com/SalesPortal/#!/'
        , ('CallidusUser') : 'rkulkarn@calliduscloud.com', ('CallidusPassword') : 'Augg@1234'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(60)

String str = WebUI.getWindowTitle()

System.out.println(str)

String commissionstitle = 'Callidus Cloud Commissions Management'

//Assert(str.equalsIgnoreCase(commissionstitle).TRUE)
WebUI.click(findTestObject('Organization/UI Swat Object Repository_Participant/Manage Organization Link'))

WebUI.scrollToElement(findTestObject('Organization/UI Swat Object Repository_Participant/Organization_Combo box'), 30)

WebUI.mouseOver(findTestObject('Organization/UI Swat Object Repository_Participant/Organization_Combo box'))

WebUI.waitForElementVisible(findTestObject('Organization/UI Swat Object Repository_Participant/Participants label'), 60)

WebUI.click(findTestObject('Organization/UI Swat Object Repository_Participant/Participants label'))

WebUI.click(findTestObject('Organization/UI Swat Object Repository_Participant/Add _icon'))

WebUI.waitForElementClickable(findTestObject('Organization/UI Swat Object Repository_Participant/Pop Up OK button'), 30)

WebUI.click(findTestObject('Organization/UI Swat Object Repository_Participant/Pop Up OK button'))

WebUI.waitForElementVisible(findTestObject('Organization/UI Swat Object Repository_Participant/Participant Id text box'), 30)

WebUI.sendKeys(findTestObject('Organization/UI Swat Object Repository_Participant/Participant Id text box'),Payeeid)

WebUI.sendKeys(findTestObject('Organization/UI Swat Object Repository_Participant/Participant First name text box'),Firstname)

WebUI.sendKeys(findTestObject('Organization/UI Swat Object Repository_Participant/Participant Lastname'),Lastname)

WebUI.click(findTestObject('Organization/UI Swat Object Repository_Participant/Participant Save Button'))

WebUI.waitForPageLoad(30)

WebUI.callTestCase(findTestCase('Commission Logout'), [:], FailureHandling.STOP_ON_FAILURE)


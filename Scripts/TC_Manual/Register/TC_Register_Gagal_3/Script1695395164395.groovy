import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForElementPresent(findTestObject('SignUp/a_Sign up'), 0)

WebUI.verifyElementPresent(findTestObject('SignUp/a_Sign up'), 0)

WebUI.click(findTestObject('SignUp/a_Sign up'))

WebUI.waitForElementPresent(findTestObject('SignUp/input_Username_SignUp'), 0)

WebUI.verifyElementPresent(findTestObject('SignUp/input_Username_SignUp'), 0)

WebUI.waitForElementPresent(findTestObject('SignUp/input_Password_SignUp'), 0)

WebUI.verifyElementPresent(findTestObject('SignUp/input_Password_SignUp'), 0)

WebUI.waitForElementPresent(findTestObject('SignUp/btn_SignUp'), 0)

WebUI.verifyElementPresent(findTestObject('SignUp/btn_SignUp'), 0)

WebUI.click(findTestObject('SignUp/btn_SignUp'))

WebUI.closeBrowser()


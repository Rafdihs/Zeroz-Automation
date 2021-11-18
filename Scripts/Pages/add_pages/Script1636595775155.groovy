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

WebUI.navigateToUrl('https://zeroz.glovory.site/auth/login')

WebUI.setText(findTestObject('Object Repository/Zeroz_Pages/Page_zeroz - Login/input_Sign in_user_name'), 'van@glovory.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Zeroz_Pages/Page_zeroz - Login/input_Sign in_password'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Zeroz_Pages/Page_zeroz - Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Zeroz_Pages/Page_zeroz  Dashboard/a_Pages'))

WebUI.click(findTestObject('Object Repository/Zeroz_Pages/Page_zeroz  Pages/a_Add New Page'))

WebUI.setText(findTestObject('Object Repository/Zeroz_Pages/Page_zeroz  Pages/input_Page title_title'), 'Zeroz')

WebUI.setText(findTestObject('Object Repository/Zeroz_Pages/Page_zeroz  Pages/input_Page slug_slug'), 'Zeroz')

WebUI.setText(findTestObject('Object Repository/Zeroz_Pages/Page_zeroz  Pages/div_Zeroz'), '<p style="">Zeroz</p>')

WebUI.click(findTestObject('Object Repository/Zeroz_Pages/Page_zeroz  Pages/button_Save'))


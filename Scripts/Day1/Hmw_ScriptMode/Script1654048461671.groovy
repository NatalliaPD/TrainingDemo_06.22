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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://trytestingthis.netlify.app/')

WebUI.setText(findTestObject('FormFill/input_First name_fname'), 'Natallia')

WebUI.setText(findTestObject('FormFill/input_Last name_lname'), 'Dyer')

WebUI.click(findTestObject('FormFill/label_Female'))

WebUI.scrollToElement(findTestObject('FormFill/select_Option                  Option 1                  Option 2                  Option 3'), 
    0)

WebUI.click(findTestObject('FormFill/label_Option 3'))

WebUI.setText(findTestObject('FormFill/input_Start typing and it till automatically guess answer_Options'), 'Mint')

WebUI.click(findTestObject('FormFill/input_Select a date_day'))

WebUI.uploadFile(findTestObject('FormFill/input_Select a file_myfile'), 'C:\\Users\\Natallia.Dyer\\OneDrive - Energy Worldnet\\Pictures\\Camera Roll\\excavator.jpg')

WebUI.click(findTestObject('FormFill/button_Submit'))

WebUI.closeBrowser()


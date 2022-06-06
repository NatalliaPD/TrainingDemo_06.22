import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://trytestingthis.netlify.app/')
WebUI.setText(findTestObject('Object Repository/Page_Try Testing This/input_Username_uname'), 'test')
WebUI.setText(findTestObject('Object Repository/Page_Try Testing This/input_Password_pwd'),'test')
WebUI.click(findTestObject('Object Repository/Page_Try Testing This/input'))
WebUI.closeBrowser()
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForElementPresent(findTestObject('saucelabs/loginScreen/fieldUsername'), 0)

if (username != 'none') {
    WebUI.sendKeys(findTestObject('saucelabs/loginScreen/fieldUsername'), username)
}

if (password != 'none') {
    WebUI.sendKeys(findTestObject('saucelabs/loginScreen/fieldPassword'), password)
}

WebUI.click(findTestObject('saucelabs/loginScreen/btnLogin'))

if (testType == 'P') {
    WebUI.waitForElementVisible(findTestObject('saucelabs/loginScreen/btnBurgerMenu'), 0)
} else {
    WebUI.verifyElementText(findTestObject('saucelabs/loginScreen/warningMsgContainer'), expectedWarningMessage)
}


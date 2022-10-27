package com.saucelabs
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable



class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("The saucelabs URL")
	def theSauceLabsUrl() {
		WebUI.openBrowser(GlobalVariable.urlSauceLabs)

		//		WebUI.navigateToUrl(GlobalVariable.urlSauceLabs)
	}

	@When("I input (.*) and (.*) in the fields")
	def inputUsernameAndPwd(String username, password) {
		WebUI.waitForElementPresent(findTestObject('saucelabs/loginScreen/fieldUsername'), 0)

		WebUI.sendKeys(findTestObject('saucelabs/loginScreen/fieldUsername'), username)

		WebUI.sendKeys(findTestObject('saucelabs/loginScreen/fieldPassword'), password)
	}

	@And("I click on the signin button")
	def clickOnSigninButton() {
		WebUI.click(findTestObject('saucelabs/loginScreen/btnLogin'))
	}

	@Then("The burger menu button will be displayed")
	def burgerMenuWillBeDisplayed() {
		WebUI.waitForElementVisible(findTestObject('saucelabs/loginScreen/btnBurgerMenu'), 0)
		WebUI.closeBrowser()
	}
}
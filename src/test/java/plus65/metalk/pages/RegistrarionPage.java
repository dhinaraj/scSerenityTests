package plus65.metalk.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrarionPage extends PageObject {
	
    @Override
	public WebDriver getDriver() {
		return super.getDriver();
	}

	public void enterFullName(String fullName) {
		getDriver().findElement(By.name("fullname")).sendKeys(fullName);
	}

	public void enterNickName(String nickName) {
		getDriver().findElement(By.name("nickname")).sendKeys(nickName);
	}

	public void selectGenderMale() {
		Select genderDropDown = new Select(getDriver().findElement(By.name("gender")));
		genderDropDown.selectByIndex(1);
	}
	
	public void enterEmail(String email) {
		getDriver().findElement(By.name("email")).sendKeys(email);
	}

	public void selectExchangeRate() {
		Select exchangeRateDropDown = new Select(getDriver().findElement(By.name("exchange_rate_id")));
		exchangeRateDropDown.selectByVisibleText("SGD");
	}
	
	public void enterNationalId(String nationalId) {
		getDriver().findElement(By.name("national_id")).sendKeys(nationalId);
	}
	
	public void enterState(String state) {
		getDriver().findElement(By.name("state")).sendKeys(state);
	}
	
	public void enterCity(String city) {
		getDriver().findElement(By.name("city")).sendKeys(city);
	}
	
	public void enterAddress(String address) {
		getDriver().findElement(By.name("address")).sendKeys(address);
	}
	
	public void enterPostalCode(String postal_code) {
		getDriver().findElement(By.name("postal_code")).sendKeys(postal_code);
	}
	
	public void enterSecondaryPassword(String secondary_password) {
		getDriver().findElement(By.name("secondary_password")).sendKeys(secondary_password);
	}
	
	
	public void enterSecondaryConfirmPassword(String secondary_password_confirmation) {
		getDriver().findElement(By.name("secondary_password_confirmation")).sendKeys(secondary_password_confirmation);
	}
	
	public void acceptAgreement() {
		getDriver().findElement(By.name("agreement")).click();
	}
	
	public void clickOnSubmit() {
		getDriver().findElement(By.id("submit_btn")).click();
	}
	
	public void enterOTP(String registrationOtp) {
		getDriver().findElement(By.xpath("html/body/div[5]/div/div/div[2]/div/div/input")).sendKeys(registrationOtp);
	}
	
	public void clickOnSubmitRegistration() {
		getDriver().findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[2]")).click();
	}
	
}

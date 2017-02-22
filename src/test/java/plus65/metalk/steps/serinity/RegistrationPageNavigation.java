package plus65.metalk.steps.serinity;


import plus65.metalk.pages.RegistrarionPage;

import net.thucydides.core.annotations.Step;


import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class RegistrationPageNavigation {
	
	RegistrarionPage registrationPage;
	
	
	@Step
	public void completeRegistration(String fullName, String nickName, String email, String nationalId, String state,
			String city, String address, String postal_code, String secondary_password,
			String secondary_password_confirmation, String registrationOtp) throws InterruptedException  {
		registrationPage.enterFullName(fullName);
		registrationPage.enterNickName(nickName);
		registrationPage.selectGenderMale();
		registrationPage.enterEmail(email);
		registrationPage.selectExchangeRate();
		registrationPage.enterNationalId(nationalId);
		registrationPage.enterState(state);
		registrationPage.enterCity(city);
		registrationPage.enterAddress(address);
		registrationPage.enterPostalCode(postal_code);
		registrationPage.enterSecondaryPassword(secondary_password);
		registrationPage.enterSecondaryConfirmPassword(secondary_password_confirmation);
		registrationPage.acceptAgreement();;
		registrationPage.clickOnSubmit();
		
		Thread.sleep(3000);
		
		registrationPage.enterOTP(registrationOtp);
		registrationPage.clickOnSubmitRegistration();

	}
	

}

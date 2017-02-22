package plus65.metalk.scenarios;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import plus65.metalk.steps.serinity.RegistrationPageNavigation;
import plus65.metalk.steps.serinity.SubscriptionPageNavigation;
import plus65.metalk.steps.serinity.UserHomePageNavgation;

@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom(value="PurchaseNewSubscripton.csv") 

public class SponsorBonusDataCreation_Step1 {
	
	
	
	@Steps
	RegistrationPageNavigation registrationNavigation;
	@Steps
	SubscriptionPageNavigation subscriptionNavigation;
	@Steps
	UserHomePageNavgation userHomePageNavigation;

	

	
    @Managed
    WebDriver browser;
    
    /*	
     //  Running with Different Test Data
     */ 
    
    
    @TestData                                               
        public static Collection<Object[]> testData(){
            return Arrays.asList(new Object[][]{
                    {"610533646", "plus65", "Basic", "110502785", "110502785", "secpassword"}
            });
        }

        private final String meTalkId;
        private final String password;
        private final String subscriptionPack;
        private final String captcha = "";
        private final String referrerId ;
        private final String placementID;
        private final String secondaryPassword; 
        public SponsorBonusDataCreation_Step1(String meTalkId, String password, String subscriptionPack,String referrerId, String placementID, String secondaryPassword ) {
        	this.meTalkId = meTalkId;
        	this.password = password;
        	this.subscriptionPack = subscriptionPack;
        	this.referrerId = referrerId;
        	this.placementID = placementID;
        	this.secondaryPassword = secondaryPassword;
        }
    
  /*  private String meTalkId;
    private String password;
    private String captcha;
    private String subscriptionPack;
    private String fullName;
    private String nickName;
    private String email;
    private String nationalId;
    private String state;
    private String city;
    private String address;
    private String postalCode;
    private String secondaryPassword;
    private String secondaryPasswordConfirmation;
    
    public void setmeTalkId(String meTalkId) {
        this.meTalkId = meTalkId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setcaptcha(String captcha) {
        this.captcha = captcha;
    }
    
    
    public void setsubscriptionPack(String subscriptionPack) {
        this.subscriptionPack = subscriptionPack;
    }
    
    
    public void setfullName(String fullName) {
        this.fullName = fullName;
    }
    
    
    public void setnickName(String nickName) {
        this.nickName = nickName;
    }
    
    
    public void setemail(String email) {
        this.email = email;
    }
    
    
    public void setnationalId(String nationalId) {
        this.nationalId = nationalId;
    }
    
    
    public void setstate(String state) {
        this.state = state;
    }
    
    
    public void setcity(String city) {
        this.city = city;
    }
    
    
    public void setaddress(String address) {
        this.address = address;
    }
    
    
    public void setpostal_code(String postalCode) {
        this.postalCode = postalCode;
    }
    
    
    public void setsecondaryPassword(String secondaryPassword) {
        this.secondaryPassword = secondaryPassword;
    }
    
    public void setsecondary_password_confirmation(String secondaryPasswordConfirmation) {
        this.secondaryPasswordConfirmation = secondaryPasswordConfirmation;
    }*/
    
    
	@Test
	public void buyFirstPackage() {
		userHomePageNavigation.isAtLoginPage();
		userHomePageNavigation.login(meTalkId, password, captcha);
		/*registrationNavigation.completeRegistration(fullName, nickName, email, nationalId, state, city, address,
				postalCode, secondaryPassword, secondaryPasswordConfirmation);*/
		subscriptionNavigation.selectFirstPackage(subscriptionPack);
		subscriptionNavigation.enterPurchaseDetails(subscriptionPack, referrerId, placementID, secondaryPassword);
		


	}
    

}

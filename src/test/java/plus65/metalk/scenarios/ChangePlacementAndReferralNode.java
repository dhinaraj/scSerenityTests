package plus65.metalk.scenarios;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import plus65.metalk.steps.serinity.AdminUserPageNavigation;
import plus65.metalk.steps.serinity.ChangeReferralPlacementNavigation;
import plus65.metalk.steps.serinity.RegistrationPageNavigation;
import plus65.metalk.steps.serinity.SubscriptionPageNavigation;
import plus65.metalk.steps.serinity.AdminHomePageNavgation;

@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom(value="PurchaseNewSubscripton.csv") 

public class ChangePlacementAndReferralNode {
	
	
	
	@Steps
	RegistrationPageNavigation registrationNavigation;
	@Steps
	SubscriptionPageNavigation subscriptionNavigation;
	@Steps
	AdminHomePageNavgation adminHomePageNavigation;
	
	@Steps
	AdminUserPageNavigation adminUserPageNavigation;
	
	@Steps
	ChangeReferralPlacementNavigation changeRefPlc;
	

	
    @Managed
    WebDriver browser;
    
    /*	
     //  Running with Different Test Data
     */ 
    
    
    @TestData                                               
        public static Collection<Object[]> testData(){
            return Arrays.asList(new Object[][]{
            	//{"UserID","ReferralID","PlacementID"}
            	{"111123400005","111123400031","111123400031"}
            	
            
            });
        }
        
        private final String adminUserName= "dhina2";
        private final String adminPassword= "casuarina1";
        private final String captcha = "12345";
        private final String userMetalkId;
        private final String referralId ;
        private final String placementId;

        
        public ChangePlacementAndReferralNode(String userMetalkId, String referralId, String placementId ) {
        	this.userMetalkId = userMetalkId;
        	this.referralId = referralId;
        	this.placementId = placementId;
        }
   

	@Test
	// ChangeReferralAndPlacementId
	public void changeReferralAndPlacementNode() throws InterruptedException {
		adminHomePageNavigation.isAtLoginPage();
		adminHomePageNavigation.login(adminUserName, adminPassword, captcha);
		changeRefPlc.changePlacementNode(userMetalkId, placementId);;
		changeRefPlc.changeReferralNode(userMetalkId, referralId);
		Thread.sleep(10000);
	}

}

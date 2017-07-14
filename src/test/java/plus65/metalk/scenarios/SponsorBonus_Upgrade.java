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
import plus65.metalk.steps.serinity.RegistrationPageNavigation;
import plus65.metalk.steps.serinity.SubscriptionPageNavigation;
import plus65.metalk.steps.serinity.UpgradePageNavigation;
import plus65.metalk.steps.serinity.AdminHomePageNavgation;

@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom(value="PurchaseNewSubscripton.csv") 

public class SponsorBonus_Upgrade {
	
	
	
	@Steps
	RegistrationPageNavigation registrationNavigation;
	@Steps
	SubscriptionPageNavigation subscriptionNavigation;
	@Steps
	AdminHomePageNavgation adminHomePageNavigation;
	
	@Steps
	AdminUserPageNavigation adminUserPageNavigation;
	
	@Steps
	UpgradePageNavigation upgradePageNavigation;

	

	
    @Managed
    WebDriver browser;
    
    /*	
     //  Running with Different Test Data
     */ 
    
    
    @TestData                                               
        public static Collection<Object[]> testData(){
            return Arrays.asList(new Object[][]{
            	
            	//Purchase and Upgrade///
            	/*//{"UserID","Referrer","Placement","PacktoBuy","RegistrationOtp","PurcahseOtp", "Current Pack", "New Pack"},
            	{"88880999931","8888099993","8888099993","Alliance","652648","135700", "Entreprenuer", "Professional+"},*/
            	
            	
            	//Only Upgrade///
            	/*//{"UserID","Current Pack", "New Pack", "upgradeOTP"},*/
            	{"1234500011","BA Starter","BA Professional","907892","NO"},
            });
        }
        
        private final String adminUserName= "dhina1";
        private final String adminPassword= "casuarina1";
        private final String captcha = "12345";
       
        private final String meTalkId;
     
        
        
        private final String currentPack;
        private final String newPack;
        private final String upgradeOtp;
        private final String voucherPresent;

     
        
      //Only Upgrade
        public SponsorBonus_Upgrade(String meTalkId, String currentPack, String newPack, String upgradeOtp, String voucherPresent ) {
        	this.meTalkId = meTalkId;
        	this.currentPack=currentPack;
        	this.newPack=newPack;
        	this.upgradeOtp=upgradeOtp;
        	this.voucherPresent=voucherPresent;
        }
    

    private String fullName="Dhinakaran";
    private String nickName="Dhina";
    private  Random rand = new Random(); 
    private  int value = rand.nextInt(500000); 
    private  String emailAppender = Integer.toString(value);
    private  String email ="dhinaplus65testing+"+emailAppender+"@gmail.com";
    private String nationalId="test"+emailAppender;
    private String state="Thailand";
    private String city="Thailand";
    private String address="Thailand";
    private String postalCode="12345";
    private String secondaryPassword="1234qwer";
    private String secondaryPasswordConfirmation="1234qwer";
    
   
	
	@Test
	// Upgrade
	public void upgradePackage() throws InterruptedException {
		adminHomePageNavigation.isAtLoginPage();
		adminHomePageNavigation.login(adminUserName, adminPassword, captcha);
		adminUserPageNavigation.findUser(meTalkId);
		adminUserPageNavigation.login();
		upgradePageNavigation.closeWarning();
		upgradePageNavigation.upgradePackage(currentPack, newPack);
		upgradePageNavigation.enterPurchaseDetails(secondaryPassword, voucherPresent, currentPack);
		upgradePageNavigation.purchasePackage(upgradeOtp);;
		Thread.sleep(10000);
	}

}



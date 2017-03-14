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
            	{"133300100","Entreprenuer","Professional+","461194","Y"},
            	{"133300101","Entreprenuer","Enterprise+","269942","Y"},
            	{"133300102","Entreprenuer","Alliance","719270","NO"},
            	{"133300103","Professional","Enterprise+","390258","NO"},
            	{"133300104","Professional","Alliance","086475","NO"},
            	{"133300105","Enterprise","Alliance","622831","NO"},
            	{"133300106","Entreprenuer+","Professional+","368253","NO"},
            	{"133300107","Entreprenuer+","Enterprise+","534462","NO"},
            	{"133300108","Entreprenuer+","Alliance","491526","NO"},
            	{"133300109","Professional+","Enterprise+","425073","NO"},
            	{"133300110","Professional+","Alliance","635829","NO"},
            	{"133300111","Enterprise+","Alliance","055871","NO"},
            	
            	
            	{"133300117","Entreprenuer","Professional+","174662","Y"},
            	{"133300118","Entreprenuer","Enterprise+","885452","Y"},
            	{"133300119","Entreprenuer","Alliance","654751","NO"},
            	{"133300120","Professional","Enterprise+","133865","NO"},
            	{"133300121","Professional","Alliance","224041","NO"},
            	{"133300122","Enterprise","Alliance","059525","NO"},
            	{"133300123","Entreprenuer+","Professional+","804340","NO"},
            	{"133300124","Entreprenuer+","Enterprise+","615191","NO"},
            	{"133300125","Entreprenuer+","Alliance","305691","NO"},
            	{"133300126","Professional+","Enterprise+","224638","NO"},
            	{"133300127","Professional+","Alliance","733695","NO"},
            	{"133300128","Enterprise+","Alliance","276611","NO"},
            	
            	
            	{"133300134","Entreprenuer","Professional+","239890","Y"},
            	{"133300135","Entreprenuer","Enterprise+","068296","Y"},
            	{"133300136","Entreprenuer","Alliance","338627","NO"},
            	{"133300137","Professional","Enterprise+","837384","NO"},
            	{"133300138","Professional","Alliance","128399","NO"},
            	{"133300139","Enterprise","Alliance","512402","NO"},
            	{"133300140","Entreprenuer+","Professional+","409228","NO"},
            	{"133300141","Entreprenuer+","Enterprise+","962824","NO"},
            	{"133300142","Entreprenuer+","Alliance","518247","NO"},
            	{"133300143","Professional+","Enterprise+","669509","NO"},
            	{"133300144","Professional+","Alliance","550791","NO"},
            	{"133300145","Enterprise+","Alliance","041964","NO"},
            	
            	
            	{"133300151","Entreprenuer","Professional+","665044","Y"},
            	{"133300152","Entreprenuer","Enterprise+","178114","Y"},
            	{"133300153","Entreprenuer","Alliance","752234","NO"},
            	{"133300154","Professional","Enterprise+","632898","NO"},
            	{"133300155","Professional","Alliance","193260","NO"},
            	{"133300156","Enterprise","Alliance","137632","NO"},
            	{"133300157","Entreprenuer+","Professional+","149060","NO"},
            	{"133300158","Entreprenuer+","Enterprise+","536759","NO"},
            	{"133300159","Entreprenuer+","Alliance","222402","NO"},
            	{"133300160","Professional+","Enterprise+","211548","NO"},
            	{"133300161","Professional+","Alliance","651325","NO"},
            	{"133300162","Enterprise+","Alliance","549546","NO"},
            });
        }
        
        private final String adminUserName= "dhina4";
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



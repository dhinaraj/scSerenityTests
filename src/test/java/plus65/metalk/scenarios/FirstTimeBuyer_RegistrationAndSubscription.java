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

public class FirstTimeBuyer_RegistrationAndSubscription {
	
	
	
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
            	
            	
            	{"144400013","311551905","311551905","Enterprise","080435","594057","NO"},
            	{"144400014","144400028","144400028","Enterprise","861295","385786","NO"},
            	{"144400015","144400028","144400028","Enterprise","648658","280234","NO"},
            	{"144400016","144400028","144400028","Enterprise","518982","410030","NO"},
            	{"144400017","144400028","144400028","Enterprise","289737","319375","NO"},
            	{"144400018","144400028","144400028","Enterprise","936970","825230","NO"},
            	{"144400019","144400028","144400028","Enterprise","457686","825230","NO"},
            	{"144400020","144400028","144400028","Enterprise","140006","825230","NO"},
            	{"144400029","144400028","144400028","Enterprise","957755","825230","NO"},
            	{"144400033","144400028","144400028","Enterprise","984957","825230","NO"},
            	{"144400034","144400028","144400028","Enterprise","740438","825230","NO"},
            	{"144400035","144400028","144400028","Enterprise","484142","825230","NO"},
   

            });
        }
        
        private final String adminUserName= "dhina4";
        private final String adminPassword= "casuarina1";
        
       /* private final String adminUserName= "sysadmin88";
        private final String adminPassword= "hellobenjamin";*/
        private final String captcha = "12345";
        private final String meTalkId;
        private final String referrerId ;
        private final String placementID;
        private final String subscriptionPack;
        private final String registrationOtp;
        private final String purchaseOtp;
        private final String voucherApplied;

        
        public FirstTimeBuyer_RegistrationAndSubscription(String meTalkId, String referrerId, String placementID, String subscriptionPack, String registrationOtp, String purchaseOtp, String voucherApplied ) {
        	this.meTalkId = meTalkId;
        	this.subscriptionPack = subscriptionPack;
        	this.referrerId = referrerId;
        	this.placementID = placementID;
        	this.registrationOtp=registrationOtp;
        	this.purchaseOtp=purchaseOtp;
        	this.voucherApplied = voucherApplied;
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
	public void registerUser() throws InterruptedException {
		adminHomePageNavigation.isAtLoginPage();
		adminHomePageNavigation.login(adminUserName, adminPassword, captcha);
		adminUserPageNavigation.findUser(meTalkId);
		adminUserPageNavigation.adjustCredit();
		adminUserPageNavigation.findUser(meTalkId);
		adminUserPageNavigation.login();
		//upgradePageNavigation.closeWarning();
		registrationNavigation.completeRegistration(fullName, nickName, email, nationalId, state, city, address,
			postalCode, secondaryPassword, secondaryPasswordConfirmation, registrationOtp);
		/*subscriptionNavigation.selectFirstPackage(subscriptionPack);
		subscriptionNavigation.enterPurchaseDetails(subscriptionPack, referrerId, placementID, secondaryPassword);
		subscriptionNavigation.purchasePackage(purchaseOtp);*/
		Thread.sleep(5000);

	}
	
	
	//@Test
	public void buyFirstPackage() throws InterruptedException {
		adminHomePageNavigation.isAtLoginPage();
		adminHomePageNavigation.login(adminUserName, adminPassword, captcha);
		adminUserPageNavigation.findUser(meTalkId);
		adminUserPageNavigation.adjustCredit();
		adminUserPageNavigation.findUser(meTalkId);
		adminUserPageNavigation.login();
		subscriptionNavigation.selectFirstPackageOld(subscriptionPack);
		subscriptionNavigation.enterPurchaseDetailsOld(subscriptionPack, referrerId, placementID, secondaryPassword, voucherApplied);
		subscriptionNavigation.purchasePackage(purchaseOtp);
		Thread.sleep(10000);
	}
	
	//@Test
	public void buySecondPackage() throws InterruptedException {
		adminHomePageNavigation.isAtLoginPage();
		adminHomePageNavigation.login(adminUserName, adminPassword, captcha);
		adminUserPageNavigation.findUser(meTalkId);
		adminUserPageNavigation.adjustCredit();
		adminUserPageNavigation.findUser(meTalkId);
		adminUserPageNavigation.login();
		upgradePageNavigation.closeWarning();
		subscriptionNavigation.selectSecondPackAfterCLP(subscriptionPack);
		subscriptionNavigation.enterPurchaseDetailsOld(subscriptionPack, referrerId, placementID, secondaryPassword, voucherApplied);
		subscriptionNavigation.purchasePackage(purchaseOtp);
		Thread.sleep(10000);
	}

}

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
import plus65.metalk.steps.serinity.UserHomePageNavgation;

@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom(value="PurchaseNewSubscripton.csv") 

public class FirstTimeBuyer_RegistrationAndSubscription {
	
	
	
	@Steps
	RegistrationPageNavigation registrationNavigation;
	@Steps
	SubscriptionPageNavigation subscriptionNavigation;
	@Steps
	UserHomePageNavgation userHomePageNavigation;
	
	@Steps
	AdminUserPageNavigation adminUserPageNavigation;

	

	
    @Managed
    WebDriver browser;
    
    /*	
     //  Running with Different Test Data
     */ 
    
    
    @TestData                                               
        public static Collection<Object[]> testData(){
            return Arrays.asList(new Object[][]{

            	
            	//{"444400018","500000001","500000001","Entreprenuer+","143928","200696"},
            	//{"444400017","444400018","444400018","Entreprenuer+","975854","561522"}
            	
            	//{"444400016","444400017","444400017","Professional+","853145","454414"},
            	//{"444400015","444400017","444400016","Professional+","096089","165098"},
            	//{"444400014","444400017","444400015","Entreprenuer+","527113","312661"},
            	//{"444400013","444400017","444400014","Entreprenuer+","810495","817970"},
            	{"444400012","444400017","444400013","Professional+","825429","259602"},
            	{"444400011","444400017","444400012","Professional+","304619","148690"},
            	{"444400010","444400017","444400011","Enterprise+","218926","006515"},
            	{"444400009","444400017","444400010","Enterprise+","979691","346603"},
            	{"444400008","444400017","444400009","Enterprise+","972011","895682"},
            	{"444400007","444400017","444400008","Enterprise+","604246","617588"},
            	{"444400006","444400017","444400007","Enterprise+","287748","793653"},
            	{"444400005","444400017","444400006","Enterprise+","670563","654205"},
            	{"444400004","444400017","444400005","Enterprise+","151120","749410"},
            	{"444400003","444400017","444400004","Alliance","217429","799268"},
            	{"444400002","444400017","444400003","Entreprenuer+","689004","420288"},
            	{"444400001","444400017","444400002","Entreprenuer+","732407","167422"},
            	{"4444000181","444400018","444400018","Alliance","364411","888219"},
            	{"4444000182","444400018","444400018","Alliance","737850","794735"},
            	{"4444000183","444400018","444400018","Alliance","971724","715741"},
            	{"4444000171","444400017","444400017","Alliance","682593","684613"},
            	{"4444000172","444400017","444400017","Alliance","966117","439272"},
            	{"4444000141","444400014","444400014","Alliance","844386","561383"},
            	{"4444000131","444400013","444400013","Alliance","560345","352726"},
            	{"44440001811","4444000181","4444000181","Alliance","343515","207881"},
            	{"44440001821","4444000182","4444000182","Alliance","974224","940412"},
            	{"44440001711","4444000171","4444000171","Alliance","620341","765783"},
            	{"44440001411","4444000141","4444000141","Alliance","036564","949187"}
            });
        }
        
        private final String adminUserName= "dhina2";
        private final String adminPassword= "casuarina1";
        private final String captcha = "12345";
        private final String meTalkId;
        private final String referrerId ;
        private final String placementID;
        private final String subscriptionPack;
        private final String registrationOtp;
        private final String purchaseOtp;

        
        public FirstTimeBuyer_RegistrationAndSubscription(String meTalkId, String referrerId, String placementID, String subscriptionPack, String registrationOtp, String purchaseOtp ) {
        	this.meTalkId = meTalkId;
        	this.subscriptionPack = subscriptionPack;
        	this.referrerId = referrerId;
        	this.placementID = placementID;
        	this.registrationOtp=registrationOtp;
        	this.purchaseOtp=purchaseOtp;
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
		userHomePageNavigation.isAtLoginPage();
		userHomePageNavigation.login(adminUserName, adminPassword, captcha);
		adminUserPageNavigation.findUser(meTalkId);
		adminUserPageNavigation.adjustCredit();
		adminUserPageNavigation.findUser(meTalkId);
		adminUserPageNavigation.login();
		registrationNavigation.completeRegistration(fullName, nickName, email, nationalId, state, city, address,
			postalCode, secondaryPassword, secondaryPasswordConfirmation, registrationOtp);
		/*subscriptionNavigation.selectFirstPackage(subscriptionPack);
		subscriptionNavigation.enterPurchaseDetails(subscriptionPack, referrerId, placementID, secondaryPassword);
		subscriptionNavigation.purchasePackage(purchaseOtp);*/
		Thread.sleep(5000);

	}
	
	
	@Test
	public void buyFirstPackage() throws InterruptedException {
		userHomePageNavigation.isAtLoginPage();
		userHomePageNavigation.login(adminUserName, adminPassword, captcha);
		adminUserPageNavigation.findUser(meTalkId);
		adminUserPageNavigation.login();
		subscriptionNavigation.selectFirstPackage(subscriptionPack);
		subscriptionNavigation.enterPurchaseDetails(subscriptionPack, referrerId, placementID, secondaryPassword);
		subscriptionNavigation.purchasePackage(purchaseOtp);
		Thread.sleep(10000);
	}

}

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
import plus65.metalk.steps.serinity.AdminHomePageNavgation;

@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom(value="PurchaseNewSubscripton.csv") 

public class SponsorBonus_Purchase {
	
	
	
	@Steps
	RegistrationPageNavigation registrationNavigation;
	@Steps
	SubscriptionPageNavigation subscriptionNavigation;
	@Steps
	AdminHomePageNavgation adminHomePageNavigation;
	
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
            	
            	//Purchase///
            	/*//{"UserID","Referrer","Placement","PacktoBuy","RegistrationOtp","PurcahseOtp", voucherApplied},*/
            	//{"7555500001","777700039","777700039","Entreprenuer","480659","480659","N"},
            	/*{"7555500002","777700039","777700039","Entreprenuer","079669","336847","N"},
            	{"8555500002","777700039","777700039", "Basic","875879","624052","N"},		
            	{"9555500002","777700039","777700039","Professional","234671","879846","N"},
            	{"10555500002","777700039","777700039","Enterprise","789474","251748","N"},
            	{"11555500002","777700039","777700039","Alliance","701116","340818","N"},	*/	
            	
            	{"133300044","133300031","133300043","Entreprenuer+","069542","069542","Y"},
            	{"133300045","133300031","133300044","Professional+","827981","827981","Y"},
            	{"133300046","133300031","133300045","Enterprise+","551358","551358","NO"},
            	{"133300047","133300031","133300046","Alliance","448348","448348","NO"},
            	{"133300061","133300048","133300060","Entreprenuer+","542239","542239","Y"},
            	{"133300062","133300048","133300061","Professional+","112551","112551","Y"},
            	{"133300063","133300048","133300062","Enterprise+","986855","986855","NO"},
            	{"133300064","133300048","133300063","Alliance","418638","418638","NO"},
            	{"133300079","133300065","133300078","Professional+","473209","473209","Y"},
            	{"133300080","133300065","133300079","Enterprise+","333253","333253","NO"},
            	{"133300081","133300065","133300080","Alliance","528133","528133","NO"},
            	{"133300095","133300082","133300094","Entreprenuer+","746728","746728","Y"},
            	{"133300096","133300082","133300095","Professional+","675600","675600","Y"},
            	{"133300097","133300082","133300096","Enterprise+","108688","108688","NO"},
            	{"133300098","133300082","133300097","Alliance","273992","273992","NO"},
            	{"133300112","133300099","133300111","Entreprenuer+","225671","225671","Y"},
            	{"133300113","133300099","133300112","Professional+","911073","911073","Y"},
            	{"133300114","133300099","133300113","Enterprise+","716224","716224","NO"},
            	{"133300115","133300099","133300114","Alliance","587179","587179","NO"},
            	{"133300129","133300116","133300128","Entreprenuer+","772281","772281","Y"},
            	{"133300130","133300116","133300129","Professional+","412982","412982","Y"},
            	{"133300131","133300116","133300130","Enterprise+","004568","004568","NO"},
            	{"133300132","133300116","133300131","Alliance","342601","342601","NO"},
            	{"133300146","133300133","133300145","Entreprenuer+","860043","860043","Y"},
            	{"133300147","133300133","133300146","Professional+","595410","595410","Y"},
            	{"133300148","133300133","133300147","Enterprise+","186146","186146","NO"},
            	{"133300149","133300133","133300148","Alliance","191171","191171","NO"},
            	
            	
  
            });
        }
        
        private final String adminUserName= "dhina4";
        private final String adminPassword= "casuarina1";
        private final String captcha = "12345";
        private final String meTalkId;
       
        
        private final String referrerId ;
        private final String placementID;
        private final String subscriptionPack;
        private final String registrationOtp;
        private final String purchaseOtp;
        
        private final String voucherApplied;
        
  

        // Purchase and Upgrade
        public SponsorBonus_Purchase(String meTalkId, String referrerId, String placementID, String subscriptionPack, String registrationOtp,String purchaseOtp, String voucherApplied ) {
        	this.meTalkId = meTalkId;
        	this.subscriptionPack = subscriptionPack;
        	this.referrerId = referrerId;
        	this.placementID = placementID;
        	this.registrationOtp=registrationOtp;
        	this.purchaseOtp=purchaseOtp;
        	this.voucherApplied= voucherApplied;

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
    
   
    
    
	//@Test
	// New User Registration
	public void registerUser() throws InterruptedException {
		adminHomePageNavigation.isAtLoginPage();
		adminHomePageNavigation.login(adminUserName, adminPassword, captcha);
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
	// New User Purchase
	public void buyFirstPackage() throws InterruptedException {
		adminHomePageNavigation.isAtLoginPage();
		adminHomePageNavigation.login(adminUserName, adminPassword, captcha);
		adminUserPageNavigation.findUser(meTalkId);
		adminUserPageNavigation.adjustCredit();
		adminUserPageNavigation.findUser(meTalkId);
		adminUserPageNavigation.login();
		subscriptionNavigation.selectFirstPackage(subscriptionPack);
		subscriptionNavigation.enterPurchaseDetailsOld(subscriptionPack, referrerId, placementID, secondaryPassword, voucherApplied);
		subscriptionNavigation.purchasePackage(purchaseOtp);
		Thread.sleep(10000);
	}
	


}

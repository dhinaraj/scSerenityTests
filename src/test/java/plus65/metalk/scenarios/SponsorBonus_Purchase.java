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
            	
            	/*{"1234500082","1234500081","1234500081","BA Starter","264376","264376","NO"},
            	{"1234500083","1234500081","1234500082","BA Starter","549822","549822","NO"},*/
            	/*{"1234500084","1234500081","1234500083","BA Starter","341039","341039","NO"},
            	{"1234500085","1234500081","1234500084","BA Professional","454543","454543","NO"},
            	{"1234500086","1234500081","1234500085","BA Professional","166806","166806","NO"},
            	{"1234500087","1234500081","1234500086","BA Regional","422859","422859","NO"},
            	{"1234500088","1234500081","1234500087","BA Starter","504596","504596","NO"},
            	{"1234500089","1234500081","1234500088","BA Professional","787719","787719","NO"},
            	{"1234500090","1234500081","1234500089","BA Regional","464919","464919","NO"},
            	{"1234500091","1234500081","1234500090","BA Global","235816","235816","NO"},
            	{"1234500093","1234500092","1234500092","BA Starter","568744","568744","NO"},
            	{"1234500094","1234500092","1234500093","BA Starter","795144","795144","NO"},
            	{"1234500095","1234500092","1234500094","BA Starter","813594","813594","NO"},
            	{"1234500096","1234500092","1234500095","BA Professional","540032","540032","NO"},
            	{"1234500097","1234500092","1234500096","BA Professional","955437","955437","NO"},
            	{"1234500098","1234500092","1234500097","BA Regional","083968","083968","NO"},
            	{"1234500099","1234500092","1234500098","BA Starter","447962","447962","NO"},
            	{"1234500100","1234500092","1234500099","BA Professional","443703","443703","NO"},
            	{"1234500101","1234500092","1234500100","BA Regional","257350","257350","NO"},
            	{"1234500102","1234500092","1234500101","BA Global","556009","556009","NO"},*/
            	/*{"1234500104","1234500103","1234500103","BA Starter","718105","718105","NO"},
            	{"1234500105","1234500103","1234500104","BA Starter","959745","959745","NO"},
            	{"1234500106","1234500103","1234500105","BA Starter","990371","990371","NO"},
            	{"1234500107","1234500103","1234500106","BA Professional","696432","696432","NO"},
            	{"1234500108","1234500103","1234500107","BA Professional","588188","588188","NO"},
            	{"1234500109","1234500103","1234500108","BA Regional","169980","169980","NO"},
            	{"1234500110","1234500103","1234500109","BA Starter","575450","575450","NO"},*/
            	{"1234500111","1234500103","1234500110","BA Professional","040178","040178","NO"},
            	{"1234500112","1234500103","1234500111","BA Regional","238981","238981","NO"},
            	{"1234500113","1234500103","1234500112","BA Global","239048","239048","NO"},
            	{"1234500115","1234500114","1234500114","BA Starter","955953","955953","NO"},
            	{"1234500116","1234500114","1234500115","BA Starter","901556","901556","NO"},
            	{"1234500117","1234500114","1234500116","BA Starter","661778","661778","NO"},
            	{"1234500118","1234500114","1234500117","BA Professional","502390","502390","NO"},
            	{"1234500119","1234500114","1234500118","BA Professional","424328","424328","NO"},
            	{"1234500120","1234500114","1234500119","BA Regional","224710","224710","NO"},
            	{"1234500121","1234500114","1234500120","BA Starter","110366","110366","NO"},
            	{"1234500122","1234500114","1234500121","BA Professional","033100","033100","NO"},
            	{"1234500123","1234500114","1234500122","BA Regional","951291","951291","NO"},
            	{"1234500124","1234500114","1234500123","BA Global","333776","333776","NO"},

            });
        }
        
        private final String adminUserName= "dhina1";
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
    
   
    
    
	@Test
	// New User Registration
	public void registerUser() throws InterruptedException {
		adminHomePageNavigation.isAtLoginPage();
		adminHomePageNavigation.login(adminUserName, adminPassword, captcha);
		adminUserPageNavigation.findUser(meTalkId);
		adminUserPageNavigation.adjustCredit();
		adminUserPageNavigation.findUser(meTalkId);
		adminUserPageNavigation.login();
		/*registrationNavigation.completeRegistration(fullName, nickName, email, nationalId, state, city, address,
			postalCode, secondaryPassword, secondaryPasswordConfirmation, registrationOtp);*/
		subscriptionNavigation.selectFirstPackage(subscriptionPack);
		subscriptionNavigation.enterPurchaseDetails(subscriptionPack, referrerId, placementID, secondaryPassword);
		//Thread.sleep(2000);
		subscriptionNavigation.purchasePackage(purchaseOtp);
		
		
		Thread.sleep(5000);

	}
	
	
	//@Test
	// New User Purchase
	public void buyFirstPackage() throws InterruptedException {
		adminHomePageNavigation.isAtLoginPage();
		adminHomePageNavigation.login(adminUserName, adminPassword, captcha);
		adminUserPageNavigation.findUser(meTalkId);
		/*adminUserPageNavigation.adjustCredit();
		adminUserPageNavigation.findUser(meTalkId);*/
		adminUserPageNavigation.login();
		subscriptionNavigation.selectFirstPackage(subscriptionPack);
		subscriptionNavigation.enterPurchaseDetailsOld(subscriptionPack, referrerId, placementID, secondaryPassword, voucherApplied);
		subscriptionNavigation.purchasePackage(purchaseOtp);
		Thread.sleep(5000);
	}
	


}

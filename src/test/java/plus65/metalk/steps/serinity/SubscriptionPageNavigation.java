package plus65.metalk.steps.serinity;


import plus65.metalk.pages.SubscriptionPage;
import plus65.metalk.pages.AdminHomePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionPageNavigation {
	
	SubscriptionPage subscriptionPage;


	  
	  @Step
	    public void selectFirstPackage(String subscriptionPackage) {
		  subscriptionPage.clickOnSubscription();
		  subscriptionPage.clickOnPlanSubscription();
		  subscriptionPage.clickOnFristTimeSubscription();
		  
		  if (subscriptionPackage.equalsIgnoreCase("Entreprenuer+") )
		  {
			  subscriptionPage.selectEntreprenuerPlusSecurePlan();
		  }
		  
		  if (subscriptionPackage.equalsIgnoreCase("Professional+") )
		  {
			  subscriptionPage.selectProfessionalPlusPlan();
		  }
		  
		  
		  if (subscriptionPackage.equalsIgnoreCase("Enterprise+") )
		  {
			  subscriptionPage.selectEnterprisePlusPlan();
		  }
		  
		  if (subscriptionPackage.equalsIgnoreCase("Alliance") )
		  {
			  subscriptionPage.selectAlliancePlan();;
		  }
	  }

		  
		  @Step
		    public void enterPurchaseDetails(String subscriptionPackage,  String referrerId, String placementID, String secondaryPassword) {
			  
			  String topupCreditAmount;
			  
			  if (subscriptionPackage.equals("Entreprenuer+"))
			  {
				 topupCreditAmount = "3000";
			  subscriptionPage.enterTopupCreditstoUse(topupCreditAmount);
			  }
			  
			  if (subscriptionPackage.equals("Professional+"))
			  {
				  topupCreditAmount = "9900";
			  subscriptionPage.enterTopupCreditstoUse(topupCreditAmount);
			  }
			  
			  if (subscriptionPackage.equals("Enterprise+"))
			  {
				  topupCreditAmount = "16500";
			  subscriptionPage.enterTopupCreditstoUse(topupCreditAmount);
			  }
			  
			  if (subscriptionPackage.equals("Alliance"))
			  {
				  topupCreditAmount = "50000";
			  subscriptionPage.enterTopupCreditstoUse(topupCreditAmount);
			  }
			  
			  subscriptionPage.enterSponsor(referrerId);
			  subscriptionPage.enterPlacement(placementID);
			  subscriptionPage.enterSecondaryPassword(secondaryPassword);
			  subscriptionPage.selectAgree();
			  
	    }
		  
		  @Step
		    public void purchasePackage( String purchaseOtp) throws InterruptedException {
			  
			  subscriptionPage.clickOnPurchase();
			  Thread.sleep(3000);
			  subscriptionPage.enterPurchaseOtp(purchaseOtp);
			  subscriptionPage.clickOnConfirmPurchase();
		 	  
	    }
		  
		  @Step
		    public void clickonCancelPurchase() {
			  
			  subscriptionPage.clickOnCancelPurchaseButton();
		 	  
		 	  
	    }
}

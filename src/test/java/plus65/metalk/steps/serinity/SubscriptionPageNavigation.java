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
		  
		  if (subscriptionPackage.equalsIgnoreCase("BA Starter") )
		  {
			  subscriptionPage.selectPlan1();
		  }
		  
		  if (subscriptionPackage.equalsIgnoreCase("BA Professional") )
		  {
			  subscriptionPage.selectPlan2();
		  }
		  
		  
		  if (subscriptionPackage.equalsIgnoreCase("BA Regional") )
		  {
			  subscriptionPage.selectPlan3();
		  }
		  
		  if (subscriptionPackage.equalsIgnoreCase("BA Global") )
		  {
			  subscriptionPage.selectPlan4();;
		  }
	  }
	  
	  @Step
	    public void selectFirstPackageOld(String subscriptionPackage) {
		  subscriptionPage.clickOnSubscription();
		  subscriptionPage.clickOnPlanSubscription();
		  subscriptionPage.clickOnFristTimeSubscription();
		  
		  if (subscriptionPackage.equalsIgnoreCase("Entreprenuer") )
		  {
			  subscriptionPage.selectPlan1();
		  }
		  
		  if (subscriptionPackage.equalsIgnoreCase("Basic") )
		  {
			  subscriptionPage.selectPlan2();
		  }
		  
		  
		  if (subscriptionPackage.equalsIgnoreCase("Professional") )
		  {
			  subscriptionPage.selectPlan3();
		  }
		  
		  if (subscriptionPackage.equalsIgnoreCase("Enterprise") )
		  {
			  subscriptionPage.selectPlan4();;
		  }
		  
		  if (subscriptionPackage.equalsIgnoreCase("Alliance") )
		  {
			  subscriptionPage.selectPlan5();;
		  }
	  }
	  
	  
	  @Step
	    public void selectSecondPackAfterCLP(String subscriptionPackage) {
		  subscriptionPage.clickOnSubscription();
		  subscriptionPage.clickOnPlanSubscription();
		  subscriptionPage.clickOnFristTimeSubscription();
		  
		  if (subscriptionPackage.equalsIgnoreCase("Entreprenuer") )
		  {
			  subscriptionPage.selectPlan1();
		  }
		  
		  if (subscriptionPackage.equalsIgnoreCase("Basic") )
		  {
			  subscriptionPage.selectPlan1();
		  }
		  
		  
		  if (subscriptionPackage.equalsIgnoreCase("Professional") )
		  {
			  subscriptionPage.selectPlan1();
		  }
		  
		  if (subscriptionPackage.equalsIgnoreCase("Enterprise") )
		  {
			  subscriptionPage.selectPlan1();;
		  }
		  
		  if (subscriptionPackage.equalsIgnoreCase("Alliance") )
		  {
			  subscriptionPage.selectPlan1();;
		  }
	  }

		  
		  @Step
		    public void enterPurchaseDetails(String subscriptionPackage,  String referrerId, String placementID, String secondaryPassword) throws InterruptedException {
			  
			  String topupCreditAmount;
			  
			  if (subscriptionPackage.equalsIgnoreCase("BA Starter"))
			  {
				 topupCreditAmount = "3000";
			  subscriptionPage.enterTopupCreditstoUse(topupCreditAmount);
			  }
			  
			  if (subscriptionPackage.equalsIgnoreCase("BA Professional"))
			  {
				  topupCreditAmount = "9900";
			  subscriptionPage.enterTopupCreditstoUse(topupCreditAmount);
			  }
			  
			  if (subscriptionPackage.equalsIgnoreCase("BA Regional"))
			  {
				  topupCreditAmount = "16500";
			  subscriptionPage.enterTopupCreditstoUse(topupCreditAmount);
			  }
			  
			  if (subscriptionPackage.equalsIgnoreCase("BA Global"))
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
		    public void enterPurchaseDetailsOld(String subscriptionPackage,  String referrerId, String placementID, String secondaryPassword, String voucherApplied) throws InterruptedException {
			  
			  String topupCreditAmount;
			  
			  if (subscriptionPackage.equalsIgnoreCase("BA Starter"))
			  {
				  
				  if (voucherApplied.equalsIgnoreCase("Y"))
				  {
				  topupCreditAmount= subscriptionPage.readAmountToPay();
				  }
				  else
				  {
				   topupCreditAmount = "3000";
				  }
				  
			  subscriptionPage.enterTopupCreditstoUse(topupCreditAmount);
			  }
			  
			  if (subscriptionPackage.equals("Basic"))
			  {
				  if (voucherApplied.equalsIgnoreCase("Y"))
				  {
				  topupCreditAmount= subscriptionPage.readAmountToPay();
				  }
				  else
				  {
				   topupCreditAmount = "3000";
				  }
			  subscriptionPage.enterTopupCreditstoUse(topupCreditAmount);
			  }
			  
			  if (subscriptionPackage.equals("BA Professional"))
			  {
				  if (voucherApplied.equalsIgnoreCase("Y"))
				  {
				  topupCreditAmount= subscriptionPage.readAmountToPay();
				  }
				  else
				  {
				   topupCreditAmount = "9900";
				  }
			  subscriptionPage.enterTopupCreditstoUse(topupCreditAmount);
			  }
			  
			  if (subscriptionPackage.equals("BA Regional"))
			  {
				  if (voucherApplied.equalsIgnoreCase("Y"))
				  {
				  topupCreditAmount= subscriptionPage.readAmountToPay();
				  }
				  else
				  {
				   topupCreditAmount = "16500";
				  }
			  subscriptionPage.enterTopupCreditstoUse(topupCreditAmount);
			  }
			  
			  if (subscriptionPackage.equals("BA Global"))
			  {
				  if (voucherApplied.equalsIgnoreCase("Y"))
				  {
				  topupCreditAmount= subscriptionPage.readAmountToPay();
				  }
				  else
				  {
				   topupCreditAmount = "50000";
				  }
			  subscriptionPage.enterTopupCreditstoUse(topupCreditAmount);
			  }
			  
			  Thread.sleep(2000);
			  subscriptionPage.enterSponsor(referrerId);
			  Thread.sleep(2000);
			  subscriptionPage.enterPlacement(placementID);
			  Thread.sleep(2000);
			 subscriptionPage.enterSecondaryPassword(secondaryPassword);
			 Thread.sleep(2000);
			  subscriptionPage.selectAgree();
			  Thread.sleep(2000);
			  
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

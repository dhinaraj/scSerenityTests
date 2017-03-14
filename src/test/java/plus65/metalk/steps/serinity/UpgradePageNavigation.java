package plus65.metalk.steps.serinity;


import plus65.metalk.pages.AdminHomePage;
import plus65.metalk.pages.UpgradePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class UpgradePageNavigation {
	
	UpgradePage upgradePage;
	
	@Step
	   public void closeWarning() {
		upgradePage.closeWarning();
	    }
	
	 @Step
	    public void upgradePackage(String currentPack, String upgradePack) {
		 upgradePage.clickOnSubscription();
		 upgradePage.clickOnPlanUpgrade();
		 upgradePage.clickOnPlanUpgrade2();
		  
		  if (currentPack.equalsIgnoreCase("Entreprenuer") && upgradePack.equalsIgnoreCase("Professional+") )
		  {
			  upgradePage.selectPlan1();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Entreprenuer") && upgradePack.equalsIgnoreCase("Enterprise+") )
		  {
			  upgradePage.selectPlan2();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Entreprenuer") && upgradePack.equalsIgnoreCase("Alliance") )
		  {
			  upgradePage.selectPlan3();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Basic") && upgradePack.equalsIgnoreCase("Professional+") )
		  {
			  upgradePage.selectPlan1();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Basic") && upgradePack.equalsIgnoreCase("Enterprise+") )
		  {
			  upgradePage.selectPlan2();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Basic") && upgradePack.equalsIgnoreCase("Alliance") )
		  {
			  upgradePage.selectPlan3();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Professional") && upgradePack.equalsIgnoreCase("Enterprise+") )
		  {
			  upgradePage.selectPlan1();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Professional") && upgradePack.equalsIgnoreCase("Alliance") )
		  {
			  upgradePage.selectPlan2();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Enterprise") && upgradePack.equalsIgnoreCase("Alliance") )
		  {
			  upgradePage.selectPlan1();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Entreprenuer+") && upgradePack.equalsIgnoreCase("Professional+") )
		  {
			  upgradePage.selectPlan1();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Entreprenuer+") && upgradePack.equalsIgnoreCase("Enterprise+") )
		  {
			  upgradePage.selectPlan2();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Entreprenuer+") && upgradePack.equalsIgnoreCase("Alliance") )
		  {
			  upgradePage.selectPlan3();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Professional+") && upgradePack.equalsIgnoreCase("Enterprise+") )
		  {
			  upgradePage.selectPlan1();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Professional+") && upgradePack.equalsIgnoreCase("Alliance") )
		  {
			  upgradePage.selectPlan2();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Enterprise+") && upgradePack.equalsIgnoreCase("Alliance") )
		  {
			  upgradePage.selectPlan1();
		  }
		  
	  }
	 
	 
	 @Step
	    public void upgradePackageOld(String currentPack, String upgradePack) {
		 upgradePage.clickOnSubscription();
		 upgradePage.clickOnPlanUpgrade();
		 upgradePage.clickOnPlanUpgrade2();
		 
		  if (currentPack.equalsIgnoreCase("Entreprenuer") && upgradePack.equalsIgnoreCase("Basic") )
		  {
			  upgradePage.selectPlan1();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Entreprenuer") && upgradePack.equalsIgnoreCase("Professional") )
		  {
			  upgradePage.selectPlan2();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Entreprenuer") && upgradePack.equalsIgnoreCase("Enterprise") )
		  {
			  upgradePage.selectPlan3();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Entreprenuer") && upgradePack.equalsIgnoreCase("Alliance") )
		  {
			  upgradePage.selectPlan4();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Basic") && upgradePack.equalsIgnoreCase("Professional") )
		  {
			  upgradePage.selectPlan1();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Basic") && upgradePack.equalsIgnoreCase("Enterprise") )
		  {
			  upgradePage.selectPlan2();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Basic") && upgradePack.equalsIgnoreCase("Alliance") )
		  {
			  upgradePage.selectPlan3();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Professional") && upgradePack.equalsIgnoreCase("Enterprise") )
		  {
			  upgradePage.selectPlan1();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Professional") && upgradePack.equalsIgnoreCase("Alliance") )
		  {
			  upgradePage.selectPlan2();
		  }
		  
		  if (currentPack.equalsIgnoreCase("Enterprise") && upgradePack.equalsIgnoreCase("Alliance") )
		  {
			  upgradePage.selectPlan1();
		  }
		 
		  
	  }

		  
		  @Step
		    public void enterPurchaseDetails(String secondaryPassword, String voucherPresent, String oldPack) {
			  
			  String topupCreditAmount;
			  if (voucherPresent.equalsIgnoreCase("Y") || oldPack.equalsIgnoreCase("Enterprise") )
			  {
			  topupCreditAmount= upgradePage.readAmountToPay2();
			  }
			  else
			  {
				topupCreditAmount= upgradePage.readAmountToPay();
			  }
			  upgradePage.enterTopupCreditstoUse(topupCreditAmount);
			  upgradePage.enterSecondaryPassword(secondaryPassword);
			  upgradePage.selectAgree();
			  
	    }
		  
		  @Step
		    public void purchasePackage( String purchaseOtp) throws InterruptedException {
			  
			  upgradePage.clickOnPurchase();
			  Thread.sleep(3000);
			  upgradePage.enterPurchaseOtp(purchaseOtp);
			  upgradePage.clickOnConfirmPurchase();
		 	  
	    }
		  
		  @Step
		    public void clickonCancelPurchase() {
			  
			  upgradePage.clickOnCancelPurchaseButton();
		 	  
		 	  
	    }
}

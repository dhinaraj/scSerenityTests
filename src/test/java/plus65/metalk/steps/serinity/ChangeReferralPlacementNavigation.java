package plus65.metalk.steps.serinity;


import plus65.metalk.pages.AdminHomePage;
import plus65.metalk.pages.ChangeReferralPlacementPage;
import plus65.metalk.pages.UpgradePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class ChangeReferralPlacementNavigation {
	
	ChangeReferralPlacementPage changeRefPlace;
	
	 @Step
	    public void changeReferralNode(String userMetalkId, String referralId) {
		 changeRefPlace.clickOnReferralNetwork();
		 changeRefPlace.clickOnChangeReferralNetwork();
		 changeRefPlace.enterUserID(userMetalkId);
		 changeRefPlace.enterReferralId(referralId);
		 changeRefPlace.clickOnSaveButton();
	  }
	 
	 
	 @Step
	    public void changePlacementNode(String userMetalkId, String placementId) {
		 changeRefPlace.clickOnReferralNetwork();
		 changeRefPlace.clickOnChangePlacementNetwork();
		 changeRefPlace.enterUserID(userMetalkId);
		 changeRefPlace.enterReferralId(placementId);
		 changeRefPlace.clickOnSaveButton();
	  }

		  
		
}

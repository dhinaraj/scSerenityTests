package plus65.metalk.steps.serinity;


import plus65.metalk.pages.AdminHomePage;
import plus65.metalk.pages.AdminUsersSearchPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class AdminUserPageNavigation {
	
	AdminUsersSearchPage adminSearch;
	
	  @Step
	    public void findUser(String meTalkID) {
		  adminSearch.clickOnUsers();
		  adminSearch.enterMetalkID(meTalkID);
		  adminSearch.clickOnFilterButton();
	    }

	  
	  @Step
	    public void adjustCredit() {
		  adminSearch.clickOnAdjustCreditButton();
		  adminSearch.enterAdditionalTopUpCredit();
		  adminSearch.enterAdditionalAdvCredit();
		  adminSearch.enterRemarks();
		  adminSearch.clickOnSaveCreditChanges();
	    }
	  
	  @Step
	    public void login() {
		  adminSearch.clickOnLoginButton();
	    }
	  
	  
}

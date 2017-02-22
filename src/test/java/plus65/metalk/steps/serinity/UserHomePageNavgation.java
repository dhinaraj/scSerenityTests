package plus65.metalk.steps.serinity;


import plus65.metalk.pages.AdminHomePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class UserHomePageNavgation {
	
	AdminHomePage userHomePage;
	
	  @Step
	    public void isAtLoginPage() {
		  userHomePage.open();
	    }

	  
	  @Step
	    public void login(String meTalkId, String password, String captcha) {
		  userHomePage.enterMeTalkId(meTalkId);
		  userHomePage.enterPassword(password);
		  userHomePage.enterCaptcha(captcha);
		  userHomePage.clickOnLogin();
	    }
}

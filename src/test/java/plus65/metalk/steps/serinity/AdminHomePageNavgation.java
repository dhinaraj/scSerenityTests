package plus65.metalk.steps.serinity;


import plus65.metalk.pages.AdminHomePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class AdminHomePageNavgation {
	
	AdminHomePage adminHomePage;
	
	  @Step
	    public void isAtLoginPage() {
		  adminHomePage.open();
	    }

	  
	  @Step
	    public void login(String meTalkId, String password, String captcha) throws InterruptedException  {
		  adminHomePage.enterMeTalkId(meTalkId);
		  adminHomePage.enterPassword(password);
		 // Thread.sleep(6000);
		 adminHomePage.enterCaptcha(captcha);
		  adminHomePage.clickOnLogin();
	    }
	  

}

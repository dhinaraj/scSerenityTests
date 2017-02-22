package plus65.metalk.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubscriptionPage extends PageObject {
	
    @Override
    public WebDriver getDriver() { return super.getDriver();}
    
    
    



    
    public void clickOnSubscription() { 
    	//To bring the focus on screen after registration
    	
/*		String parentWindow = getDriver().getWindowHandle();
		for(String winHandle : getDriver().getWindowHandles()){
			getDriver().switchTo().window(parentWindow);
		}*/
		
    	//Proceeding to Buy Subscription
    	  WebElement subcriptionLink = getDriver().findElement(By.xpath("//ul/li[2]/a/span[1]"));
    	  Actions builder = new Actions(getDriver());
    	    Action mouseOverSubscription = builder
    	            .moveToElement(subcriptionLink)
    	            .build();
    	mouseOverSubscription.perform();
    }
    public void clickOnPlanSubscription() { 
        WebElement planSubcriptionLink = getDriver().findElement(By.xpath("html/body/header/div[1]/nav/div[2]/ul/li[2]/ul/li/a"));
        
        
        Actions builder = new Actions(getDriver());
        Action mouseOverPlanSubscription = builder
                .moveToElement(planSubcriptionLink)
                .build();
    	mouseOverPlanSubscription.perform();
    }
    public void clickOnFristTimeSubscription() { getDriver().findElement(By.xpath("html/body/header/div[1]/nav/div[2]/ul/li[2]/ul/li/ul/li/a")).click();}

    
    public void selectEntreprenuerPlusSecurePlan(){ getDriver().findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/input[1]")).click();}
    public void selectProfessionalPlusPlan(){ getDriver().findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/input[2]")).click();}
    public void selectEnterprisePlusPlan(){ getDriver().findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/input[3]")).click();}
    public void selectAlliancePlan(){ getDriver().findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/input[4]")).click();}
    public void enterTopupCreditstoUse(String topupCreditAmount){ 
    	getDriver().findElement(By.name("me_points")).clear();
    	getDriver().findElement(By.name("me_points")).sendKeys(topupCreditAmount);}
    public void enterAdvertisingCreditstoUse(String advertisingCreditAmount){ getDriver().findElement(By.name("advertising_credit")).sendKeys(advertisingCreditAmount);}
    public void enterSponsor(String referrerId){ getDriver().findElement(By.name("sponsor")).sendKeys(referrerId);}
    public void enterPlacement(String placementID){ getDriver().findElement(By.name("placement")).sendKeys(placementID);}
    public void enterSecondaryPassword(String secondaryPassword){ getDriver().findElement(By.name("secondary_password")).sendKeys(secondaryPassword);}
    public void selectAgree(){ getDriver().findElement(By.name("agreement")).click();}
    public void clickOnPurchase(){ getDriver().findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[2]/form/div[15]/a[1]")).click();}
    

    public void clickOnCancelPurchaseButton(){ getDriver().findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[1]")).click();}
    
    public void enterPurchaseOtp(String purchaseOtp){ getDriver().findElement(By.xpath("html/body/div[5]/div/div/div[2]/div/div/input")).sendKeys(purchaseOtp);}
    public void clickOnConfirmPurchase(){ getDriver().findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[2]")).click();}
}

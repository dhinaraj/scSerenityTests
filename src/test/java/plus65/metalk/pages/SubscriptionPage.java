package plus65.metalk.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

    
    public void selectPlan1(){ getDriver().findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/input[1]")).click();}
    public void selectPlan2(){ getDriver().findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/input[2]")).click();}
    public void selectPlan3(){ getDriver().findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/input[3]")).click();}
    public void selectPlan4(){ getDriver().findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/input[4]")).click();}
    public void selectPlan5(){ getDriver().findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/input[5]")).click();}
  
    
    public void enterTopupCreditstoUse(String topupCreditAmount){ 
    	//getDriver().findElement(By.name("me_points")).clear();
    	
    	getDriver().findElement(By.name("me_points")).clear();
    	getDriver().findElement(By.name("me_points")).sendKeys(topupCreditAmount);
    	JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
    	jsExecutor.executeScript("$(arguments[0]).change();", getDriver().findElement(By.name("me_points")));

    	
    }
    public void enterAdvertisingCreditstoUse(String advertisingCreditAmount){
    	
    	getDriver().findElement(By.name("advertising_credit")).clear();
    	getDriver().findElement(By.name("advertising_credit")).sendKeys(advertisingCreditAmount);
    	JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
    	jsExecutor.executeScript("$(arguments[0]).change();", getDriver().findElement(By.name("advertising_credit")));
    }
    public void enterBACredit(String advertisingCreditAmount){ 
    	getDriver().findElement(By.name("ba_credit")).clear();
    	getDriver().findElement(By.name("ba_credit")).sendKeys(advertisingCreditAmount);
    	JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
    	jsExecutor.executeScript("$(arguments[0]).change();", getDriver().findElement(By.name("ba_credit")));
    }
    public void enterSponsor(String referrerId){ 
    	
    	getDriver().findElement(By.name("sponsor")).sendKeys(referrerId);
    	JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
    	jsExecutor.executeScript("$(arguments[0]).change();", getDriver().findElement(By.name("sponsor")));
    	}
    public void enterPlacement(String placementID){ 
    	
    	getDriver().findElement(By.name("placement")).sendKeys(placementID);
    	JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
    	jsExecutor.executeScript("$(arguments[0]).change();", getDriver().findElement(By.name("placement")));
    	}
    public String readAmountToPay(){ String amountToPay = getDriver().findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[3]/div/p[2]")).getText(); return amountToPay;}
    public void enterSecondaryPassword(String secondaryPassword){
    	getDriver().findElement(By.name("secondary_password")).sendKeys(secondaryPassword);
    	JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
    	jsExecutor.executeScript("$(arguments[0]).change();", getDriver().findElement(By.name("secondary_password")));}
    public void selectAgree(){ getDriver().findElement(By.name("agreement")).click();}
    public void clickOnPurchase(){ getDriver().findElement(By.partialLinkText("Purchase")).click();}
    
    

    public void clickOnCancelPurchaseButton(){ getDriver().findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[1]")).click();}
    
    public void enterPurchaseOtp(String purchaseOtp){ //getDriver().findElement(By.xpath("html/body/div[5]/div/div/div[2]/div/div/input")).sendKeys(purchaseOtp);
    	getDriver().findElement(By.xpath(".//*[@id='otp_code']/p[1]/input")).sendKeys(purchaseOtp);
    }
    public void clickOnConfirmPurchase(){ getDriver().findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[2]")).click();}
}

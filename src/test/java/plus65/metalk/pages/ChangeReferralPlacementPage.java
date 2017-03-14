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

public class ChangeReferralPlacementPage extends PageObject {
	
    @Override
    public WebDriver getDriver() { return super.getDriver();}
    
 
    public void clickOnReferralNetwork() { 
    	getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div/ul/li[6]/a/span[1]")).click();
    }
    
    public void clickOnChangeReferralNetwork() { 
    	getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div/ul/li[6]/ul/li[3]/a")).click();
    }
    
    public void enterUserID(String userMetalkId) { 
    	getDriver().findElement(By.xpath("html/body/div[3]/div[2]/div/div/form/div[1]/div/input")).sendKeys(userMetalkId);
    }
    
    public void enterReferralId(String ref_plc_id) { 
    	getDriver().findElement(By.xpath("html/body/div[3]/div[2]/div/div/form/div[2]/div/input")).sendKeys(ref_plc_id);
    }
    
    public void clickOnSaveButton() { 
    	getDriver().findElement(By.xpath("html/body/div[3]/div[2]/div/div/form/div[3]/div/button")).click();
    }
    
    public void clickOnChangePlacementNetwork() { 
    	getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div/ul/li[6]/ul/li[4]/a")).click();
    }
    
    
    
   
}

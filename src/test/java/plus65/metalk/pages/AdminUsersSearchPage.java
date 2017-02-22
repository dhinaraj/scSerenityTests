package plus65.metalk.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.Robot;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminUsersSearchPage extends PageObject {
	
    @Override
    public WebDriver getDriver() { return super.getDriver();}
    
 
    
    public void clickOnUsers() { 
    	getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div/ul/li[1]/a")).click();
    	
    }
    
    public void enterMetalkID(String meTalkID) { 
    	getDriver().findElement(By.name("metalk_id")).sendKeys(meTalkID);
    	
    }
    
    public void clickOnFilterButton() { 
    	getDriver().findElement(By.xpath("html/body/div[3]/div[2]/div/div/div[1]/div/div[2]/div/form/div[10]/button")).click();
    	
    }
    
    public void clickOnAdjustCreditButton() { 
    	getDriver().findElement(By.xpath("html/body/div[3]/div[2]/div/div/div[2]/table/tbody/tr[1]/td[15]/a[6]")).click();
    	
    }
    
    public void enterAdditionalTopUpCredit() { 
    	getDriver().findElement(By.name("me_points_adjustment")).clear();
    	getDriver().findElement(By.name("me_points_adjustment")).sendKeys("100");
    	
    }
    
    public void enterRemarks() { 
    	getDriver().findElement(By.name("remarks")).clear();
    	getDriver().findElement(By.name("remarks")).sendKeys("test");
    	
    }
    
    public void clickOnSaveCreditChanges() { 
    	getDriver().findElement(By.xpath("html/body/div[3]/div[2]/div/div/form/div[5]/div/button")).click();
    	
    }
    
    public void clickOnLoginButton() { 
    	getDriver().findElement(By.xpath("html/body/div[3]/div[2]/div/div/div[2]/table/tbody/tr[1]/td[15]/a[1]")).click();
    	
    }
    
    
    
    
}

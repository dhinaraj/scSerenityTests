package plus65.metalk.pages;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://demometalk.plus65.local/admin/login")
//@DefaultUrl("https://192.168.65.162/admin/login")
//@DefaultUrl("https://demometalk2.plus65.local/admin/login")

//@DefaultUrl("https://subscriber.securecom-media.com/admin/login")



public class AdminHomePage extends PageObject{
	
    @Override
    public WebDriver getDriver() { return super.getDriver();}

    public void enterMeTalkId(String id) { getDriver().manage().window().maximize();  getDriver().findElement(By.name("metalk_id")).sendKeys(id);}
    public void enterPassword(String password) {  getDriver().findElement(By.name("password")).sendKeys(password);}
    public void enterCaptcha(String captcha) {  getDriver().findElement(By.name("user-captcha")).sendKeys(captcha);}
    public void clickOnLogin(){  getDriver().findElement(By.xpath("/html/body/div[1]/form/div[5]/div[1]/button")).click();}
    
   
    
    
   
}

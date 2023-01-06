package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ServicesPage extends PageBase{

    public ServicesPage(WebDriver Loginddriver)
    {
        super(Loginddriver);
    }
    WebDriverWait wait = new WebDriverWait(driver, WAIT);
    public void Opensidemenue() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        waitelementToBeClickable(driver.findElement(By.id("insSlctSrvForm:j_idt810:0:j_idt811")));
        WebElement The_Periodic_Inspection_Service=driver.findElement(By.id("insSlctSrvForm:j_idt810:0:j_idt811"));
        clickButton2(The_Periodic_Inspection_Service);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("modal-backdrop fade in")));
        WebElement Support_Visual_Test=driver.findElement(By.id("insSlctSrvForm:j_idt810:7:showInspectionImages"));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("boothSpanText::after")));
        clickButton2(Support_Visual_Test);
        WebElement ContinueButton=driver.findElement(By.xpath("//a[@class='pt-10 btn btn-large proceed-btn btn-containue btn-primary']"));
        scrollDownPage(ContinueButton);
        waitelementToBeClickable(ContinueButton);
        //wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
        clickButton(ContinueButton);
    }
}

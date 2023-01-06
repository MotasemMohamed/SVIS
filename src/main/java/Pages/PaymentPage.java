package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class PaymentPage extends PageBase{

    public PaymentPage(WebDriver Loginddriver)
    {
        super(Loginddriver);
    }
    WebDriverWait wait = new WebDriverWait(driver, WAIT);
    Faker fakerdata = new Faker();
    String phonenumber = fakerdata.number().digits(8).toString();
    public  void paymentmethod() throws AWTException {
        waitForVisibility(driver.findElement(By.id("s2id_payCollectFeesForm:paymentMode:paymentModeField")));
        WebElement paymentmethodButton=driver.findElement(By.id("s2id_payCollectFeesForm:paymentMode:paymentModeField"));
        clickButton(paymentmethodButton);
        List<WebElement> Paymentmethod= driver.findElements(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable']"));
        Paymentmethod.get(0).click();
        waitelementToBeClickable(driver.findElement(By.id("payCollectFeesForm:continue-button")));
        waitForVisibility(driver.findElement(By.xpath("//div[@id='payCollectFeesForm:paymentMode:paymentModePanel']/label[@class='control-label']")));
        waitForVisibility(driver.findElement(By.id("payCollectFeesForm:cashRemainingAmount:cashRemainingAmountPanel")));
        clickButton(driver.findElement(By.id("payCollectFeesForm:continue-button")));
        waitForVisibility(driver.findElement(By.cssSelector("iframe[src='../trs/communicate_certificate_dialog.jsf")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='../trs/communicate_certificate_dialog.jsf']")));
        clickButton(driver.findElement(By.cssSelector("input[name='communicateCertificate:newMobile:newMobileField_editableInput']")));
        SendData(driver.findElement(By.cssSelector("input[name='communicateCertificate:newMobile:newMobileField_editableInput']")),phonenumber);
        clickButton(driver.findElement(By.id("communicateCertificate:continue-button-advance")));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);
        driver.navigate().refresh();
    }
    }


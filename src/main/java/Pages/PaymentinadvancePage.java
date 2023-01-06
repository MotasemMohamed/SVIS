package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentinadvancePage extends PageBase{

    public PaymentinadvancePage(WebDriver Loginddriver)
    {
        super(Loginddriver);
    }
    public void Paidinadvance()
    {
        WebElement PaidinadvanceButton=driver.findElement(By.id("insVhlDetailsForm:redirectPayInAdvance"));
        clickButton(PaidinadvanceButton);
    }
}

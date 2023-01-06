package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver Loginddriver)
    {
        super(Loginddriver);
    }

    public void Login() {
        WebElement Username=driver.findElement(By.id("j_username"));
        WebElement Password= driver.findElement(By.id("j_password"));
        WebElement login= driver.findElement(By.xpath("//input[@value='Login']"));
        SendData(Username,"svis_support");
        SendData(Password,"Qc_123456");
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", login);
    }
}

package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransactionSearchPage extends PageBase{

    public TransactionSearchPage(WebDriver Loginddriver)
    {
        super(Loginddriver);
    }
    Faker fakerdata = new Faker();
    String Chassis = fakerdata.name().firstName();
    public void AddChassis() {
        for (int i=0; i<17;i++ )
        {
            WebElement Chassis1=driver.findElement(By.id("chassis-no-"+i));
            SendData(Chassis1,Chassis);
        }
        WebElement ContinueButton=driver.findElement(By.xpath("(//a[@class='btn btn-primary proceed-btn'])[2]"));
        clickButton(ContinueButton);
    }
}

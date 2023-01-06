package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InspectorQueuePage extends PageBase{

    public InspectorQueuePage(WebDriver Loginddriver)
    {
        super(Loginddriver);
    }

    public void Opensidemenue() {
        WebElement Sidemenue=driver.findElement(By.xpath("//a[@title='القائمة']"));
        WebElement NewInspector=driver.findElement(By.xpath("//a[text()='خدمة فحص المركبات']"));
        clickButton(Sidemenue);
        clickButton(NewInspector);
    }
}

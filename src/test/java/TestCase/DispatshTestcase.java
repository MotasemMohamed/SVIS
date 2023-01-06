package TestCase;

import Pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class DispatshTestcase extends TestBase {

        LoginPage LoginObject;
        InspectorQueuePage InspectorQueueObject;
        ServicesPage ServicesPageObject;
        TransactionSearchPage TransactionSearchObject;
        TransactionDetailsPage TransactionDetailsObject;
        PaymentinadvancePage PaymentinadvanceObject;
        PaymentPage PaymentObject;
        @Test
        public void Dispatsh() throws InterruptedException, AWTException {
            LoginObject= new LoginPage(driver);
            LoginObject.Login();
            //Assert.assertEquals(driver.findElement(By.className("inspector-name")).getText(),"مهندس الدعم");
            InspectorQueueObject = new InspectorQueuePage(driver);
            InspectorQueueObject.Opensidemenue();
            Assert.assertEquals(driver.findElement(By.xpath("//div[@class='box-header grd-white color-silver-dark corner-top']/span")).getText(),"اختيار خدمات Booth 01");
            ServicesPageObject= new ServicesPage(driver);
            ServicesPageObject.Opensidemenue();
            TransactionSearchObject= new  TransactionSearchPage (driver);
            TransactionSearchObject.AddChassis();
            TransactionDetailsObject = new TransactionDetailsPage(driver);
            TransactionDetailsObject.AddVehicleData();
            PaymentObject = new  PaymentPage(driver);
            PaymentObject.paymentmethod();
        }
}

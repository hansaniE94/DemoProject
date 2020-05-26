package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends LoginPage {


    public HomePage(WebDriver driver) {
        super(driver);
    }
    By lblHomePageUserName= By.xpath("//table//tr[@class='heading3']");
    public String getHomePageUserName()
    {
        return driver.findElement(lblHomePageUserName).getText();
    }
}

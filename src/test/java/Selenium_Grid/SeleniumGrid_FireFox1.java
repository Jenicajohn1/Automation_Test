package Selenium_Grid;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.DriverFactory;


public class SeleniumGrid_FireFox1 {
    @Test
    public void executeInDocker(){
        WebDriver driver = DriverFactory.getInstance().getDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}

package Day6_101622;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_FindElement {

    public static void main(String[] args) throws InterruptedException {
        //declare the webdriver manager setup for chrome
        WebDriverManager.chromedriver().setup();
        //define the chorme driver for your test use
        //create an instance for a chrome driver to use for automation
        WebDriver driver = new ChromeDriver();

        // Navigate to chrome yahoo site
        driver.navigate().to("https://www.yahoo.com");

        //Maximize driver
        driver.manage().window().maximize();
        // To allow the browser to wait few seconds
        Thread.sleep(4000);
        //Click on sign in by using xpath text
        driver.findElements(By.xpath("//*[contains(@class,'_yb_sc88r')]")).get(1).click();
        //exit driver
        driver.quit();

    }//end of main

}//end of java class

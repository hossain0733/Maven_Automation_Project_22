package Day5_101522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_xPath_TextContains {

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

        //Click on sign in by using xpath text
        driver.findElement(By.xpath("//*[text() = 'Sign in']")).click();

        // To allow the browser to wait few seconds
        Thread.sleep(4000);

        // Navigate to chrome yahoo site
        driver.navigate().to("https://www.yahoo.com");

        //click the bell icon
        driver.findElement(By.xpath("//*[contains(@class,'rapid-nonanchor')]")).click();

        //exit driver
        driver.quit();

    }//end of main

}//End of java class

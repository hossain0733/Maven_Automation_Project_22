package Day9_102922;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T1_MouseAction_USPS {
    public static void main(String[] args) throws InterruptedException {
        //declare the web-driver manager setup for chrome
        WebDriverManager.chromedriver().setup();
        //define the chrome driver for your test use
        //create an instance for a chrome driver to use for automation
        WebDriver driver = new ChromeDriver();

        // Navigate to chrome yahoo site
        driver.navigate().to("https://www.usps.com");
        Thread.sleep(3000);

        //hover over to send tab
        WebElement sendTab = driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
        //Declare mouse action
        Actions mouseAction = new Actions(driver);
        //hover cursor end with perform
        mouseAction.moveToElement(sendTab).perform();

        Thread.sleep(3000);
        //click on calculate a price using mouse click
        WebElement calculatePrice = driver.findElement(By.xpath("//li[@class='tool-calc']"));
        mouseAction.moveToElement(calculatePrice).click().perform();

        Thread.sleep(2000);
        //double click on usps home logo
        WebElement uspsHome = driver.findElement(By.xpath("//*[@alt='USPS.com home']"));
        //right-clicking on usps home logo
        mouseAction.moveToElement(uspsHome).contextClick().perform();
        //double-clicking on usps home logo
        mouseAction.moveToElement(uspsHome).doubleClick().perform();

    }//end of main
}//end of java class

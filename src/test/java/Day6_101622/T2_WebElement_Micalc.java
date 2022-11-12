package Day6_101622;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_WebElement_Micalc {
    public static void main(String[] args) throws InterruptedException {
        //declare the webdriver manager setup for chrome
        WebDriverManager.chromedriver().setup();
        //define the chorme driver for your test use
        //create an instance for a chrome driver to use for automation
        WebDriver driver = new ChromeDriver();

        // Navigate to chrome yahoo site
        driver.navigate().to("https://www.mlcalc.com");

        //Maximize driver
        driver.manage().window().maximize();
        //wait
        Thread.sleep(3000);
        //clear and enter a new value on purchase price field
        WebElement pPrice = driver.findElement(By.xpath("//*[@name='ma']"));
        //clear the purchase price
        pPrice.clear();
        //put new value in the purchase price
        pPrice.sendKeys("450000");

        //clear and enter new value in downpayment field
        WebElement dPayment = driver.findElement(By.xpath("//*[@name='dp']"));
        //clear down payment
        dPayment.clear();
        //input new amount in dPay
        dPayment.sendKeys("25");
        //exit driver
        driver.quit();
    }//end of main
}//end of java class

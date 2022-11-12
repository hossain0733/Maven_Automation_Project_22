package Day11_110522;

import Reuseable_Liberary.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class T1_WebElements_list {
    WebDriver driver;
    ArrayList<WebElement> totalMenuHeaders, mainMenuHeaders;
    @BeforeSuite
    public void SetChromeDriver() {
        driver = Reusable_Actions.setUpDriver();
        //navigate to usps.com home page
        driver.navigate().to("https://www.usps.com/");
        //store all the elements of the menu header into an arraylist of webelements
        totalMenuHeaders = new ArrayList<>(driver.findElements(By.xpath("//*[@class = 'nav-list']/li")));
    }//end of set driver method
    @AfterSuite
    public void quitTheSession() {
        driver.quit();
    }//end of after suite


    @Test(priority = 1)
    public void tc001_verifyTotalCountOfMenuHeaders(){
        //Print out the count
        System.out.println("The total number of menu header is : " + totalMenuHeaders.size());
    }//end of test 1

    @Test(priority = 2 )
    public void tc002_clickOnTheFirstDropDown(){
        totalMenuHeaders.get(0).click();
    }//end og test 2

    @Test(priority = 3)
    public void tc003_verifyCountOfMainMenuHeaders(){
        mainMenuHeaders = new ArrayList<>(driver.findElements(By.xpath("//*[@class = 'menuheader']")));
        System.out.println("The total number of main menu header is: " + mainMenuHeaders.size());
    }//end of test 3

}//end of java class

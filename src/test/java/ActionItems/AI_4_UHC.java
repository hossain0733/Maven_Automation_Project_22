package ActionItems;

import Reuseable_Liberary.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AI_4_UHC {
    WebDriver driver;
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setUpDriver();
    }//end of set driver method

    @AfterSuite
    public void quitTheSession(){
        driver.quit();
    }//end of after suite

    @Test(priority = 1)
    public void testCase1(){

        driver.navigate().to("https://www.uhc.com");

        Reusable_Actions.clickAction(driver, "//*[@aria-label='Find a doctor']", "Find a doctor");

        Reusable_Actions.scrollByView(driver,"//*[@aria-label='Find a dentist Opens a new window']", "Find a dentist" );

        Reusable_Actions.clickAction(driver,"//*[@aria-label='Find a dentist Opens a new window']", "Find a dentist" );

        Reusable_Actions.switchToTabByIndex(driver, 1);

        Reusable_Actions.clickAction(driver, "//*[@aria-label='Employer and Individual Plans']", "Employer and Individual Plans");

    }//end of test 1

    @Test(priority = 2)
    public void testCase2() throws InterruptedException {
        Reusable_Actions.sendKeysAction(driver, "//*[@id='location']","14301","Zipcode");

        Reusable_Actions.clickAction(driver, "//*[@id='auto_0']", "Area Zipcode");

        Reusable_Actions.clickAction(driver, "//*[text()='Continue']", "continue");

        Reusable_Actions.clickAction(driver, "//*[text()='*National Options PPO 30']", "National Options PPO 30");

        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);

        Reusable_Actions.clickAction(driver, "//*[@data-testid='linked-node-title']", "general dentists");
    }//end of testCase2

    @Test(priority = 3)
    public void testCase3() {
        Reusable_Actions.selectByText(driver,"//*[@data-test-id='radius-miles-dropdown']","4", "Within miles");

        Reusable_Actions.clickAction(driver, "//*[text()='Keller, David, DDS']", "Doctor");

        Reusable_Actions.clickAction(driver, "//*[text()='Save']", "Save");

        String addressValue = driver.findElement(By.xpath("//*[@class='btn-label-wrapper']")).getText();
        //split message to extract out the search number
        String[] splitResult = addressValue.split(" ");

        String milesValue = driver.findElement(By.xpath("//*[@class='block mapLink']")).getText();
        //split message to extract out the search number
        splitResult = milesValue.split(" ");

        String networkValue = driver.findElement(By.xpath("//*[@value='location.inNetwork']")).getText();
        //split message to extract out the search number
        splitResult = networkValue.split(" ");

        System.out.println("Address:" + addressValue + "Miles: " + milesValue + "Network: " + networkValue );

        driver.close();

    }//end of testCase3

    @Test(priority = 4)
    public void testCase4() {
        Reusable_Actions.switchToTabByIndex(driver, 0);

        Reusable_Actions.sendKeysAction(driver, "//*[@id='search-desktop']","doctor","search");

        Reusable_Actions.clickAction(driver, "//*[@id='search_button-desktop']", "Search button");

        String resultValue = driver.findElement(By.xpath("//*[@id='search-results-count__header']")).getText();
        //split message to extract out the search number
        String[] splitResult = resultValue.split("   ");//used 3 spaces so it divides into 2 pieces

        System.out.println("Search Result:" + splitResult[0]);
    }//end of testCase4

}//end of java class


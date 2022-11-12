package Day11_110522;

import Reuseable_Liberary.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T2_Boolean {
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
    public void tc001_verifySignedInOptionIsChecked(){
        //Navigate to yahoo
        driver.navigate().to("https://www.yahoo.com/");
        //click on sign in button
        Reusable_Actions.clickAction(driver, "//*[@class = '_yb_1933e']","sign In Button");
        //verifying signin option is checked
        boolean isSignInChecked = driver.findElement(By.xpath("//*[@id= 'persistent']")).isSelected();
        System.out.println("The checkbox check condition is: " + isSignInChecked);

    }//end of test 1

    @Test(dependsOnMethods = "tc001_verifySignedInOptionIsChecked")
    public void tc002_verifySignedInOptionIsUnChecked(){
        //click on check box to uncheck it
        Reusable_Actions.clickAction(driver, "//*[@class= 'stay-signed-in checkbox-container']", "SignInCheckBox");
        //verifying signin option is checked
        boolean isSignInChecked = driver.findElement(By.xpath("//*[@id= 'persistent']")).isSelected();
        System.out.println("The checkbox check condition is: " + isSignInChecked);

    }//end of test 2
}//end of java class

package Day11_110522;

import Reuseable_Liberary.Reusable_Actions;
import Reuseable_Liberary.Reuseable_Annotations;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static Reuseable_Liberary.Reuseable_Annotations.driver;

public class T3_ReuseableAnnotation_yahoo extends Reuseable_Annotations {
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
}

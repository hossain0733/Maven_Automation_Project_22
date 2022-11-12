package Review_10052022;

public class Review_1005 {

    public static void main(String[] args) {
    //exercise one

        //declare a string array variable
        String[] carBrands;
        //defining car brand values for the linear string array
        carBrands = new String[]{"Toyota","Ferrari","Porsche","B.M.W","Tesla"};
        //Print a value from Car Brands. Array always starts from (0)
int i=0;
        while (i<carBrands.length) {
            System.out.println("Car Brands: " + carBrands[i]);
            //incerment goes at the end
            i++;

        }// end of while loop

    }//end of main


}//end of java class

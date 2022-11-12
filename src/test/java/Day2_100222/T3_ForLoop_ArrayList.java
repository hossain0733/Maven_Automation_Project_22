package Day2_100222;

import java.util.ArrayList;

public class T3_ForLoop_ArrayList {

    public static void main(String[] args) {

        // declare and define the arraylist for zipcode
        ArrayList<String> zipCode = new ArrayList<>();
        //add list of zipcodes
        zipCode.add("11218");
        zipCode.add("11217");
        zipCode.add("11216");
        zipCode.add("11416");
        zipCode.add("14301");
        zipCode.add("14215");
        zipCode.add("14125");
        zipCode.add("10001");

        //call for loop to print out all the zipcode values from the array list
        for (int i=0; i < zipCode.size(); i++) {
            //print out each zipcode automatically
            System.out.println("zip code: " + zipCode.get(i));


        }//end of for loop

    }//end of main

}//end of java class

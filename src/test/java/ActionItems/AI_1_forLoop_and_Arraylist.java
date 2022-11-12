package ActionItems;

import java.util.ArrayList;

public class AI_1_forLoop_and_Arraylist {

    public static void main(String[] args) {
        // create an ArrayList for country
        ArrayList<String> country = new ArrayList<>();
        country.add("Usa");
        country.add("India" );
        country.add("Sri Lanka");
        country.add("Bangladesh");
        country.add("Nepal");

        // create integer ArrayList for CountryCode
        ArrayList<Integer> CountryCode = new ArrayList<>();
        CountryCode.add(1);
        CountryCode.add(997);
        CountryCode.add(110);
        CountryCode.add(880);
        CountryCode.add(60);
        // create a loop through all the value using for loop
        for (int i = 0; i < CountryCode.size(); i++){

            System.out.println("My country name is " + country.get(i) + " and my country code is " + CountryCode.get(i));
        }// end of for loop


    }// end of main method

}// end of java

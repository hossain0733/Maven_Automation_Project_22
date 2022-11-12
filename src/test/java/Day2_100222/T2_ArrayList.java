package Day2_100222;

import java.util.ArrayList;

public class T2_ArrayList {

    public static void main(String[] args) {

    //declare and define an array list of countries
        ArrayList<String> countries = new ArrayList<>();
        //now add the value for countries array
        countries.add("USA");
        countries.add("Bangladesh");
        countries.add("Canada");
        countries.add("Pakistan");
        countries.add("Srilanka");

        //print Bangladesh from countries list
        System.out.println("The country that I will visit next year is: " + countries.get(1));
        //to get a count of countries
        System.out.println("Number of countries in visiting list: " + countries.size());

        // call an integer array list for streetNumber
        ArrayList<Integer> streetNumber = new ArrayList<>();
        streetNumber.add(111);
        streetNumber.add(222);
        streetNumber.add(333);
        System.out.println("The street I wil go to is: " + streetNumber.get(1));


    }//end of main

}//end of java class

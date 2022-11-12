package Day2_100222;

public class T4_WhileLoop_LinearArray {

    public static void main(String[] args) {
        // you can also use arraylist for while loop
        //declare and define linear array for street number
        int[] streetNumber = new int[]{111,222,333,444,555,666,777,888,999};
        //iterate through all street numbers by while loop
        //set the initializer
        int i=0;
        //now set the condition for while loop
        // linear array gets the count by using (.length) command
        while (i < streetNumber.length) {
            System.out.println("street Number: " + streetNumber[i]);
            //incrementation goes at the end for while loop
            i++; // i++ and i+1 is the same thing
        }// end of while loop

    }//end  of main

}//end of java class

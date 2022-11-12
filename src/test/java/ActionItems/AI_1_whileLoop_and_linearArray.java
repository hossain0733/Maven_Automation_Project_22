package ActionItems;

public class AI_1_whileLoop_and_linearArray {

    public static void main(String[] args) {
        // create string array for region
        String[] Region = new String[] {"NY", "NJ", "DC", "CT", "PA", "AL","Manhattan"};

        // create an int array for AreaCode
        int[] AreaCode = new int[] {212, 201, 202, 203, 215, 205, 718};

        // initialize your starting point before calling while loop
        int i = 0;
        // define the end point in while loop
        while (i < AreaCode.length){
            System.out.println("My region is " + Region [i] + " and my area code is " + AreaCode[i]);

            // incrementing
            i = i +1;// i++ and i+1 is the same thing.

        }// end of while loop

    }// end of main method

}//end of Java

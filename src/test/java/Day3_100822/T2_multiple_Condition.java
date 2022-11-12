package Day3_100822;

public class T2_multiple_Condition {

    public static void main(String[] args) {
        //declare three integer variable
        int a, b, c;
        a = 3;
        b = 4;
        c = 9;
        // write multiple conditions that covers a+b>c , a+b<c , a+b=c

        if (a+b<c) {
            System.out.println("a & b is less than c");
        } else if (a+b>c) {
            System.out.println("a & b is grater than c");
        } else {
            System.out.println("a & b is equal to c");
        }// end of conditions

    }// end of main
}// End of java class

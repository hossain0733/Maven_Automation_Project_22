package Day4_100922;

public class T1_SplitCommand {

    public static void main(String[] args) {
        //declare a string variable
        String message = "My name is Shahdat";
        //extract out Shahdat from the string and print it
        //call split message using split array
        String[] splitMessage = message.split(" ");
        System.out.println("Result: " + splitMessage[0]);

        // extracting each character from a string
        String message2 = "abc";
        String[] splitMessage2 = message2.split("");
        System.out.println("Index 2 is: " + splitMessage2[1]);

    }//end of main
}//end of java class

import java.util.Scanner;
public class StarPyramidBuilder {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of levels: ");
        int levels = scanner.nextInt();
        //no need to put a scanner.nextLine(); to consume the enter because there is no other input.

        for (int i = 1; i <= levels; i++) {
            // Print leading spaces
            for (int j = 0; j < levels - i; j++) { //this puts a certain amount of spaces in front of the stars to center it.
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * i - 1; k++) { //this determines the amount of stars what will be entered.
                System.out.print("*");
            }
            // Move to the next line
            System.out.println(); //then after the loop in both cases is iterated, it enters and starts to next number iterated number dependent on input.
        }
    }
}

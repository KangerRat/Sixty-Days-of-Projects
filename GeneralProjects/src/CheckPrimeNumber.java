import java.util.Scanner;
public class CheckPrimeNumber {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int j;
        for (int i = 1; i < number; i++){
            if(i == 2) System.out.println("i");
            if(i % 2 != 0) System.out.println("i");
            if((i == 2) && (i % 2 != 0))  j = i;


        }

//i'll get back to this another day.
    }

}

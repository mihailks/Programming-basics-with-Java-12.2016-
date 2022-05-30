import java.util.Scanner;

public class numberWithWords {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n>=1 && n<=9) {

            if (n == 1) {
                System.out.println("one");
            }
            if (n == 2) {
                System.out.println("two");
            }
            if (n == 3) {
                System.out.println("three");
            }
            if (n == 4) {
                System.out.println("four");
            }
            if (n == 5) {
                System.out.println("five");
            }
            if (n == 6) {
                System.out.println("six");
            }
            if (n == 7) {
                System.out.println("seven");
            }
            if (n == 8) {
                System.out.println("eight");
            }
            if (n == 9) {
                System.out.println("nine");
            }
            //if (n == 10) {
                //System.out.println("ten");
            //}
        }
        else{
            System.out.println("number too big");
        }
}}

import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double m = 0.0;

        if (n <= 100) {
            m = m + 5;
        } else if (n>1000){
            m = n * 0.1 ;
        } else {
            m = n * 0.2;
        }

        if (n%2==0) {
            m += 1;
        }
        else if (n%10==5) {
            m += 2;
        }
        System.out.println(m);
        System.out.println(m + n);

    }
}
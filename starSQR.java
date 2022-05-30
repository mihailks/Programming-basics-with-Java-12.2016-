import java.util.Scanner;

public class starSQR {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int C = N-2;
        String star = "*";
        System.out.println(star.repeat(N));
        for (int i = 1; i<=N-2; i++){
            System.out.print(star);
            System.out.print(" ".repeat(C));
            System.out.println(star);
        }
        System.out.println(star.repeat(N));
    }
}

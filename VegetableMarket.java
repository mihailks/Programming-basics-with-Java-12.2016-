import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();
        double M = scanner.nextDouble();
        int kgZel = scanner.nextInt();
        int kgPlo = scanner.nextInt();

        System.out.println((N*kgZel + M*kgPlo)/1.94);


    }
}

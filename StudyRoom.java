import java.util.Scanner;

public class StudyRoom {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double h = scanner.nextDouble();
        double w = scanner.nextDouble();

        // po shirina
        int broiNaRed = (int) (((w*100 - 100) / 70));
        System.out.println(broiNaRed);

        // brojRedove
        int brojRedove = (int) (h*100 / 120);
        System.out.println(brojRedove);

        System.out.println(broiNaRed * brojRedove - 3);
    }

}

import java.util.Scanner;

public class SmallShop {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();
        String city = scanner.nextLine();
        //double quan = Double.parseDouble(scanner.nextLine());
        //Double prise = 0.0;

        System.out.println(city + " " + item);
        //System.out.println(quan);
        System.out.println(item);


//        if (city.equals("Sofia")) {
//            switch (item){
//                case "cofee":
//                    prise = 0.5;
//                    break;
//                case "water":
//                    prise = 0.8;
//                    break;
//                case "beer":
//                    prise = 1.20;
//                    System.out.println(prise);
//                    break;
//            }
//
//        }
//        System.out.println(prise*quan);
//        System.out.println(city + " " + item);
        
    }
}

package lesson13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vvedite name strany: ");
        Scanner scan = new Scanner(System.in);
        String inputCountry = scan.nextLine();
        AbstractCountry country = null;
        if (inputCountry.equals("Germany")){
            country  = new Germany();
            country.setKurort(40);
            country.setNarod(7000000);
            country.setSquare(400000);
            country.setStolitsa("Berlin");
            country.setVisa(false);
        }
        if (inputCountry.equals("Italy")){
            country  = new Italy();
            country.setKurort(46);
            country.setNarod(5000000);
            country.setSquare(800000);
            country.setStolitsa("Rim");
            country.setVisa(true);
        }
        System.out.println("4to vi hotite ot Country");
        System.out.println("1- Narod");
        System.out.println("2- kurort");
        System.out.println("3- square");
        System.out.println("4- stolitsa");
        System.out.println("5- visa");

        int inputAction = scan.nextInt();

        switch (inputAction){
            case  1: country.printKurorti();
                break;
            case  2:country.printKurorti();
                break;
            case  3: country.printSquare();
                break;
            case  4: country.printCountryName();
                break;
            case  5: country.needVisa();
                break;
                default:
        }
    }
}

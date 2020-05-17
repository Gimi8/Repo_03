package Zadanie7;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcja;
        double x ;
        double wynik;
        do {
            System.out.println("MENU");
            System.out.println("1 - km/h na m/s");
            System.out.println("2 - m/s na km/h");
            System.out.println("0  - KONIEC");
            System.out.print("Dokonaj wyboru");
            opcja = scanner.nextInt();
            switch (opcja) {
                case 1:
                    System.out.print("Podaj wartość : ");
                    x = scanner.nextDouble();
                    wynik = kmh2ms(x);
                    System.out.printf("%.2f km/ h = %.2f m/s", x ,wynik);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Błedna opcja ");
            }

        } while (opcja != 0);


        System.out.println("100 km/h =  " + kmh2ms(100) + " m/s");
        System.out.printf("100 km/h = %.2f ", kmh2ms(100));

    }

    private static double kmh2ms(double kmh) {
        return kmh * 1000 / 3600;
    }


}

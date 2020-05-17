package Zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zakres = scanner.nextInt();
        for (int i = 0; i <zakres ; i++) {
            System.out.println(i);
            if(i % 2 == 0 ) System.out.print(" podzielna przez 2 ");
            if(i % 3 == 0 ) System.out.print(" podzielna przez 3 ");
            if(i % 5 == 0 ) System.out.print(" podzielna przez 5 ");
        }





    }
}

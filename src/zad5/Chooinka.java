package zad5;

public class Chooinka {
    public static void main(String[] args) {
        int s = 3 ;
        int szerokosc = 2 * s + 1 ;
        for (int i = 0; i < s  ; i++) {
            int iloscGwizdek= 2 * i -1 ;
            for (int j = 0; j < (szerokosc - iloscGwizdek) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < iloscGwizdek ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <s ; i++) {
            for (int j = 0; j < szerokosc; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

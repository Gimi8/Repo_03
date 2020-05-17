package zadanie1;

import java.util.Random;
import java.util.Scanner;

public class Tavlica {

    public static final int Size = 5;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int[] tablica = new int[10];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(100);
        }
//           //1.a
//        System.out.println("Liczby losowe");
//        printTabInt(tablica);
//
//        //1.B
//
//        System.out.println("Odwrotna kolejność");
//
//        printBack(tablica);
//        //1.C
////        System.out.println("Nieparzyste pozycje");
////        int i = 0;
////        while (i < tablica.length){
////            if(i % 2 == 1)
////                System.out.print(tablica[1] + " ");
////        }
////        i++;
//
//        //1.E
//        int sum = getSum(tablica);
//        System.out.println(sum);
//
//        //1.I
//        System.out.print(" Podaj liczbę : ");
//        int liczba = scanner.nextInt();
//        for (int j = 0 ; j <tablica.length ; j++){
//            if (tablica[j] % liczba == 0){
//                System.out.println(tablica[j]  + " ");
//            }
//        }
//
//        //1.J
//        System.out.println("Najmniejsza liczba ");
//        System.out.println(" min " + getMin(tablica));

        //2.a
        System.out.println("Tablica DwuWymiarowa");
        int[][] tablicaDwuWym = createTab2D(Size, 0, 40);
        int[][] tablica3 = createTab2D(3);
        //2.B
        System.out.println("Wyswietlanie liczby z tab 2 wymiarowych ");
        printTab2D(tablica3);
        printTab2D(tablicaDwuWym);
        //2.E
        System.out.println("Wiersz z tablicy 2D ");
        int[] w = getRow(tablicaDwuWym, 3);
        if (w != null) printTabInt(w);
        else System.out.println("błędny nr wiersza ");




        //22.A
        //SORTOWANIE BOMBELKOWE
        System.out.println("przed losowaniem: ");
        printTabInt(tablica);
        int tmp;
        System.out.println("po sortowaniu : ");
        for (int i = 0; i <tablica.length- 1 ; i++) {
            for (int j = 0; j < tablica.length - 1 - i ; j++) {
                if (tablica[j] > tablica[j+1] ){
                    tmp = tablica[j];
                    tablica[j] = tablica[j +1 ];
                    tablica[j+1 ] = tmp;
                }
            }
        }
        System.out.println(tablica);
//22.B
        System.out.println("Przed ");
    printTabInt(tablica);
        System.out.println("Po");
        selecionSort(tablica);
        printTabInt(tablica);

    }//END
    // SORTOWANIE
    private static void selecionSort(int[] T ){
        int pmin, tmp;
        for (int j = 0; j <T.length - 1  ; j++) {
           pmin = j;
            for (int i = j + 1 ; i <T.length ; i++) {
                if(T[i] < T[pmin]){
                    pmin = i ;
                }
            }
            tmp = T[pmin];
            T[pmin] = T[j];
            T[j] = tmp;
        }










    }



    private static int[] getRow(int[][] tab, int nr) {
        if (nr >= tab.length) {
            return null;
        }
        int[] row = new int[tab[0].length];
        for (int i = 0; i < tab[0].length; i++) {
            row[i] = tab[nr][i];
        }
        return row;
    }


    private static void printTab2D(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                // System.out.print(tab[i][j] + " ");
                System.out.printf("%3d ", tab[i][j]);
            }
            System.out.println();

        }

    }

    private static int[][] createTab2D(int size, int min, int max) {
        Random random2 = new Random();
        int[][] tablicaDwuWym = new int[Size][Size];
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {
                tablicaDwuWym[i][j] = random2.nextInt(max - min) + min;
            }
        }
        return tablicaDwuWym;
    }

    private static int[][] createTab2D(int size) {
        Random random2 = new Random();
        int[][] tablicaDwuWym = new int[Size][Size];
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {
                tablicaDwuWym[i][j] = random2.nextInt();
            }
        }
        return tablicaDwuWym;
    }


    private static int getMin(int[] T) {
        int pmin = 0;
        int i = 1;
        while (i < T.length) {
            if (T[i] < T[pmin]) {
                pmin = i;

            }
            i++;
        }
        return T[pmin];
    }

    private static int getSum(int[] tablica) {
        System.out.println("Suma wszystkich elementow ");
        int sum = 0;
        for (int x : tablica) {
            sum += x;
        }
        return sum;
    }

    private static void printBack(int[] tablica) {
        for (int i = tablica.length - 1; i >= 0; i--) {

            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }

    private static void printTabInt(int[] tablica) {
        for (int r : tablica) {
            System.out.print(r + " ");
        }
        System.out.println();
    }
}

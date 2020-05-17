public class Rekurencja {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + " ");
        int s = silnia(n);
        System.out.println(s);


    }

    public static int silnia(int n) {
        if (n == 0) return 1;
        return n * silnia(n - 1);
    }
}
//23,e
//22
//
package powern;

public class PowerN {
    /* public static int count8(int n) {
            if (n % 10 == 8) return 1 + count8(n / 10);
            else if (n < 1) return 0;
            else return count8(n / 10);
        }
         */
    public static int powerN(int base, int n) {
        if (n <= 1) return base;
        else return base * powerN(base, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(powern.PowerN.powerN(3, 2));
    }
}

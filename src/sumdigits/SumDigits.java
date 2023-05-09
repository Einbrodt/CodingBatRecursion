package sumdigits;

public class SumDigits {
    public static int sumDigits(int n) {
        if (n > 0) return (n % 10 + sumDigits(n / 10));
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(sumdigits.SumDigits.sumDigits(126));
    }
}

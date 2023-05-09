package counts;

public class Count8 {

    public static int count8(int n) {
        if (n < 1) return 0;
        if (n % 10 == 8 && (n / 10) % 10 == 8) return 2 + count8(n / 10);
        if (n % 10 == 8) return 1 + count8(n / 10);
        return count8(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(count8(8)); // 1
        System.out.println(count8(818)); // 2
        System.out.println(count8(8818)); // 4
    }
}

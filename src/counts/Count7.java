package counts;

public class Count7 {
    public static int count7(int n) {
        if (n % 10 == 7) return 1 + count7(n / 10);
        else if (n < 1) return 0;
        else return count7(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(counts.Count7.count7(717)); // 2
        System.out.println(Count11.count11("11abc11")); // 2
        System.out.println(Count11.count11("111")); // 1
        //System.out.println(Count8.count8(8818));
    }
}

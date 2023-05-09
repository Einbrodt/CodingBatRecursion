package counts;

public class CountX {
    public static int countX(String str) {
        if (str.equals("")) return 0;
        else if (str.charAt(0) == 'x') return 1 + countX(str.substring(1));
        else return countX(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(countX("xxhixx")); // expect 4
    }
}

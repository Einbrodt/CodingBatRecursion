package counts;

public class CountHi {
    public static int countHi(String str) {
        if (str.length() < 2) return 0;
        else if (str.startsWith("hi")) return 1 + countHi(str.substring(1));
        else return countHi(str.substring(1));
    }

    public static int countHi2(String str) {
        if (str.length() <= 1) return 0;
        if (str.substring(0, 2).equals("hi")) return 1 + countHi2(str.substring(2));
        if (str.length() > 2 && str.substring(0, 3).equals("xhi")) return countHi2(str.substring(3));
        return countHi2(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(CountHi.countHi("xhixhix")); //expect 2
        System.out.println(CountHi.countHi2("ahibhi")); // 2

    }
}


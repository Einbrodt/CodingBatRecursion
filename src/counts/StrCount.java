package counts;

public class StrCount {

    public static int strCount(String str, String sub) {
        if (sub.length() > str.length() || str.isEmpty() || sub.isEmpty()) return 0;

        if (str.substring(0, sub.length()).equals(sub)) return 1 + strCount(str.substring(sub.length()), sub);
        return strCount(str.substring(1), sub);
    }

    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat")); // 2
        System.out.println(strCount("catcowcat", "cow")); // 1
        System.out.println(strCount("iiiijj", "ii")); // 2
    }

}

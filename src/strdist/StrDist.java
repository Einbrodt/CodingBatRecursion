package strdist;

public class StrDist {
    public static int strDist(String str, String sub) {
        if (sub.length() > str.length()) return 0;
        boolean equals = str.substring(0, sub.length()).equals(sub);
        if (equals && str.substring(str.length() - sub.length()).equals(sub)) return str.length();
        if (!equals) return strDist(str.substring(1), sub);
        return strDist(str.substring(0, str.length() - 1), sub);
    }

    public static void main(String[] args) {
        System.out.println(strDist("cccatcowcatxx", "cat")); // → 9;
        System.out.println(strDist("catcowcat", "cow")); // → 3);
        System.out.println(strDist("catcowcat", "cat")); // → 9);
    }
}

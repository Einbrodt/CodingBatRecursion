package pairstar;

public class PairStar {
    public static String pairStar(String str) {
        if (str.length() <= 1) return str;
        if (str.charAt(0) == str.charAt(1)) return str.substring(0, 1) + "*" + pairStar(str.substring(1));
        return str.charAt(0) + pairStar(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(pairstar.PairStar.pairStar("hello")); // hel*lo
    }
}

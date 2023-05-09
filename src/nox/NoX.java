package nox;

public class NoX {
    public static String noX(String str) {
        if (str.isEmpty()) return str;
        if (str.charAt(0) == 'x') return "" + noX(str.substring(1));
        return str.charAt(0) + noX(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(NoX.noX("xx")); //expect ""
        System.out.println(nox.NoX.noX("xaxb")); // "ab";
        System.out.println(nox.NoX.noX("abc")); // "abc
    }
}

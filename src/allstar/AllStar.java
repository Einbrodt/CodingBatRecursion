package allstar;

public class AllStar {
    public static String allStar(String str) {
        if (str.length() <= 1) return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(allstar.AllStar.allStar("hello")); //"h*e*l*l*o"
    }
}

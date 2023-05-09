package changes;

public class ChangePi {
    public static String changePi(String str) {
        if (str.length() <= 1) return str;
        if (str.substring(0, 2).equals("pi")) return "3.14" + changePi(str.substring(2));
        return str.charAt(0) + changePi(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(changes.ChangePi.changePi("xpix")); //expect 3.14p
        System.out.println(changePi("xpix")); // x3.14x
    }
}

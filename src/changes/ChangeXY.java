package changes;

public class ChangeXY {
    public static String changeXY(String str) {
        if (str.contains("x")) return changeXY(str.replace('x', 'y'));
        else return str;
    }

    public static void main(String[] args) {
        System.out.println(ChangeXY.changeXY("codex"));
    }
}

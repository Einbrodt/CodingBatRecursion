package bunnyears;

public class BunnyEars {
    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        else if (bunnies % 2 == 0) return 3 + bunnyEars2(bunnies - 1);
        else return 2 + bunnyEars2(bunnies - 1);
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        else return bunnies * 2;
    }

    public static void main(String[] args) {
        System.out.println(BunnyEars.bunnyEars(2));
        System.out.println(bunnyears.BunnyEars.bunnyEars2(2));

    }
}

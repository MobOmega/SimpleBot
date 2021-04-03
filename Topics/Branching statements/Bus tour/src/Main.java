import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridge = scanner.nextInt();
        boolean crash = false;
        for (int i = 0; i < bridge; i++) {
            crash = scanner.nextInt() <= busHeight;
            if (crash) {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            }
        }
        if (!crash) {
            System.out.println("Will not crash");
        }
    }
}
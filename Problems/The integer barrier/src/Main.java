import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yes = 0;
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            if (x == 0) {
                System.out.println(yes);
                break;
            } else {
                yes += x;
            }
            if (yes >= 1000) {
                System.out.println(yes - 1000);
                break;
            }
        }
    }
}

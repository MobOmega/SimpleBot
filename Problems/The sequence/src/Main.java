import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 0;
        int x = 1;
        int z = 0;

        while (i < input) {
            for (int y = 0; y < x; y++) {
                System.out.print(x + " ");
                z++;
                if (z == input) { break; }
            }
            if (z == input) { break; }
            x++;
            i++;
        }

    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num % 2 == 0 && num != 0) {
                System.out.println("even");
            } else if (num % 2 != 0) {
                System.out.println("odd");
            } else if (num == 0) {
                break;
            }
        }
    }
}
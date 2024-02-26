import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n1, n2;

        do {
            System.out.println("1. Sayınızı giriniz : ");
            n1 = scanner.nextInt();
            if (n1 <= 0)
                System.out.println("Lütfen pozitif bir sayı giriniz.");
        } while (n1 <= 0);

        do {
            System.out.println("2. Sayınızı giriniz : ");
            n2 = scanner.nextInt();
            if (n2 <= 0)
                System.out.println("Lütfen pozitif bir sayı giriniz.");
        } while (n2 <= 0);

        int i = 1;
        while (true) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println("Ekok : " +i);
                break;
            }
            i++;

        }
        while (n1 != n2) {
            if (n1 > n2)
                n1 = n1 - n2;
            else
                n2 = n2 - n1;
        }
        System.out.println("Ebob : " + n2);
    }

    }


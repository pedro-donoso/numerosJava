import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.printf("El primer número (%d) es el mayor.%n", a);
        } else if (b >= c) {
            System.out.printf("El segundo número (%d) es el mayor.%n", b);
        } else {
            System.out.printf("El tercer número (%d) es el mayor.%n", c);
        }
        sc.close();
    }
}
import java.util.*; 

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum=" + sum); // Concatenate "Sum=" and sum using +
        sc.close();
    }
}
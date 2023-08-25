import java.util.Scanner;

public class Triangulos {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("a: ");
        double lado_a = scanner.nextDouble();

        System.out.print("b: "); 
        double lado_b = scanner.nextDouble();

        System.out.print("c: ");
        double lado_c = scanner.nextDouble();
        
        if (lado_a + lado_b <= lado_c || lado_a + lado_c <= lado_b || lado_b + lado_c <= lado_a) {
        System.out.println("No es un triángulo válido");
        } else if (lado_a == lado_b && lado_b == lado_c) {
        System.out.println("El triángulo es equilátero"); 
        } else if (lado_a == lado_b || lado_b == lado_c || lado_a == lado_c) {
        System.out.println("El triángulo es isósceles");
        } else {
        System.out.println("El triángulo es escaleno");
        }

    }
    }
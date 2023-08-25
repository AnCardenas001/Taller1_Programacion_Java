import java.util.Scanner;

public class Bisiestos {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();

        if (año % 4 == 0 && año % 100 != 0) { 
            System.out.println("Es bisiesto");
        } else if (año % 400 == 0) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }

}

import java.util.Scanner;

public class Tenis {

    public static void main(String[] args) throws Exception {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Juegos ganados por A: ");
        a = scanner.nextInt();
        System.out.print("Juegos ganados por B: ");
        b = scanner.nextInt();

        if ((a > 7 || b > 7)||(a == 7 && b == 7)) 
        {
            System.out.println("Inválido");
        }
        else if (a == 6 && b < 5) 
        {
            System.out.println("Ganó A");
        }
        else if (b == 6 && a < 5) 
        {
            System.out.println("Ganó B");
        }
        else if ( a >= 5 && b == 7) 
        {
            System.out.println("Ganó B");
        }
        else if ( b >= 5 && a == 7) 
        {
            System.out.println("Ganó A");
        }
        else if ( (a < 6 && b < 6) && (Math.abs(a-b)<2)) 
        {
            System.out.println("Aún no termina");
        }
        else {
            System.out.println("Inválido");
        }
    }
}

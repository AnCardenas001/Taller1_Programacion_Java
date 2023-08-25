import java.util.Scanner;

public class Ordenamiento {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[4];

        System.out.println("Ingrese 4 números: ");
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int guardar = 0;
            for(int i = 0; i < numeros.length; i++) {
                for(int j = i + 1; j < numeros.length; j++) {
                    if(numeros[i] > numeros[j]) {
                        guardar = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = guardar;
                    }
                }
            }
        System.out.print("El orden es: ");
        for(int i = 0; i < 4; i++) {
            System.out.print(numeros[i] +", ");
        }

        
    }
}

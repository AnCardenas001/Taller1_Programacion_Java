public class Division {
    
    public static void main(String[] args) throws Exception {

        int dividendo = 0;
        int divisor = 0;

        System.out.print("Dividendo: ");
        dividendo = Integer.parseInt(System.console().readLine());

        System.out.print("Divisor: ");
        divisor = Integer.parseInt(System.console().readLine());

        if (dividendo % divisor == 0) {
            System.out.println("La división es exacta.");
        } else {
            System.out.println("La división no es exacta.");
        }

        int cociente = dividendo / divisor;
        int residuo = dividendo % divisor;

        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);

    }
}

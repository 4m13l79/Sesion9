import java.util.Scanner;
public class Programa03 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de personas: ");
        int n = scanner.nextInt();
        double[] compras = new double[n];
        double total = 0;
        double compraMayor = Double.MIN_VALUE;
        double compraMenor = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la compra de la persona " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
            total += compras[i];
            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }
        double promedio = total / n;
        System.out.println("Total de las compras: " + total);
        System.out.println("Promedio de las compras: " + promedio);
        System.out.println("Compra mayor: " + compraMayor);
        System.out.println("Compra menor: " + compraMenor);
        scanner.close();
    }
}

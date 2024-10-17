import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el número de personas: ");
        int n = lectura.nextInt();
        double[] pesos = new double[n];
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = lectura.nextDouble();
            suma += pesos[i]; // Acumular la suma de los pesos
        }
        double promedio = suma / n;
        System.out.println("El peso promedio de las personas es: " + promedio);
        lectura.close();
    }
}

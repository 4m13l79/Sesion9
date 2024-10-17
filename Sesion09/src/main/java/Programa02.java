import java.util.Scanner;
public class Programa02 {
     public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el número de personas: ");
        int n = lectura.nextInt();
        double[] ingresos = new double[n];
        double suma = 0;
        double ingresoMayor = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = lectura.nextDouble();
            suma += ingresos[i];
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }
        double promedio = suma / n;
        System.out.println("El ingreso promedio de las personas es: " + promedio);
        System.out.println("El ingreso mayor de las personas es: " + ingresoMayor);
        lectura.close();
    }
}

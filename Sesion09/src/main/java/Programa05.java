import java.util.Scanner;
public class Programa05 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese 5 valores para el arreglo a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Valor " + (i + 1) + " para a: ");
            a[i] = lectura.nextInt();
        }
        System.out.println("Ingrese 5 valores para el arreglo b:");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Valor " + (i + 1) + " para b: ");
            b[i] = lectura.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            c[2 * i] = a[i];
            c[2 * i + 1] = b[i];
        }
        System.out.println("Valores intercalados en el arreglo c:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        lectura.close();
    }
}

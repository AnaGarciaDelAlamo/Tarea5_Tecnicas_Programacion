import java.util.Scanner;
public class Ejercicio3 {
    /*Producir un algoritmo agregando notas en una tabla. Al final, mostrar todas las calificaciones y su media.

Ejemplo de ejecución del algoritmo:

¿Nota?

12

¿Nota?

15

¿Nota?

8

¿Nota?

7

¿Nota?

-1

La media de las notas (12; 15; 8; 7) es 10,5.*/

    public void notaMedia(){
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[10];
        int valor =0;
        int suma = 0;
        int contador = 0;
        while (valor != -1) {
            System.out.println("¿Nota?");
            valor = sc.nextInt();
            if (valor >= 0 && valor <= 10) {
                tabla[contador] = valor;
                suma += valor;
                contador++;
            }
        }
        System.out.print("La media de las notas (");
        for (int i = 0; i < contador; i++) {
            System.out.print(tabla[i]);
            if (i < contador - 1) {
                System.out.print("; ");
            }
        }
        System.out.println(") es " + (double) suma / contador);
    }

}


import java.util.Scanner;
public class Ejercicio8 {
    /*Realizar un algoritmo que permita jugar a los barcos con las siguientes simplificaciones:

Solo hay un jugador.

Solo hay cuatro filas y cuatro columnas.

Solo hay un barco que ocupa una única celda (este espacio se elige al azar).

Ejemplo de ejecución:

????

????

????

????

¿Qué columna? 2
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TAMAÑO = 4;
        int i, j;
        int[][] tab2d = new int[TAMAÑO][TAMAÑO];


        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO; i++) {
                System.out.print(tab2d[j][i] + "?");
            }
            System.out.println();


            System.out.println("¿Qué columna? ");
            int columna = sc.nextInt();
            System.out.println("¿Qué fila? ");
            int fila = sc.nextInt();
            if (tab2d[fila][columna] == 0) {
                System.out.println("Agua");
                System.out.println(tab2d[fila][columna]);
            } else {
                System.out.println("Tocado");
                System.out.println(tab2d[fila][columna]);
            }

            if (tab2d[fila][columna] == 1) {
                System.out.println("Hundido");
                System.out.println(tab2d[fila][columna]);
            }
            System.out.println();
        }
    }
}

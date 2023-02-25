
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
        int[][] tab2d = new int[4][4];
        for(int i = 0; i < tab2d.length; i++) {
            for(int j = 0; j < tab2d[i].length; j++) {
                tab2d[i][j] = Math.random() < 0.5 ? 0 : 1;
            }
        }

        for(int i = 0; i < tab2d.length; i++) {
            for(int j = 0; j < tab2d[i].length; j++) {
                System.out.print(tab2d[i][j]);
            }
            System.out.println();
        }
        boolean terminar = false;

        do{

            System.out.println("¿Qué columna? ");
            int columna = sc.nextInt();
            System.out.println("¿Qué fila? ");
            int fila = sc.nextInt();
            if (tab2d[fila][columna] == 0) {
                System.out.println("Agua");
                System.out.println(tab2d[fila][columna]);
                terminar = false;
            } else {
                System.out.println("Tocado");
                System.out.println(tab2d[fila][columna]);
                terminar = false;
            }

            if (tab2d[fila][columna] == 1) {
                System.out.println("Hundido");
                System.out.println("Ha ganado");
                System.out.println(tab2d[fila][columna]);
                terminar = true;
            }
            System.out.println();

        }while(terminar == false);

    }
}

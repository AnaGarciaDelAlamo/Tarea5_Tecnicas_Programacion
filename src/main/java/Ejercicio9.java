import java.util.Scanner;

public class Ejercicio9 {
    /*rear un algoritmo para jugar a tres en raya: en una cuadrícula de tres celdas por tres, los jugadores se turnan para escribir su símbolo (X y O) en una celda vacía. El primer jugador que logre alinear (en fila, columna o diagonal) tres de sus símbolos, gana.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tablero = new char[3][3];
        int i, j;
        for (j = 0; j < 3; j++) {
            for (i = 0; i < 3; i++) {
                tablero[j][i] = ' ';
            }
        }
        int turno = 0;
        while (true) {
            System.out.println("Turno del jugador " + (turno % 2 + 1));
            System.out.println("Indicar fila:");
            int fila = sc.nextInt();
            System.out.println("Indicar columna:");
            int columna = sc.nextInt();
            if (tablero[fila][columna] == ' ') {
                if (turno % 2 == 0) {
                    tablero[fila][columna] = 'X';
                } else {
                    tablero[fila][columna] = 'O';
                }
                turno++;
            } else {
                System.out.println("Casilla ocupada");
            }
            for (j = 0; j < 3; j++) {
                for (i = 0; i < 3; i++) {
                    System.out.print(tablero[j][i] + " ");
                }
                System.out.println();
            }
            if (tablero[0][0] == tablero[0][1] && tablero[0][1] == tablero[0][2] && tablero[0][0] != ' ') {
                System.out.println("Gana el jugador " + (turno % 2 + 1));
                break;
            }
            if (tablero[1][0] == tablero[1][1] && tablero[1][1] == tablero[1][2] && tablero[1][0] != ' ') {
                System.out.println("Gana el jugador " + (turno % 2 + 1));
                break;
            }
            if (tablero[2][0] == tablero[2][1] && tablero[2][1] == tablero[2][2] && tablero[2][0] != ' ') {
                System.out.println("Gana el jugador " + (turno % 2 + 1));
                break;
            }
        }
    }
}

public class Ejercicio6 {
    /*¿Qué contiene la tabla generada por el algoritmo siguiente?

Algo QueHace
# ??
Constante TAMAÑO       : entero <- 3
Variable i, j, val: entero
Variable tab2d: entero[TAMAÑO][TAMAÑO]
Inicio
 val <- 1
 Para j <- 0 a TAMAÑO - 1
   Para i <- 0 a TAMAÑO - 1
     tab2d[j][i] <- val
     val <- val + 1
   FPara
 FPara
Fin
Modificar el algoritmo anterior para que la tabla tenga cuatro filas y cuatro columnas con los valores de uno a dieciséis, completando en primer lugar la primera columna, luego la segunda, posteriormente la tercera y por último la cuarta.

Modificar el algoritmo nuevamente, para tener los siguientes valores en la tabla:

0

1

2

3

1

2

3

4

2

3

4

5

3

4

5

6*/
public void queHace(){
    int TAMAÑO = 3;
    int i, j, val;
    int[][] tab2d = new int[TAMAÑO][TAMAÑO];
    val = 1;
    for (j = 0; j < TAMAÑO; j++) {
        for (i = 0; i < TAMAÑO; i++) {
            tab2d[j][i] = val;
            val = val + 1;
        }
    }
    for (j = 0; j < TAMAÑO; j++) {
        for (i = 0; i < TAMAÑO; i++) {
            System.out.print(tab2d[j][i] + " ");
        }
        System.out.println();
    }
}
}

import java.util.Scanner;
public class Ejercicio2 {
    /*Realizar un algoritmo que haga que el usuario introduzca tantas cifras comprendidas entre cero y nueve como desee. Una vez que el usuario ha terminado su serie introduciendo -1, el algoritmo muestra el número de veces que se ha escrito cada dígito.

Ejemplo de ejecución:

Indicar un valor comprendido entre 0 y 9 o -1 para terminar:

2

Otro valor, por favor o -1 para terminar...

9

Otro valor, por favor o -1 para terminar...

2

Otro valor, por favor o -1 para terminar...

2

Otro valor, por favor o -1 para terminar...

0

Otro valor, por favor o -1 para terminar...

-1

Cantidad de 0: 1

Cantidad de 1: 0

Cantidad de 2: 3

Cantidad de 3: 0

Cantidad de 4: 0

Cantidad de 5: 0

Cantidad de 6: 0

Cantidad de 7: 0

Cantidad de 8: 0

Cantidad de 9: 1*/

    public void numOcurrencias(){
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[10];
        int valor =0;
        while (valor != -1) {
            System.out.println("Indicar un valor comprendido entre 0 y 9 o -1 para terminar:");
            valor = sc.nextInt();
            if (valor >= 0 && valor <= 9) {
                tabla[valor]++;
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Cantidad de " + i + ": " + tabla[i]);
        }

    }
}

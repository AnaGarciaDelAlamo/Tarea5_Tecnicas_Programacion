public class Ejercicio1 {
    //Crear un algoritmo escribiendo los valores comprendidos entre diez y cero en orden descendente en una tabla, y posteriormente recorrer esta tabla para mostrar la cuenta hacia atrás.

    public void tabla(){
        int[] tabla = new int[11];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = 10 - i;
        }
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(tabla[i]);
        }

    }
}

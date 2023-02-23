import java.util.Scanner;

public class Ejercicio5 {
    /*Un palíndromo es una palabra cuyo orden de letras sigue siendo el mismo si se lee de izquierda a derecha o de derecha a izquierda. Ejemplos: Kayak, Ana, radar, rotor, etc.

Escriba un algoritmo que pida al usuario una palabra sin acento, en minúsculas y seguida de un carácter en particular para indicar el final (# por ejemplo), y que le diga al usuario si esta palabra es un palíndromo.

Ejemplo de ejecución:

Escriba una palabra y después #

kayak#

kayak es un palíndromo*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una palabra y después #");
        String palabra = sc.nextLine();
        String palabraSinAcentos = palabra.replaceAll("[áéíóú]", "");
        String palabraSinAcentosYEnMinusculas = palabraSinAcentos.toLowerCase();
        String palabraSinAcentosYEnMinusculasYSinCaracterFinal = palabraSinAcentosYEnMinusculas.substring(0, palabraSinAcentosYEnMinusculas.length() - 1);
        String palabraSinAcentosYEnMinusculasYSinCaracterFinalAlReves = new StringBuilder(palabraSinAcentosYEnMinusculasYSinCaracterFinal).reverse().toString();
        if (palabraSinAcentosYEnMinusculasYSinCaracterFinal.equals(palabraSinAcentosYEnMinusculasYSinCaracterFinalAlReves)) {
            System.out.println(palabraSinAcentosYEnMinusculasYSinCaracterFinal + " es un palíndromo");
        } else {
            System.out.println(palabraSinAcentosYEnMinusculasYSinCaracterFinal + " no es un palíndromo");
        }
    }
}

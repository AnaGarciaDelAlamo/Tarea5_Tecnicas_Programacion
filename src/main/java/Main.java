import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int option = 0;
        try (Scanner sc = new Scanner(System.in)){
            do{
                menuPrincipal();
                try{
                    option = sc.nextInt();
                }catch (InputMismatchException ex){
                    sc.next();
                    option = -1;
                }
                switch (option){
                    case 0:
                        System.out.println("Adiós");
                        return;
                    case 1:
                        System.out.println("Ejercicio 1");
                        Ejercicio1 ejercicio1 = new Ejercicio1();
                        ejercicio1.tabla();
                        break;
                    case 2:
                        System.out.println("Ejercicio 2");
                        Ejercicio2 ejercicio2 = new Ejercicio2();
                        ejercicio2.numOcurrencias();
                        break;
                    case 3:
                        System.out.println("Ejercicio 3");
                        Ejercicio3 ejercicio3 = new Ejercicio3();
                        ejercicio3.notaMedia();
                        break;
                    case 4:
                        System.out.println("Ejercicio 4");
                        Ejercicio4 ejercicio4 = new Ejercicio4();
                        ejercicio4.maquinaVotar();
                        break;
                    case 5:
                        System.out.println("Ejercicio 5");
                        Ejercicio5 ejercicio5 = new Ejercicio5();
                        ejercicio5.palindromo();
                        break;
                    case 6:
                        System.out.println("Ejercicio 6");
                        Ejercicio6 ejercicio6 = new Ejercicio6();
                        ejercicio6.queHace();
                        break;
                    case 7:
                        System.out.println("Ejercicio 7");
                        Ejercicio7 ejercicio7 = new Ejercicio7();
                        ejercicio7.matriz();
                        break;
                    case 8:
                        System.out.println("Ejercicio 8");
                        Ejercicio8 ejercicio8 = new Ejercicio8();
                        ejercicio8.juego();
                        break;
                    case 9:
                        System.out.println("Ejercicio 9");
                        Ejercicio9 ejercicio9 = new Ejercicio9();
                        ejercicio9.tresEnRaya();
                        break;
                    case 10:
                        System.out.println("Ejercicio 10");
                        Ejercicio10 ejercicio10 = new Ejercicio10();
                        ejercicio10.registroEmpleados();
                        break;

                }
            }while(option >=0 || option < 11);

        }catch (InputMismatchException ex){
            System.out.println("Error en el dato introducido");
        }
    }


    private static void menuPrincipal(){
        System.out.println("Seleccione una opción: ");
        System.out.println("0.- Salir");
        System.out.println("1.- Ejercicio 1");
        System.out.println("2.- Ejercicio 2");
        System.out.println("3.- Ejercicio 3");
        System.out.println("4.- Ejercicio 4");
        System.out.println("5.- Ejercicio 5");
        System.out.println("6.- Ejercicio 6");
        System.out.println("7.- Ejercicio 7");
        System.out.println("8.- Ejercicio 8");
        System.out.println("9.- Ejercicio 9");
        System.out.println("10.- Ejercicio 10");
    }
}

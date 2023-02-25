import java.util.Scanner;

public class Ejercicio4 {
   /*Cree un algoritmo que pida a los usuarios que voten (los usuarios se turnarán para usar su máquina de votación). Se proponen varios candidatos. Al final del día, el presidente de la mesa de votación introduce un código especial para finalizar la votación (68753421) y se muestran los resultados. Eso sí, este ejercicio es teórico, ya que la seguridad no está garantizada y un usuario puede votar varias veces...

Ejemplo de ejecución del algoritmo:

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[4];
        int valor;
        try{
        do{

            System.out.println("Elija entre: ");
            System.out.println("1 - Emilia TERREROS");
            System.out.println("2 - Gerardo ESCODAR");
            System.out.println("3 - María AGUAVIVA");
            System.out.println("4 - Nadia LETUX");

            valor = sc.nextInt();

            switch (valor){
                case 1:
                    System.out.println("Ha votado a Emilia TERREROS");
                    tabla[0]++;
                    break;
                case 2:
                    System.out.println("Ha votado a Gerardo ESCODAR");
                    tabla[1]++;
                    break;
                case 3:
                    System.out.println("Ha votado a María AGUAVIVA");
                    tabla[2]++;
                    break;
                case 4:
                    System.out.println("Ha votado a Nadia LETUX");
                    tabla[3]++;
                    break;
            }


        }while (valor != 68753421);
        }catch (Exception e){
            System.out.println("Ha introducido un valor incorrecto");
        }
        System.out.println("Ha finalizado la votación");
        System.out.println("Emilia TERREROS ha obtenido " + tabla[0] + " votos");
        System.out.println("Gerardo ESCODAR ha obtenido " + tabla[1] + " votos");
        System.out.println("María AGUAVIVA ha obtenido " + tabla[2] + " votos");
        System.out.println("Nadia LETUX ha obtenido " + tabla[3] + " votos");
    }
}
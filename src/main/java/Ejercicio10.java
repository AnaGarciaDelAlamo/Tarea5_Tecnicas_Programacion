public class Ejercicio10 {
    /*Los empleados de una cierta compañía se representan en la base de datos de la compañía por su nombre,número de empleado y número de la seguridad social.Construir una estructura de tablas hash que permita acceder al registro de un empleado por cualquiera de estos tres datos.(Nota:No se dispone de memoria suficiente para duplicar los registros de los empleados).
     */

    String nombre;
    int numeroEmpleado;
    int numeroSeguridadSocial;

    public Ejercicio10() {
    }

    /*public Ejercicio10(String nombre, int numeroEmpleado, int numeroSeguridadSocial) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }*/

        public void registroEmpleados(){
            Ejercicio10[] empleados = new Ejercicio10[10];
            Ejercicio10[] hashNombre = new Ejercicio10[10];
            Ejercicio10[] hashNumEmpleado = new Ejercicio10[10];
            Ejercicio10[] hashNumSS = new Ejercicio10[10];
            for (int i = 0; i < empleados.length; i++) {
                hashNombre[empleados[i].nombre.hashCode() % 10] = empleados[i];
                hashNumEmpleado[empleados[i].numeroEmpleado % 10] = empleados[i];
                hashNumSS[empleados[i].numeroSeguridadSocial % 10] = empleados[i];
            }
            System.out.println(hashNombre["Juan".hashCode() % 10]);
            System.out.println(hashNumEmpleado[1]);
            System.out.println(hashNumSS[1]);
        }



}

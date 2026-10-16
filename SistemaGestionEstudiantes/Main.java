
import java.util.Scanner;

/**
 * Clase principal del Sistema de Gestion de Estudiantes.
 * Permite capturar datos desde la terminal.
 */
public class Main {

    public static void main(String[] args) {

        // Objeto para leer los datos ingresados por el usuario.
        Scanner teclado = new Scanner(System.in);

        // Solicitamos los datos del estudiante.
        System.out.println("=== SISTEMA DE GESTION DE ESTUDIANTES ===");

        System.out.print("Ingresa la matricula: ");
        String matricula = teclado.nextLine();

        System.out.print("Ingresa el nombre: ");
        String nombre = teclado.nextLine();

        double calificacion;

        // Validamos que la calificacion este entre 0 y 100.
        while (true) {
            System.out.print("Ingresa la calificacion (0-100): ");

            if (teclado.hasNextDouble()) {
                calificacion = teclado.nextDouble();

                if (calificacion >= 0 && calificacion <= 100) {
                    break;
                } else {
                    System.out.println(
                        "Error: ingresa una calificacion entre 0 y 100."
                    );
                }
            } else {
                System.out.println("Error: debes ingresar un numero.");
                teclado.nextLine();
            }
        }

        // Creamos el objeto con los datos capturados.
        Estudiante estudiante =
                new Estudiante(matricula, nombre, calificacion);

        // Mostramos el resultado.
        System.out.println("\n=== DATOS DEL ESTUDIANTE ===");
        estudiante.mostrarInformacion();

        if (estudiante.aprobo()) {
            System.out.println("Resultado: APROBADO");
        } else {
            System.out.println("Resultado: NO APROBADO");
        }

        teclado.close();
    }
}


/**
 * Clase que representa a un estudiante.
 * Guarda su matrícula, nombre y calificación.
 */
public class Estudiante {

    // Atributos del estudiante.
    private String matricula;
    private String nombre;
    private double calificacion;

    // Constructor que inicializa los datos del estudiante.
    public Estudiante(String matricula, String nombre,
                      double calificacion) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    // Método para mostrar la información del estudiante.
    public void mostrarInformacion() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Calificacion: " + calificacion);
    }

    // Método que indica si el estudiante aprobó.
    public boolean aprobo() {
        return calificacion >= 70;
    }
}

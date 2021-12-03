
/**
 * Ejercicio3 Escribe un programa que muestre por pantalla 10 palabras en inglés
 * junto a su correspondiente traducción al castellano. Las palabras deben estar
 * distribuidas en dos columnas y alineadas a la izquierda.
 * 
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.printf("%-10s   %5s", "Conejo", "Rabbit\n");
        System.out.printf("%-10s   %5s", "Word  ", "Palabra\n");
        System.out.printf("%-10s   %10s", "Developer ", "Desarrollador\n");
        System.out.printf("%-10s   %5s", "Teacher ", "Profesor\n");
        System.out.printf("%-10s   %10s", "Driver ", "Conductor\n");
        System.out.printf("%-10s   %10s", "Student ", "Estudiante\n");
        System.out.printf("%-10s   %8s", "Language ", "Lenguaje\n");
        System.out.printf("%-8s   %9s", "English ", "Ingles\n");
        System.out.printf("%-10s   %-10s", "American ", "Americano\n");
        System.out.printf("%-10s   %-10s", "Colombian ", "Colombiano");

    }

}
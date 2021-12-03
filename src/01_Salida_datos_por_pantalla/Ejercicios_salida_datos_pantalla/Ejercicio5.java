
/**
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada
 * asignatura de un color diferente.
 * 
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("┌───────────┬───────────┬───────────┬───────────┬───────────┐");
        System.out.println("│   Lunes   |   Martes  │ Miercoles │  Jueves   │  Viernes  │ ");
        System.out.println("├───────────┼───────────┼───────────┼───────────┼───────────┤");
        System.out.println(
                "|\033[92m Escritura \033[39;49m|\033[33mMatematicas\033[39;49m|\033[96mCastellano\033[39;49m |Castellano |   \033[91mArtes\033[39;49m   |");
        System.out.println("├───────────┼───────────┼───────────┼───────────┼───────────┤");
        System.out.println(
                "|\033[34mInformatica\033[39;49m|\033[33mMatematicas\033[39;49m|Castellano |\033[96mCastellano\033[39;49m |   \033[91mArtes\033[39;49m   |");
        System.out.println("├───────────┼───────────┼───────────┼───────────┼───────────┤");
        System.out.println(
                "|\033[31mE. Corporal\033[39;49m| \033[94mSociales\033[39;49m  |   Ingles  |  Ingles   |\033[33mMatematicas\033[39;49m|");
        System.out.println("├───────────┼───────────┼───────────┼───────────┼───────────┤");
        System.out.println(
                "|  \033[35mLectura\033[39;49m  | \033[94mSociales\033[39;49m  |   Ingles  |  Religion |\033[33mMatematicas\033[39;49m|");
        System.out.println("├───────────┼───────────┼───────────┼───────────┼───────────┤");
        System.out.println("|     D     |  E     S  |   C     A |   N      S|     O     |");
        System.out.println("├───────────┼───────────┼───────────┼───────────┼───────────┤");
        System.out.println(
                "|\033[36mC.Naturales\033[39;49m|\033[36mC.Naturales\033[39;49m| Geometría |Ed. Fisica |\033[36mC.Naturales\033[39;49m|");
        System.out.println("├───────────┼───────────┼───────────┼───────────┼───────────┤");
        System.out.println(
                "|   \033[30mEtica\033[39;49m   |  \033[32mIngles\033[39;49m   |Estadistica|Ed. Fisica |\033[36mC.Naturales\033[39;49m|");
        System.out.println("└───────────┴───────────┴───────────┴───────────┴───────────┘");
    }

}

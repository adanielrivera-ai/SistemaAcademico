/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademico;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    /**
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    static ArrayList<Nota> notas = new ArrayList<>(); 
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      MenuPrincipal(sc);
      sc.close();
    } 
    
    static void MenuPrincipal(Scanner sc)
    {
        int opcion;

        do {
            System.out.println("\n===== SISTEMA ACADEMICO =====");
            System.out.println("1. Estudiantes");
            System.out.println("2. Asignaturas");
            System.out.println("3. Notas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: menuEstudiantes(sc); break;
                case 2: menuAsignaturas(sc); break;
                case 3: menuNotas(sc);       break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opcion no valida");
            }

        } while (opcion != 0);
    }
    static void menuEstudiantes(Scanner sc) {
    int opcion;

    do {
        System.out.println("\n--- ESTUDIANTES ---");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Listar estudiantes");
        System.out.println("3. Buscar estudiante");
        System.out.println("4. Actualizar estudiante");
        System.out.println("5. Eliminar estudiante");
        System.out.println("0. Volver al menu principal");
        System.out.print("Seleccione una opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1: ; break;
            case 2: ;     break;
            case 3: ;    break;
            case 4: ;break;
            case 5: ;  break;
            case 0: System.out.println("Volviendo..."); break;
            default: System.out.println("Opcion no valida");
        }

    } while (opcion != 0);
}

static void menuAsignaturas(Scanner sc) {
    int opcion;

    do {
        System.out.println("\n--- ASIGNATURAS ---");
        System.out.println("1. Registrar asignatura");
        System.out.println("2. Listar asignaturas");
        System.out.println("3. Buscar asignatura");
        System.out.println("4. Actualizar asignatura");
        System.out.println("5. Eliminar asignatura");
        System.out.println("0. Volver al menu principal");
        System.out.print("Seleccione una opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1: ; break;
            case 2: ;break;
            case 3: ;break;
            case 4: ;break;
            case 5: ;break;
            case 0: System.out.println("Volviendo..."); break;
            default: System.out.println("Opcion no valida");
        }

    } while (opcion != 0);
}

static void menuNotas(Scanner sc) {
    int opcion;

    do {
        System.out.println("\n--- NOTAS ---");
        System.out.println("1. Registrar nota");
        System.out.println("2. Listar notas");
        System.out.println("3. Buscar nota");
        System.out.println("4. Actualizar nota");
        System.out.println("5. Eliminar nota");
        System.out.println("0. Volver al menu principal");
        System.out.print("Seleccione una opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1: ; break;
            case 2: ;     break;
            case 3: ;    break;
            case 4: ;break;
            case 5: ;  break;
            case 0: System.out.println("Volviendo..."); break;
            default: System.out.println("Opcion no valida");
        }

    } while (opcion != 0);
}

}

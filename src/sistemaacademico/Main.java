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
<<<<<<< HEAD
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

=======
 */ 
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    static Scanner sc = new Scanner(System.in);

    public static Asignatura registrarAsignatura() {
        System.out.print("Nombre de la asignatura: ");
        String nombre = sc.nextLine();
        System.out.print("Creditos: ");
        int creditos = Integer.parseInt(sc.nextLine());
        System.out.print("Docente: ");
        String docente = sc.nextLine();
        return new Asignatura(nombre, creditos, docente);
    }
    
    public static void listarAsignaturas(ArrayList<Asignatura> lista) {
    if (lista.isEmpty()) {
        System.out.println("No hay asignaturas registradas.");
    } else {
        for (Asignatura a : lista) {
            System.out.println(a.toString());
        }
    }
>>>>>>> 9d21462fb44fa07c1235ad48ac99d7521b5966f9
}

public static void buscarAsignatura(ArrayList<Asignatura> lista) {
    System.out.print("Ingrese el nombre de la asignatura a buscar: ");
    String nombre = sc.nextLine();
    boolean encontrada = false;
    for (Asignatura a : lista) {
        if (a.getNombre().equalsIgnoreCase(nombre)) {
            System.out.println(a.toString());
            encontrada = true;
        }
    }
    if (!encontrada) {
        System.out.println("Asignatura no encontrada.");
    }
}

public static void actualizarAsignatura(ArrayList<Asignatura> lista) {
    System.out.print("Ingrese el nombre de la asignatura a actualizar: ");
    String nombre = sc.nextLine();
    boolean encontrada = false;
    for (Asignatura a : lista) {
        if (a.getNombre().equalsIgnoreCase(nombre)) {
            System.out.print("Nuevo nombre: ");
            a.setNombre(sc.nextLine());
            System.out.print("Nuevos creditos: ");
            a.setCreditos(Integer.parseInt(sc.nextLine()));
            System.out.print("Nuevo docente: ");
            a.setDocente(sc.nextLine());
            System.out.println("Asignatura actualizada.");
            encontrada = true;
        }
    }
    if (!encontrada) {
        System.out.println("Asignatura no encontrada.");
    }
}

public static void eliminarAsignatura(ArrayList<Asignatura> lista) {
    System.out.print("Ingrese el nombre de la asignatura a eliminar: ");
    String nombre = sc.nextLine();
    boolean encontrada = false;
    for (Asignatura a : lista) {
        if (a.getNombre().equalsIgnoreCase(nombre)) {
            lista.remove(a);
            System.out.println("Asignatura eliminada.");
            encontrada = true;
            break;
        }
    }
    if (!encontrada) {
        System.out.println("Asignatura no encontrada.");
    }
}

    public static void main(String[] args) {
        ArrayList<Asignatura> lista = new ArrayList<>();
        Asignatura asignatura = registrarAsignatura();
        lista.add(asignatura);
        System.out.println(asignatura.toString());
        listarAsignaturas(lista);
        buscarAsignatura(lista);
        actualizarAsignatura(lista);
        eliminarAsignatura(lista);
        
    }
}

   


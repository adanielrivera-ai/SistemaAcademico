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

    static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    static ArrayList<Nota> notas = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuPrincipal(sc);
        sc.close();

        Asignatura asignatura = registrarAsignatura();
        asignaturas.add(asignatura);
        System.out.println(asignatura.toString());
        listarAsignaturas(asignaturas);
        buscarAsignatura(asignaturas);
        actualizarAsignatura(asignaturas);
        eliminarAsignatura(asignaturas);
    }

    static void MenuPrincipal(Scanner sc) {
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
                case 1:
                    menuEstudiantes(sc);
                    break;
                case 2:
                    menuAsignaturas(sc);
                    break;
                case 3:
                    menuNotas(sc);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
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
                case 1: ;
                    break;
                case 2: ;
                    break;
                case 3: ;
                    break;
                case 4: ;
                    break;
                case 5: ;
                    break;
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
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
                case 1: ;
                    break;
                case 2: ;
                    break;
                case 3: ;
                    break;
                case 4: ;
                    break;
                case 5: ;
                    break;
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
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
                case 1: ;
                    break;
                case 2: ;
                    break;
                case 3: ;
                    break;
                case 4: ;
                    break;
                case 5: ;
                    break;
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 0);
    }

    public static Asignatura registrarAsignatura(Scanner sc) {
        System.out.print("Nombre de la asignatura: ");
        String nombre = sc.nextLine();
        System.out.print("Creditos: ");
        int creditos = Integer.parseInt(sc.nextLine());
        System.out.print("Docente: ");
        String docente = sc.nextLine();
        return asignaturas(nombre, creditos, docente);
    }

    public static void listarAsignaturas(ArrayList<Asignatura> asignaturas) {
        if (asignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas.");
        } else {
            for (Asignatura a : asignaturas) {
                System.out.println(a.toString());
            }
        }
    }

    public static void registrarNota(ArrayList<Estudiante> estudiantes,
            ArrayList<Asignatura> asignaturas,
            ArrayList<Nota> notas,
            Scanner sc) {
        System.out.println("\n--- Registrar Nota ---");

        System.out.print("Ingrese código del estudiante: ");
        String codigoEst = sc.nextLine();
        Estudiante estudianteSeleccionado = null;
        for (Estudiante e : estudiantes) {
            if (e.getCodigo().equals(codigoEst)) {
                estudianteSeleccionado = e;
                break;
            }
        }
        if (estudianteSeleccionado == null) {
            System.out.println("Estudiante no encontrado.");
            return;
        }

        System.out.print("Ingrese código de la asignatura: ");
        String codigoAsig = sc.nextLine();
        Asignatura asignaturaSeleccionada = null;
        for (Asignatura a : asignaturas) {
            if (a.getCodigo().equals(codigoAsig)) {
                asignaturaSeleccionada = a;
                break;
            }
        }
        if (asignaturaSeleccionada == null) {
            System.out.println("Asignatura no encontrada.");
            return;
        }

        System.out.print("Ingrese valor de la nota (0-5): ");
        double valor = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese periodo (ej. 2026-1): ");
        String periodo = sc.nextLine();

        Nota nuevaNota = new Nota(estudianteSeleccionado, asignaturaSeleccionada, valor, periodo);
        notas.add(nuevaNota);

        System.out.println("Nota registrada exitosamente.");
    }

    public static void listarNotas(ArrayList<Nota> notas) {
        System.out.println("\n--- Listado de Notas ---");
        if (notas.isEmpty()) {
            System.out.println("No hay notas registradas.");
            return;
        }
        for (Nota n : notas) {
            System.out.println("Estudiante: " + n.getEstudiante().getNombre()
                    + " | Asignatura: " + n.getAsignatura().getNombre()
                    + " | Nota: " + n.getValor()
                    + " | Periodo: " + n.getPeriodo());
        }
    }

    public static void buscarNota(ArrayList<Nota> notas, Scanner sc) {
        System.out.println("\n--- Buscar Nota ---");
        System.out.print("Ingrese código del estudiante: ");
        String codigoEst = sc.nextLine();
        System.out.print("Ingrese código de la asignatura: ");
        String codigoAsig = sc.nextLine();

        boolean encontrada = false;
        for (Nota n : notas) {
            if (n.getEstudiante().getCodigo().equals(codigoEst)
                    && n.getAsignatura().getCodigo().equals(codigoAsig)) {
                System.out.println("Estudiante: " + n.getEstudiante().getNombre()
                        + " | Asignatura: " + n.getAsignatura().getNombre()
                        + " | Nota: " + n.getValor()
                        + " | Periodo: " + n.getPeriodo());
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("No se encontró la nota para ese estudiante y asignatura.");
        }
    }

    public static void actualizarNota(ArrayList<Nota> notas, Scanner sc) {
        System.out.println("\n--- Actualizar Nota ---");
        System.out.print("Ingrese código del estudiante: ");
        String codigoEst = sc.nextLine();
        System.out.print("Ingrese código de la asignatura: ");
        String codigoAsig = sc.nextLine();

        boolean encontrada = false;
        for (Nota n : notas) {
            if (n.getEstudiante().getCodigo().equals(codigoEst)
                    && n.getAsignatura().getCodigo().equals(codigoAsig)) {

                System.out.println("Nota actual encontrada:");
                System.out.println("Estudiante: " + n.getEstudiante().getNombre()
                        + " | Asignatura: " + n.getAsignatura().getNombre()
                        + " | Nota: " + n.getValor()
                        + " | Periodo: " + n.getPeriodo());

                // Pedir nuevos valores
                System.out.print("Ingrese nuevo valor de la nota (0-5): ");
                double nuevoValor = sc.nextDouble();
                sc.nextLine(); // limpiar buffer
                System.out.print("Ingrese nuevo periodo: ");
                String nuevoPeriodo = sc.nextLine();

                // Actualizar
                n.setValor(nuevoValor);
                n.setPeriodo(nuevoPeriodo);

                System.out.println("Nota actualizada exitosamente.");
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("No se encontró la nota para ese estudiante y asignatura.");
        }
    }

    public static void eliminarNota(ArrayList<Nota> notas, Scanner sc) {
        System.out.println("\n--- Eliminar Nota ---");
        System.out.print("Ingrese código del estudiante: ");
        String codigoEst = sc.nextLine();
        System.out.print("Ingrese código de la asignatura: ");
        String codigoAsig = sc.nextLine();

        boolean eliminada = notas.removeIf(n
                -> n.getEstudiante().getCodigo().equals(codigoEst)
                && n.getAsignatura().getCodigo().equals(codigoAsig)
        );

        if (eliminada) {
            System.out.println("Nota eliminada exitosamente.");
        } else {
            System.out.println("No se encontró la nota para ese estudiante y asignatura.");
        }
    }

    public static void buscarAsignatura(ArrayList<Asignatura> asignaturas, Scanner sc) {
        System.out.print("Ingrese el nombre de la asignatura a buscar: ");
        String nombre = sc.nextLine();
        boolean encontrada = false;
        for (Asignatura a : asignaturas) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(a.toString());
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("Asignatura no encontrada.");
        }
    }

    public static void actualizarAsignatura(ArrayList<Asignatura> asignaturas, Scanner sc) {
        System.out.print("Ingrese el nombre de la asignatura a actualizar: ");
        String nombre = sc.nextLine();
        boolean encontrada = false;
        for (Asignatura a : asignaturas) {
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

    public static void eliminarAsignatura(ArrayList<Asignatura> asignaturas, Scanner sc) {
        System.out.print("Ingrese el nombre de la asignatura a eliminar: ");
        String nombre = sc.nextLine();
        boolean encontrada = false;
        for (Asignatura a : asignaturas) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                asignaturas.remove(a);
                System.out.println("Asignatura eliminada.");
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Asignatura no encontrada.");
        }
    }
}

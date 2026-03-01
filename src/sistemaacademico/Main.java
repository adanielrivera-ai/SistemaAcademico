/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademico;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        public static void registrarNota(ArrayList<Estudiante> estudiantes,
                                 ArrayList<Asignatura> asignaturas,
                                 ArrayList<Nota> notas,
                                 Scanner sc) {
            System.out.println("\n--- Registrar Nota ---");

            System.out.print("Ingrese código del estudiante: ");
            String codigoEst = sc.nextLine();
            Estudiante estudianteSeleccionado = null;
            for(Estudiante e : estudiantes) {
                if(e.getCodigo().equals(codigoEst)) {
                    estudianteSeleccionado = e;
                    break;
                }
            }
            if(estudianteSeleccionado == null) {
                System.out.println("Estudiante no encontrado.");
                return;
            }

            System.out.print("Ingrese código de la asignatura: ");
            String codigoAsig = sc.nextLine();
            Asignatura asignaturaSeleccionada = null;
            for(Asignatura a : asignaturas) {
                if(a.getCodigo().equals(codigoAsig)) {
                    asignaturaSeleccionada = a;
                    break;
                }
            }
            if(asignaturaSeleccionada == null) {
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
            if(notas.isEmpty()) {
                System.out.println("No hay notas registradas.");
                return;
            }
            for(Nota n : notas) {
                System.out.println("Estudiante: " + n.getEstudiante().getNombre() +
                                   " | Asignatura: " + n.getAsignatura().getNombre() +
                                   " | Nota: " + n.getValor() +
                                   " | Periodo: " + n.getPeriodo());
            }
        }

        public static void buscarNota(ArrayList<Nota> notas, Scanner sc) {
            System.out.println("\n--- Buscar Nota ---");
            System.out.print("Ingrese código del estudiante: ");
            String codigoEst = sc.nextLine();
            System.out.print("Ingrese código de la asignatura: ");
            String codigoAsig = sc.nextLine();

            boolean encontrada = false;
            for(Nota n : notas) {
                if(n.getEstudiante().getCodigo().equals(codigoEst) &&
                   n.getAsignatura().getCodigo().equals(codigoAsig)) {
                    System.out.println("Estudiante: " + n.getEstudiante().getNombre() +
                                       " | Asignatura: " + n.getAsignatura().getNombre() +
                                       " | Nota: " + n.getValor() +
                                       " | Periodo: " + n.getPeriodo());
                    encontrada = true;
                    break;
                }
            }
            if(!encontrada) {
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
            for(Nota n : notas) {
                if(n.getEstudiante().getCodigo().equals(codigoEst) &&
                   n.getAsignatura().getCodigo().equals(codigoAsig)) {

                    System.out.println("Nota actual encontrada:");
                    System.out.println("Estudiante: " + n.getEstudiante().getNombre() +
                                       " | Asignatura: " + n.getAsignatura().getNombre() +
                                       " | Nota: " + n.getValor() +
                                       " | Periodo: " + n.getPeriodo());

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
            if(!encontrada) {
                System.out.println("No se encontró la nota para ese estudiante y asignatura.");
            }
        }
    }
}

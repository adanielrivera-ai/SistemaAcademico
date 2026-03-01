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

    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademico;

/**
 *
 * @author DELL
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

    public static void main(String[] args) {
        ArrayList<Asignatura> lista = new ArrayList<>();
        Asignatura asignatura = registrarAsignatura();
        lista.add(asignatura);
        System.out.println(asignatura.toString());
        listarAsignaturas(lista);
        buscarAsignatura(lista);
    }
}

   


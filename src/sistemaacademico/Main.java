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

    public static void main(String[] args) {
        ArrayList<Asignatura> lista = new ArrayList<>();
        Asignatura asignatura = registrarAsignatura();
        lista.add(asignatura);
        System.out.println(asignatura.toString());
    }
}

   


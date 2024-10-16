package org.example;
import java.util.Scanner;

public class Empleado {
    private String nombre;
    private String cargo;
    private double salario;
    private String fechaIngreso;

    public Empleado(String nombre, String cargo, double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado[] empleados = new Empleado[3];

        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");

            System.out.println("Nombre:");
            String nombre = sc.nextLine();

            System.out.println("Cargo:");
            String cargo = sc.nextLine();

            System.out.println("Salario:");
            double salario = sc.nextDouble();

            sc.nextLine();

            System.out.println("Fecha de ingreso (dd/mm/aaaa):");
            String fechaIngreso = sc.nextLine();

            empleados[i] = new Empleado(nombre, cargo, salario, fechaIngreso);
        }

        System.out.println("Información de los empleados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
        }
    }
}


package org.example;
import java.util.Scanner;

public class Jugador {
    private String nombre;
    private String posicion;
    private int edad;
    private int numeroCamiseta;

    public Jugador(String nombre, String posicion, int edad, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + edad);
        System.out.println("Número de camiseta: " + numeroCamiseta);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Registro de jugadores utilizando datos quemados
        Jugador jugador1 = new Jugador("Lionel Messi", "Delantero", 36, 10);
        Jugador jugador2 = new Jugador("Sergio Ramos", "Defensa", 38, 4);

        System.out.println("Ingresa el nombre del jugador 3:");
        String nombre = sc.nextLine();
        System.out.println("Ingresa la posición del jugador 3:");
        String posicion = sc.nextLine();
        System.out.println("Ingresa la edad del jugador 3:");
        int edad = sc.nextInt();
        System.out.println("Ingresa el número de camiseta del jugador 3:");
        int numeroCamiseta = sc.nextInt();

        Jugador jugador3 = new Jugador(nombre, posicion, edad, numeroCamiseta);

        System.out.println("Información de los jugadores:");
        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();
        jugador3.mostrarInformacion();
    }
}
package com.uniajc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Libro libro1 = new Libro("1984", "George Orwell", 5, 1, "Ciencia Ficción");

        Libro libro2 = new Libro();

        System.out.println("Ingrese el título del libro:");
        libro2.setTitulo(scanner.nextLine());

        System.out.println("Ingrese el autor del libro:");
        libro2.setAutor(scanner.nextLine());
        
        System.out.println("Ingrese el genero del libro:");
        libro2.setGenero(scanner.nextLine());

        System.out.println("Ingrese la cantidad de ejemplares:");
        libro2.setNumEjemplares(scanner.nextInt());

        System.out.println("Ingrese la cantidad de ejemplares prestados:");
        libro2.setNumEjemplaresPrestados(scanner.nextInt());

        System.out.println("\nEstado inicial del libro1:");
        System.out.println(libro1);

        System.out.println("\nPrestando");
        if (libro1.prestamo()) {
            System.out.println("Prestado");
        } else {
            System.out.println("No hay ejemplares disponibles");
        }

        System.out.println("\nEstado después de prestarlo");
        System.out.println(libro1);

        System.out.println("\nDevolviendo");
        if (libro1.devolucion()) {
            System.out.println("Devuelto");
        } else {
            System.out.println("No hay libros prestados");
        }

        System.out.println("\nEstado después de devolverlo");
        System.out.println(libro1);

        System.out.println("\nInformación del libro1:");
        System.out.println(libro1);

        System.out.println("\nInformación del libro2:");
        System.out.println(libro2);

        scanner.close();
    }
}

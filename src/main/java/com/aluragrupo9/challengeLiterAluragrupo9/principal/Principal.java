package com.aluragrupo9.challengeLiterAluragrupo9.principal;

import java.util.Scanner;

public class Principal {

    private Scanner teclado = new Scanner(System.in);

    public void muestraMenu() {

        int opcion = -1;

        while (opcion != 0) {

            var menu = """
                    
                    1 - Buscar libro por título
                    2 - Listar libros registrados
                    3 - Listar autores registrados
                    4 - Listar autores vivos en determinado año
                    5 - Listar libros por idioma
                    0 - Salir
                    """;

            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:
                    buscarLibroPorTitulo();
                    break;

                case 2:
                    listarLibros();
                    break;

                case 3:
                    listarAutores();
                    break;

                case 4:
                    listarAutoresVivos();
                    break;

                case 5:
                    listarLibrosPorIdioma();
                    break;

                case 0:
                    System.out.println("Cerrando aplicación...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private void buscarLibroPorTitulo() {
        System.out.println("Funcionalidad en construcción...");
    }

    private void listarLibros() {
        System.out.println("Funcionalidad en construcción...");
    }

    private void listarAutores() {
        System.out.println("Funcionalidad en construcción...");
    }

    private void listarAutoresVivos() {
        System.out.println("Funcionalidad en construcción...");
    }

    private void listarLibrosPorIdioma() {
        System.out.println("Funcionalidad en construcción...");
    }
}
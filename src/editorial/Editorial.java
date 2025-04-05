package editorial;

import java.util.Scanner;

public class Editorial {
    private static Scanner escribir = new Scanner(System.in);
    private static Libro[] librosFeria = new Libro[100]; 
    private static int cantidadLibros = 0; // Contador de libros agregados
    
    
    public static void main(String[] args) {
         System.out.println("SISTEMA DE LIBROS FILBO 2024    ");
        
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            int opcion = obtenerOpcion();
            
            switch (opcion) {
                case 1:
                    agregarLibroTexto();
                    break;
                case 2:
                    agregarLibroInvestigacion();
                    break;
                case 3:
                    agregarNovela();
                    break;
                case 4:
                    mostrarLibros();
                    break;
                
                case 5:
                    continuar = false;
                    System.out.println("Usted salio del sistema");
                    break;
                default:
                    System.out.println("opcon no validad, ingrese una de las opcines del menu");
            }
        }
        
        escribir.close();
    }
    
    private static void mostrarMenu() {
        System.out.println("\n  MENU ");
        System.out.println("1. Agregar Libro de Texto");
        System.out.println("2. Agregar Libro de Investigacin UdeC");
        System.out.println("3. Agregar Novela");
        System.out.println("4. Mostrar Todos los Libros");
        System.out.println("5. Salir");
        System.out.println("Seleccione una opcion: ");
        
    }
    
    private static int obtenerOpcion() {
        try {
            return Integer.parseInt(escribir.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    
    private static void agregarLibroTexto() {
        System.out.println("\n AGREGAR LIBRO DE TEXTO ");
        
        
        System.out.print("Ingrese el titulo: ");
        String titulo = escribir.nextLine();
        
        System.out.print("Ingrese el autor: ");
        String autor = escribir.nextLine();
        
        double precio = obtenerPrecio();
        
        System.out.print("Ingrese el curso: ");
        String curso = escribir.nextLine();
        
        librosFeria[cantidadLibros] = new LibroTexto(titulo, autor, precio, curso);
        cantidadLibros++;
        System.out.println("Libro de texto agregado");
    }
    
    private static void agregarLibroInvestigacion() {
        System.out.println("\n AGREGAR LIBRO DE INVESTIGACION UdeC ");
        
        
        System.out.print("Ingrese el titulo: ");
        String titulo = escribir.nextLine();
        
        System.out.print("Ingrese el autor: ");
        String autor = escribir.nextLine();
        
        double precio = obtenerPrecio();
        
        System.out.print("Ingrese la facultad: ");
        String facultad = escribir.nextLine();
        
        librosFeria[cantidadLibros] = new LibroInvestigacion(titulo, autor, precio, facultad);
        cantidadLibros++;
        System.out.println("Libro de investigacion agregado ");
    }
    
    private static void agregarNovela() {
        System.out.println("\n AGREGAR NOVELA ");
        
        System.out.print("Ingrese el titulo: ");
        String titulo = escribir.nextLine();
        
        System.out.print("Ingrese el autor: ");
        String autor = escribir.nextLine();
        
        double precio = obtenerPrecio();
        
        System.out.print("Ingrese el tipo de novela (historica, romantica, policiaca, etc.): ");
        String tipoNovela = escribir.nextLine();
        
        librosFeria[cantidadLibros] = new Novela(titulo, autor, precio, tipoNovela);
        cantidadLibros++;
        System.out.println("Novela agregada");
    }
    
    private static double obtenerPrecio() {
        double precio = 0;
        boolean precioValido = false;
        
        while (!precioValido) {
            System.out.print("Ingrese el precio: $");
            try {
                precio = Double.parseDouble(escribir.nextLine());
                if (precio > 0) {
                    precioValido = true;
                } else {
                    System.out.println("El precio debe ser mayor que cero. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un valor numérico valido.");
            }
        }
        
        return precio;
    }
    
    private static void mostrarLibros() {
        System.out.println("\n LIBROS FILBO 2024");
        
        if (cantidadLibros == 0) {
            System.out.println("No hay libros registrados en el sistema.");
            return;
        }
        
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println("Libro #" + (i + 1));
            librosFeria[i].mostrarInformacion();
        }
    }
    
}

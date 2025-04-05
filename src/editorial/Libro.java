package editorial;

public abstract class Libro {
    protected String titulo;
    protected String autor;
    protected double precio;
    
    // Constructor
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    // Método abstracto que implementarán las subclases
    public abstract double calcularPrecioConDescuento();
    
    // Método para mostrar información del libro
    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio original: $" + precio);
        System.out.println("Precio con descuento: $" + calcularPrecioConDescuento());
    }
}
        


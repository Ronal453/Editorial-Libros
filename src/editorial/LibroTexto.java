package editorial;

public class LibroTexto extends Libro {
    private String curso;
    
    public LibroTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }
    
    @Override
    public double calcularPrecioConDescuento() {
        return precio * 0.6; // 40% de descuento
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Curso: " + curso);
        System.out.println("Tipo: Libro de Texto");
        System.out.println("Descuento: 40%");
        System.out.println("------------------------");
    }
}
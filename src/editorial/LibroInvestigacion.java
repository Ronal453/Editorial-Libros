package editorial;

public class LibroInvestigacion extends Libro {
    private String facultad;
    
    public LibroInvestigacion(String titulo, String autor, double precio, String facultad) {
        super(titulo, autor, precio);
        this.facultad = facultad;
    }
    
    @Override
    public double calcularPrecioConDescuento() {
        return precio * 0.75; // 25% de descuento
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Facultad: " + facultad);
        System.out.println("Tipo: Libro de Investigacion UdeC");
        System.out.println("Descuento: 25%");
        System.out.println("------------------------");
    }
}

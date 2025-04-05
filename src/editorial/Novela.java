package editorial;

public class Novela extends Libro {
    private String tipoNovela;
    
    public Novela(String titulo, String autor, double precio, String tipoNovela) {
        super(titulo, autor, precio);
        this.tipoNovela = tipoNovela;
    }
    
    @Override
    public double calcularPrecioConDescuento() {
        return precio * 0.85; // 15% de descuento
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de novela: " + tipoNovela);
        System.out.println("Tipo: Novela");
        System.out.println("Descuento: 15%");
        System.out.println("------------------------");
    }
}

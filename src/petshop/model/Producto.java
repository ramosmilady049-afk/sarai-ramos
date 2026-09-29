package petshop.model;
import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String idProducto;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
    private Proveedor proveedor;
    private final List<Inventario> movimientos = new ArrayList<>();

    public void actualizarStock() {}
    public boolean verificarDisponibilidad() { return stock > 0; }
}
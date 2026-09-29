package petshop.model;

public class DetalleVenta {
    private String idDetalle;
    private Venta venta;
    private Producto producto;
    private int cantidad;
    private double subtotal;

    public double calcularSubtotal() { return subtotal; }
}
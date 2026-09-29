package petshop.model;

public class Pago {
    private String idPago;
    private Venta venta;
    private double monto;
    private String metodoPago;
    private String fecha;

    public void registrarPago() {}
    public boolean validarMonto(double total) { return monto >= total; }
}
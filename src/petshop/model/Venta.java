package petshop.model;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String idVenta;
    private String fecha;
    private Cliente cliente;
    private Empleado empleado;
    private double total;
    private final List<DetalleVenta> detalles = new ArrayList<>();
    private final List<Pago> pagos = new ArrayList<>();

    public void registrarVenta() {}
    public double calcularTotal() { return total; }
    public void emitirComprobante() {}
}
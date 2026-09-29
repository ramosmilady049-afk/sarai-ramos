package petshop.model;

public class Inventario {
    private String idMovimiento;
    private Producto producto;
    private String tipoMovimiento;
    private int cantidad;
    private String fecha;

    public void registrarEntrada() {}
    public void registrarSalida() {}
    public void generarAlertaStock() {}
}
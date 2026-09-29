package petshop.model;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String idEmpleado;
    private String nombre;
    private String cargo;
    private String turno;
    private final List<Cita> citas = new ArrayList<>();
    private final List<Venta> ventas = new ArrayList<>();

    public void atenderVenta() {}
    public void registrarCita() {}
    public void actualizarInventario() {}
}
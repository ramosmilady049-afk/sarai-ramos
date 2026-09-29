package petshop.model;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String idCliente;
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;
    private final List<Mascota> mascotas = new ArrayList<>();
    private final List<Venta> ventas = new ArrayList<>();

    public void registrar() {}
    public void actualizarDatos() {}
    public void consultarHistorial() {}
}
package petshop.model;
import java.util.ArrayList;
import java.util.List;

public class Proveedor {
    private String idProveedor;
    private String razonSocial;
    private String contacto;
    private String rubro;
    private final List<Producto> productos = new ArrayList<>();

    public void registrarPedido() {}
    public void actualizarCatalogo() {}
}
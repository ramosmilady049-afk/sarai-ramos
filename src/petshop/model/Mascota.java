package petshop.model;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
    private String idMascota;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private double peso;
    private Cliente cliente;
    private final List<Cita> citas = new ArrayList<>();

    public void registrarMascota() {}
    public void actualizarFicha() {}
    public void verHistorialClinico() {}
}
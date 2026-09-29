package petshop.model;
import java.util.ArrayList;
import java.util.List;

public class Cita {
    private String idCita;
    private String fecha;
    private String hora;
    private String estado;
    private Mascota mascota;
    private Empleado empleado;
    private final List<Servicio> servicios = new ArrayList<>();

    public void agendar() {}
    public void confirmar() {}
    public void cancelar() {}
    public void finalizar() {}
}
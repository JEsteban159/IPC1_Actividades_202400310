package Model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Operacion> historialOperaciones;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.historialOperaciones = new ArrayList<>();
    }

    public void agregarOperacion(Operacion operacion) {
        this.historialOperaciones.add(operacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Operacion> getHistorialOperaciones() {
        return new ArrayList<>(historialOperaciones);
    }

    public int getTotalOperaciones() {
        return historialOperaciones.size();
    }
}

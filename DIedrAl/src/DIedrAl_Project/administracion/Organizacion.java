package DIedrAl_Project.administracion;

import java.util.ArrayList;
import java.util.List;

import DIedrAl_Project.recursos.Banco;

public class Organizacion {
    private final Banco banco;

    private List<Centro> centros = new ArrayList<Centro> ();

    public void nuevoCentro(Centro centro) {
    }

    public void eliminarCentro(String nombre) {
    }

    List<Centro> getCentros() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.centros;
    }

    void setCentros(List<Centro> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.centros = value;
    }

}
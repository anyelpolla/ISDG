package DIedrAl_Project.negocio.calendario;

import java.util.ArrayList;
import java.util.List;

import DIedrAl_Project.negocio.administracion.Terapeuta;
import DIedrAl_Project.negocio.pacientes.Paciente;

public class Calendario {
    private List<SesionProgramada> sesiones = new ArrayList<SesionProgramada> ();

    public List<SesionProgramada> mostrar() {
    	return sesiones;
    }

    public void addSesion(SesionProgramada sesion) {
    	sesiones.add(sesion);
    }

    public void modificarSesion(SesionProgramada antigua, SesionProgramada nueva) {
    	//pensaaaaaar
    }

    public void eliminarSesion(SesionProgramada sesion) {
    	sesiones.remove(sesion);
    }

    public void filtrarTerapeuta(Terapeuta t) {
    	sesiones.removeIf((new FiltroTerapeuta<SesionProgramada>(t)));
    }
    
    public void filtrarTerapeuta(ArrayList<Terapeuta> t) {
    	sesiones.removeIf((new FiltroTerapeuta<SesionProgramada>(t)));
    }
    
    public void filtrarPaciente(Paciente p) {
    	sesiones.removeIf((new FiltroPaciente<SesionProgramada>(p)));
    }
    
    public void filtrarPaciente(ArrayList<Paciente> p) {
    	sesiones.removeIf((new FiltroPaciente<SesionProgramada>(p)));
    }

}
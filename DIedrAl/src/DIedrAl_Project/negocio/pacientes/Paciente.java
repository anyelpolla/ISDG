package DIedrAl_Project.negocio.pacientes;

import DIedrAl_Project.negocio.administracion.Persona;

public class Paciente extends Persona {
	
	DatosPaciente datos;

	public Paciente(String nombre, String apellido1, String apellido2, String nif) {
		super(nombre, apellido1, apellido2, nif);
		datos = new DatosPaciente();
	}

	public void addInforme(Informe Informe) {
	}

	public void eliminarInforme(Informe Informe) {
	}

	public void modificarInforme(Informe informe) {
	}

	public void addNota(Nota nota) {
	}

	public void eliminarNota(Nota nota) {
	}

	public void modificarNota(Nota nota) {
	}

	public void editarPerfil() {
	}

	public DatosPaciente getDatos() {
		return datos;
	}


}

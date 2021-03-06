package DIedrAl_Project.negocio.recursos;

import DIedrAl_Project.negocio.calendario.SesionProgramada;

public class Banco {
	private ArrayActividades actividades;

	private ArraySesiones sesiones;

	private ArrayRecursos recursos;
	
	private ArraySesionesProgramadas sesionesProgramadas;

	private static Banco instancia = null;

	public static Banco getInstancia() {

		if (instancia == null)
			instancia = new Banco();

		return instancia;
	}

	private Banco() {
		recursos = new ArrayRecursos();
		actividades = new ArrayActividades();
		sesiones = new ArraySesiones();
		sesionesProgramadas = new ArraySesionesProgramadas();
	}

	public ArrayActividades getActividades() {
		return actividades;
	}

	public void setActividades(ArrayActividades actividades) {
		this.actividades = actividades;
	}

	public ArraySesiones getSesiones() {
		return sesiones;
	}

	public void setSesiones(ArraySesiones sesiones) {
		this.sesiones = sesiones;
	}
	
	public ArraySesionesProgramadas getSesionesProgramadas() {
		return sesionesProgramadas;
	}

	public void setSesionesProgramadas(ArraySesionesProgramadas sesionesProgramadas) {
		this.sesionesProgramadas = sesionesProgramadas;
	}

	public void addRecurso(Recurso rec) {
		recursos.add(rec);
	}

	/**
	 * elimina el recurso dado de la lista de recursos del banco, así como de
	 * los conjuntos de asociados de las listas de sesiones y de actividades del
	 * banco
	 * @param rec
	 */
	public void removeRecurso(Recurso rec) {
		recursos.erase(rec);

		this.actividades.forEach((actividad) -> {
			if (actividad.getAsociados().contains(rec)) {
				actividad.asociados.remove(rec);
			}
		});
		
		this.sesiones.forEach((sesion) -> {
			if (sesion.getAsociados().contains(rec)) {
				sesion.asociados.remove(rec);
			}
		});
	}

	public void addSesion(Sesion ses) {
		sesiones.add(ses);
	}

	public void removeSesion(Sesion ses) {
		sesiones.erase(ses);
		
		this.actividades.forEach((actividad) -> {
			if (actividad.getAsociados().contains(ses)) {
				actividad.asociados.remove(ses);
			}
		});
		
		this.sesiones.forEach((sesion) -> {
			if (sesion.getAsociados().contains(ses)) {
				sesion.asociados.remove(ses);
			}
		});
	}
	
	public void addSesionProgramada(SesionProgramada sp) {
		sesionesProgramadas.add(sp);
	}

	public void removeSesionProgramada(SesionProgramada sp) {
		sesionesProgramadas.erase(sp);
		
		this.actividades.forEach((actividad) -> {
			if (actividad.getAsociados().contains(sp)) {
				actividad.asociados.remove(sp);
			}
		});
		
		this.sesionesProgramadas.forEach((sesionProgramada) -> {
			if (sesionProgramada.getAsociados().contains(sp)) {
				sesionProgramada.asociados.remove(sp);
			}
		});
	}

	public void addActividad(Actividad act) {
		actividades.add(act);
	}

	public void removeActividad(Actividad act) {
		
		actividades.erase(act);
		
		this.actividades.forEach((actividad) -> {
			if (actividad.getAsociados().contains(act)) {
				actividad.asociados.remove(act);
			}
		});
		
		this.sesiones.forEach((sesion) -> {
			if (sesion.getAsociados().contains(act)) {
				sesion.asociados.remove(act);
			}
		});
	}

	public ArrayRecursos getRecursos() {
		return recursos;
	}

	public void setRecursos(ArrayRecursos value) {
		recursos = value;
	}

}

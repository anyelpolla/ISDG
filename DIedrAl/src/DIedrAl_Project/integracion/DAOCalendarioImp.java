package DIedrAl_Project.integracion;

import java.io.IOException;
import java.util.HashSet;

import DIedrAl_Project.integracion.BasicClasses.DAObasico;
import DIedrAl_Project.negocio.calendario.Calendario;
import DIedrAl_Project.negocio.recursos.Actividad;

public class DAOCalendarioImp implements DAOCalendario {
	
private static DAOCalendarioImp instancia = null;
	
	private DAObasico<Calendario> op;
	private final String file = "calendario.txt";
	
	public static DAOCalendarioImp getInstance(){
		if(instancia == null) instancia = new DAOCalendarioImp();
		return instancia;
	}

	
	private DAOCalendarioImp(){
		op = new DAObasico<>();
	}

	@Override
	public void crearCalendario(Calendario c) throws IOException {
		op.guardar(c, file);
	}

	@Override
	public void eliminarCalendario(String id) throws IOException, ClassNotFoundException {
		op.borrar(id, file);
	}

	@Override
	public void modificarActividad(Calendario r) throws IOException, ClassNotFoundException {
		op.modificar(r, file);
	}

	@Override
	public HashSet<Calendario> listarCalendario() throws IOException, ClassNotFoundException {
		return op.obtenerDatosSet(file);
	}

	@Override
	public boolean existeCalendario(String id) throws IOException, ClassNotFoundException {
		return op.exists(id, file);
	}

	
}
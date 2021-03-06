package DIedrAl_Project.negocio.administracion;

import java.io.Serializable;
import DIedrAl_Project.negocio.ObjetoAlmacenable;
import DIedrAl_Project.negocio.calendario.Fecha;
import DIedrAl_Project.negocio.pacientes.Direccion;

public abstract class Persona implements ObjetoAlmacenable, Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5272541968155649741L;

	protected String nombre = "";

	protected String apellido1 = "";

	protected String apellido2 = "";

	protected Fecha fechaNacimiento = null;

	protected EstadoCivil estadoCivil = null;

	protected Direccion direccion = null;

	protected String email = "";

	protected String tfo = "";

	protected String perfil = "";

	protected String centro = "";
	/**
	 * El NIF es su dni, el id es el campo que le permite al objeto ser
	 * guardado.
	 */
	protected String nif;

	protected String id;

	public String getCentro() {
		return centro;
	}

	public void setCentro(String nuevo) {
		centro = nuevo;
	};

	public Persona(String nombre, String apellido1, String apellido2, String nif) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nif = nif;
		this.id=nif;
	}

	public String getName() {
		return nombre;
	}

	public void setName(String name) {
		this.nombre = name;
	}

	public String getFirstSurname() {
		return apellido1;
	}

	public void setFirstSurname(String firstSurname) {
		this.apellido1 = firstSurname;
	}

	public String getSecondSurname() {
		return apellido2;
	}

	public void setSecondSurname(String secondSurname) {
		this.apellido2 = secondSurname;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public Fecha getBirthday() {
		return fechaNacimiento;
	}

	public void setBirthday(Fecha birthday) {
		fechaNacimiento = birthday;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = EstadoCivil.valueOf(estadoCivil);
	}

	public Direccion getAddress() {
		return direccion;
	}

	public void setAddress(Direccion address) {
		direccion = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTfo() {
		return tfo;
	}

	public void setTfo(String tfo) {
		this.tfo = tfo;
	}

	@Override
	public String getId() {
		return nif;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
		this.id = nif;
	}

	public int compararAlfab(Persona otra) {
		if (apellido1.compareTo(otra.apellido1) == -1) {
			return -1;
		} else if (apellido1.compareTo(otra.apellido1) == 1) {
			return 1;
		} else {
			if (apellido2.compareTo(otra.apellido2) == -1) {
				return -1;
			} else if (apellido2.compareTo(otra.apellido2) == 1) {
				return 1;
			} else {
				if (nombre.compareTo(otra.nombre) == -1) {
					return -1;
				} else if (nombre.compareTo(otra.nombre) == 1) {
					return 1;
				} else
					return 0;
			}
		}
	}

	/**
	 * Comprueba si la persona comparte id con la dada
	 * 
	 * @return 0 si id es el mismo que el de otra, -1/1 si menor/mayor,
	 *         respectivamente.
	 */
	public int compararNIF(Persona otra) {
		return nif.compareTo(otra.nif);
	}

	public String toString() {
		return nif + ": " + nombre + " " + apellido1 + " " + apellido2;
	}

	/**
	 * Dada una persona, iguala los campos de la persona actual para que
	 * coincidan con los de la proporcionada
	 * 
	 * @param otra
	 *            persona cuyos campos se desean copiar
	 */

	public void igualarCampos(Persona that) {
		fechaNacimiento = that.fechaNacimiento;
		estadoCivil = that.estadoCivil;
		direccion = that.direccion;
		email = that.email;
		tfo = that.tfo;
		perfil = that.perfil;
		centro = that.centro;
	}

}

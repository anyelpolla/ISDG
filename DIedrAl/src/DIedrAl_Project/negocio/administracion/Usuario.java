package DIedrAl_Project.negocio.administracion;

public class Usuario extends Persona {

	protected boolean admin;

	protected String infor;

	protected String password;

	public Usuario(String nombre, String apellido1, String apellido2, String id) {
		super(nombre, apellido1, apellido2, id);
		password = id;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin() {
		admin = true;
	}

	public void resetAdmin() {
		admin = false;
	}

	public void setInfor(String infor) {
		this.infor = infor;
	}
	
	public String getInfor(){
		return infor;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Comprueba si el string introducido coincide con la contraseņa del
	 * ususuario.
	 * 
	 * @param pass contraseņa a probar
	 * @return true si coincide, false en caso contrario.
	 */
	public boolean inputPassword(String pass) {
		return pass.equals(password);
	}
	
}

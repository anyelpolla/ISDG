package DIedrAl_Project.negocio.recursos;

import java.util.*;

public abstract class ArrayEtiquetables<T extends Etiquetable> {

	protected Set<T> etiquetables;
	
	public ArrayEtiquetables(){
		etiquetables = new HashSet<T>(); 
	}

	public Set<T> filtrarEtiqueta(Set<String> filtros) {

		HashSet<T> aux = new HashSet<T>();
		for (T x : etiquetables) {
			if(x.getEtiquetas().containsAll(filtros)){
				aux.add(x);
			}
		}
		return aux;
	}

	public Set<T> filtrarNombre(String nombre) {

		HashSet<T> aux = new HashSet<T>();

		String nameAux;

		for (T x : etiquetables) {
			nameAux = x.getNombre().toLowerCase();
			if (nameAux.contains(nombre.toLowerCase())) {
				aux.add(x);
			}
		}

		return aux;
	}
	
	public void add(T elem){
		etiquetables.add(elem);
	}
	public void erase(T elem){
		etiquetables.remove(elem);
	}

}

package Usuarios;

import java.io.Serializable;

public class Empresa extends Usuario implements Serializable {

	String CIF;

	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empresa(String direccion, int numerotlf, String nombre, String CIF) {
		super(direccion, numerotlf, nombre);
		this.CIF = CIF;
	}

	@Override
	public String toString() {
		return "Empresa [CIF=" + CIF + ", direccion=" + direccion + ", numerotlf=" + numerotlf + ", nombre=" + nombre
				+ "]";
	}

}

package Usuarios;

import java.io.Serializable;

public class Cliente extends Usuario implements Serializable {

	String DNI;

	public Cliente() {
		super();
	}

	public Cliente(String direccion, int numerotlf, String nombre, String DNI) {
		super(direccion, numerotlf, nombre);
		this.DNI = DNI;
	}

	@Override
	public String toString() {
		return "Cliente [Nombre=" + nombre + " DNI=" + DNI + ", direccion=" + direccion + ", numerotlf=" + numerotlf + "]";
	}

}

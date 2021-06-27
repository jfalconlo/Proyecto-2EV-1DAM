package Vehiculos;

import java.io.Serializable;
import java.time.LocalDate;

public class Coche extends Vehiculo implements Serializable {

	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coche(String modelo, String marca, String combustible, int kilometraje, String matricula,
			LocalDate añoMatriculacion, double cilindrada, int potencia, String color) {
		super(modelo, marca, combustible, kilometraje, matricula, añoMatriculacion, cilindrada, potencia, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Coche [Modelo=" + modelo + ", marca=" + marca + ", combustible=" + combustible + ", kilometraje="
				+ kilometraje + ", matricula=" + matricula + ", añoMatriculacion=" + añoMatriculacion + ", cilindrada="
				+ cilindrada + ", potencia=" + potencia + ", color=" + color + "]";
	}

}

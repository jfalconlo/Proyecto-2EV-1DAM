package Vehiculos;

import java.io.Serializable;
import java.time.LocalDate;

public class Furgoneta extends Vehiculo implements Serializable {

	public Furgoneta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Furgoneta(String modelo, String marca, String combustible, int kilometraje, String matricula,
			LocalDate aņoMatriculacion, double cilindrada, int potencia, String color) {
		super(modelo, marca, combustible, kilometraje, matricula, aņoMatriculacion, cilindrada, potencia, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Furgoneta [Modelo=" + modelo + ", marca=" + marca + ", combustible=" + combustible + ", kilometraje="
				+ kilometraje + ", matricula=" + matricula + ", aņoMatriculacion=" + aņoMatriculacion + ", cilindrada="
				+ cilindrada + ", potencia=" + potencia + ", color=" + color + "]";
	}

}

package Vehiculos;

import java.io.Serializable;
import java.time.LocalDate;

public class Furgoneta extends Vehiculo implements Serializable {

	public Furgoneta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Furgoneta(String modelo, String marca, String combustible, int kilometraje, String matricula,
			LocalDate a�oMatriculacion, double cilindrada, int potencia, String color) {
		super(modelo, marca, combustible, kilometraje, matricula, a�oMatriculacion, cilindrada, potencia, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Furgoneta [Modelo=" + modelo + ", marca=" + marca + ", combustible=" + combustible + ", kilometraje="
				+ kilometraje + ", matricula=" + matricula + ", a�oMatriculacion=" + a�oMatriculacion + ", cilindrada="
				+ cilindrada + ", potencia=" + potencia + ", color=" + color + "]";
	}

}

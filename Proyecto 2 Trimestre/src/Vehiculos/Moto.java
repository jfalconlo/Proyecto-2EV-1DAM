package Vehiculos;

import java.io.Serializable;
import java.time.LocalDate;

public class Moto extends Vehiculo implements Serializable {

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(String modelo, String marca, String combustible, int kilometraje, String matricula,
			LocalDate añoMatriculacion, double cilindrada, int potencia, String color) {
		super(modelo, marca, combustible, kilometraje, matricula, añoMatriculacion, cilindrada, potencia, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moto [Modelo=" + modelo + ", marca=" + marca + ", combustible=" + combustible + ", kilometraje="
				+ kilometraje + ", matricula=" + matricula + ", añoMatriculacion=" + añoMatriculacion + ", cilindrada="
				+ cilindrada + ", potencia=" + potencia + ", color=" + color + "]";
	}

}

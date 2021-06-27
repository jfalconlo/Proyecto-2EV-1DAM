package Vehiculos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

import Mantenimiento.Mantenimiento;

public abstract class Vehiculo implements Serializable {

	ArrayList<Mantenimiento> Mantenimientos = new ArrayList<Mantenimiento>();
	String modelo;
	String marca;
	String combustible;
	int kilometraje;
	String matricula;
	LocalDate añoMatriculacion;
	double cilindrada;
	int potencia;
	String color;

	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}

	public Vehiculo(String modelo, String marca, String combustible, int kilometraje, String matricula,
			LocalDate añoMatriculacion, double cilindrada, int potencia, String color) {
		this.modelo = modelo;
		this.marca = marca;
		this.combustible = combustible;
		this.kilometraje = kilometraje;
		this.matricula = matricula;
		this.añoMatriculacion = añoMatriculacion;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.color = color;
	}

	public void añadirMantenimieto(Mantenimiento Mantenimiento) {

		Mantenimientos.add(Mantenimiento);

	}
	
public int totalMantenimientos() {
	return Mantenimientos.size();
}

	public void verMantenimientos() {
		for (int i = 0; i < Mantenimientos.size(); i++) {
			System.out.println((i + 1) + " " + Mantenimientos.get(i).toString());
		}
	}

	public void eliminarMantenimiento(int Mantenimiento) {
		Mantenimientos.remove(Mantenimiento);

	}

	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", Marca=" + marca + ", Combustible=" + combustible + ", Kilometraje="
				+ kilometraje + ", Matricula=" + matricula + ", AñoMatriculacion=" + añoMatriculacion + ", Cilindrada="
				+ cilindrada + ", Potencia=" + potencia + ", Color=" + color + "]";
	}

}

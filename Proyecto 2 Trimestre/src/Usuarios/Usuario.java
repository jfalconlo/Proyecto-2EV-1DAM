package Usuarios;

import java.io.Serializable;
import java.util.ArrayList;

import Vehiculos.Vehiculo;
import Mantenimiento.*;

public abstract class Usuario implements Serializable{

	ArrayList<Vehiculo> Vehiculos = new ArrayList<Vehiculo>();

	String direccion;
	int numerotlf;
	String nombre;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(String direccion, int numerotlf, String nombre) {
		this.direccion = direccion;
		this.numerotlf = numerotlf;
		this.nombre = nombre;
	}

	public int totalVehiculos() {
		return Vehiculos.size();
	}
	
	public Vehiculo seleccionarVehiculo(int vehiculo) {
		return Vehiculos.get(vehiculo);
	}
	
	public void añadirVehiculo(Vehiculo vehiculo) {
		Vehiculos.add(vehiculo);
	}

	public void elimiarVehiculo(int vehiculo) {
		Vehiculos.remove(vehiculo);
	}

	public void verVehiculos() {
		for (int i = 0; i < Vehiculos.size(); i++) {
			System.out.println((i + 1) + " " + Vehiculos.get(i).toString());
		}
	}

	@Override
	public String toString() {
		return "Usuario [ Nombre=" + nombre + " Vehiculos=" + Vehiculos + ", direccion=" + direccion + ", numerotlf="
				+ numerotlf + "]";
	}

	public String informacionRelevante() {
		return "Nombre=" + nombre;
	}

}

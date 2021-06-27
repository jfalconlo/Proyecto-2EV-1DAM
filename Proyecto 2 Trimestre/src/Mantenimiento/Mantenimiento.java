package Mantenimiento;

import java.io.Serializable;
import java.time.LocalDate;

public class Mantenimiento implements Serializable {

	LocalDate fechaMan;
	LocalDate fechaProxMant;
	double Precio;
	String tipoMantenimiento;

	public Mantenimiento(LocalDate fechaMan, LocalDate fechaProxMant, double precio, String tipoMantenimiento) {
		this.fechaMan = fechaMan;
		this.fechaProxMant = fechaProxMant;
		Precio = precio;
		this.tipoMantenimiento = tipoMantenimiento;
	}

	@Override
	public String toString() {
		return "Mantenimiento [TipoMantenimiento=" + tipoMantenimiento + ", FechaMan=" + fechaMan + ", fechaProxMant="
				+ fechaProxMant + ", Precio=" + Precio + "]";
	}

}

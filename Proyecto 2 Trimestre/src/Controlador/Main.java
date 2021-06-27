package Controlador;

import Usuarios.*;
import Vehiculos.*;
import java.util.*;
import java.io.*;
import java.time.*;
import Mantenimiento.*;

public class Main implements Serializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();// Array el Cual sera nuestra base de datos.

		System.out.println("Bienvenido al Programa de Mantenimiento de Vehiculos");

		try (Scanner sc = new Scanner(System.in)) {

			while (1 != 0) {

				menuPrincipal(); // Metodo el Cual solo nos mostrara el menu.

				int seleccionMenu = sc.nextInt();
				switch (seleccionMenu) { // Switch el cual se encarga del menu principal
				case 1:

					System.out.println("¿A que tipo de Usuario desea dar de alta?");
					System.out.println("1.Cliente 2.Una Empresa");

					int selecCreaUsuario = sc.nextInt();

					switch (selecCreaUsuario) {
					case 1:
						System.out.println("Introduzca el nombre");
						String nombre = sc.next();
						System.out.println("DNI");
						String DNI = sc.next();
						System.out.println("Numero de Telefono");
						int numerotlf = sc.nextInt();
						System.out.println("Dirección");
						String direccion = sc.next();
						Cliente Cliente = new Cliente(direccion, numerotlf, nombre, DNI);

						Usuarios.add(Cliente);
						break;

					case 2:
						System.out.println("Introduzca el nombre");
						String nombreEmpresa = sc.next();
						System.out.println("CIF");
						String CIF = sc.next();
						System.out.println("Numero de Telefono");
						int numerotlfEmpresa = sc.nextInt();
						System.out.println("Dirección");
						String direccionEmpresa = sc.next();

						Empresa Empresa = new Empresa(direccionEmpresa, numerotlfEmpresa, nombreEmpresa, CIF);

						Usuarios.add(Empresa);

						break;

					default:
						throw new IllegalArgumentException("Introduzca un valor dentro de las Opciones");
					}
					break;

				case 2:

					if (Usuarios.size() <= 0) { // Este sera el error el cual nos dara el programa
												// En caso que no haya ningun usuario para eliminar
						throw new IllegalArgumentException("No hay Usuarios para Eliminar");
					}

					else {
						System.out.println("A que Cliente desea dar de baja");
						for (int i = 0; i < Usuarios.size(); i++) {
							System.out.println((i + 1) + " " + Usuarios.get(i).toString());
						}
						Usuarios.remove((sc.nextInt() + 1));
					}
					break;
				case 3:

					if (Usuarios.size() <= 0) { // Este sera el error el cual nos dara el programa
						// En caso que no haya ningun usuario para eliminar
						throw new IllegalArgumentException("No hay Usuarios para Eliminar");
					}

					else {
						System.out.println("A que Cliente desea Acceder");
						for (int i = 0; i < Usuarios.size(); i++) {
							System.out.println((i + 1) + " " + Usuarios.get(i).toString());
						}
						int accesoUsuario = (sc.nextInt() - 1);
						System.out.println(
								"Has accedido al Cliente " + Usuarios.get(accesoUsuario).informacionRelevante());
						System.out.println("¿Que desea hacer");
						System.out.println("1.Añadir Vehiculo 2.Eliminar Vehiculo 3.Mantenimientos 4.Ver Vehiculos");
						seleccionMenu = sc.nextInt();
						switch (seleccionMenu) {
						case 1:
							System.out.println("Que tipo de vehiculo desea añadir");
							System.out.println("1.Coche 2.Moto 3.Furgoneta");

							seleccionMenu = sc.nextInt();

							switch (seleccionMenu) {
							case 1:
								System.out.println("Introduzca el modelo del Vehiculo");
								String modelo = sc.next();
								System.out.println("Introduzca la marca del Vehiculo");
								String marca = sc.next();
								System.out.println("Introduzca el tipo de combustible");
								String combustible = sc.next();
								System.out.println("Introduzca el Kilometraje");
								int kilometraje = sc.nextInt();
								System.out.println("Introduzca la Matricula");
								String matricula = sc.next();
								System.out.println("Introduzca el año de matriculacion");
								int año = sc.nextInt();
								System.out.println("Introduzca el mes de matriculacion");
								int mes = sc.nextInt();
								System.out.println("Introduzca el dia de matriculacion");
								int dia = sc.nextInt();

								System.out.println("Introduzca la Cilindrada");
								double cilindrada = sc.nextDouble();
								System.out.println("Introduzca los caballos dle vehiculo");
								int caballos = sc.nextInt();
								System.out.println("Por ultimo introduzca el color");
								String color = sc.next();

								Coche Coche = new Coche(modelo, marca, combustible, kilometraje, matricula,
										LocalDate.of(año, mes, dia), cilindrada, caballos, color);

								Usuarios.get(accesoUsuario).añadirVehiculo(Coche);
								break;
							case 2:
								System.out.println("Introduzca el modelo del Vehiculo");
								modelo = sc.next();
								System.out.println("Introduzca la marca del Vehiculo");
								marca = sc.next();
								System.out.println("Introduzca el tipo de combustible");
								combustible = sc.next();
								System.out.println("Introduzca el Kilometraje");
								kilometraje = sc.nextInt();
								System.out.println("Introduzca la Matricula");
								matricula = sc.next();
								System.out.println("Introduzca el año de matriculacion");
								año = sc.nextInt();
								System.out.println("Introduzca el mes de matriculacion");
								mes = sc.nextInt();
								System.out.println("Introduzca el dia de matriculacion");
								dia = sc.nextInt();
								System.out.println("Introduzca la Cilindrada");
								cilindrada = sc.nextDouble();
								System.out.println("Introduzca los caballos dle vehiculo");
								caballos = sc.nextInt();
								System.out.println("Por ultimo introduzca el color");
								color = sc.next();

								Moto Moto = new Moto(modelo, marca, combustible, kilometraje, matricula,
										LocalDate.of(año, mes, dia), cilindrada, caballos, color);
								Usuarios.get(accesoUsuario).añadirVehiculo(Moto);
								break;
							case 3:

								System.out.println("Introduzca el modelo del Vehiculo");
								modelo = sc.next();
								System.out.println("Introduzca la marca del Vehiculo");
								marca = sc.next();
								System.out.println("Introduzca el tipo de combustible");
								combustible = sc.next();
								System.out.println("Introduzca el Kilometraje");
								kilometraje = sc.nextInt();
								System.out.println("Introduzca la Matricula");
								matricula = sc.next();
								System.out.println("Introduzca el año de matriculacion");
								año = sc.nextInt();
								System.out.println("Introduzca el mes de matriculacion");
								mes = sc.nextInt();
								System.out.println("Introduzca el dia de matriculacion");
								dia = sc.nextInt();
								System.out.println("Introduzca la Cilindrada");
								cilindrada = sc.nextDouble();
								System.out.println("Introduzca los caballos dle vehiculo");
								caballos = sc.nextInt();
								System.out.println("Por ultimo introduzca el color");
								color = sc.next();

								Furgoneta Furgoneta = new Furgoneta(modelo, marca, combustible, kilometraje, matricula,
										LocalDate.of(año, mes, dia), cilindrada, caballos, color);
								Usuarios.get(accesoUsuario).añadirVehiculo(Furgoneta);
								break;

							default:
								throw new IllegalArgumentException("Introduzca bien el vehiculo que desea eliminar");
							}
							break;
						case 2:
							Usuarios.get(accesoUsuario).verVehiculos();
							System.out.println("Que vehiculo desea eliminar");
							Usuarios.get(accesoUsuario).elimiarVehiculo((sc.nextInt() - 1));
							break;
						case 3:
							System.out.println("¿Que desea hacer?");
							System.out.println("1.Añadir Mantenimiento 2.Eliminar Mantenimiento 3.Ver Mantenimientos");
							seleccionMenu = sc.nextInt();
							switch (seleccionMenu) {
							case 1:
								System.out.println("¿Que tipo de Mantenimiento se ha Realizado?");
								String tipoMantenimiento = sc.next();
								System.out.println("Precio del Mantenimiento");
								double precio = sc.nextDouble();
								System.out.println("¿En que fecha se ha realizado el Mantenimiento?");
								System.out.println("Dia");
								int dia = sc.nextInt();
								System.out.println("mes");
								int mes = sc.nextInt();
								System.out.println("año");
								int año = sc.nextInt();
								System.out.println("¿Cuando le toca el siguiente Mantenimiento?");
								System.out.println("Dia");
								int diaproxMan = sc.nextInt();
								System.out.println("mes");
								int mesproxMan = sc.nextInt();
								System.out.println("año");
								int añoproxMan = sc.nextInt();
								Mantenimiento Mantenimiento = new Mantenimiento(LocalDate.of(año, mes, dia),
										LocalDate.of(añoproxMan, mesproxMan, diaproxMan), precio, tipoMantenimiento);

								System.out.println("¿A que vehiculo desea añadir este mantennimiento?");
								Usuarios.get(accesoUsuario).verVehiculos();
								int vehiculo = (sc.nextInt() - 1);
								Usuarios.get(accesoUsuario).seleccionarVehiculo(vehiculo)
										.añadirMantenimieto(Mantenimiento);
								// Preguntar a Tomas Lio importante

								break;

							case 2:
								if (Usuarios.get(accesoUsuario).totalVehiculos()==0) { // Este sera el error el cual nos dara el programa
									// En caso que no haya ningun usuario para eliminar
									throw new IllegalArgumentException("No hay Usuarios para Eliminar");
								}
								else {
								System.out.println("¿De que vehiculo desea eliminar el Mantenimiento");
								Usuarios.get(accesoUsuario).verVehiculos();
								vehiculo = (sc.nextInt() - 1);
								System.out.println("¿Que mantenimiento desea elimina?");
								Usuarios.get(accesoUsuario).seleccionarVehiculo(vehiculo).verMantenimientos();
								Usuarios.get(accesoUsuario).seleccionarVehiculo(vehiculo)
										.eliminarMantenimiento((sc.nextInt() - 1));}

								break;

							case 3:
								if(Usuarios.get(accesoUsuario).totalVehiculos()==0) {
									Usuarios.get(accesoUsuario).verVehiculos();
								}
								else {
								System.out.println("¿De que vehiculo desea ver los Mantenimientos");
								Usuarios.get(accesoUsuario).verVehiculos();
								vehiculo = (sc.nextInt() - 1);
								if(Usuarios.get(accesoUsuario).seleccionarVehiculo(vehiculo).totalMantenimientos()==0) {
									System.out.println("El Vehiculo seleccionado no tiene ningun mantenimiento realizado");
									
								}
								else {
								System.out.println("Los Mantenimientos realizados al coche seleccionnado son");
								Usuarios.get(accesoUsuario).seleccionarVehiculo(vehiculo).verMantenimientos();
								}
								}
								break;
							default:
								throw new IllegalArgumentException("Introduzca una opcion correcta");
							}
							break;
						case 4:
							Usuarios.get(accesoUsuario).verVehiculos();// Mostramos los vehiculos del Usuario
																		// seleccionado annteriormente.
							break;
						default:
							throw new IllegalArgumentException("Introduzca un valor dentro de las Opciones");
						}
					}
					break;
				case 4:
					guardarDatos(Usuarios);

					break;
				case 5:
					Usuarios = cargarDatos();
					break;
				case 6:
					System.exit(0);
					break;
				default:
					throw new IllegalArgumentException("Introduzca un valor dentro de las Opciones");
				}
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Introduce valores corecctos");
		}
	}

	// Metodos usados en el main.

	public static ArrayList<Usuario> cargarDatos() throws IOException, FileNotFoundException, ClassNotFoundException {
		ArrayList<Usuario> Usuarios;
		System.out.print("Leyendo ArrayList del fichero datos.dat.. ");

		ObjectInputStream leyendoFichero = new ObjectInputStream(new FileInputStream("datos.dat"));
		Usuarios = (ArrayList<Usuario>) leyendoFichero.readObject();
		leyendoFichero.close();

		System.out.println("ok!");
		System.out.println("Datos leídos del fichero:");
		return Usuarios;
	}

	public static void guardarDatos(ArrayList<Usuario> Usuarios) throws IOException, FileNotFoundException {
		System.out.print("Guardando datos en el fichero datos.dat.. ");

		ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("datos.dat"));
		escribiendoFichero.writeObject(Usuarios);
		escribiendoFichero.close();

		System.out.println("Datos Guardados con exito!");
	}

	public static void menuPrincipal() {
		System.out.println("--------------------------");
		System.out.println("¿Que desea hacer");
		System.out.println("--------------------------");
		System.out.println("1.Dar de Alta a un Usuario");
		System.out.println("--------------------------");
		System.out.println("2.Dar de Baja a un Usuario");
		System.out.println("--------------------------");
		System.out.println("3.Acceder a un Usuario");
		System.out.println("--------------------------");
		System.out.println("4.Guardar Base de Datos");
		System.out.println("--------------------------");
		System.out.println("5.Cargar Base de Datos");
		System.out.println("--------------------------");
		System.out.println("6.Cerrar el Programa");
		System.out.println("--------------------------");
	}

}

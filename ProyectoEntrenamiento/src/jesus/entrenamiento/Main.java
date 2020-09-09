package jesus.entrenamiento;

import java.util.ArrayList;
import java.util.List;

import jesus.entrenamiento.delegate.BicepsTricepsDelegate;
import jesus.entrenamiento.delegate.ClienteDelegate;
import jesus.entrenamiento.delegate.impl.BicepsTricepsDelegateImpl;
import jesus.entrenamiento.model.BicepsTriceps;
import jesus.entrenamiento.model.Cliente;
import jesus.entrenamiento.model.PiernasGluteos;
import jesus.entrenamiento.model.Semana;

public class Main {

	public static void main(String[] args) {

//----------------PIERNA Y GLUTEOS-----------------------------------------------		
		Semana diaPiernas = new Semana();
		PiernasGluteos rutinaPG1 = new PiernasGluteos(diaPiernas);
		PiernasGluteos rutinaPG2 = new PiernasGluteos(diaPiernas);
		PiernasGluteos rutinaPG3 = new PiernasGluteos(diaPiernas);
		PiernasGluteos rutinaPG4 = new PiernasGluteos(diaPiernas);

		rutinaPG1 = crearRutinaPiernas(diaPiernas, "Sentadillas al fondo", 25, 4);
		rutinaPG2 = crearRutinaPiernas(diaPiernas, "Zancadas o Desplantes", 20, 4);
		rutinaPG3 = crearRutinaPiernas(diaPiernas, "Extension de Cuadriceps", 20, 4);
		rutinaPG4 = crearRutinaPiernas(diaPiernas, "Femorales", 15, 4);

		System.out.println(
				"Para el dia : " + diaPiernas.getPiernasGluteos() + "\n" + "Tenemos los siguientes ejercicios : " + "\n"
						+ rutinaPG1.getDescripcion() + " | " + "\n" + rutinaPG2.getDescripcion() + " | " + "\n"
						+ rutinaPG3.getDescripcion() + " | " + "\n" + rutinaPG4.getDescripcion() + " | ");

//----------------Rutina Biceps y Triceps por DAO-----------------------------------------------
		Semana diaBicepsTriceps = new Semana();
		BicepsTriceps rutinaBT1 = new BicepsTriceps(diaBicepsTriceps);
		BicepsTriceps rutinaBT2 = new BicepsTriceps(diaBicepsTriceps);
		BicepsTriceps rutinaBT3 = new BicepsTriceps(diaBicepsTriceps);
		BicepsTriceps rutinaBT4 = new BicepsTriceps(diaBicepsTriceps);
		BicepsTricepsDelegate BT1 = new BicepsTricepsDelegateImpl();
		System.out.println(BT1.CrearRutinaBicepsTriceps(rutinaBT1, rutinaBT2, rutinaBT3, rutinaBT4) + "\n");

		// ----------------Crear Clientes por
		// DAO-----------------------------------------------
		System.out.println("\n//----------------Crear Clientes por DAO----------------------------");
		List<Cliente> CrearClientesDAO = new ArrayList<Cliente>();
		CrearClientesDAO = ClienteDelegate.crearCliente(null); // crea el cliente partiendo de un null
		for (Cliente clienteDelegate : CrearClientesDAO) {
			System.out.println(
					clienteDelegate.getNombre() + " " + clienteDelegate.getApellido() + " " + clienteDelegate.getRut());
		}

//----------------Clientes por Conexion (BD o Dammy)-----------------------------------------------
		System.out.println("\n//----------------Clientes por Conexion (BD o Dammy)----------------------------");
		List<Cliente> listaClientesDAO = new ArrayList<Cliente>();
		listaClientesDAO = ClienteDelegate.consultaCliente2();
		// ---------------- Lista de clientes por Conexion (BD o
		// Dammy)-----------------------------------------------
		System.out
				.println("\n//----------------Lista de clientes por Conexion (BD o Dammy)----------------------------");
		for (Cliente clienteDelegate : listaClientesDAO) {
			System.out.println(
					clienteDelegate.getNombre() + " " + clienteDelegate.getApellido() + " " + clienteDelegate.getRut());
		}

	}

	// ----------------METODOS APARTE----------------------------

	public static PiernasGluteos crearRutinaPiernas(Semana piernasGluteos, String descripcion, Integer repeticiones,
			Integer series) {

		Semana diaPiernas = new Semana();
		PiernasGluteos rutina = new PiernasGluteos(diaPiernas);
		diaPiernas.setPiernasGluteos(descripcion);
		rutina.setDescripcion(descripcion);
		rutina.setRepeticiones(repeticiones);
		rutina.setSeries(series);
		rutina.addDiaPiernasGluteos();
		return rutina;

	}

}

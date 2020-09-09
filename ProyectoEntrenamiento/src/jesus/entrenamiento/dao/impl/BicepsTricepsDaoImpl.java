package jesus.entrenamiento.dao.impl;


import jesus.entrenamiento.dao.BicepsTricepsDao;
import jesus.entrenamiento.model.BicepsTriceps;
import jesus.entrenamiento.model.Semana;

public class BicepsTricepsDaoImpl implements  BicepsTricepsDao {

	

	@Override
	public String CrearRutinaBicepsTriceps(BicepsTriceps rutinaBT1, BicepsTriceps rutinaBT2,
			BicepsTriceps rutinaBT3, BicepsTriceps rutinaBT4) {
		Semana diaBicepsTriceps = new Semana();
		rutinaBT1 = crearRutinaBicepsTriceps(diaBicepsTriceps, "Curl de Biceps", 25, 4);
		rutinaBT2 = crearRutinaBicepsTriceps(diaBicepsTriceps, "Banco Scott con Barra W", 20, 4);
		rutinaBT3 = crearRutinaBicepsTriceps(diaBicepsTriceps, "Patada de Triceps", 20, 4);
		rutinaBT4 = crearRutinaBicepsTriceps(diaBicepsTriceps, "Jalon de Triceps", 15, 4);
		// TODO Auto-generated method stub
		return "\nLa Rutina del martes es biceps y triceps, contiene los siguientes ejercicios : "
				+"\n"+ rutinaBT1.getDescripcion()+"\n"+rutinaBT2.getDescripcion()
				+"\n"+ rutinaBT3.getDescripcion() +"\n"+ rutinaBT4.getDescripcion();
	}
	

	public static BicepsTriceps crearRutinaBicepsTriceps(Semana bicepsTriceps, String descripcion, Integer repeticiones,
			Integer series) {

		Semana diaBicepsTriceps = new Semana();
		BicepsTriceps rutina = new BicepsTriceps(diaBicepsTriceps);
		diaBicepsTriceps.setPiernasGluteos(descripcion);
		rutina.setDescripcion(descripcion);
		rutina.setRepeticiones(repeticiones);
		rutina.setSeries(series);
		rutina.addDiaBicepsTriceps();
		return rutina;
}
}

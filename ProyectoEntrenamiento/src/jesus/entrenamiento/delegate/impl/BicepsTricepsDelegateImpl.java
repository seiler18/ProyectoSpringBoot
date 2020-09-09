package jesus.entrenamiento.delegate.impl;


import jesus.entrenamiento.dao.BicepsTricepsDao;
import jesus.entrenamiento.dao.impl.BicepsTricepsDaoImpl;
import jesus.entrenamiento.delegate.BicepsTricepsDelegate;
import jesus.entrenamiento.model.BicepsTriceps;

public class BicepsTricepsDelegateImpl implements BicepsTricepsDelegate {
BicepsTricepsDao bicepsTricepsDao = null;

	
	
	public BicepsTricepsDelegateImpl() {
		super();
		this.bicepsTricepsDao = new BicepsTricepsDaoImpl();
		
	}


	@Override
	public String CrearRutinaBicepsTriceps(BicepsTriceps rutinaBT1, BicepsTriceps rutinaBT2,
			BicepsTriceps rutinaBT3, BicepsTriceps rutinaBT4) {
		// TODO Auto-generated method stub
		return this.bicepsTricepsDao.CrearRutinaBicepsTriceps(rutinaBT1,rutinaBT2,rutinaBT3,rutinaBT4);
	}


}

package jesus.entrenamiento.model;


import java.util.List;

public class BicepsTriceps extends Rutinas {
private List<Semana>DiaBicepsTriceps;

public BicepsTriceps(Semana semana) {
	super();
	DiaBicepsTriceps = addDiaBicepsTriceps();
}

public List<Semana> getDiaBicepsTriceps() {
	return DiaBicepsTriceps;
}

public List<Semana> addDiaBicepsTriceps() {
	return this.DiaBicepsTriceps ;
}



}

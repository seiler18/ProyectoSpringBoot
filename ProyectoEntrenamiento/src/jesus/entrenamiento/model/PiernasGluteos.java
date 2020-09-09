package jesus.entrenamiento.model;

import java.util.List;

public class PiernasGluteos extends Rutinas {
private List<Semana>DiaPiernasGluteos;



public PiernasGluteos(Semana semana) {
	super();
	this.addDiaPiernasGluteos();
}



public List<Semana> getDiaPiernasGluteos() {
	return DiaPiernasGluteos;
}

public List<Semana> addDiaPiernasGluteos(){
	return this.DiaPiernasGluteos;
}


}



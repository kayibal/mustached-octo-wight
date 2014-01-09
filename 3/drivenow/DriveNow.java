package drivenow;

import drivenow.interfaces.IDrivenow;
import drivenow.interfaces.IFahrlehrerinBoundary;
import drivenow.interfaces.ISekretaerBoundary;

public class DriveNow implements IDrivenow {
	Ressourcenverwaltung rv;

	public DriveNow() {
		rv = new Ressourcenverwaltung();
	}

	public String getGruppenNummer() {
		return "T07G02";
	}

	public IFahrlehrerinBoundary getFahrlehrerinBoundary() {
		return new FahrlehrerinBoundary(rv);
	}

	public ISekretaerBoundary getSekretaerBoundary() {
		return new SekretaerBoundary(rv);
	}

	public void initialisieren() {
		// Konstruktoren sind überwertet
	}

	public void shutDown() {

	}
}

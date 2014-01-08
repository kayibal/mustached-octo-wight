package drivenow;

import drivenow.interfaces.IDrivenow;
import drivenew.

public class DriveNowImpl implements IDrivenow {
	public String getGruppenNummer() {
		return "T07G02";
	}

	public IFahrlehrerinBoundary getFahrlehrerinBoundary() {
		// return new FahrlehrerinBoundaryImpl();
		return null;
	}

	public ISekretaerBoundary getSekretaerBoundary() {
		// return new FahrlehrerinBoundaryImpl();
		return null;
	}

	public void initialisieren() {

	}

	public void shutDown() {

	}
}

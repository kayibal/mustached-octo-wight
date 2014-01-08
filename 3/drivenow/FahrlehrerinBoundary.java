package drivenow;

import drivenow.interfaces.IFahrlehrerinBoundary;
import drivenow.Systemereignis;

public class FahrlehrerinBoundary implements IFahrlehrerinBoundary {
	private Ressourcenverwaltung rv;

	public FahrlehrerinBoundary(Ressourcenverwaltung prv) {
		rv = prv;
	}

	public Systemereignis einloggenUndUnterrichtsstundenZurueckgeben(String name, String kennzeichen) {
		return new Systemereignis();
	}

	public String unterrichtsstundenZurueckgeben() {
		return "";
	}
}

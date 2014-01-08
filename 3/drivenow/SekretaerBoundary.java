package drivenow;

import java.util.Date;

import drivenow.interfaces.ISekretaerBoundary;
import drivenow.interfaces.ISekretaerBoundary.Stundenart;

public class SekretaerBoundary implements ISekretaerBoundary {
	private Ressourcenverwaltung rv;

	public SekretaerBoundary(Ressourcenverwaltung prv) {
		rv = prv;
	}

	public Systemereignis fahrlehrerinEintragen(String name, String kennzeichen) {
		Auto a = rv.findAuto(kennzeichen);

		if (a == null)
			return new Systemereignis(Systemereignis.Nachricht.Fahrlehrerin_nicht_hinzugefuegt_Auto_unbekannt);

		if (a.getHalter() != null)
			return new Systemereignis(Systemereignis.Nachricht.Fahrlehrerin_nicht_hinzugefuegt_Auto_vergeben);

		rv.addFahrlehrerin(new Fahrlehrerindaten(name, a));
		return new Systemereignis(Systemereignis.Nachricht.Fahrlehrerin_erfolgreich_hinzugefuegt);
	}

	public Systemereignis fahrschuelerEintragen(String name, String anschrift) {
		return new Systemereignis();
	}

	public Systemereignis fahrschulautoEintragen(String kennzeichen) {
		if (rv.findAuto(kennzeichen) != null)
			return new Systemereignis(Systemereignis.Nachricht.Auto_mit_kennzeichen_bereits_vorhanden);

		rv.addAuto(new Auto(kennzeichen));
		return new Systemereignis(Systemereignis.Nachricht.Fahrschulauto_erfolgreich_hinzugefuegt);
	}

	public Systemereignis theoriestundeEintragen(int thema, Date beginn) {
		return new Systemereignis();
	}

	public Systemereignis fahrstundeEintragen(String schuelerID, Stundenart art, Date beginn, int anzahl) {
		return new Systemereignis();
	}

	public Systemereignis theoriestundeVermerken(String schuelerID, Date beginn) {
		return new Systemereignis();
	}

	public Systemereignis fahrstundeLoeschen(String schuelerID, Date beginn) {
		return new Systemereignis();
	}

	public String datenbestandZurueckgeben() {
		return "";
	}

	public Systemereignis theoriepruefungszulassungUeberpruefen(String schuelerID) {
		return new Systemereignis();
	}

	public Systemereignis theoriepruefungsbestehenEintragen(String schuelerID) {
		return new Systemereignis();
	}

	public Systemereignis praxispruefungEintragen(String schuelerID, Date beginn) {
		return new Systemereignis();
	}
}

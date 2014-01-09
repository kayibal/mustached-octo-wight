package drivenow;

/**
 * Klasse fuer die Systemereignisse.
 *
 * Diese Klasse darf nicht veraendert werden.
 *
 * @author nicht mehr daniel
 */
public class Systemereignis {

	/**
	 * Jedes Systemereignis enthaelt eine Nachricht.
	 */
	private Nachricht nachricht;

	/**
	 * Ist das Systemereignis eine Antwort auf das Erstellen eines ID
	 * tragenden Objektes, wird die zugewiesene ID in diesem Feld zurueckgegeben.
	 */
	private String ID;

	/**
	 * Ist das Systemereignis eine Antwort auf die Anfrage nach einem
	 * Datenbestand, wird dieser als Textdarstellung in diesem Feld
	 * transportiert.
	 */
	private String text;

	public Systemereignis(Nachricht nachricht) {
		this.nachricht = nachricht;
	}

	/**
	 * Dummy Constructor
	 */
	public Systemereignis() {
		ID = "Dummy";
		text = "Fuck this";
		nachricht = Nachricht.Dummy;
	}

	public Nachricht getNachricht() {
		return nachricht;
	}

	public String getID() {
		return ID;
	}

	public String getText() {
		return text;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return nachricht.name();
	}

	public enum Nachricht {
		Auto_mit_kennzeichen_bereits_vorhanden,
		Fahrlehrerin_erfolgreich_hinzugefuegt,
		Fahrlehrerin_Login_nicht_erfolgreich,
		Fahrlehrerin_nicht_hinzugefuegt_Auto_unbekannt,
		Fahrlehrerin_nicht_hinzugefuegt_Auto_vergeben,
		Fahrlehrering_Login_erfolgreich,
		Fahrschueler_erfolgreich_hinzugefuegt,
		Fahrschueler_nicht_hinzugefuegt_keine_Fahrlehrerin_vorhanden,
		Fahrschulauto_erfolgreich_hinzugefuegt,
		Fahrstunde_erfolgreich_eingetragen,
		Fahrstunde_erfolgreich_geloescht,
		Fahrstunde_nicht_eingetragen_Lehrerin_nicht_verfuegbar,
		Fahrstunde_nicht_geloescht_Stunde_existiert_nicht,
		Praxispruefung_erfolgreich_eingtragen,
		Praxispruefung_nicht_eingetragen_Fahrlehrerin_nicht_verfuegbar,
		Praxispruefung_nicht_eingetragen_Sonderstunden_fehlen,
		Praxispruefung_nicht_eingetragen_Theoriepruefung_fehlt,
		Theoriepruefungsbestehen_erfolgreich_eingetragen,
		Theoriepruefungszulassung_erfolgreich_geprueft,
		Theoriepruefungszulassung_nicht_erfuellt_Grundlagen_fehlen,
		Theoriepruefungszulassung_nicht_erfuellt_Sonderstunden_fehlen,
		Theoriestunde_erfolgreich_hinzugefuegt,
		Theoriestunde_erfolgreich_vermerkt,
		Theoriestunde_nicht_hinzugefuegt_keine_Lehrerin_verfuegbar,
		Theoriestunde_nicht_hinzugefuegt_Raum_belegt,
		Theoriestunde_nicht_vermerkt_bereits_genug_Grundlagen,
		Theoriestunde_nicht_vermerkt_bereits_Sonderthema,
		Theoriestunde_nicht_vermerkt_bereits_vermerkt,
		Dummy
	}

}

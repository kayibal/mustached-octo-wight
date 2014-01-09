package drivenow;

import java.util.ArrayList;

public class Fahrschueler {
	private int id;
	private ArrayList<Theoriestunde> theoriestunden;
	private ArrayList<Fahrstunde> fahrstunden;
	private String adresse;
	private String name;
	private boolean theorie_bestanden;
	
	/**
	 * name und adresse werden im konstruktor gesetzt
	 */
	public Fahrschueler(String name, String adresse) {
		this.name = name;
		this.adresse = adresse;
		this.theorie_bestanden = false;
	}
	
	/**
	 * Gibt die ID des Schülers zurück
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * vermerkt eine Theoriestunde als absolviert
	 */
	public void addTheoriestunde(Theoriestunde t) {
		this.theoriestunden.add(t);
	}
	
	/**
	 * vermerkt eine Fahrstunde als absolviert
	 */
	public void addFahrstunde(Fahrstunde f){
		this.fahrstunden.add(f);
	}
	
	/**
	 * Überprüft ob eine bestimmte Stunde bereits absolviert wurde
	 */
	public boolean findeStunde(Theoriestunde ts){
		return theoriestunden.contains(ts);
	}
	
	/**
	 * Gib die Anzahl der absolvierten Grundlagenstunden zurück
	 */
	public int getAnzahlGrundlagen(){
		int anzahl = 0;
		for(Theoriestunde stunde: this.theoriestunden){
			if (stunde.getThema() < 12) anzahl++;
		}
		return anzahl;
	}
	
	/**
	 * Gibt true zurück falls der Schüler mindestens ein Sonderthema besucht hat
	 */
	public boolean sonderthemaBesucht(){
		for(Theoriestunde stunde: this.theoriestunden){
			if (stunde.getThema() > 12) return true;
		}
		return false;
	}
	/**
	 * vermerkt eine bestandene Theorieprüfung
	 */
	public void theorieBestanden(){
		this.theorie_bestanden = true;
	}
}

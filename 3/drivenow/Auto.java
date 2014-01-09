package drivenow;

public class Auto {
	private String kennzeichen;
	private Fahrlehrerindaten halter;

	public Auto(String kfz) {
		kennzeichen = kfz;
	}

	public Fahrlehrerindaten getHalter() {
		return halter;
	}

	public void setHalter(Fahrlehrerindaten fl) {
		halter = fl;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}
}

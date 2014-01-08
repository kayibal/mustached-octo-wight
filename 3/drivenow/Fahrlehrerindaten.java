package drivenow;

public class Fahrlehrerindaten {
	private String name;

	public Fahrlehrerindaten(String n, Auto a) {
		name = n;
		a.setHalter(this);
	}

	public String getName() {
		return name;
	}
}

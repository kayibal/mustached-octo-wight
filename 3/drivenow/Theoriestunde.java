package drivenow;

import java.util.Date;

public class Theoriestunde extends Unterrichtsstunde {
	private int thema;

	public Theoriestunde(int t, Date b) {
		super(b);
		thema = t;
	}

	public int getThema() {
		return thema;
	}

}

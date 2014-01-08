package drivenow;

import java.util.Date;

public class Theoriestunde {
	private int thema;
	private Date beginn;

	public Theoriestunde(int t, Date b) {
		thema = t;
		beginn = b;
	}

	public int getThema() {
		return thema;
	}

	public Date getBeginn() {
		return beginn;
	}
}

package drivenow;

import java.util.Date;

public abstract class Unterrichtsstunde {

	private Date beginn;
	
	Unterrichtsstunde(Date beginn){
		this.beginn = beginn;
	}
	
	public Date getBeginn(){
		return this.beginn;
	}
	
}

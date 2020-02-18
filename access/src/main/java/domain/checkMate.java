package domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class checkMate {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	private String access;
	private boolean output;
		
	public checkMate(String userId, String userAccess) 
	{
		this.id = userId;
		this.setAccess(userAccess);
	}
	
	public boolean getCheckMate(String userId, String userAccess) {
		return output;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

}
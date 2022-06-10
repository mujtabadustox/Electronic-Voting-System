package application;
import java.util.ArrayList;
public class PoliticalParty {
	int pid;
	String name;
	int votes;
	
	PersistanceHandler persHandler;

	void save(){
	persHandler.saveParty(this);

	}

	void setPersistanceHandler (PersistanceHandler ph)

	{
	this.persHandler=ph;
	}
	
	
	
	public PoliticalParty(int pid, String name) {
	
		this.pid = pid;
		this.name = name;
		votes=0;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public void incrementVote() {
		this.votes++;
	}

}

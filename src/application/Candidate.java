package application;

public class Candidate extends Citizen {


	private int Cid;
	private String partyName;
	private int partyId;
	private String area;
	private int votes;
	
	PersistanceHandler persHandler;

	void save(){
	persHandler.saveCandidate(this);

	}

	void setPersistanceHandler (PersistanceHandler ph)

	{
	this.persHandler=ph;
	}
	
	
	public Candidate(int id, String name, int age, String gender, String address, int cid, String partyName,
			int partyId, String area) {
		super(id, name, age, gender, address);
		Cid = cid;
		this.partyName = partyName;
		this.partyId = partyId;
		this.area = area;
		this.votes=0;
	}
	
	public int getCid() {
		return Cid;
	}
	public void setCid(int id) {
		this.Cid = id;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public int getPartyId() {
		return partyId;
	}
	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int vt) {
		this.votes=vt;
	}
	public void incrementVotes() {
		this.votes++;
	}
	public void displayCandidate() {
		super.display();
		System.out.println("Candidate Id:"+getCid());
		System.out.println("Party Name:"+ getPartyName());
		System.out.println("Area Elected:"+getArea());
	}

}

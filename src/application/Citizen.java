package application;

public class Citizen {

	private int id;
	private String name;
	private int age;
	private String gender;
	private String address;
	private boolean status;
	public static int count;
	
	PersistanceHandler persHandler;

	void save(){
	persHandler.saveCitizen(this);

	}

	void setPersistanceHandler (PersistanceHandler ph)

	{
	this.persHandler=ph;
	}
	
	public Citizen() {
		super();
	}

	public Citizen(int id, String name, int age, String gender, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.status=false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean st) {
		this.status = st;
	}
	public void display() {
		System.out.println("Citizen Id:"+getId());
		System.out.println("Name:"+getName());
		System.out.println("Age:"+getAge());
		System.out.println("Gender:"+getGender());
		System.out.println("Address:"+getAddress());
	}

}

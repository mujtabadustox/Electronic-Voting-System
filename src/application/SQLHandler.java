package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SQLHandler extends PersistanceHandler {
	
	@Override
	void saveCitizen(Citizen c) {
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Driver loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","12345");
			
			System.out.println("Connection Established!");
		String sql = "INSERT INTO Citizens \r\n"
				+ "(citizen_id,citizen_name,citizen_age,citizen_gender,citizen_address)\r\n"
				+ "VALUES\r\n"
				+ "(?,?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, c.getId());
		stmt.setString(2,c.getName());
		stmt.setInt(3, c.getAge());
		stmt.setString(4, c.getGender());
		stmt.setString(5,c.getAddress());
		
		
		int rowsinserted = stmt.executeUpdate();
		if(rowsinserted>0)System.out.println("\nCitizen Added Successfully");
		
		con.close();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}		
	}
	
	@Override
	void saveCandidate(Candidate c) {
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Driver loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","12345");
			
			System.out.println("Connection Established!");
		String sql = "INSERT INTO Candidates \r\n"
				+ "(candidate_id,area,citizen_id,praty_id)\r\n"
				+ "VALUES\r\n"
				+ "(?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, c.getCid());
		stmt.setString(2,c.getArea());
		stmt.setInt(3, c.getId());
		stmt.setInt(4, c.getPartyId());

		
		
		int rowsinserted = stmt.executeUpdate();
		if(rowsinserted>0)System.out.println("\nCandidate Added Successfully");
		
		con.close();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}		
	}
	
	
	@Override
	void saveParty(PoliticalParty p) {
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Driver loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","12345");
			
			System.out.println("Connection Established!");
		String sql = "INSERT INTO Parties \r\n"
				+ "(party_id,party_name)\r\n"
				+ "VALUES\r\n"
				+ "(?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1,p.getPid());
		stmt.setString(2,p.getName());
		
		
		
		int rowsinserted = stmt.executeUpdate();
		if(rowsinserted>0)System.out.println("\nParty Added Successfully");
		
		con.close();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}		
	}



}

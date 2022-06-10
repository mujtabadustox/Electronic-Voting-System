package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;

public class ControllerEVS {
	
	static Citizen[] Citizens = new Citizen[50];
	static int CTcount=0;
	
	static PoliticalParty[] Parties = new PoliticalParty[50];
	static int pcount=0;
	
	static Candidate[] CandidatesArr = new Candidate[50];
	static int cncount=0;
	static int canId=1;
	
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	//registration
	@FXML
	private TextField myTextName;
	@FXML
	private TextField myTextAge;
	@FXML
	private TextField myTextCnic;
	@FXML
	private TextField myTextAddress;
	@FXML
	private TextField myTextGender;
	
	//login
	@FXML
	private TextField loginId;
	@FXML
	private TextField loginName;
	
	@FXML
	private Label MyCandidates;
	
	//Candidates
	@FXML
	private TextField myTextName1;
	@FXML
	private TextField myTextAge1;
	@FXML
	private TextField myTextCnic1;
	@FXML
	private TextField myTextAddress1;
	@FXML
	private TextField myTextGender1;
	@FXML
	private TextField myTextAreas;
	@FXML
	private TextField myTextParties;
	@FXML
	private Label myTextA;
	@FXML
	private Label myTextP;
	@FXML
	private Label myTextA1;
	@FXML
	private Label myTextA2;
	@FXML
	private Label myTextA3;

	//Parties
	@FXML
	private TextField partyInput;
	
	//Vote
	@FXML
	private TextField AreaInput;
	@FXML
	private TextField VoteInput;
	
	//ShowResult
	@FXML
	private Label myTextA4;
	
	String areas= "NA-245\nNA-246\nNA-247\nNA-248\nNA-249\nNA-250\n";
	String pparties= "MQM\nPTI\nPML-Q\nPML-N\nAWP\n";
	


	
	public void writeToMySQL() {
		PersistanceHandler myHandler = new SQLHandler();
		int size=CTcount-1;
		Citizens[size].setPersistanceHandler(myHandler);
		Citizens[size].save();
	}
	public void writeToMySQL1() {
		PersistanceHandler myHandler = new SQLHandler();
		int size=cncount-1;
		CandidatesArr[size].setPersistanceHandler(myHandler);
		CandidatesArr[size].save();
	}
	public void writeToMySQL2() {
		PersistanceHandler myHandler = new SQLHandler();
		int size=pcount-1;
		Parties[size].setPersistanceHandler(myHandler);
		Parties[size].save();
	}
	public void Menu(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void AdminScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("AdminScreen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void PartyScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("PartyScreen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void CScreen(ActionEvent event) throws IOException {
		
		
		
		root = FXMLLoader.load(getClass().getResource("Candidate.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		
	}
	
	public void VoteS(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Vote.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void Result(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Result.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void proceed(ActionEvent event) throws IOException {
		myTextA.setText(areas);
		myTextP.setText(pparties);
		
	}
	public void proceed1(ActionEvent event) throws IOException {
		myTextA1.setText(pparties);
	}
	public void proceed2(ActionEvent event) throws IOException {
		myTextA2.setText(areas);
	}
	public void HowToVote(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("HowToVote.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void VoteScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("VoteScreen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Register(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Register.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void login(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void Submit(ActionEvent event) throws IOException {
		
		int id;
		int age;
		String cname;
		String ad;
		String gender;
		boolean aa=true;
		
		cname=myTextName.getText();
		id=Integer.parseInt(myTextCnic.getText());
		age=Integer.parseInt(myTextAge.getText());
		ad=myTextAddress.getText();
		gender=myTextGender.getText();
		
		
		boolean found=false;
		
		for (int i=0 ; i<CTcount ; i++) {
			if (Citizens[i]!=null) {
				
				if (Citizens[i].getId()==id ) {
					
					System.out.println("Id is in Use");
					aa=false;
				
				}
				}
		}
		
		for (int i=0 ; i<CTcount ; i++) {
			
			if (Citizens[i]!=null) {
				
					if (Citizens[i].getName().equals(cname) && Citizens[i].getAge()==age && Citizens[i].getAddress().equals(ad) && Citizens[i].getGender().equals(gender)) {
				found=true;
					}
			}
			
		}
		
		if(found==true) {
			System.out.println("Account Already Exists");
		}else {
		
		Citizens[CTcount]=new Citizen(id,cname,age,gender,ad);
		Citizens[CTcount].display();
		CTcount++;
		System.out.println("CTcount:"+CTcount);
		
		writeToMySQL();
		aa=true;
		
		
		}
			
				if (aa==true) {
					root = FXMLLoader.load(getClass().getResource("Success.fxml"));
					stage = (Stage)((Node)event.getSource()).getScene().getWindow();
					scene = new Scene(root);
					stage.setScene(scene);
					stage.show();
				}{
					System.out.println("HMM");
				}
				
	}
	
public void vLogin(ActionEvent event) throws IOException {
		
		int id;
		String cname;
		boolean check=false;
	
		cname=loginName.getText();
		id=Integer.parseInt(loginId.getText());
		
		System.out.println("id:"+id);
		System.out.println("name:"+cname);
		
		System.out.println("ctcount:"+CTcount);
		
		
		for (int i=0 ;i<CTcount; i++) {
			if (Citizens[i]!=null) {
					System.out.println("name:"+Citizens[i].getName());
					System.out.println("Id:"+Citizens[i].getId());
			}
			
		}
		
		for (int i=0 ;i<CTcount; i++) {
			if (Citizens[i]!=null) {
				if (Citizens[i].getId()==id && (cname.equals(Citizens[i].getName()))) {
					System.out.println("name:"+Citizens[i].getName());
					check=true;
				}
			}
			
		}
		
		System.out.println("Check:"+check);
		
		if (check==true) {
		
		root = FXMLLoader.load(getClass().getResource("SuccessLogin.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		}

		
		

				
	}
	

public void viewInfo(ActionEvent event) throws IOException {
	root = FXMLLoader.load(getClass().getResource("ViewInfo.fxml"));
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
	
public void showCandidate(ActionEvent event) throws IOException {
	
	CandidatesArr[cncount]=new Candidate(129,"ali",20,"male","islamabad",canId,"pti",123,"na-250");
	cncount++;
	canId++;
	
	CandidatesArr[cncount]=new Candidate(156,"yasir",29,"male","islamabad",canId,"pti",127,"na-250");
	cncount++;
	canId++;
	
	CandidatesArr[cncount]=new Candidate(196,"yasir",29,"male","islamabad",canId,"pti",127,"na-250");
	cncount++;
	canId++;
	
	String msg="";
	
	
	for (int i=0 ;i<cncount; i++) {
		if (CandidatesArr[i]!=null) {
			String x= CandidatesArr[i].getName();
			String y=String.valueOf(CandidatesArr[i].getAge());
			String z=CandidatesArr[i].getPartyName();
			String k=CandidatesArr[i].getGender();
			msg=msg+"Name: ";
			msg=msg+x;
			msg=msg+"\t";
			msg=msg+"Age: ";
			msg=msg+y;
			msg=msg+"\t";
			msg=msg+"Party: ";
			msg=msg+z;
			msg=msg+"\t";
			msg=msg+"Gender: ";
			msg=msg+k;
			msg=msg+"\t";
			msg=msg+"\n\n";
			}
		}
	
	
	MyCandidates.setText(msg);
	
	
}



public void showCandidate1(ActionEvent event) throws IOException {
	
	
	String msg="";
	
	
	for (int i=0 ;i<cncount; i++) {
		if (CandidatesArr[i]!=null) {
			String x= CandidatesArr[i].getName();
			String y=String.valueOf(CandidatesArr[i].getAge());
			String z=CandidatesArr[i].getPartyName();
			String k=CandidatesArr[i].getGender();
			msg=msg+"Name: ";
			msg=msg+x;
			msg=msg+"\t";
			msg=msg+"Age: ";
			msg=msg+y;
			msg=msg+"\t";
			msg=msg+"Party: ";
			msg=msg+z;
			msg=msg+"\t";
			msg=msg+"Gender: ";
			msg=msg+k;
			msg=msg+"\t";
			msg=msg+"\n\n";
			}
		}
	
	
	myTextA3.setText(msg);
	
	
}

public void createCandidate(ActionEvent event) throws IOException{

int cid;
int age;
String cname;
String add;
String gender;
String area;
String pp;
boolean aa=true;

cname=myTextName1.getText();
cid=Integer.parseInt(myTextCnic1.getText());
age=Integer.parseInt(myTextAge1.getText());
add=myTextAddress1.getText();
gender=myTextGender1.getText();
area=myTextAreas.getText();
pp=myTextParties.getText();

{
	
	int pID=0;
	String pName="";
	for (int i=0 ;i<pcount;i++) {
		if(Parties[i].getName().equals(pp)) {
			pID=Parties[i].getPid();
			pName=Parties[i].getName();
		}
	}
	
	CandidatesArr[cncount]=new Candidate(cid,cname,age,gender,add,canId,pName,pID,area);
	CandidatesArr[cncount].displayCandidate();
	cncount++;
	canId++;
	
	writeToMySQL1();

}
	
root = FXMLLoader.load(getClass().getResource("SuccessCandidate.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();

}

public void partyAdd(ActionEvent event) throws IOException {
	String abc="";
	abc=partyInput.getText();
	System.out.println("Party:"+abc);
	
	int c=pcount+1;
	Parties[pcount]=new PoliticalParty(c,abc);
	pcount++;
	
	writeToMySQL2();
	
	root = FXMLLoader.load(getClass().getResource("SuccessParty.fxml"));
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
	
	
}

public void vote(ActionEvent event) throws IOException {
	
	String Area=AreaInput.getText();
	String PartyName=VoteInput.getText();	
	
	System.out.println("Area:"+Area);
	System.out.println("Vote:"+PartyName);
	
	for (int i=0 ;i<cncount; i++) {
		if (CandidatesArr[i]!=null) {
			if(CandidatesArr[i].getArea().equals(Area) && CandidatesArr[i].getPartyName().equals(PartyName)) {
				CandidatesArr[i].incrementVotes();
			}
			}
		}
	
//	for (int i=0 ;i<CTcount; i++) {
//		if (Citizens[i]!=null) {
//			if(Citizens[i].getId()==citizenId) {
//				Citizens[i].setStatus(true);
//			}
//			}
//		}
	
	for (int i=0 ;i<pcount; i++) {
		if (Parties[i]!=null) {
			if(Parties[i].getName().equals(PartyName)) {
				Parties[i].incrementVote();
			}
			}
		}
	
	root = FXMLLoader.load(getClass().getResource("SuccessVote.fxml"));
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
	
	
}

public void showResult(ActionEvent event) throws IOException {
	

	String msg="";
	for (int i=0 ;i<pcount;i++) {
		String y=String.valueOf(Parties[i].getPid());
		String x=String.valueOf(Parties[i].getVotes());
		String z=Parties[i].getName();
		msg=msg+"Name: ";
		msg=msg+z;
		msg=msg+"\t";
		msg=msg+"Id: ";
		msg=msg+y;
		msg=msg+"\t";
		msg=msg+"Votes: ";
		msg=msg+x;
		msg=msg+"\n\n";
	}
	
	myTextA4.setText(msg);
	
}

}

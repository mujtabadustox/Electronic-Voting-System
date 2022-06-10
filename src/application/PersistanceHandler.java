package application;

public abstract class PersistanceHandler {
	abstract void saveCitizen(Citizen c);
	abstract void saveCandidate(Candidate cn);
	abstract void saveParty(PoliticalParty pp);
}

package model;

public class Posology {
	String users;
	int dose;
	String period;
	String recomendations;
	
	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public int getDose() {
		return dose;
	}

	public void setDose(int dose) {
		this.dose = dose;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getRecomendations() {
		return recomendations;
	}

	public void setRecomendations(String recomendations) {
		this.recomendations = recomendations;
	}

	public Posology(String users, int dose, String period, String recomendations) {
		this.users = users;
		this.dose = dose;
		this.period = period;
		this.recomendations = recomendations;
	}
	
	public String toString() {
		return "Usuarios: " + users + "\nDosis: " + dose + "\nPeriodo: " + period + "\nRecomendaciones: " + recomendations;
	}
	
}
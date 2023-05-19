package model;

public class Game {
	private Question question1;
	private Question question3;
	private Question question2;
	
	
	public boolean determineACorrect() {
		boolean rta;
		
		if (question1.getResponse() == 'v' ) {
			rta = true;
		}else {
			rta = false;
		}
		return rta;
	}
	
	public boolean determineBCorrect() {
		boolean rta;
		
		if (question2.getResponse() == 'v' ) {
			rta = true;
		}else {
			rta = false;
		}
		return rta;
	}
	
	public boolean determineCCorrect() {
		boolean rta;
		
		if (question3.getResponse() == 'f' ) {
			rta = true;
		}else {
			rta = false;
		}
		return rta;
	}
	
	public void setQuestion1(Question question1) {
		this.question1 = question1;
	}
	public void setQuestion2(Question question2) {
		this.question2 = question2;
	}
	public void setQuestion3(Question question3) {
		this.question3 = question3;
	}
}

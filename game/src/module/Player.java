package module;

public class Player {
	
	public int number = (int)(Math.random()*10+0);
	public String name = "";
	
	public void playerGuess() {
	System.out.println("Yo creo que es: " + number + "---" + name);
	}
}

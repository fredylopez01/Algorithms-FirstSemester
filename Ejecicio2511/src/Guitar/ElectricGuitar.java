package Guitar;

public class ElectricGuitar {
	String brand;
	int numOfPickups;
	boolean rockStarUsesIt;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	protected int getNumOfPickups() {
		return numOfPickups;
	}
	public void setNumOfPickups(int numOfPickups) {
		this.numOfPickups = numOfPickups;
	}
	public boolean isRockStarUsesIt() {
		return rockStarUsesIt;
	}
	public void setRockStarUsesIt(boolean rockStarUsesIt) {
		this.rockStarUsesIt = rockStarUsesIt;
	}
}

package model;

public class Drug {
	String name;
	String manufacturer;
	String routeOfAdministration;
	Posology posology;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getRouteOfAdministration() {
		return routeOfAdministration;
	}

	public void setRouteOfAdministration(String routeOfAdministration) {
		this.routeOfAdministration = routeOfAdministration;
	}

	public Posology getPosology() {
		return posology;
	}

	public void setPosology(Posology posology) {
		this.posology = posology;
	}

	public Drug(String name, String manufacturer, String routeOfAdministration, Posology posology) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.routeOfAdministration = routeOfAdministration;
		this.posology = posology;
	}

	public String toString() {
		return "Nombre del medicamento: " + name + "\nFabricante del medicamento: " + manufacturer + "\nVía de administración: " + routeOfAdministration;
	}
	
	
}
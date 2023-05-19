package presenter;

import model.Drug;
import model.Posology;
import view.View;

public class Presenter {
	View one = new View();
	Posology ola = new Posology("Adultos y mayores de 16", 500, "6 horas", "No debe tomar este medicannto con el estomago vacio");
	Drug aspirina = new Drug("Aspirina", "Bayer", "Oral", ola);
	
	public void drugPrint() {
		one.showMessage(aspirina.toString());
		one.showMessage(aspirina.getPosology().toString());
	}
	
	public void createDrug(int x) {
		Drug[] listDrugs = new Drug[x];
		for (int y = 0; y < x; x++) {
			one.showMessage("");
			String name = one.readName("Ingrese el nombre del nuevo medicamento: ");
			String manufacturer = one.readName("Ingrese fabricante del medicamento: ");
			String routeOfAdministration = one.readName("Ingrese la via de administracion del medicamento: ");
			listDrugs[y] = new Drug(name, manufacturer, routeOfAdministration, ola);
			listDrugs[y].getPosology().toString();
		}
	}
	
	public static void main(String [] args) {
		View one = new View();
		Presenter first = new Presenter();
		first.drugPrint();
		int x = one.readInt("\nCuantos medicamentos desea crear con la misma posologia: ");
		first.createDrug(x);
	}
}
package presenter;

import model.Dog;
import view.View;

public class Presenter {
  View view;
  Dog[] myDogs;
  Dog dog1;

  public Presenter() {
    this.view = new View();
    this.myDogs = new Dog[5];
  }

  public void run() {
    String menu = "Seleccione una opción para empezar:\n 1.Crear Perrito\n 2.Invocar el ladrido\n 3.Envejecer\n 4.Salir \n";
    int opcion = 0;
    int pos = 0;
    do {
      opcion = view.readInt(menu);
      switch (opcion) {
        case 1:
          if (pos >= 5)
            view.showMessage("Ya creo todos los perritos posibles; maximo 5");
          else {
            myDogs[pos] = dogConstructor();
            pos++;
          }
          break;
        case 2:
          view.showMessage("estos son los perrtios  existentes \n");
          for (int i = 0; i < 5; i++) {
            dog1 = myDogs[i];
            if (dog1 != null)
              view.showMessage(i + ". " + dog1.getName());
          }
          int j = view.readInt("Indique el numero de perrito que debe ladrar");
          if (myDogs[j] != null)
            view.showMessage(myDogs[j].bark());
          else
            view.showMessage("no existen perritos, por favor cree uno antes.");
          break;
        case 3:
          if (dog1 != null) {
            int age = view.readInt("Por favor ingrese la nueva edad  de " + dog1.getName() + ": ");
            dog1.getOlder(age);
          } else
            view.showMessage("no existen perritos, por favor cree uno antes.");
          break;
        case 4:
          view.showMessage("Regresa pronto!!");
          break;
      }
    } while (opcion != 4);
    /*
     * / view.showMessage(dog1.bark(2));
     * age = view.readInt("Por favor ingrese la nueva edad  de " + dog1.getName() +
     * ": ");
     * dog1.getOlder(age);
     * 
     */

  }

  public Dog dogConstructor() {
    String name = view.readString("Por favor ingrese el nombre del perrito: ");
    int size = view.readInt("Por favor ingrese la altura  de " + name + ": ");
    int age = view.readInt("Por favor ingrese la edad  de " + name + ": ");
    Dog dog1 = new Dog(name, age, size);
    return dog1;
  }

  public static void main(String[] args) {
    new Presenter().run();

  }

}

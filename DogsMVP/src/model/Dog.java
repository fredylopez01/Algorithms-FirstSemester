package model;

public class Dog {
  private String name;
  private int age;
  private int size;

  public Dog() {
    this.name = "na";
    this.age = 0;
    this.size = 0;
  }

  public Dog(String name, int age, int size) {
    this.name = name;
    this.age = age;
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getSize() {
    return size;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @param age the age to set
   */
  public void setAge(int age) {
    this.age = age;
  }

  /**
   * @param size the size to set
   */
  public void setSize(int size) {
    this.size = size;
  }

  public String bark() {
    String result = "¿?";
    if (size <= 20) {
      result = "Yip Yip!! ";
    } else if (size > 20 && size < 50) {
      result = "Guau Guau!! ";
    } else
      result = "Ruff Ruff!! ";
    return result;
  }

  public String bark(int times) {
    String result = "";
    for (; times > 0; times--) {
      result += this.bark();
    }
    return this.name + " dice " + result;
  }

  public void getOlder(int age) {
    this.age = age;
    if (this.age <= 2)
      this.size = 20;
    else if (this.age > 2 && this.age <= 7)
      this.size = 50;
    else
      this.size = Integer.parseInt((Float.parseFloat("" + this.size) * 1.1) + "");
  }

}

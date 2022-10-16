public class Car {

  private String make;
  private String model;
  private int year;

  public Car(String make, String model, int year) {
    this.setMake(make);
    this.setModel(model);
    this.setYear(year);
  }

  // Copy Constructor
  public Car(Car objCar) {
    this.copy(objCar);
  }

  // Copy Object
  public void copy(Car x) {
    this.setMake(x.getMake());
    this.setModel(x.getModel());
    this.setYear(x.getYear());
  }

  // Setters
  private void setMake(String make) {
    this.make = make;
  }

  private void setModel(String model) {
    this.model = model;
  }

  private void setYear(int year) {
    this.year = year;
  }

  // getters
  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }
}

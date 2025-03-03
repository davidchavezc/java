public class Empleado extends Persona {
  String empresa;
  double salario;

  @Override
  public void saludar(){
    super.saludar();
    System.out.println("Trabajo en " + empresa + " y gano " + salario + " pesos al mes.");
  }
}

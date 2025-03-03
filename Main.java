public class Main {
  public static void main(String[] args){
    Persona persona1 = new Persona();
    persona1.nombre = "David";
    persona1.edad = 19;

    persona1.saludar();

    Empleado empleado1 = new Empleado();
    empleado1.nombre = "Iván";
    empleado1.edad = 21;
    empleado1.empresa = "Microsoft";
    empleado1.salario = 65000;

    empleado1.saludar();
  }
}
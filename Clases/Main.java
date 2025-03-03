public class Main {
  public static void main(String[] args){
    Persona persona = new Persona();
    persona.nombre = "David";
    persona.edad = 19;

    persona.saludar();

    Empleado empleado = new Empleado();
    empleado.nombre = "Iván";
    empleado.edad = 21;
    empleado.empresa = "Microsoft";
    empleado.salario = 9867.30;

    empleado.saludar();

    Estudiante estudiante = new Estudiante();
    estudiante.nombre = "Gael";
    estudiante.edad = 20;
    estudiante.escuela = "FIME";
    estudiante.carrera = "ITS";

    estudiante.saludar();
  }
}
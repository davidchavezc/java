public class Estudiante extends Persona{
  String carrera;
  String escuela;

  @Override
  public void saludar(){
    super.saludar();
    System.out.println("Estudio " + carrera + " en " + escuela);
  }
}

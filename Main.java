public class Main {
  public static void main(String[] args) {
    caracteresEnUltimaPalabra("Anita lava la tina");
  }
  static void esPalindromo(String word){
    String tmpWord = word.toLowerCase().replaceAll("\\s","");
    String reverseWord = "";
    for(int i = 1; tmpWord.length() >= i; i++){
      reverseWord += tmpWord.charAt((tmpWord.length())-i);
    }
    if(reverseWord.equals(tmpWord)){
      System.out.println("Sí, el string dado es palíndromo.");
    }
    else{
      System.out.println("No, el string no es palíndromo.");
    }
  }

  static void factorial(int num){
    int factorial = 1;
    for(int i = num; i > 0; i--){
      factorial=factorial*i;
    }
    System.out.println(factorial);
  }

  static void caracteresEnUltimaPalabra(String string){
    String[] palabrasDelString = string.split("\\s");
    System.out.println(palabrasDelString[(palabrasDelString.length)-1]);
  }
}
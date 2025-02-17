public class Main {
  public static void main(String[] args) {
    caracteresEnUltimaPalabra("Anita lava la tina");
  }
  static boolean esPalindromo(String word){
    String tmpWord = word.toLowerCase().replaceAll("\\s","");
    String reverseWord = "";
    for(int i = 1; tmpWord.length() >= i; i++){
      reverseWord += tmpWord.charAt((tmpWord.length())-i);
    }
    if(reverseWord.equals(tmpWord)){ return true;} else{return false;}
  }

  static Integer factorial(int num){
    int factorial = 1;
    for(int i = num; i > 0; i--){
      factorial=factorial*i;
    }
    return factorial;
  }

  static String caracteresEnUltimaPalabra(String string){
    String[] palabrasDelString = string.split("\\s");
    return(palabrasDelString[(palabrasDelString.length)-1]);
  }
}
public class Main {
  public static void main(String[] args) {
    System.out.println("PRUEBA 1. CHECAR SI UN STRING ES PALINDROMO");
    String lookForWord = System.console().readLine();
    String evalWord = lookForWord.toLowerCase().replaceAll("\\s","");
    String reverseWord = "";
    for(int i = 1; evalWord.length() >= i; i++){
      reverseWord += evalWord.charAt((evalWord.length())-i);
    }
    if(reverseWord.equals(evalWord)){
      System.out.println("Sí, el string dado es palíndromo.");
    }
    else{
      System.out.println("No, el string no es palíndromo.");
    }
    System.out.println(lookForWord);
    System.out.println(reverseWord);
    System.out.println("PRUEBA 2. FACTORIAL DE UN NUMERO");
    String evalNum = System.console().readLine();
    int intEvalNum = Integer.parseInt(evalNum);
    int factorial = 1;
    for(int i = intEvalNum; i > 0; i--){
      factorial=factorial*i;
    }
    System.out.println(factorial);
  }
}
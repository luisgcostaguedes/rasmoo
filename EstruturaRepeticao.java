public class EstruturaRepeticao {
  public static void main(String[] args) {
    int contador = 4;
    while (contador < 10) {
      System.out.println("Contador while: " + contador);
      contador++;
    }
    System.out.println("----------------------------------------------------");

    for (int i = 0; i < 5; i++) {
      System.out.println("Contador for: " + i);
    }

    System.out.println("----------------------------------------------------");

    // do {
    // System.out.println("Contador do while: " + contador);
    // contador++;
    // } while (contador < 10);
  }
}

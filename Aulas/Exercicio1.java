package Aulas;
import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a temperatura em Celsius: ");
    double celsius = scanner.nextDouble();
    double fahrenheit = (celsius * 1.8) + 32;
    double kelvin = celsius + 273.15;

    System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    System.out.println("A temperatura em Kelvin é: " + kelvin);
    scanner.close();

  }

}

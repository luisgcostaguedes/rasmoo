package Bank.src;
public class TestaConta {

  // Podemos ver que para criar uma conta é necesário colocar o tipo que vai ser a
  // primeriaConta, como não é nehum número e sim um objeto, é necessário colocar
  // o tipo da classe Conta. Para assim darmos a atribuição de uma new Conta()
  // para a variável primeiraConta.

  public static void main(String[] args) {
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 200;
    primeiraConta.agencia = 1;
    primeiraConta.numeroConta = 1234;
    primeiraConta.titular = "Batatinha";

    System.out.println("Olá " + primeiraConta.titular + "!" + " Seu saldo é de: " + primeiraConta.saldo);
    System.out.println("Agência: " + primeiraConta.agencia);
    System.out.println("Número da conta: " + primeiraConta.numeroConta);
  }
}

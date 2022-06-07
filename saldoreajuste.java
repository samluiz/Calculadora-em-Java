import java.util.Scanner;

public class saldoreajuste {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe seu saldo: ");
    double saldo = sc.nextDouble();

    double reajuste = (saldo * 0.01) + saldo;

    System.out.println("Seu saldo anterior era de R$" + saldo + ". Com o reajuste, passou a ser R$" + reajuste + ".");

    sc.close();
  }

}

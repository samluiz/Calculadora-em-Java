import java.util.Scanner;

public class troco {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    double conta, pago, sobra, troco = 0;
    int i = 0, valor, qtNotas = 0;

    System.out.println("Informe o valor da conta: ");
    conta = sc.nextDouble();

    System.out.println("Informe o valor pago: ");
    pago = sc.nextDouble();

    sobra = conta - pago;
    
    if (pago < conta) {
      System.out.println("Valor insuficiente. Faltam R$" + sobra);
    }

    else if (pago == conta) {
      System.out.println("O valor pago é igual ao valor da conta.");
    }

    else {
      int[] notas = {100, 50, 20, 10, 5, 2, 1};
      troco = pago - conta;
      valor = (int)troco;
      System.out.println("Troco: " + troco);
      while (valor != 0) {
        qtNotas = valor / notas[i];
        if (qtNotas != 0) {
          valor = valor % notas[i];
        }
        System.out.println(qtNotas + " nota(s) de R$" + notas[i] + "\n");
        i++;
      }
      
    }

    sc.close();
  }
}

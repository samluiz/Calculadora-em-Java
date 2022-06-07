import java.util.Scanner;

public class calculoipi {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    Double peca1[] = new Double[3];
    Double peca2[] = new Double[3];
    Double valorTotal;

    System.out.println("Informe a porcentagem do IPI a ser acrescido no valor das peças: ");
    Double ipi = sc.nextDouble();

    System.out.println("Informe, respectivamente, o código, o valor unitário e a quantidade de peças 1: ");
    for (int i = 0; i < 3; i++) {
      peca1[i] = sc.nextDouble();
    }

    System.out.println("Informe, respectivamente, o código, o valor unitário e a quantidade de peças 2: ");
    for (int i = 0; i < 3; i++) {
      peca2[i] = sc.nextDouble();
    }

    sc.close();

    valorTotal = (peca1[1]*peca1[2] + peca2[1]*peca2[2]) * (ipi/100 + 1);

    System.out.println("O valor total a ser pago da peça de código " + peca1[0] + " com a peça de código " + peca2[0] + " é de R$" + valorTotal + ".");

  }
}

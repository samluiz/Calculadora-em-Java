import java.util.Scanner;

public class contaRestaurante {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double[] pizza = new Double[2];
    Double[] refri = new Double[2];

    System.out.println("Informe a quantidade de pizzas e o valor respectivamente: ");
    for (int i = 0; i < 2; i++) {
      pizza[i] = sc.nextDouble();

    }

    System.out.println("Informe a quantidade de refrigerantes e o valor respectivamente: ");
    for (int i = 0; i < 2; i++) {
      refri[i] = sc.nextDouble();

    }

    System.out.print("Informe a quantidade de pessoas da turma: ");
    int pessoas = sc.nextInt();

    Double conta = (pizza[0] * pizza[1]) + (refri[0] * refri[1])
        + ((pizza[0] * pizza[1]) + (refri[0] * refri[1]) * 0.10);

    Double contaDividida = conta / pessoas;

    System.out.println("A conta final deu R$" + conta + ". Cada pessoa na turma irá pagar R$" + contaDividida + ".");

    sc.close();

  }
}

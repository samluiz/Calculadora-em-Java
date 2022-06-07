import java.util.Scanner;

public class salariocomissao {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe o nome do vendedor: ");
    String nome = sc.nextLine();

    System.out.print("\nInforme o salário fixo do vendedor: ");
    Double salFixo = sc.nextDouble();

    System.out.print("\nInforme o valor total de vendas efetuadas pelo vendedor: ");
    Double totalVendas = sc.nextDouble();

    System.out.print("\nInforme o percentual que o vendedor recebe sobre o total de vendas: ");
    Double percentual = sc.nextDouble();

    sc.close();

    Double salTotal = salFixo + (totalVendas *(percentual / 100));

    System.out.println("O salário total do vendedor " + nome + " é de R$" + salTotal + ".");

  }
}

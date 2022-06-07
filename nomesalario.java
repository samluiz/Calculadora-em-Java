import java.util.Scanner;

public class nomesalario {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe o nome do funcionário: ");
    String nome = sc.nextLine();

    System.out.print("\nInforme o número de horas trabalhadas: ");
    Double horas = sc.nextDouble();

    System.out.print("\nInforme o valor recebido por hora: ");
    Double valorHoras = sc.nextDouble();

    System.out.print("\nInforme o número de filhos: ");
    Integer filhos = sc.nextInt();

    sc.close();

    Double bonus = filhos * 0.03;
    Double salario = (horas * valorHoras) + bonus;

    System.out.println("O funcionário " + nome + " recebe o salário bruto de R$" + salario + ".");

  }
}

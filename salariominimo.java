import java.util.Scanner;

public class salariominimo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contador = 0;

    System.out.println("Informe o valor do salário mínimo atualmente: ");
    Double salarioMinAtual = sc.nextDouble();

    System.out.println("Informe seu salário atual: ");
    Double salarioUser = sc.nextDouble();

    sc.close();

    while (salarioUser >= salarioMinAtual) {
      contador++;
      salarioUser = salarioUser - salarioMinAtual;
    }
    System.out.println("Você recebe " + contador + " salários mínimos.");
  }
}

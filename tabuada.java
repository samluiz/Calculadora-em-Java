import java.util.Scanner;

public class tabuada {
  public static void main(String[] args) {
    int number, result;

    System.out.println("Bem vindo a tabuada!");

    try (Scanner reader = new Scanner(System.in)) {
      System.out.print("Digite um número: ");
      number = reader.nextInt();
    }
    for (int i = 1; i <= 10; i++) {
      result = number * i;
      System.out.println(number + " x " + i + " = " + result);
    }
  }
}

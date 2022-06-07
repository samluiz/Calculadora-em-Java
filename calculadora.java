import java.util.Scanner;

public class calculadora {
  public static void main(String[] args) {
    try (Scanner reader = new Scanner(System.in)) {
      double numbers[] = new double[2];
      double result;
      int menu;
      char userInput;

      do {
        System.out.println("Bem vindo! Sou a calculadora de dois números!");
        System.out.println(
            "Escolha a operação que deseja realizar\n[1] ADIÇÃO\n[2] SUBTRAÇÃO\n[3] MULTIPLICAÇÃO\n[4] DIVISÃO\n[0] SAIR");
        menu = reader.nextInt();

        switch (menu) {
          case 0:
            System.out.println("Programa finalizado.");
            break;
          case 1:
            for (int i = 0; i < 2; i++) {
              System.out.print("Insira um número: ");
              numbers[i] = reader.nextDouble();
            }
            result = numbers[0] + numbers[1];
            System.out
                .println("O resultado da adição entre " + numbers[0] + " e " + numbers[1] + " é: " + result + ".");
            break;
          case 2:
            for (int i = 0; i < 2; i++) {
              System.out.print("Insira um número: ");
              numbers[i] = reader.nextDouble();
            }
            result = numbers[0] - numbers[1];
            System.out
                .println("O resultado da subtração entre " + numbers[0] + " e " + numbers[1] + " é: " + result + ".");
            break;
          case 3:
            for (int i = 0; i < 2; i++) {
              System.out.print("Insira um número: ");
              numbers[i] = reader.nextDouble();
            }
            result = numbers[0] * numbers[1];
            System.out.println(
                "O resultado da multiplicação entre " + numbers[0] + " e " + numbers[1] + " é: " + result + ".");
            break;
          case 4:
            for (int i = 0; i < 2; i++) {
              System.out.print("Insira um número: ");
              numbers[i] = reader.nextDouble();
            }
            result = numbers[0] / numbers[1];
            System.out
                .println("O resultado da divisão entre " + numbers[0] + " e " + numbers[1] + " é: " + result + ".");
            break;
          default:
            System.out.println("Valor inválido.");
            break;
        }

        System.out.println("Deseja me utilizar novamente?\n[S] / [N]");
        userInput = reader.next(".").charAt(0);

        if ((userInput != 'S') || (userInput != 's')) {
          System.out.println("Obrigado por me utilizar!");
        }

      } while ((userInput == 'S') || (userInput == 's'));
    }
  }
}

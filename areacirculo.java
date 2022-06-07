import java.util.Scanner;

public class areacirculo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Bem vindo ao programa de cálculo da área do círculo!");
    System.out.print("Informe o raio do círculo (em cm): ");
    Double raio = sc.nextDouble();

    Double areaCirculo = Math.PI * Math.pow(raio, 2);

    System.out.println("A área do círculo cujo raio é de " + raio + "cm é de " + areaCirculo + "cm.");

    sc.close();

  }
}

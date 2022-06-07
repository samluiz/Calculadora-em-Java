import java.util.Scanner;

public class inverso {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite uma frase ou palavra: ");
    String frase = sc.nextLine();

    String fraseinvertida = new StringBuilder(frase).reverse().toString();

    System.out.println(fraseinvertida.toUpperCase());

    sc.close();
  }
}

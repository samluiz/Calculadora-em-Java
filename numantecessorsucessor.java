import java.util.Scanner;

public class numantecessorsucessor {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um número: ");
    int numero = sc.nextInt();
    int antecessor = numero - 1;
    int sucessor = numero + 1;

    sc.close();

    System.out.println("O número inserido foi o " + numero + "\nAntecessor: " + antecessor + "\nSucessor: " + sucessor);
  }
}

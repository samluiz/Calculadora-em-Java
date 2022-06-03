import java.util.Scanner;

public class idadeemdias {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int[] idade = new int[4];

    System.out.println("Informe quantos anos, meses e dias você possui, respectivamente");
    for (int i = 0; i < 3; i++) {
      idade[i] = reader.nextInt();
    }

    idade[3] = (idade[0] * 365) + (idade[1] * 30) + idade[2]; 



    System.out.println("Você já viveu " + idade[3] + " dias na sua vida!");


  }
}

import java.util.Scanner;

public class velocidadeMedia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe a distância a percorrer: ");
    Double distancia = sc.nextDouble();

    System.out.print("\nInforme a velocidade média a percorrer: ");
    Double velMedia = sc.nextDouble();

    sc.close();

    Double tempoMedio = distancia / velMedia;

    System.out.println("O tempo médio para percorrer " + distancia + "km numa velocidade média de " + velMedia + "km/h é de " + (Math.round(tempoMedio)) + "h.");
  }
}

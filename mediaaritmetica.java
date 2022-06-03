public class mediaaritmetica {
  public static void main(String[] args) {

    int numbers1[] = {8, 9, 7};
    int soma1 = 0;
    for (int i = 0; i < numbers1.length; i++) {
      soma1 = soma1 + numbers1[i]; 
    }

    int numbers2[] = {4, 5, 6};
    int soma2 = 0;
    for (int i = 0; i < numbers2.length; i++) {
      soma2 = soma2 + numbers2[i]; 
    }

    int medias[] = new int[4];
    medias[0] = soma1 / 3;
    medias[1] = soma2 / 3;
    medias[2] = medias[0] + medias[1];
    medias[3] = medias[2] / 2;

    System.out.println("A média dos números 8 + 9 + 7 corresponde à " + medias[0] + "\nA média dos números 4 + 5 + 6 corresponde à " + medias[1] + "\nA soma de ambas as médias corresponde à " + medias[2] + "\nA média das duas médias corresponde à " + medias[3]);

  }
}

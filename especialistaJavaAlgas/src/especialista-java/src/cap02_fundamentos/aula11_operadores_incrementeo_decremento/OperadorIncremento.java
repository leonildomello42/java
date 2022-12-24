package cap02_fundamentos.aula11_operadores_incrementeo_decremento;

public class OperadorIncremento {

  public static void main(String[] args) {
    int totalDownloads = 10;

    // totalDownloads = totalDownloads + 1;
    // totalDownloads += 1;

    // totalDownloads++;

    // int novoTotalDownloads = totalDownloads++;
    int novoTotalDownloads = ++totalDownloads;

    System.out.println("Total de downloads: " + totalDownloads);
    System.out.println("Novo total de downloads: " + novoTotalDownloads);
  }

}

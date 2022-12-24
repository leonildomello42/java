package cap02_fundamentos.aula15_conversao_tipos_primitivos;

public class ConversaoDoubleParaInt {

  public static void main(String[] args) {
    double largura = 100.37;
    // int tamanho = largura; // não compila

    int tamanho = (int) largura; // isso compila

    System.out.println(tamanho);
  }

}

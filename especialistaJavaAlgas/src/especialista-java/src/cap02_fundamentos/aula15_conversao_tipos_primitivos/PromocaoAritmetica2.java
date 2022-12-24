package cap02_fundamentos.aula15_conversao_tipos_primitivos;

public class PromocaoAritmetica2 {

  public static void main(String[] args) {
    long x = 10;
    float y = 9.34f;
    // long z = x * y; // não compila
    float z = x * y;

    System.out.println(z);
  }

}

package cap03_estru_controle.aula04_curto_circuito_operadores;

public class CurtoCircuitoOperadoresLogicos {

  public static void main(String[] args) {
    int x = 10;
    int y = 20;

    //Retorna y = 20 pois nao é executado visto que x == 10 eh falso
    // boolean resultado = x == 10 && y++ == 20;
    boolean resultado = x == 15 || y++ == 20;

    System.out.println(resultado);
    System.out.println(y);
  }

}

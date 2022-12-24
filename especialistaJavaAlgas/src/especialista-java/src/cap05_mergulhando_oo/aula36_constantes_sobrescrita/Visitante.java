package cap05_mergulhando_oo.aula36_constantes_sobrescrita;

public class Visitante {

    static final int IDADE_MINIMA_ACESSO_IRRESTRITO = 16;

    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade() {
        return idade < IDADE_MINIMA_ACESSO_IRRESTRITO;
    }

}
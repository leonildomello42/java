package cap05_mergulhando_oo.aula32_variaveis_estaticas;

public class Produto {

    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;

    void alterarCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    void imprimirCustoEmbalagem() {
        System.out.printf("Custo com embalagem: %.2f%n", Produto.custoEmbalagem);
    }

}
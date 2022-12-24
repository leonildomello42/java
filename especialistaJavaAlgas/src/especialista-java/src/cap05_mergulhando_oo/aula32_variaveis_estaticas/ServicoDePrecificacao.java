package cap05_mergulhando_oo.aula32_variaveis_estaticas;

public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        // poderia ter cálculos muito mais complexos aqui

        double precoVendaCalculado = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }

}
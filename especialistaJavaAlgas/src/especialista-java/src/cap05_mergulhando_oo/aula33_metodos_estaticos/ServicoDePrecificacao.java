package cap05_mergulhando_oo.aula33_metodos_estaticos;

public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        // poderia ter cálculos muito mais complexos aqui

        double precoVendaCalculado = Matematica.calcularAcrescimo(
                produto.precoCusto, percentualMargemLucro);

        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }

}
package cap05_mergulhando_oo.aula33_metodos_estaticos;

public class Principal3 {

    public static void main(String[] args) {
        Produto.alterarCustoEmbalagem(10);

        Produto produto = new Produto();
        produto.alterarPrecoCusto(100);

        System.out.printf("Total de custos: %.2f%n",
                Produto.calcularCustosTotais(produto));
    }

}
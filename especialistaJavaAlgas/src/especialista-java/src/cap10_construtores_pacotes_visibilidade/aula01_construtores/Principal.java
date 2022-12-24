package cap10_construtores_pacotes_visibilidade.aula01_construtores;

public class Principal {

    public static void main(String[] args) {

        Produto produto = new Produto("Picanha 1kg (peça)");
        Produto produto1 = new Produto("Arroz", 35);
        Produto produto2 = new Produto();

        System.out.println(produto.nome);
        System.out.println(produto.quantidadeEstoque);

        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEstoque);

        System.out.println(produto2.nome);
        System.out.println(produto2.quantidadeEstoque);
    }

}

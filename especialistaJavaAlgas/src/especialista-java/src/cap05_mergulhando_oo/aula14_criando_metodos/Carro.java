package cap05_mergulhando_oo.aula14_criando_metodos;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa proprietario;

    void calcularValorRevenda() {
        System.out.printf("Calcular valor de revenda de: %s %d%n",
                modelo, anoFabricacao);
    }

}
package cap06_introducao_clean_code.aula05_metodos_com_unica_responsabilidade;

public class GatewayPagamento {

    static boolean autorizarPagamento(String numeroCartao, double valor) {
        return true;
    }

}
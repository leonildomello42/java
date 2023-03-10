package cap12_heranca.aula02_tagget_classes_ma_pratica;

import cap12_heranca.aula02_tagget_classes_ma_pratica.banco.Conta;
import cap12_heranca.aula02_tagget_classes_ma_pratica.banco.Titular;

public class Principal1 {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("João da Silva", "12312312300"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);
        conta1.setTipo(Conta.NORMAL);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(27.5);
        conta1.imprimirDemonstrativo();

//        conta1.creditarRendimentos(6);
    }

}

package cap13_polimorfismo_classes_abstratas.aula09_classes_metodos_abstratas;

import cap13_polimorfismo_classes_abstratas.aula09_classes_metodos_abstratas.faturamento.GestorFiscal;
import cap13_polimorfismo_classes_abstratas.aula09_classes_metodos_abstratas.faturamento.NotaFiscalProduto;
import cap13_polimorfismo_classes_abstratas.aula09_classes_metodos_abstratas.faturamento.NotaFiscalServico;

public class Principal {

    public static void main(String[] args) {
        var gestorFiscal = new GestorFiscal();

//        var nf = new NotaFiscal("Abc", 500);
        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo da roda", 900, true);

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);
    }

}
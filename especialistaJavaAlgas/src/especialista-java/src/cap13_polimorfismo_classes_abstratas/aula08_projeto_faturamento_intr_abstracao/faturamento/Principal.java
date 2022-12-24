package cap13_polimorfismo_classes_abstratas.aula08_projeto_faturamento_intr_abstracao.faturamento;


import cap13_polimorfismo_classes_abstratas.aula08_projeto_faturamento_intr_abstracao.faturamento.fiscal.GestorFiscal;
import cap13_polimorfismo_classes_abstratas.aula08_projeto_faturamento_intr_abstracao.faturamento.fiscal.NotaFiscal;
import cap13_polimorfismo_classes_abstratas.aula08_projeto_faturamento_intr_abstracao.faturamento.fiscal.NotaFiscalProduto;
import cap13_polimorfismo_classes_abstratas.aula08_projeto_faturamento_intr_abstracao.faturamento.fiscal.NotaFiscalServico;

public class Principal {

    public static void main(String[] args) {
        var gestorFiscal = new GestorFiscal();

        var nf = new NotaFiscal("Abc", 500);
        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo da roda", 900, true);

        gestorFiscal.emitirNotasFiscais(nf, nfBolaFutebol, nfReparoMotor);

//        System.out.println(nfBolaFutebol.calcularImpostos());
//        System.out.println(nfReparoMotor.calcularImpostos());
    }

}
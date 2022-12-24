package cap13_polimorfismo_classes_abstratas.aula08_projeto_faturamento_intr_abstracao.faturamento.fiscal;

public class GestorFiscal {

    public void emitirNotasFiscais(NotaFiscal... notasFiscais) {
        for (NotaFiscal notaFiscal : notasFiscais) {
            notaFiscal.emitir();
            System.out.println("---------------");
        }
    }

}
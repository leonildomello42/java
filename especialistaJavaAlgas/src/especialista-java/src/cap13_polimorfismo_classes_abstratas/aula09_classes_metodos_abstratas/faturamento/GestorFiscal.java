package cap13_polimorfismo_classes_abstratas.aula09_classes_metodos_abstratas.faturamento;

public class GestorFiscal {

    public void emitirNotasFiscais(NotaFiscal... notasFiscais) {
        for (NotaFiscal notaFiscal : notasFiscais) {
            notaFiscal.emitir();
            System.out.println("---------------");
        }
    }

}
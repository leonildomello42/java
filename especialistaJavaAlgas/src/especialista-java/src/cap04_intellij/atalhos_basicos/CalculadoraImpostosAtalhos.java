package cap04_intellij.atalhos_basicos;

public class CalculadoraImpostosAtalhos {

    //Plugin: presentation assistant - mostrar as teclas

    public static void main(String[] args) {

        char tipoNotaFiscal = 'S';
        double totalFaturado = 1200.30;
        int idade;



        double taxaImpostos;


        if (tipoNotaFiscal == 'S') {
            taxaImpostos = totalFaturado * 0.16;
        } else {
            taxaImpostos = totalFaturado * 0.35;
        }



        // double valorImpostos = tipoNotaFiscal == 'S' ? totalFaturado * 0.16 : totalFaturado * 0.35;
//    double taxaImpostos = tipoNotaFiscal == 'S' ? 0.16 : 0.35;
        double valorImpostos = totalFaturado * taxaImpostos;

        System.out.println(taxaImpostos);

        System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
        System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
        System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
        System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
        System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
        System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
    }
}


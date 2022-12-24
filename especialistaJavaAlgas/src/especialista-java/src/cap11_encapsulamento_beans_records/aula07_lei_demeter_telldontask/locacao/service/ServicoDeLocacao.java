package cap11_encapsulamento_beans_records.aula07_lei_demeter_telldontask.locacao.service;


import cap11_encapsulamento_beans_records.aula07_lei_demeter_telldontask.locacao.Locacao;

public class ServicoDeLocacao {

    public void confirmarLocacao(Locacao locacao) {
//        double totalDiarias = locacao.getVeiculo().getGrupo().getValorDiaria()
//                * locacao.getQuantidadeDiarias();

//        double totalDiarias = locacao.getValorDiaria()
//                * locacao.getQuantidadeDiarias();

        double totalDiarias = locacao.calcularTotalDiarias();

        // TODO realiza lógica para registrar locação pelo valor das diárias

//        locacao.getVeiculo().setDisponivel(false);
        locacao.reservarVeiculo();
    }

}
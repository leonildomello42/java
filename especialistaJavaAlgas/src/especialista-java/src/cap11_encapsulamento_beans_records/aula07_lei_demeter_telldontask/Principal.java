package cap11_encapsulamento_beans_records.aula07_lei_demeter_telldontask;


import cap11_encapsulamento_beans_records.aula07_lei_demeter_telldontask.locacao.GrupoVeiculo;
import cap11_encapsulamento_beans_records.aula07_lei_demeter_telldontask.locacao.Locacao;
import cap11_encapsulamento_beans_records.aula07_lei_demeter_telldontask.locacao.Veiculo;
import cap11_encapsulamento_beans_records.aula07_lei_demeter_telldontask.locacao.service.ServicoDeLocacao;

public class Principal {

    public static void main(String[] args) {
        GrupoVeiculo grupo = new GrupoVeiculo("SUV", 450);
        Veiculo veiculo = new Veiculo("ALG-9999", grupo);
        Locacao locacao = new Locacao(veiculo, 5);

        ServicoDeLocacao servicoDeLocacao = new ServicoDeLocacao();
        servicoDeLocacao.confirmarLocacao(locacao);
    }

}
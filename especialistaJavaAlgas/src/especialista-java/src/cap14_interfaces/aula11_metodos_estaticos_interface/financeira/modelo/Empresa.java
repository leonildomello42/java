package cap14_interfaces.aula11_metodos_estaticos_interface.financeira.modelo;

public abstract class Empresa {

    private String razaoSocial;
    private double totalFaturamento;

    public Empresa(String razaoSocial, double totalFaturamento) {
        this.razaoSocial = razaoSocial;
        this.totalFaturamento = totalFaturamento;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }

    public void setTotalFaturamento(double totalFaturamento) {
        this.totalFaturamento = totalFaturamento;
    }

}
package cap14_heran_intr_polim.met_final.entities;

//Classe não pode ser herdada
public final class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    //Metodo não pode ser sobreposto
    @Override
    public final void withdraw(double amount){
        balance -= amount;
    }
}

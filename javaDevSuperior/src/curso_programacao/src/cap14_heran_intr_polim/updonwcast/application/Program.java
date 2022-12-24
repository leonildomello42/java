package cap14_heran_intr_polim.updonwcast.application;

    /*
    Upcasting - Casting da subclasse parar a superclasse - uso comum: polimorfisto
     */

    /*
    Downcasting - Casting da superclasse para subclasse (uso instanceof) - uso comum: métodos que
    recebem parâmetros genericos
     */

import cap14_heran_intr_polim.updonwcast.entities.Account;
import cap14_heran_intr_polim.updonwcast.entities.BusinessAccount;
import cap14_heran_intr_polim.updonwcast.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        acc1.getBalance();

        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //DONWCASTING

        if(acc2 instanceof BusinessAccount){
            BusinessAccount bacc1 = (BusinessAccount) acc2;
        }
    }
}

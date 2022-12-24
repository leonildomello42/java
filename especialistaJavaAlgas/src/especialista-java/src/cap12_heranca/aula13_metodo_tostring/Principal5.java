package cap12_heranca.aula13_metodo_tostring;

import cap12_heranca.aula13_metodo_tostring.banco.Passaporte;

public class Principal5 {

    public static void main(String[] args) {
        Passaporte passaporte = new Passaporte("123456", "Brasil");

        System.out.println(passaporte);
    }

}
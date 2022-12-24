package cap04_intellij.code_completion_postfix_completion;

public class Programa {

    public static void main(String[] args) {

        int total = 10;

        boolean pendente = true;

        /*
        live templates
         */

        //soutv
        System.out.println("total = " + total);

        //fori
        for (int i = 0; i < 5; i++) {

        }

        /*
        postfix completion
         */

        //total.sout
        //total.soutv
        System.out.println(total);

        //pendent.if
        if (pendente) {

        }

        //pendente.while
        while (pendente) {

        }

        //total.fori
        for (int i = 0; i < total; i++) {

        }

        //total.forr
        for (int i = total; i > 0; i--) {

        }
    }
}

package atividades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/*                    Exercício Solicitado
        - Descruba o timelnMillis do dia que você nasceu;
        - Converta em um objeto Date;
        - Verifique se ele é anterior ou posterior a 15 de maio de 2010.
* */

public class AtividadeDate {
    public static void main (String[] args) throws ParseException {

            //  Formatando texto em Data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNasc = sdf.parse("01/01/1990");
        Date dataInfor = sdf.parse("15/05/2010");

            //  Retorna a Data em Milissegundos
        Long dataMillis = dataNasc.getTime();

            //  Retorna o Milissegundos em Data
        Date dataNascRetor = new Date(dataMillis);

            //  Verificando se dataNasc é anterior a dataInfor
        boolean verificacao = dataNascRetor.before(dataInfor);

            //  Testando condição
        String condicao;
        if (verificacao == true){
            condicao = "anterior";
        }
        else {
            condicao = "posterior";
        }

            // Impressão na tela
        System.out.println("A Data de nascimento tranformado em Milissegundos é: " + dataMillis);
        System.out.println("A Data de nascimento é: " + sdf.format(dataNascRetor));
        System.out.println("A data de nascimento %s é %s a data %s".formatted
                (sdf.format(dataNascRetor), condicao, sdf.format(dataInfor)));
    }

}

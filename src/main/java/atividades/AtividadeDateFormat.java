package atividades;

import java.text.SimpleDateFormat;
import java.util.Date;

/*                    Exercício Solicitado
        - Converta a Data atual no formato DD/MM/YYYY HH:MM:SS:MMM
* */

public class AtividadeDateFormat {
    public static void main(String[] args){
        Date dataAtual = new Date();
            //Formatador
        SimpleDateFormat dataHoraForm = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:mmm");
        SimpleDateFormat dataForm = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat horaForm = new SimpleDateFormat("hh:mm:ss:mmm");

            //Formatando data e hr
        String dataHoraFormatada = dataHoraForm.format(dataAtual);
        String dataFormatada = dataForm.format(dataAtual);
        String horaFormatado = horaForm.format(dataAtual);

            // Saida de dados na tela
        System.out.println("##############################################");
        System.out.println("Data e Hora formatada em uma só variável.\n" + dataHoraFormatada);
        System.out.println("Data formatada.\n" + dataFormatada);
        System.out.println("Hora formatada.\n" + horaFormatado);
        System.out.println("##############################################");
    }
}

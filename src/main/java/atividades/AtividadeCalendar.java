package atividades;
import java.text.DateFormat;
import java.util.*;

/*                    Exercício Solicitado
        - Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento sem que
            os juros sejam cobrados.
        - Caso essa data caia em um sábado ou domingo, o cliente pode pagar na segunda-feira
            seguinte.
        - Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem
            para pagar.
* */

public class AtividadeCalendar {
    public static void main(String[] args){

            // Variaveis a ser usadas
        Calendar dataVenc = Calendar.getInstance();
        Integer dia, mes, ano;
        Date dataAux;
        String suporte = "";

            // Formatação de data e local
        Locale loc = new Locale ("pt","BR");
        DateFormat formatBr = DateFormat.getDateInstance(DateFormat.SHORT, loc);

            //  Entrada de valores pelo usuario
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o dia do vencimento: ");
        dia = ler.nextInt();
        System.out.println("Digite o mes do vencimento: ");
        mes = ler.nextInt() -1;
        System.out.println("Digite o ano do vencimento: ");
        ano = ler.nextInt();
        dataVenc.set(ano, mes,dia);

            // Verificando se é final de semana, caso sim, aplicando nova data
        if ((dataVenc.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) || dataVenc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            if (dataVenc.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                dataVenc.add(Calendar.DATE, 2);
                suporte = "sábado";
            } else if (dataVenc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                dataVenc.add(Calendar.DATE, 1);
                suporte = "domingo";
            }
            System.out.println("A data informada é no %s, por esse motivo, poderá pagar na segunda, sem juros e sem problema!".formatted(suporte));
        }

            // Atribuindo data a uma nova variavel date e somando + 10 dias
        dataAux = dataVenc.getTime();
        dataVenc.add(Calendar.DATE,10);
            // Saida de dados na tela
        System.out.println("A data de vencimento do boleto é %s, voce terá 10 dias para pagar após o vencimento, ".formatted(formatBr.format(dataAux)));
        System.out.println("sem que pague juros, ou seja, você poderá pagar até o dia %s.".formatted(formatBr.format(dataVenc.getTime())));
    }
}

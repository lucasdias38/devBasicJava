package atividades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*                    Exercício Solicitado
        - Adicione 4 anos, 6 meses e 13 horas ao momento
            15/05/2010 10:00:00
* */

public class AtividadeDateJava8 {

    public static void main (String[] args){
            // Determinando a data e a hora que será manipulado
        LocalDateTime dtHr = LocalDateTime.of(2010,5,15,10,00,00);
        LocalDate data = LocalDate.of(2010,5,15);
        LocalTime hr = LocalTime.of(10,00,00);

            //Aplicando alteração na data e hora juntos e separados
        LocalDateTime dtHrMod = dtHr.plusYears(4).plusMonths(6).plusHours(13);
        LocalDate dataMod = data.plusYears(4).plusMonths(6);
        LocalTime hrMod = hr.plusHours(13);

            //Saida de dados na tela
        System.out.println("############################################");
        System.out.println("Data e hora solicitado: " + dtHr);
        System.out.println("Após a modificação: " + dtHrMod);
        System.out.println("Data solicitado: " + data);
        System.out.println("Após a modificação: " + dataMod);
        System.out.println("Hora solicitado: " + hr);
        System.out.println("Após a modificação: " + hrMod);
        System.out.println("############################################");
    }
}

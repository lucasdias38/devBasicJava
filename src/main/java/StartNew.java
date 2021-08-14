import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class StartNew {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);
        LocalDateTime dataHr = LocalDateTime.now();

        LocalTime hrAgr = LocalTime.now();
        LocalTime hrMaisUm = hrAgr.plusHours(1);
        LocalDateTime dtFut = dataHr.plusHours(1).plusDays(2).plusSeconds(30);

        System.out.println("Hoje " + hoje);
        System.out.println("Ontem " + ontem);
        System.out.println("Hora Agr " + hrAgr);
        System.out.println("Um hora a mais " + hrMaisUm);
        System.out.println("Data e hr " + dataHr);
        System.out.println("Data e hr modificado " +dtFut);
    }
}

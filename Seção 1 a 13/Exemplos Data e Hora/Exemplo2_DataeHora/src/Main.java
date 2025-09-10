import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");



        // CÁLCULOS DATA E HORA


        // acrescentar ou diminuir tempo

        // como se fosse semana passada
                                            //menos 7 dias
        LocalDate pastWeekLocalDate = d04.minusDays(7);
                                            // mais 7 dias
        LocalDate nextWeekLocalDate = d04.plusDays(7);
                                            // mais 7 anos
        LocalDate nextYearLocalDate = d04.plusYears(7);



        System.out.println("PasrweekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("nextYearLocalDate = " + nextYearLocalDate);

        System.out.println("------------------------------------");


    // COM LOCALDATETIME

        //menos 7 dias
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        // mais 7 dias
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        // mais 7 anos
        LocalDateTime nextYearLLocalDateTime = d05.plusYears(7);
        // O LocalDateTime tem HORAS, MINUTOS E SEGUNDOS
                                            // 30 minutos
        LocalDateTime exemplominutos = d05.plusMinutes(30);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("nextYearLLocalDateTime = " + nextYearLLocalDateTime);
        System.out.println("exemplominutos = " + exemplominutos);


    // COM INSTANT

        //menos 7 dias
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        // mais 7 dias
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        // mais 7 anos
        //Instant nextYearInstant = d06.plus(7, ChronoUnit.YEARS);

        System.out.println("------------------------------------");


        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);
        //System.out.println("nextYearInstant = " + nextYearInstant);


        // duração


        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);

        System.out.println("T1 dias = " + t1.toDays());



    }
}
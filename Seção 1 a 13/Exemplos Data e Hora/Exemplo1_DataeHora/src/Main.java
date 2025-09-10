import java.time.*;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // como instanciar data e hora em java


        // data de agora
        LocalDate d01 = LocalDate.now();

        System.out.println("data de agora = " + d01);

        System.out.println("------------------------");

        // data de agora com a hora

        LocalDateTime d02 = LocalDateTime.now();

        System.out.println("data de agora com horário = " + d02);

        System.out.println("------------------------");

        // data hora gmt (global)
        Instant d03 = Instant.now();

        //fuso horário londres
        System.out.println("Data hora de agora (global)" + d03);

        System.out.println("------------------------");

        // convertendo de texto para data

        LocalDate d04 = LocalDate.parse("2022-07-20");

        System.out.println(d04);

        System.out.println("------------------------");

        // convertendo de texto para data e hora

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T14:35:21");

        System.out.println(d05);

        System.out.println("------------------------");

        // instant agora é a global

        Instant d06 = Instant.parse("2022-07-20T14:35:21Z");

        System.out.println(d06);

        System.out.println("------------------------");


        // para guardar o horario euqivalente ao fuso

        Instant d07 = Instant.parse("2022-07-20T14:35:21-03:00");

        System.out.println(d07);

        System.out.println("------------------------");

        // texto no formato customizado

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);

        System.out.println(d08);


        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        System.out.println(d09);


        System.out.println("------------------------");

        // Instaciar datas a partir de dados isolados

        LocalDate d10 = LocalDate.of(2022, 07, 20);

        System.out.println(d10);

        LocalDateTime d11 = LocalDateTime.of(2024, 05, 13, 20, 40);

        System.out.println(d11);

        System.out.println("------------------------");
        System.out.println("------------------------");

        // Convertendo data hora para texto (formato customizado)


        System.out.println("d04 = " + d04.format(fmt1));

        System.out.println("d04 = " + fmt1.format(d04));

        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));


        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));



        // como imprimir um instant com time zone (data hora global)

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());



        System.out.println("d06 = " + fmt3.format(d06));



        // outro caso

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // é uma data local

        System.out.println("D05 = " + d05.format(fmt4));

        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; // global

        System.out.println("D06 = " + fmt5.format(d06));


        // converter data-hora global para local

        /* LISTA COM zoneids disponiveis

       for (String s: ZoneId.getAvailableZoneIds()){
           System.out.println(s);
       }

        */

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());

        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Asia/Hebron"));

        System.out.println("R1 = " + r1);

        System.out.println("R2 = " + r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("R3 = " + r3);

        System.out.println("R4 = " + r4);


        // obter daods de uma data-hora local

        System.out.println("d04 dia = " + d04.getDayOfMonth());

        System.out.println("d04 mes = " + d04.getMonthValue());

        System.out.println("d04 ano = " + d04.getYear());


        System.out.println("d05 hora = " + d05.getHour());

        System.out.println("d05 Minuto = " + d05.getMinute());

        System.out.println("d05 Segundos = " + d05.getSecond());

        // calculo

        Duration t1 = Duration.between()













    }
}
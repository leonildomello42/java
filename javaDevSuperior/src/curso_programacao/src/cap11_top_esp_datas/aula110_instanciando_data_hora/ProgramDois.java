package cap11_top_esp_datas.aula110_instanciando_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ProgramDois {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());

        System.out.println(r2);
        System.out.println(r3);

        int day = d04.getDayOfMonth();
        int monthValue = d04.getMonthValue();
        int year = d04.getYear();

        int hour = d05.getHour();
        int minuts = d05.getMinute();

        System.out.println(day);

//        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
//            System.out.println(availableZoneId);
//        }
    }
}

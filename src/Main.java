import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        LocalTime timeLocal = LocalTime.now(ZoneId.of("Europe/Rome"));
        LocalDate dateLocal = LocalDate.now(ZoneId.of("Europe/Rome"));
        LocalDateTime dateTimeLocal = LocalDateTime.of(dateLocal,timeLocal);
        ZonedDateTime zonedDateTimeLocal = ZonedDateTime.of(dateTimeLocal,ZoneId.of("Europe/Rome"));

        LocalTime timeNewYork = LocalTime.now(ZoneId.of("America/New_York"));
        LocalDate dateNewYork = LocalDate.now(ZoneId.of("America/New_York"));
        LocalDateTime dateTimeNY = LocalDateTime.of(dateNewYork,timeNewYork);
        ZonedDateTime zonedDateTimeNY = ZonedDateTime.of(dateTimeNY,ZoneId.of("America/New_York"));

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("EEEE dd/MMM/yyyy HH:mm:ss zzzz", Locale.ITALY);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE dd/MMM/yyyy HH:mm:ss zzzz", Locale.ENGLISH);
//        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.ITALY);
//        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.ENGLISH);

        System.out.println("------------------------");
        System.out.println("With locale ITALY");
        System.out.println(formatter1.format(zonedDateTimeLocal));
        System.out.println(formatter1.format(zonedDateTimeNY));
        System.out.println("------------------------");
        System.out.println("With locale ENGLISH");
        System.out.println(formatter2.format(zonedDateTimeLocal));
        System.out.println(formatter2.format(zonedDateTimeNY));


    }
}
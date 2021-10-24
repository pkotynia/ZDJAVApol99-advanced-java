package datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Locale;

public class DateTimePlayground {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate christmasEve = LocalDate.parse("2021-12-24");
        System.out.println(christmasEve);

        LocalDate christmasEveCreatedUsingOf = LocalDate.of(2021, Month.DECEMBER, 24);

        LocalDate tomorrow = now.plus(1, ChronoUnit.DAYS);

        System.out.println(tomorrow);
        System.out.println(now);

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek);

        DayOfWeek firstDayOfTheMonth = now.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek();
        System.out.println(firstDayOfTheMonth);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        System.out.println(ZoneId.getAvailableZoneIds());

        ZonedDateTime polandTimeZone = ZonedDateTime.of(currentDateTime, ZoneId.of("Poland"));
        System.out.println(polandTimeZone);

        System.out.println(polandTimeZone.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println(polandTimeZone.format(DateTimeFormatter.ofPattern("yy/MM/dd")));

        System.out.println(polandTimeZone
                .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.UK)));


    }
}

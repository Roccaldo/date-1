import java.time.*;
import java.time.format.FormatStyle;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime ieri = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String piccolo = ieri.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        String medio = ieri.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        String intero = ieri.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT));

        System.out.println("ieri Short: " + piccolo);
        System.out.println("ieri Medium: " + medio);
        System.out.println("ieri Full: " + intero);
    }
}  

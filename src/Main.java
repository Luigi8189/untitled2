import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Crea un OffsetDateTime dalla stringa ISO 8601
        String input = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(input);

        //Definisce il formato desiderato in italiano
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy" , Locale.ITALIAN);

        //Converte e stampa
        String formatted = dateTime.format(formatter);
        System.out.println(formatted); //Output: 01 marzo 2023
    }
}
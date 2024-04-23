import java.time.LocalDate;
import java.util.List;

public class OVA extends Anime {
    OVA(String displayName, List<String> genres, double rating, int episodesCount, LocalDate releaseDate)
    {
        // Использование конструктора родителя
        super(displayName, genres, rating, episodesCount, releaseDate);
    }
}

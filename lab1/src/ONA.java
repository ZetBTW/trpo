import java.time.LocalDate;
import java.util.List;

public class ONA extends Anime {
    ONA(String displayName, List<String> genres, double rating, int episodesCount, LocalDate releaseDate)
    {
        // Использование конструктора родителя
        super(displayName, genres, rating, episodesCount, releaseDate);
    }
}

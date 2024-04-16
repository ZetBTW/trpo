import java.util.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Anime list initialization
        List<Anime> animeList = new ArrayList<>();

        // ONA List
        animeList.add(new ONA("Hametsu no Mars", Arrays.asList("Научная фантастика", "Ужасы"), 2.22, 1, LocalDate.of(2005, 6, 2)));
        animeList.add(new ONA("Ex-Arm", Arrays.asList("Научная фантастика", "Экшн"), 2.89, 12, LocalDate.of(2021, 9, 17)));
        animeList.add(new ONA("Cyberpunk: Edgerunners", Arrays.asList("Научная фантастика", "Киберпанк"), 8.60, 10, LocalDate.of(2022, 9, 23)));
        animeList.add(new ONA("Pluto", Arrays.asList("Научная фантастика", "Экшн", "Драма"), 8.53, 8, LocalDate.of(2023, 10, 8)));
        animeList.add(new ONA("Shiguang Dailiren", Arrays.asList("Экшн", "Драма", "Фэнтези"), 8.68, 11, LocalDate.of(2021, 4, 27)));

        // OVA List
        animeList.add(new OVA("FLCL", Arrays.asList("Анимация", "Экшн", "Комедия"), 8.1, 6, LocalDate.of(2000, 3, 22)));
        animeList.add(new OVA("Densetsu Kyojin Ideon", Arrays.asList("Меха", "Экшн", "Научная фантастика"), 6.8, 39, LocalDate.of(1980, 10, 29)));
        animeList.add(new OVA("Green Legend Ran", Arrays.asList("Приключения", "Драма", "Романтика"), 6.7, 3, LocalDate.of(1992, 12, 9)));
        animeList.add(new OVA("Hi-Speed Jecy", Arrays.asList("Экшн", "Приключения", "Меха"), 6.6, 12, LocalDate.of(1989, 8, 13)));
        animeList.add(new OVA("Megazone 23", Arrays.asList("Музыка", "Экшн", "Научная фантастика"), 6.5, 4, LocalDate.of(1985, 1, 30)));

        // Printing anime with rating > 7
        System.out.println("Anime with rating > 7:");
        for (Anime anime : animeList)
        {
            if (anime.getRating() > 7)
                System.out.println("Anime: " + anime.getDisplayName() + " - Rating: " + anime.getRating());
        }

        // Printing recent anime
        System.out.println("\nRecent anime (releaseDate < now - 1 year):");
        for (Anime anime : animeList)
        {
            if (anime.getReleaseDate().isAfter(LocalDate.now().minusYears(1)))
                System.out.println("Anime: " + anime.getDisplayName() + " - Release Date: " + anime.getReleaseDate());
        }

        // Printing most used genres
        Map<String, Integer> genreCounter = new HashMap<>();
        for (Anime anime : animeList)
        {
            for (String genre : anime.getGenres())
            {
                genreCounter.put(genre, genreCounter.getOrDefault(genre, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedGenresList = new ArrayList<>(genreCounter.entrySet());
        sortedGenresList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        System.out.println("\nMost used genres (TOP 5):");
        for (int i = 0; i < (sortedGenresList.size() > 4 ? 5 : sortedGenresList.size()); i++)
        {
            System.out.println((i + 1) + ") " + sortedGenresList.get(i).getKey());
            System.out.println("Use count: " + sortedGenresList.get(i).getValue());
        }
    }
}
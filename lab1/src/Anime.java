import java.time.LocalDate;
import java.util.List;

public abstract class Anime {

    Anime(String displayName, List<String> genres, double rating, int episodesCount, LocalDate releaseDate)
    {
        try
        {
            this.setDisplayName(displayName);
            this.setGenres(genres);
            this.setRating(rating);
            this.setEpisodesCount(episodesCount);
            this.setReleaseDate(releaseDate);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("exception: " + e);
        }
    }

    private String  displayName;
    private List<String> genres;
    private double rating;
    private int episodesCount;
    private LocalDate releaseDate;

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public void setGenres(List<String> genres)
    {
        this.genres = genres;
    }

    public void setRating(double rating)
    {
        if (rating < 0 || rating > 10)
            throw new IllegalArgumentException("rating should be 0-10");

        this.rating = rating;
    }

    public void setEpisodesCount(int episodesCount)
    {
        if (episodesCount < 1)
            throw new IllegalArgumentException("episodesCount should be > 0");

        this.episodesCount = episodesCount;
    }

    public void setReleaseDate(LocalDate date)
    {
        this.releaseDate = date;
    }

    public String getDisplayName()
    {
        return this.displayName;
    }

    public List<String> getGenres()
    {
        return this.genres;
    }

    public double getRating()
    {
        return this.rating;
    }

    public int getEpisodesCount()
    {
        return this.episodesCount;
    }

    public LocalDate getReleaseDate()
    {
        return this.releaseDate;
    }
}

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Класс для хранения экземпляров коллекции Anime
public class AnimeList {
    AnimeList()
    {
        list = new ArrayList<>();
    }
    private List<Anime> list;

    // Добавление нового экземпляра
    public void push(Anime item)
    {
        list.add(item);
    }

    // Достать последний экзепляр
    public void pop()
    {
        list.removeLast();
    }

    // Получение списка
    public List<Anime> getList()
    {
        return list;
    }

    // Удаление определенного экземпляра (2 варианта)
    public void remove(int id)
    {
        list.remove(id);
    }
    public void remove(Anime anime)
    {
        list.remove(anime);
    }

    // Замена определенного экземпляра (2 варианта)
    public void set(int id, Anime obj)
    {
        list.set(id, obj);
    }
    public void set(Anime where, Anime obj)
    {
        list.set(list.indexOf(where), obj);
    }

    // Получение определенного экземпляра по идентификатору
    public Anime get(int id)
    {
        return list.get(id);
    }

    // === Изменение экземпляра ===
    // Имя
    public void editName(int id, String name)
    {
        list.get(id).setDisplayName(name);
    }
    // Жанры
    public void editGenres(int id, List<String> genres)
    {
        list.get(id).setGenres(genres);
    }
    // Рейтинг
    public void editRating(int id, double rating)
    {
        list.get(id).setRating(rating);
    }
    // Кол-во эпизодов
    public void editEpisodes(int id, int episodesCount)
    {
        list.get(id).setEpisodesCount(episodesCount);
    }
    // Дата выхода
    public void editReleaseDate(int id, LocalDate date)
    {
        list.get(id).setReleaseDate(date);
    }
}

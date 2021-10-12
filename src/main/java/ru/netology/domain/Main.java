package ru.netology.domain;

public class Main {
    public static void main(String[] args) {
        FilmItem first = new FilmItem(1, "Film 1");
        FilmItem second = new FilmItem(2, "Film 2");
        FilmItem third = new FilmItem(3, "Film 3");
        FilmItem forth = new FilmItem(4, "Film 4");
        FilmItem fifth = new FilmItem(5, "Film 5");
        FilmItem six = new FilmItem(6, "Film 6");
        FilmItem seven = new FilmItem(7, "Film 7");
        FilmItem nine = new FilmItem(8, "Film 8");
        FilmItem eight = new FilmItem(9, "Film 9");
        FilmItem ten = new FilmItem(10, "Film 10");
        FilmItem eleven = new FilmItem(11, "Film 11");
        FilmManager manager = new FilmManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(forth);
        manager.save(fifth);
        manager.save(six);
        manager.save(seven);
        manager.save(nine);
        manager.save(eight);
        manager.save(ten);
        manager.save(eleven);
        manager.filmsGet();

    }
}

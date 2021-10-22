package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {
    FilmManager manager = new FilmManager();
    FilmItem first = new FilmItem(1, "Film 1");
    FilmItem second = new FilmItem(2, "Film 2");
    FilmItem third = new FilmItem(3, "Film 3");
    FilmItem fourth = new FilmItem(4, "Film 4");
    FilmItem fifth = new FilmItem(5, "Film 5");
    FilmItem sixth = new FilmItem(6, "Film 6");
    FilmItem seventh = new FilmItem(7, "Film 7");
    FilmItem eighth = new FilmItem(8, "Film 8");
    FilmItem ninth = new FilmItem(9, "Film 9");
    FilmItem tenth = new FilmItem(10, "Film 10");
    FilmItem eleventh = new FilmItem(11, "Film 11");


    @Test
    public void shouldAddFilm() {
        FilmItem[] expected = {fourth, tenth};
        manager.save(fourth);
        manager.save(tenth);
        FilmItem[] actual = manager.getItems();
        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldGetLastFilmsUnderLimits() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);


        FilmItem[] expected = {eleventh,tenth,ninth,eighth,seventh,sixth,fifth,fourth,third,second};
        FilmItem[] actual = manager.filmsGet();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldGetLastFilmsLowLimit() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        FilmItem[] expected = {seventh,sixth,fifth,fourth,third,second,first};
        FilmItem[] actual = manager.filmsGet();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldGetLastOneFilms() {
        manager.save(first);
        FilmItem[] expected = {first};
        FilmItem[] actual = manager.filmsGet();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldGetNoFilms() {
        FilmItem[] expected = {};
        FilmItem[] actual = manager.filmsGet();
        assertArrayEquals(expected, actual);
    }

}

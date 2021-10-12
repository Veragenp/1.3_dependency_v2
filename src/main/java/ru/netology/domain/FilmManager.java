package ru.netology.domain;

import ru.netology.domain.FilmItem;

public class FilmManager {
    private int amountOffFilmGet;
    private FilmItem[] items = new FilmItem[0];
    public void save(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = item;
        items = tmp;
    }

    public FilmManager(int amountOffFilmGet) {
        this.amountOffFilmGet = amountOffFilmGet;
    }

    public FilmManager() {
    }

    public FilmItem[] getItems() {
        return items;
    }

    public FilmItem[] filmsGet() {
        int resultLength;
        FilmItem[]  items = getItems();
        if (items.length > 10) {
            resultLength = 9;
        } else {
            resultLength = items.length;
        }
        FilmItem[] result = new FilmItem[resultLength];
        for (int i = 0; i < resultLength; i++){
            int index = resultLength - i - 1;
            result[i] = items[index];
        }
        return result;


    }

}

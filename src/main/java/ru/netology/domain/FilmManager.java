package ru.netology.domain;

import ru.netology.domain.FilmItem;

public class FilmManager {
    private FilmItem[] items = new FilmItem[0];
    private int amountOffFilm = 10;

    public FilmManager(int amountOffFilm) {
        this.amountOffFilm = amountOffFilm;
    }

    public int getAmountOffFilm() {
        return amountOffFilm;
    }

    public void save(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = item;
        items = tmp;
    }

    public FilmManager() {
    }

    public FilmItem[] getItems() {
        return items;
    }


    public FilmItem[] filmsGet() {
        int resultLength;
        FilmItem[] items = getItems();
        if (items.length > amountOffFilm) {
            resultLength = amountOffFilm;
        } else {
            resultLength = items.length;
        }
        FilmItem[] result = new FilmItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;


    }

}

package ru.netology.domain;

class FilmItem {
    private int id;
    private int filmID;
    private String filmName;
    private String typeFilm;
    private boolean tomorrow;

    public FilmItem() {
    }

    public FilmItem(int id, String filmName) {
        this.id = id;
        this.filmID = filmID;
        this.filmName = filmName;
        this.typeFilm = typeFilm;
        this.tomorrow = tomorrow;
    }

    public int getId() {
        return id;
    }

    public int getFilmID() {
        return filmID;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getTypeFilm() {
        return typeFilm;
    }

    public boolean isTomorrow() {
        return tomorrow;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setTypeFilm(String typeFilm) {
        this.typeFilm = typeFilm;
    }

    public void setTomorrow(boolean tomorrow) {
        this.tomorrow = tomorrow;
    }
}





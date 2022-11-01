package domain;

public class Dvd extends MaterialAudioVisual{
    protected String director;

    public Dvd() {
    }

    public Dvd(int id) {
        this.id = id;
    }

    public Dvd(String titulo, String director, String duracion, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
    }

    public Dvd(int id, String titulo, String director, String duracion, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Dvd{" + "id=" + id + ", titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", genero=" + genero + '}';
    }
}

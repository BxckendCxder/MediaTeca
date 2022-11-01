package domain;


public class Cd extends MaterialAudioVisual{
    private String artista;
    private int numeroCanciones;
    private int unidadesDisponibles;

    public Cd() {
    }

    public Cd(int id) {
        this.id = id;
    }

    public Cd(String titulo, String artista, String genero, String duracion, int numeroCanciones, int unidadesDisponibles) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.numeroCanciones = numeroCanciones;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public Cd(int id, String titulo, String artista, String genero, String duracion, int numeroCanciones, int unidadesDisponibles) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.numeroCanciones = numeroCanciones;
        this.unidadesDisponibles = unidadesDisponibles;
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

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    @Override
    public String toString() {
        return "cd{" + "id=" + id + ", titulo=" + titulo + ", artista=" + artista + ", genero=" + genero + ", duracion=" + duracion + ", numeroCanciones=" + numeroCanciones + ", unidadesDisponibles=" + unidadesDisponibles + '}';
    }
    
    
}

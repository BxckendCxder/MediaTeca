package domain;

public class Libro extends MaterialEscrito{
    private String autor;
    private int numeroDePag;
    private String isbn;
    private int yearPub;

    public Libro() {
    }

    public Libro(int id) {
        this.id = id;
    }

    public Libro(String titulo, String autor, int numeroDePag, String editorial, String isbn, int yearPub, int unidadesDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePag = numeroDePag;
        this.editorial = editorial;
        this.isbn = isbn;
        this.yearPub = yearPub;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public Libro(int id, String titulo, String autor, int numeroDePag, String editorial, String isbn, int yearPub, int unidadesDisponibles) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePag = numeroDePag;
        this.editorial = editorial;
        this.isbn = isbn;
        this.yearPub = yearPub;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePag() {
        return numeroDePag;
    }

    public void setNumeroDePag(int numeroDePag) {
        this.numeroDePag = numeroDePag;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYearPub() {
        return yearPub;
    }

    public void setYearPub(int yearPub) {
        this.yearPub = yearPub;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePag=" + numeroDePag + ", editorial=" + editorial + ", isbn=" + isbn + ", yearPub=" + yearPub + ", unidadesDisponibles=" + unidadesDisponibles + '}';
    }
}

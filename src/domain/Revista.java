package domain;

public class Revista extends MaterialEscrito{
    private String periodicidad;
    private String fechaPub;

    public Revista() {
    }

    public Revista(int id) {
        this.id = id;
    }

    public Revista(String titulo, String editorial, String periodicidad, String fechaPub, int unidadesDisponibles) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.periodicidad = periodicidad;
        this.fechaPub = fechaPub;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public Revista(int id, String titulo, String editorial, String periodicidad, String fechaPub, int unidadesDisponibles) {
        this.id = id;
        this.titulo = titulo;
        this.editorial = editorial;
        this.periodicidad = periodicidad;
        this.fechaPub = fechaPub;
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getFechaPub() {
        return fechaPub;
    }

    public void setFechaPub(String fechaPub) {
        this.fechaPub = fechaPub;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    @Override
    public String toString() {
        return "Revista{" + "id=" + id + ", titulo=" + titulo + ", editorial=" + editorial + ", periodicidad=" + periodicidad + ", fechaPub=" + fechaPub + ", unidadesDisponibles=" + unidadesDisponibles + '}';
    }
    
    
    
}

package beans;

public class Lectoras {

    private int id;
    private String nombre;
    private String area;
    private boolean novedad;
    private String observaciones;

    public Lectoras(int id, String nombre, String area, boolean novedad, String observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.area = area;
        this.novedad = novedad;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Lectoras{" + "id=" + id + ", nombre=" + nombre + ", area=" + area + ", novedad=" + novedad + ", observaciones=" + observaciones +'}';
    }

}

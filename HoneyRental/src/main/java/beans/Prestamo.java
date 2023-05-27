
package beans;
import java.util.Date;
public class Prestamo {
    private String username;
    private Date fecha;
    private boolean novedad;


    public Prestamo(String username, Date fecha, boolean novedad) {
        this.username = username;
        this.fecha = fecha;
        this.novedad = novedad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "username=" + username + ", fecha=" + fecha + ", novedad=" + novedad + '}';
    }

}

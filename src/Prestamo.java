import java.util.Date;

/**
 * Representa un préstamo con su titulo de libro prestado y con el usuario titular del prestamo.
 * 
 * @author Gloria y Guadalupe
 */

public class Prestamo {

    private Libro libro;
    private Usuario usuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    // Constructor con fechaDevolución en null por defecto
    public Prestamo(Libro libro, Usuario usuario, Date fechaPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = null;  // Se inicia como null
    }

    // Constructor con fecha de devolución opcional
    public Prestamo(Libro libro, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion) {
        
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro () {return libro;}

    public Usuario getUsuario () {return usuario;}

    public Date getFechaPrestamo () {return fechaPrestamo;}

    public Date getFechaDevolucion () {return fechaDevolucion;}

    public void setLibro (Libro libro) {this.libro = libro;}

    public void setUsuario (Usuario usuario) {this.usuario = usuario;}

    public void setFechaPrestamo (Date fechaPrestamo) {this.fechaPrestamo = fechaPrestamo;}

    public void setFechaDevolucion (Date fechaDevolucion) {this.fechaDevolucion = fechaDevolucion;}

    public void devolverLibro (Date fechaDevolucion) {this.fechaDevolucion = fechaDevolucion;}

    @Override
    public String toString() {

        return "Libro: " + libro.getTitulo() + ", Usuario: " + usuario.getUser() + ", Fecha de Préstamo: " + fechaPrestamo + ", Fecha de Devolución: " + (fechaDevolucion != null ? fechaDevolucion : "No devuelto");
   
    }
    
}


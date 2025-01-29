import java.util.Date;

public class Libro {

    private String titulo;
    private String autor;
    private Categoria categoria;
    private Date fechaPublicacion;

    public Libro (String titulo, String autor, Categoria categoria, Date fechaPublicacion) {

        this.titulo = titulo;
        this.autor = autor;
        this.categoria = Categoria.FANTASIA;
        this.fechaPublicacion = fechaPublicacion;

    }

    public String getTitulo () {return this.titulo;}

    public void setTitulo (String titulo) {this.titulo = titulo;}

    public String getAutor () {return this.autor;}

    public void setAutor (String autor) {this.autor = autor;}

    public Categoria getCategoria () {return this.categoria;}

    public void setCategoria (Categoria categoria) {this.categoria = categoria ;}

    public Date getFechaPublicacion () {return this.fechaPublicacion;}

    public void setFechaPublicacion(Date fechaPublicacion) {this.fechaPublicacion = fechaPublicacion;}

    @Override
    public String toString () {

        return "Titulo: " + titulo + ", Autor: " + autor + ", Categoria: " + categoria + ", Fecha de Publicación: " + fechaPublicacion;

    }

}
import java.util.Date;

/**
 * Representa un libro con su titulo, su autor, su categoria y su fecha de publicación.
 * 
 * @author Gloria y Guadalupe
 */

public class Libro {

    private String titulo;
    private String autor;
    private Categoria categoria;
    private Date fechaPublicacion;

    public Libro (String titulo, String autor, Categoria categoria, Date fechaPublicacion) {

        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.fechaPublicacion = fechaPublicacion;

    }

    public String getTitulo () {return this.titulo;}

    public void setTitulo (String titulo) {this.titulo = titulo;}

    public String getAutor () {return this.autor;}

    public void setAutor (String autor) {this.autor = autor;}

    public Categoria getCategoria () {return this.categoria;}

    public void setCategoria (Categoria categoria) {

        /*if (categoria.equals(Categoria.FICCION) || categoria.equals(Categoria.REALISMO_MAGICO)
        || categoria.equals(Categoria.TEATRO) || categoria.equals(Categoria.NOVELA)
        || categoria.equals(Categoria.FANTASIA) || categoria.equals(Categoria.CIENCIA_FICCION)
        || categoria.equals(Categoria.MISTERIO) || categoria.equals(Categoria.HISTORIA)
        || categoria.equals(Categoria.ROMANCE) || categoria.equals(Categoria.BIOGRAFIA)
        || categoria.equals(Categoria.AUTOAYUDA) || categoria.equals(Categoria.POLICIACA)
        || categoria.equals(Categoria.TERROR) || categoria.equals(Categoria.AVENTURA)) {*/

            this.categoria = categoria;

        /* } else {

        categoria = null;

        }*/

    }

    public Date getFechaPublicacion () {return this.fechaPublicacion;}

    public void setFechaPublicacion(Date fechaPublicacion) {this.fechaPublicacion = fechaPublicacion;}

    @Override
    public String toString () {

        return "Titulo: " + titulo + ", Autor: " + autor + ", Categoria: " + categoria + ", Fecha de Publicación: " + fechaPublicacion;

    }

}
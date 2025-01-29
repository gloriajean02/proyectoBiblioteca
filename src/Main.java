import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Biblioteca sistema = new Biblioteca();
        
        sistema.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", Categoria.FICCION, crearFecha(1605, Calendar.OCTOBER, 1)));
        sistema.agregarLibro(new Libro("Cien Años de Soledad", "Gabriel García Márquez", Categoria.REALISMO_MAGICO, crearFecha(1967, Calendar.MAY, 30)));
        sistema.agregarLibro(new Libro("Don Juan Tenorio", "Tirso de Molina", Categoria.TEATRO, crearFecha(1630, Calendar.MARCH, 15)));
        sistema.agregarLibro(new Libro("La Casa de los Espíritus", "Isabel Allende", Categoria.NOVELA, crearFecha(1982, Calendar.OCTOBER, 10)));
        sistema.agregarLibro(new Libro("Cien Años de Soledad", "Gabriel García Márquez", Categoria.REALISMO_MAGICO, crearFecha(1967, Calendar.MAY, 30)));
        sistema.agregarLibro(new Libro("Crepúsculo", "Stephenie Meyer", Categoria.FANTASIA, crearFecha(2005, Calendar.AUGUST, 1)));
        sistema.agregarLibro(new Libro("Nuevo Amanecer", "Stephenie Meyer", Categoria.FANTASIA, crearFecha(2006, Calendar.SEPTEMBER, 6)));
        sistema.agregarLibro(new Libro("Eclipse", "Stephenie Meyer", Categoria.FANTASIA, crearFecha(2007, Calendar.AUGUST, 7)));
        sistema.agregarLibro(new Libro("Amanecer", "Stephenie Meyer", Categoria.FANTASIA, crearFecha(2008, Calendar.AUGUST, 2)));
        sistema.agregarLibro(new Libro("Harry Potter y la Piedra Filosofal", "J.K. Rowling", Categoria.FANTASIA, crearFecha(1997, Calendar.JUNE, 26)));
        sistema.agregarLibro(new Libro("Harry Potter y la Cámara Secreta", "J.K. Rowling", Categoria.FANTASIA, crearFecha(1998, Calendar.JULY, 2)));
        sistema.agregarLibro(new Libro("Harry Potter y el Prisionero de Azkaban", "J.K. Rowling", Categoria.FANTASIA, crearFecha(1999, Calendar.JULY, 8)));
        sistema.agregarLibro(new Libro("Harry Potter y el Cáliz de Fuego", "J.K. Rowling", Categoria.FANTASIA, crearFecha(2000, Calendar.JULY, 8)));
        sistema.agregarLibro(new Libro("Harry Potter y la Orden del Fénix", "J.K. Rowling", Categoria.FANTASIA, crearFecha(2003, Calendar.JUNE, 21)));
        sistema.agregarLibro(new Libro("Harry Potter y el Príncipe Mestizo", "J.K. Rowling", Categoria.FANTASIA, crearFecha(2005, Calendar.JULY, 16)));
        sistema.agregarLibro(new Libro("Harry Potter y las Reliquias de la Muerte", "J.K. Rowling", Categoria.FANTASIA, crearFecha(2007, Calendar.JULY, 21)));
        sistema.agregarLibro(new Libro("Dune", "Frank Herbert", Categoria.CIENCIA_FICCION, crearFecha(1965, Calendar.AUGUST, 1)));
        sistema.agregarLibro(new Libro("El Código Da Vinci", "Dan Brown", Categoria.MISTERIO, crearFecha(2003, Calendar.MARCH, 18)));
        sistema.agregarLibro(new Libro("Los Miserables", "Victor Hugo", Categoria.HISTORIA, crearFecha(1862, Calendar.MARCH, 1)));
        sistema.agregarLibro(new Libro("Orgullo y Prejuicio", "Jane Austen", Categoria.ROMANCE, crearFecha(1813, Calendar.JANUARY, 28)));
        sistema.agregarLibro(new Libro("Steve Jobs", "Walter Isaacson", Categoria.BIOGRAFIA, crearFecha(2011, Calendar.OCTOBER, 24)));
        sistema.agregarLibro(new Libro("Los 7 Hábitos de la Gente Altamente Efectiva", "Stephen R. Covey", Categoria.AUTOAYUDA, crearFecha(1989, Calendar.AUGUST, 15)));
        sistema.agregarLibro(new Libro("Sherlock Holmes: Estudio en Escarlata", "Arthur Conan Doyle", Categoria.POLICIACA, crearFecha(1887, Calendar.NOVEMBER, 1)));
        sistema.agregarLibro(new Libro("Drácula", "Bram Stoker", Categoria.TERROR, crearFecha(1897, Calendar.MAY, 26)));
        sistema.agregarLibro(new Libro("La Isla del Tesoro", "Robert Louis Stevenson", Categoria.AVENTURA, crearFecha(1883, Calendar.JANUARY, 1)));


        System.out.println("Libros disponibles:");
        sistema.mostrarLibros();

        System.out.println("\nBuscar libro: " + sistema.buscarLibro("El Quijote"));

        /*System.out.println("\nLibros de Gabriel García Márquez:");
        sistema.mostrarLibrosPorAutor("Gabriel García Márquez");

        Libro libroActualizado = new Libro("El Quijote", "Miguel de Cervantes", "Ficción", crearFecha(1605, Calendar.SEPTEMBER, 1));
        sistema.actualizarLibro("El Quijote", libroActualizado);
        System.out.println("\nLibro actualizado:");
        sistema.mostrarLibros();*/

        sistema.eliminarLibro("La Casa de los Espíritus");
        System.out.println("\nLibros después de eliminar:");
        sistema.mostrarLibros();
    }

    public static Date crearFecha(int anio, int mes, int dia) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes, dia, 0, 0, 0); 
        calendar.set(Calendar.MILLISECOND, 0); 
        return calendar.getTime();
    }
}

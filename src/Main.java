import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Biblioteca sistema = new Biblioteca();

        sistema.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", "Ficción", crearFecha(1605, Calendar.OCTOBER, 1)));
        sistema.agregarLibro(new Libro("Cien Años de Soledad", "Gabriel García Márquez", "Realismo Mágico", crearFecha(1967, Calendar.MAY, 30)));
        sistema.agregarLibro(new Libro("Don Juan Tenorio", "Tirso de Molina", "Teatro", crearFecha(1630, Calendar.MARCH, 15)));
        sistema.agregarLibro(new Libro("La Casa de los Espíritus", "Isabel Allende", "Novela", crearFecha(1982, Calendar.OCTOBER, 10)));
        sistema.agregarLibro(new Libro("Cien Años de Soledad", "Gabriel García Márquez", "Realismo Mágico", crearFecha(1967, Calendar.MAY, 30)));

        System.out.println("Libros disponibles:");
        sistema.mostrarLibros();

        System.out.println("\nBuscar libro: " + sistema.buscarLibro("El Quijote"));

        System.out.println("\nLibros de Gabriel García Márquez:");
        sistema.mostrarLibrosPorAutor("Gabriel García Márquez");

        Libro libroActualizado = new Libro("El Quijote", "Miguel de Cervantes", "Ficción", crearFecha(1605, Calendar.SEPTEMBER, 1));
        sistema.actualizarLibro("El Quijote", libroActualizado);
        System.out.println("\nLibro actualizado:");
        sistema.mostrarLibros();

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

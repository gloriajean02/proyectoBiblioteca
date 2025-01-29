import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Biblioteca sistema = new Biblioteca();
        
        sistema.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", Categoria.FICCION, crearFecha(1605, Calendar.OCTOBER, 1)));
        sistema.agregarLibro(new Libro("Cien Años de Soledad", "Gabriel García Márquez", Categoria.REALISMO_MAGICO, crearFecha(1967, Calendar.MAY, 30)));
        sistema.agregarLibro(new Libro("Don Juan Tenorio", "Tirso de Molina", Categoria.TEATRO, crearFecha(1630, Calendar.MARCH, 15)));
        sistema.agregarLibro(new Libro("La Casa de los Espíritus", "Isabel Allende", Categoria.NOVELA, crearFecha(1982, Calendar.OCTOBER, 10)));
        sistema.agregarLibro(new Libro("Crepúsculo", "Stephenie Meyer", Categoria.FANTASIA, crearFecha(2005, Calendar.AUGUST, 1)));
        sistema.agregarLibro(new Libro("Nuevo Amanecer", "Stephenie Meyer", Categoria.FANTASIA, crearFecha(2006, Calendar.SEPTEMBER, 6)));
        sistema.agregarLibro(new Libro("Eclipse", "Stephenie Meyer", Categoria.FANTASIA, crearFecha(2007, Calendar.AUGUST, 7)));
        sistema.agregarLibro(new Libro("Amanecer", "Stephenie Meyer", Categoria.FANTASIA, crearFecha(2008, Calendar.AUGUST, 2)));
        sistema.agregarLibro(new Libro("Harry Potter y la Piedra Filosofal", "J.K. Rowling", Categoria.FANTASIA, crearFecha(1997, Calendar.JUNE, 26)));
        sistema.agregarLibro(new Libro("Dune", "Frank Herbert", Categoria.CIENCIA_FICCION, crearFecha(1965, Calendar.AUGUST, 1)));
        sistema.agregarLibro(new Libro("El Código Da Vinci", "Dan Brown", Categoria.MISTERIO, crearFecha(2003, Calendar.MARCH, 18)));
        sistema.agregarLibro(new Libro("Los Miserables", "Victor Hugo", Categoria.HISTORIA, crearFecha(1862, Calendar.MARCH, 1)));
        sistema.agregarLibro(new Libro("Orgullo y Prejuicio", "Jane Austen", Categoria.ROMANCE, crearFecha(1813, Calendar.JANUARY, 28)));
        sistema.agregarLibro(new Libro("Steve Jobs", "Walter Isaacson", Categoria.BIOGRAFIA, crearFecha(2011, Calendar.OCTOBER, 24)));
        sistema.agregarLibro(new Libro("Los 7 Hábitos de la Gente Altamente Efectiva", "Stephen R. Covey", Categoria.AUTOAYUDA, crearFecha(1989, Calendar.AUGUST, 15)));
        sistema.agregarLibro(new Libro("Sherlock Holmes: Estudio en Escarlata", "Arthur Conan Doyle", Categoria.POLICIACA, crearFecha(1887, Calendar.NOVEMBER, 1)));
        sistema.agregarLibro(new Libro("Drácula", "Bram Stoker", Categoria.TERROR, crearFecha(1897, Calendar.MAY, 26)));
        sistema.agregarLibro(new Libro("La Isla del Tesoro", "Robert Louis Stevenson", Categoria.AVENTURA, crearFecha(1883, Calendar.JANUARY, 1)));

        // Menú interactivo
        while (true) {
            System.out.println("\n--- Menú de Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Buscar libros por autor");
            System.out.println("4. Buscar libros por categoría");
            System.out.println("5. Actualizar libro");
            System.out.println("6. Eliminar libro");
            System.out.println("7. Mostrar todos los libros");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Para consumir el salto de línea después de la opción

            switch (opcion) {
                case 1:
                    // Agregar libro
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.print("Ingrese la categoría del libro (FICCION, REALISMO_MAGICO, etc.): ");
                    String categoriaStr = sc.nextLine();
                    Categoria categoria = Categoria.valueOf(categoriaStr.toUpperCase());
                    System.out.print("Ingrese la fecha de publicación (AAAA-MM-DD): ");
                    String fechaStr = sc.nextLine();
                    Date fechaPublicacion = parseFecha(fechaStr); // Usamos el método parseFecha
                    if (fechaPublicacion == null) {
                        System.out.println("Formato de fecha incorrecto.");
                        break;
                    }
                    Libro libro = new Libro(titulo, autor, categoria, fechaPublicacion);
                    sistema.agregarLibro(libro);
                    System.out.println("Libro agregado exitosamente.");
                    break;

                case 2:
                    // Buscar libro por título
                    System.out.print("Ingrese el título del libro a buscar: ");
                    String tituloBuscar = sc.nextLine();
                    Libro libroEncontrado = sistema.buscarLibro(tituloBuscar);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado: " + libroEncontrado);
                    } else {
                        System.out.println("No se encontró el libro.");
                    }
                    break;

                case 3:
                    // Buscar libros por autor
                    System.out.print("Ingrese el autor de los libros a buscar: ");
                    String autorBuscar = sc.nextLine();
                    Libro[] librosPorAutor = sistema.buscarPorAutor(autorBuscar);
                    if (librosPorAutor.length > 0) {
                        System.out.println("Libros encontrados por el autor " + autorBuscar + ":");
                        for (Libro l : librosPorAutor) {
                            System.out.println(l);
                        }
                    } else {
                        System.out.println("No se encontraron libros de ese autor.");
                    }
                    break;

                case 4:
                    // Buscar libros por categoría
                    System.out.print("Ingrese la categoría de los libros a buscar (FICCION, REALISMO_MAGICO, etc.): ");
                    String categoriaBuscarStr = sc.nextLine();
                    Categoria categoriaBuscar = Categoria.valueOf(categoriaBuscarStr.toUpperCase());
                    Libro[] librosPorCategoria = sistema.buscarPorCategoria(categoriaBuscar);
                    if (librosPorCategoria.length > 0) {
                        System.out.println("Libros encontrados en la categoría " + categoriaBuscar + ":");
                        for (Libro l : librosPorCategoria) {
                            System.out.println(l);
                        }
                    } else {
                        System.out.println("No se encontraron libros en esa categoría.");
                    }
                    break;

                case 5:
                    // Actualizar libro
                    System.out.print("Ingrese el título del libro a actualizar: ");
                    String tituloActualizar = sc.nextLine();
                    Libro libroParaActualizar = sistema.buscarLibro(tituloActualizar);
                    if (libroParaActualizar != null) {
                        System.out.print("Ingrese el nuevo título: ");
                        String nuevoTitulo = sc.nextLine();
                        System.out.print("Ingrese el nuevo autor: ");
                        String nuevoAutor = sc.nextLine();
                        System.out.print("Ingrese la nueva categoría: ");
                        String nuevaCategoriaStr = sc.nextLine();
                        Categoria nuevaCategoria = Categoria.valueOf(nuevaCategoriaStr.toUpperCase());
                        System.out.print("Ingrese la nueva fecha de publicación (AAAA-MM-DD): ");
                        String nuevaFechaStr = sc.nextLine();
                        Date nuevaFecha = parseFecha(nuevaFechaStr);
                        if (nuevaFecha == null) {
                            System.out.println("Formato de fecha incorrecto.");
                            break;
                        }
                        Libro libroActualizado = new Libro(nuevoTitulo, nuevoAutor, nuevaCategoria, nuevaFecha);
                        boolean actualizado = sistema.actualizarLibro(tituloActualizar, libroActualizado);
                        if (actualizado) {
                            System.out.println("Libro actualizado exitosamente.");
                        } else {
                            System.out.println("No se encontró el libro para actualizar.");
                        }
                    } else {
                        System.out.println("No se encontró el libro.");
                    }
                    break;

                case 6:
                    // Eliminar libro
                    System.out.print("Ingrese el título del libro a eliminar: ");
                    String tituloEliminar = sc.nextLine();
                    boolean eliminado = sistema.eliminarLibro(tituloEliminar);
                    if (eliminado) {
                        System.out.println("Libro eliminado exitosamente.");
                    } else {
                        System.out.println("No se encontró el libro para eliminar.");
                    }
                    break;

                case 7:
                    // Mostrar todos los libros
                    System.out.println("Lista de libros en la biblioteca:");
                    System.out.println(sistema);
                    break;

                case 8:
                    // Salir
                    System.out.println("Saliendo del programa.");
                    sc.close();
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, elija nuevamente.");
            }
        }
    }

    // Método para crear fechas
    public static Date crearFecha(int anio, int mes, int dia) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes, dia, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    // Método para parsear fechas
    public static Date parseFecha(String fechaStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(fechaStr);
        } catch (ParseException e) {
            return null; // Si la fecha no es válida, retornamos null
        }
    }
}



        /*System.out.println("Buscar libro:");
        String titulo = sc.nextLine();
        Libro libroEncontrado= sistema.buscarLibro;
        if (libroEncontrado != null){
            System.out.println("Libro encontrado");
        }else{
            System.out.println("Libro no encontrado");
        }

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
    }*/

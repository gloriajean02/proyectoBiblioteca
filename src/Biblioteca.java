import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;


/**
 * Clase principal de biblioteca.
 * 
 * @author Gloria y Guadalupe
 */

public class Biblioteca {
    public static Scanner sc = new Scanner(System.in);
    public static GestorUsuario gestor = new GestorUsuario(); //Crear un objeto tipo GestorUsuario
    public static GestorLibros sistema = new GestorLibros(); //Crear un objeto tipo GestorLibros
    public static GestorPrestamos gestorPrestamos = new GestorPrestamos(); //Crear un objeto tipo GestorPrestamos
    public static void main(String[] args) {

        //Crear libros
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


        //Crear usuarios
        gestor.nuevoUsuario(new Usuario("Guadalupe01", "gorrito02", TipoUsuario.ADMINISTRADOR));
        gestor.nuevoUsuario(new Usuario("LunaLovegood", "ilovemagic", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("HarryEl+Prota", "soyunpesao", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("CarrieBradshaw", "redflag1965", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("RachelGreen01", "ilovemyoutfit", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("MonGeller24", "ilovemyroomba", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("PrincesaConsuela", "imhislobster", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("Pablo_Profe%", "arraydegatetes", TipoUsuario.ADMINISTRADOR));
        gestor.nuevoUsuario(new Usuario("ChandlerBing", "couldibeany", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("RossGeller", "unagipaleont", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("JoeyTribbiani", "howudoin123", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("BruceWayne", "batcave123", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("ClarkKent", "superman78", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("GandalfTheGrey", "youShallPass", TipoUsuario.ADMINISTRADOR));
        gestor.nuevoUsuario(new Usuario("YodaMaster", "forcebewithyou", TipoUsuario.ADMINISTRADOR));
        gestor.nuevoUsuario(new Usuario("DarthVader", "IamYourFather", TipoUsuario.USUARIO));

        // Crear préstamos
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("Orgullo y prejuicio"), gestor.buscarUsuario("YodaMaster"), crearFecha(2024, 2, 3), crearFecha(2024, 2, 4)));
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("Harry Potter y la Piedra Filosofal"), gestor.buscarUsuario("LunaLovegood"), crearFecha(2024, 2, 1)));
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("El Quijote"), gestor.buscarUsuario("HarryEl+Prota"), crearFecha(2024, 2, 2)));
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("Orgullo y Prejuicio"), gestor.buscarUsuario("CarrieBradshaw"), crearFecha(2024, 2, 3)));
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("Los Miserables"), gestor.buscarUsuario("RachelGreen01"), crearFecha(2024, 2, 4)));
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("Sherlock Holmes: Estudio en Escarlata"), gestor.buscarUsuario("MonGeller24"), crearFecha(2024, 2, 5)));
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("Crepúsculo"), gestor.buscarUsuario("PrincesaConsuela"), crearFecha(2024, 2, 6)));
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("Drácula"), gestor.buscarUsuario("Pablo_Profe%"), crearFecha(2024, 2, 7)));
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("Dune"), gestor.buscarUsuario("ChandlerBing"), crearFecha(2024, 2, 8), crearFecha(2024, 2, 4)));
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("Cien Años de Soledad"), gestor.buscarUsuario("RossGeller"), crearFecha(2024, 2, 9)));
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("La Casa de los Espíritus"), gestor.buscarUsuario("JoeyTribbiani"), crearFecha(2024, 2, 10), crearFecha(2024, 2, 4)));
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("La Isla del Tesoro"), gestor.buscarUsuario("BruceWayne"), crearFecha(2024, 2, 11)));
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("El Código Da Vinci"), gestor.buscarUsuario("YodaMaster"), crearFecha(2024, 2, 3)));
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("Amanecer"), gestor.buscarUsuario("YodaMaster"), crearFecha(2024, 2, 3)));
        gestorPrestamos.nuevoPrestamo(new Prestamo(sistema.buscarLibro("Don Juan Tenorio"), gestor.buscarUsuario("YodaMaster"), crearFecha(2024, 2, 3), crearFecha(2024, 2, 4)));
        


        // Login
        boolean loginExitoso = false;

        do {
            System.out.print("Ingrese su usuario: ");
            String username = sc.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String password = sc.nextLine();

            Usuario usuarioEncontrado = gestor.buscarUsuario(username); // nos devuelve null si no lo encuentra
            
            if (usuarioEncontrado != null) {
                if (usuarioEncontrado.login(username, password)) {
                    loginExitoso = true;
                    System.out.println("¡Bienvenido, " + usuarioEncontrado.getUser() + "!");
                    if (usuarioEncontrado.getTipoUsuario() == TipoUsuario.ADMINISTRADOR) {
                        menuAdmin();
                    }
                    else {
                        menuUsuario(); 
                    }    
                }  else {
                    System.out.println("Contraseña incorrecta. Intente de nuevo.");
                }
            } else {
                System.out.println("Usuario no encontrado. Intente de nuevo.");
            }
            
        } while (loginExitoso == false);
    }
    

    

        // Menu ADMIN
        public static void menuAdmin(){

            int opcion = 0;

                        do {
                            System.out.println("                     Menú Biblioteca");
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("    1. Agregar libros nuevos.");
                            System.out.println("    2. Eliminar libros existentes.");
                            System.out.println("    3. Buscar libros por título, autor o categoría.");
                            System.out.println("    4. Mostrar todos los libros disponibles.");
                            System.out.println("    5. Registrar nuevos usuarios.");
                            System.out.println("    6. Consultar información de usuarios registrados.");
                            System.out.println("    7. Realizar préstamos de libros.");
                            System.out.println("    8. Devolver libros prestados.");
                            System.out.println("    9. Mostrar libros actualmente prestados.");
                            System.out.println("    10. Mostrar número de préstamos totales y activos.");
                            System.out.println("    11. Listar los libros más prestados.");
                            System.out.println("    12. Mostrar qué usuario tiene más préstamos activos.");
                            System.out.println("    0. Salir.");
                            System.out.println("----------------------------------------------------------------");

                            opcion = Integer.parseInt(sc.nextLine());

                            switch (opcion) {
                                case 1:
                                    agregarLibro();
                                break;
                                case 2:
                                    eliminarLibro();
                                break;
                                case 3:
                                    System.out.println("Elige una opción:");
                                    System.out.println("1. Buscar por título.");
                                    System.out.println("2. Buscar por autor.");
                                    System.out.println("3. Buscar por género.");
                                    System.out.println("0. Salir al menú principal.");
                                    int choice = Integer.parseInt(sc.nextLine());
                                    switch (choice) {
                                        case 1 -> buscarTitulo();
                                        case 2 -> buscarAutor();
                                        case 3 -> buscarGenero();
                                        case 0 -> System.out.println("Saliendo al menú principal...");
                                        default -> System.out.println("Error, opción no encontrada.");
                                    }
                                break;
                                case 4:
                                    System.out.println("Lista de libros en la biblioteca:");
                                    System.out.println(sistema.toString());
                                break;
                                case 5:
                                    crearUsuario();
                                break;
                                case 6:
                                    System.out.println("Información de usuarios registrados en la biblioteca:");
                                    System.out.println(gestor.toString()); 
                                break;
                                case 7:
                                    prestarLibro();
                                break;
                                case 8:
                                    devolverLibro();
                                break;
                                case 9:
                                    System.out.println("Lista de libros prestados:");
                                    System.out.println(gestorPrestamos.toString());
                                break;
                                case 10:
                                    gestorPrestamos.contarPrestamosTotalesYActivos();
                                break;
                                case 11:
                                    System.out.println("NO SOY CAPAZ DE HACERLO");
                                break;
                                case 12:
                                    gestorPrestamos.usuarioConMasPrestamosActivos();
                                break;
                                case 0:
                                    System.out.println("Saliendo...");
                                break;
                                default:
                                    System.out.println("Opción inexistente. Pulse 0 para salir.");
                                break;
                            }
                        } while (opcion != 0);

        }
        
        public static void menuUsuario(){

            int opcion = 0;

                        do {
                            System.out.println("                     Menú Biblioteca");
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("    1. Buscar libros por título, autor o categoría.");
                            System.out.println("    2. Mostrar todos los libros disponibles.");
                            System.out.println("    3. Realizar préstamos de libros.");
                            System.out.println("    4. Devolver libros prestados.");
                            System.out.println("    0. Salir.");
                            System.out.println("----------------------------------------------------------------");

                            opcion = Integer.parseInt(sc.nextLine());

                            switch (opcion) {
                                case 1:
                                    System.out.println("Elige una opción:");
                                    System.out.println("1. Buscar por título.");
                                    System.out.println("2. Buscar por autor.");
                                    System.out.println("3. Buscar por género.");
                                    System.out.println("0. Salir al menú principal.");
                                    int choice = Integer.parseInt(sc.nextLine());
                                    switch (choice) {
                                        case 1 -> buscarTitulo();
                                        case 2 -> buscarAutor();
                                        case 3 -> buscarGenero();
                                        case 0 -> System.out.println("Saliendo al menú principal...");
                                        default -> System.out.println("Error, opción no encontrada.");
                                    }
                                break;
                                case 2:
                                    System.out.println("Lista de libros en la biblioteca:");
                                    System.out.println(sistema);
                                break;
                                case 3:
                                    prestarLibro();
                                break;
                                case 4:
                                    devolverLibro();
                                break;
                                case 0:
                                    System.out.println("Saliendo...");
                                break;
                                default:
                                    System.out.println("Opción inexistente. Pulse 0 para salir.");
                                break;
                            }
                        } while (opcion != 0);

        }

        

        public static void agregarLibro(){
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
            
            if (fechaPublicacion != null) {
                Libro libro = new Libro(titulo, autor, categoria, fechaPublicacion);
                sistema.agregarLibro(libro);
                System.out.println("Libro agregado exitosamente.");     
            } else System.out.println("Formato de fecha incorrecto.");
                    
        }

        public static void eliminarLibro(){
            System.out.print("Ingrese el título del libro a eliminar: ");
            String tituloEliminar = sc.nextLine();
            boolean eliminado = sistema.eliminarLibro(tituloEliminar);
            
            if (eliminado) {
                System.out.println("Libro eliminado exitosamente.");
            } else System.out.println("No se encontró el libro para eliminar.");
        }

        public static void buscarTitulo(){
            System.out.print("Ingrese el título del libro a buscar: ");
            String tituloBuscar = sc.nextLine();
            Libro libroEncontrado = sistema.buscarLibro(tituloBuscar);
            
            if (libroEncontrado != null) {
                System.out.println("Libro encontrado: " + libroEncontrado);
            } else {
                System.out.println("No se encontró el libro.");
            }
        }

        public static void buscarAutor(){
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
        }

        public static void buscarGenero(){
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
        }

        public static void crearUsuario(){
            System.out.println("Nombre de usuario:");
            String nuevoUsuario = sc.nextLine();
            System.out.println("Contraseña:");
            String contrasena = sc.nextLine();
            System.out.println("Tipo de usuario (ADMINISTRADOR/USUARIO):");
            String tipoUsuarioStr = sc.nextLine();

            if (tipoUsuarioStr.equals("ADMINISTRADOR") || tipoUsuarioStr.equals("USUARIO") ) {
                TipoUsuario tipoUsuario = TipoUsuario.valueOf(tipoUsuarioStr);

                Usuario usuario = new Usuario(nuevoUsuario, contrasena, tipoUsuario);

                gestor.nuevoUsuario(usuario);

                System.out.println("Usuario creado.");

            } else System.out.println("Error, tipo de usuario inexistente.");

        }

        public static void prestarLibro(){
            System.out.print("Ingrese el título del libro a prestar: ");
            String tituloPrestamo = sc.nextLine();
            Libro libroPrestamo = sistema.buscarLibro(tituloPrestamo);
            if (libroPrestamo != null) {
                System.out.print("Ingrese el nombre de usuario al que se prestará el libro: ");
                String usuarioPrestamo = sc.nextLine();
                Usuario usuario = gestor.buscarUsuario(usuarioPrestamo);
                if (usuario != null) {
                    gestorPrestamos.realizarPrestamo(libroPrestamo, usuario);
                } else {
                    System.out.println("Usuario no encontrado.");
                }
            } else {
                System.out.println("Libro no encontrado.");
            }

        }

        public static void devolverLibro(){
            System.out.print("Ingrese el título del libro a devolver: ");
                String tituloDevolucion = sc.nextLine();
                Libro libroDevolucion = sistema.buscarLibro(tituloDevolucion);
                if (libroDevolucion != null) {
                    System.out.print("Ingrese el nombre de usuario que devuelve el libro: ");
                    String usuarioDevolucion = sc.nextLine();
                    Usuario usuario = gestor.buscarUsuario(usuarioDevolucion);
                    if (usuario != null) {
                        gestorPrestamos.devolverLibro(libroDevolucion, usuario);
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                } else System.out.println("Libro no encontrado.");
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
            return null; 
        }
    }
}

    


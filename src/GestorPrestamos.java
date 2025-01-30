import java.util.Date;

/**
 * Clase que gestiona los prestamos de la biblioteca.
 * 
 * @author Gloria y Guadalupe
 */

public class GestorPrestamos {

    private Prestamo[] prestamos;
    private int contador;  
    private static final int TAM = 100;
    

    public GestorPrestamos() {

        this.prestamos = new Prestamo[TAM];
        this.contador = 0;  
    }

    // Nuevo prestamo
    public void nuevoPrestamo(Prestamo nuevoPrestamo) {
        if (contador<TAM){
            prestamos[contador] = nuevoPrestamo;  
            contador++;  
        }
    }

    // Realizar un préstamo de libro
    public void realizarPrestamo(Libro libro, Usuario usuario) {
        if (libro != null && usuario != null && contador < TAM) {
            Prestamo nuevoPrestamo = new Prestamo(libro, usuario, new Date()); 
            prestamos[contador] = nuevoPrestamo;  
            contador++;  
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado a " + usuario.getUser());
        } else {
            System.out.println("Error al realizar el préstamo: Libro o usuario no válido o capacidad máxima alcanzada.");
        }
    }

    // Devolver un libro prestado
    public void devolverLibro(Libro libro, Usuario usuario) {
        for (int i = 0; i < contador; i++) {  
            if (prestamos[i].getLibro().equals(libro) && prestamos[i].getUsuario().equals(usuario) && prestamos[i].getFechaDevolucion() == null) {
                prestamos[i].devolverLibro(new Date());
                System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto.");
            } else System.out.println("No se encontró un préstamo activo de este libro.");
        }
        
    }

    // Contar préstamos totales y activos
    public void contarPrestamosTotalesYActivos() {
        int prestamosActivos = 0;
        for (int i = 0; i < contador; i++) {
            if (prestamos[i].getFechaDevolucion() == null) {
                prestamosActivos++;
            }
        }
        System.out.println("Préstamos totales: " + contador);
        System.out.println("Préstamos activos: " + prestamosActivos);
    }

    // Listar libros más prestados
    
    
    
    // Usuario con más préstamos activos
    public void usuarioConMasPrestamosActivos() {
        Usuario[] usuariosContados = new Usuario[TAM];
        int[] contadorPrestamos = new int[TAM];
        int usuariosRegistrados = 0;
        Usuario usuarioCulto = null;
        int numPrestamos = 0;
        boolean encontrado = false;

        for (int i = 0; i < contador && !encontrado; i++) {
            if (prestamos[i].getFechaDevolucion() == null) { // Solo tenemos en cuenta préstamos activos
                Usuario usuario = prestamos[i].getUsuario();
                encontrado = false;

                // Buscar si el usuario ya está en la lista
                for (int j = 0; j < usuariosRegistrados; j++) {
                    if (usuariosContados[j].equals(usuario)) {
                        contadorPrestamos[j]++;
                        encontrado = true;
                    }
                }

                // Si no está en la lista, lo agregamos
                if (!encontrado) {
                    usuariosContados[usuariosRegistrados] = usuario;
                    contadorPrestamos[usuariosRegistrados] = 1;
                    usuariosRegistrados++;
                }
            }
        }

        // Encontrar el usuario con más préstamos activos
        for (int i = 0; i < usuariosRegistrados; i++) {
            if (contadorPrestamos[i] > numPrestamos) {
                numPrestamos = contadorPrestamos[i];
                usuarioCulto = usuariosContados[i];
            }
        }

        if (usuarioCulto != null) {
            System.out.println("\nUsuario con más préstamos activos: " + usuarioCulto.getUser() + " (" + numPrestamos + " préstamos activos)");
        } else {
            System.out.println("\nNo hay préstamos activos.");
        }
    }
    


    // Mostrar libros actualmente prestados 
    @Override
    public String toString() {
        String stringLibrosPrestados = "";
        for (int i = 0; i < contador; i++) {
            if (prestamos[i].getFechaDevolucion() == null) {
                stringLibrosPrestados += prestamos[i].toString() + "\n";
            }
        }
        return stringLibrosPrestados;
    }
    
}

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

    // Devolver un libro prestado
    public boolean devolverLibro(Libro libro, Usuario usuario) {
        for (int i = 0; i < contador; i++) {  
            if (prestamos[i] != null &&  // Comprueba que el prestamo no es null
                prestamos[i].getFechaDevolucion() == null &&  //Comprueba que no está devuelto
                prestamos[i].getLibro().equals(libro) &&  // Comprueba que el prestamo es un libro existente
                prestamos[i].getUsuario().equals(usuario)) { // Comprueba que es el usuario corresp
                    
                prestamos[i].devolverLibro(new Date());  // le pone fecha devolucion
                return true; 
            }
        }
        return false;  
    }
    

    // Contar préstamos totales
    public int contarPrestamosTotales() {
        return contador;
    }

    // Contar préstamos activos
    public int contarPrestamosActivos() {
        int prestamosActivos = 0;
        for (int i = 0; i < contador; i++) {
            if (prestamos[i].getFechaDevolucion() == null) {
                prestamosActivos++;
            }
        }
        return prestamosActivos;
    }

    // Listar libros más prestados
    
    
    
    // Usuario con más préstamos activos
    public Usuario usuarioConMasPrestamosActivos() {
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

        return usuarioCulto;
    }
    
    // Contador de préstamos del Usuario Culto
    public int cantidadPrestamosActivos(Usuario usuario) {
        int prestamosActivos = 0;
        for (int i = 0; i < contador; i++) {
            if (prestamos[i].getUsuario().equals(usuario) && prestamos[i].getFechaDevolucion() == null) {
                prestamosActivos++;
            }
        }
        return prestamosActivos;
    }

    //Encontrar el libro más prestado
    public Libro libroMasPrestado() {
        Libro[] librosContados = new Libro[TAM];
        int[] contadorPrestamos = new int[TAM];
        int librosRegistrados = 0;
        Libro libroPopular = null;
        int maxPrestamos = 0;
        boolean encontrado = false;
    
        for (int i = 0; i < contador && !encontrado; i++) {  
            Libro libro = prestamos[i].getLibro();
            encontrado = false;
    
            // Buscar si el libro ya está en la lista
            for (int j = 0; j < librosRegistrados; j++) {
                if (librosContados[j] != null && librosContados[j].equals(libro)) {
                    contadorPrestamos[j]++;
                    encontrado = true;
                }
            }
    
            // Si no está en la lista, lo agregamos
            if (!encontrado) {
                librosContados[librosRegistrados] = libro;
                contadorPrestamos[librosRegistrados] = 1;
                librosRegistrados++;
            }
        }
    
        // Encontrar el libro más prestado
        for (int i = 0; i < librosRegistrados; i++) {
            if (contadorPrestamos[i] > maxPrestamos) {
                maxPrestamos = contadorPrestamos[i];
                libroPopular = librosContados[i];
            }
        }
    
        return libroPopular;  // Devuelve el libro más prestado 
    }


    //Contar las veces que se ha prestado el libro
    public int cantidadPrestamosLibro(Libro libro) {
        int prestamosLibro = 0;
        for (int i = 0; i < contador; i++) {
            if (prestamos[i].getLibro().equals(libro)) {
                prestamosLibro++;
            }
        }
        return prestamosLibro;
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

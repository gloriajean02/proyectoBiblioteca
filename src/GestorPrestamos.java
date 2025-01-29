import java.util.Date;

public class GestorPrestamos {

    private Prestamo[] prestamos;
    private int contador;  

    public GestorPrestamos(int capacidad) {

        this.prestamos = new Prestamo[capacidad];
        this.contador = 0;  
    }

    // Realizar un préstamo de libro
    public void realizarPrestamo(Libro libro, Usuario usuario) {
        if (libro != null && usuario != null && contador < prestamos.length) {
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
                return;
            }
        }
        System.out.println("No se encontró un préstamo activo de este libro.");
    }

    // Mostrar libros actualmente prestados (solo para administradores)
    public void mostrarLibrosPrestados(Usuario usuario) {
        if (usuario.getTipoUsuario() == TipoUsuario.ADMINISTRADOR) {
            System.out.println("Libros actualmente prestados:");
            for (int i = 0; i < contador; i++) {
                if (prestamos[i].getFechaDevolucion() == null) {
                    System.out.println(prestamos[i]);
                }
            }
        } else {
            System.out.println("Acción solo disponible para administradores.");
        }
    }
}

import java.util.Arrays;

class Biblioteca {

    private Libro[] libros;
    private int lleno;
    private static final int TAM = 100;

    public Biblioteca() {
        libros = new Libro[TAM];
        lleno = 0;
    }

    /**
     * Añade un nuevo libro al gestor.
     * 
     * @param libro el libro a añadir.
     */
    public void agregarLibro(Libro libro) {
        if (lleno < TAM) {
            libros[lleno] = libro;
            lleno++;
        } else {
            System.out.println("El gestor está lleno, no se puede agregar más libros.");
        }
    }

    /**
     * Busca el índice de un libro por título.
     * 
     * @param titulo el título del libro a buscar.
     * @return el índice del libro, o -1 si no se encuentra.
     */
    private int buscarIndiceLibro(String titulo) {
        int buscar = -1;
        for (int i = 0; i < lleno && buscar == -1; i++) {
            if (libros[i].getTitulo().equals(titulo)) {
                buscar = i;
            }
        }
        return buscar;
    }

    /**
     * Busca un libro por título.
     * 
     * @param titulo el título del libro a buscar.
     * @return el libro encontrado, o null si no se encuentra.
     */
    public Libro buscarLibro(String titulo) {
        Libro buscar = null;
        int indice = buscarIndiceLibro(titulo);
        if (indice != -1) {
            buscar = libros[indice];
        }
        return buscar;
    }

    /**
     * Busca libros por autor.
     * 
     * @param autor el autor de los libros a buscar.
     * @return un array de libros del autor.
     */
    public Libro[] buscarPorAutor(String autor) {
        Libro[] resultado = new Libro[TAM];
        int autorLleno = 0;
        for (int i = 0; i < lleno; i++) {
            if (libros[i].getAutor().equals(autor)) {
                resultado[autorLleno] = libros[i];
                autorLleno++;
            }
        }
        return Arrays.copyOf(resultado, autorLleno);
    }

    /**
     * Busca libros por categoría.
     * 
     * @param categoria la categoría de los libros a buscar.
     * @return un array de libros de la categoría.
     */
    public Libro[] buscarPorCategoria(Categoria categoria) {
        Libro[] resultado = new Libro[TAM];
        int categoriaLleno = 0;
        for (int i = 0; i < lleno; i++) {
            if (libros[i].getCategoria().equals(categoria)) {
                resultado[categoriaLleno] = libros[i];
                categoriaLleno++;
            }
        }
        return Arrays.copyOf(resultado, categoriaLleno);
    }

    /**
     * Actualiza un libro existente.
     * 
     * @param titulo    el título del libro a actualizar.
     * @param actualizado el nuevo libro con la información actualizada.
     * @return true si el libro se actualizó correctamente, false si no se encuentra.
     */
    public boolean actualizarLibro(String titulo, Libro actualizado) {
        int indice = buscarIndiceLibro(titulo);
        if (indice != -1) {
            libros[indice] = actualizado;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Elimina un libro por título.
     * 
     * @param titulo el título del libro a eliminar.
     * @return true si el libro se eliminó correctamente, false si no se encuentra.
     */
    public boolean eliminarLibro(String titulo) {
        int indice = buscarIndiceLibro(titulo);
        if (indice != -1) {
            for (int i = indice; i < lleno - 1; i++) {
                libros[i] = libros[i + 1];
            }
            libros[--lleno] = null;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Devuelve los libros como un string.
     */
    @Override
    public String toString() {
        String stringLibro = "";
        for (int i = 0; i < lleno; i++) {
            stringLibro += libros[i].toString() + "\n";
        }
        return stringLibro;
    }

    /**
     * Devuelve un array de libros como un string.
     */
    public static String toString(Libro[] arrayLibro) {
        String stringLibro = "";
        for (Libro libro : arrayLibro) {
            stringLibro += libro.toString() + "\n";
        }
        return stringLibro;
    }
}
    /*    libros = new Libro[MAX_LIBROS];
        totalLibros = 0;

    }

    public void agregarLibro (Libro libro) {

        if (totalLibros < MAX_LIBROS) {

            libros[totalLibros] = libro;
            totalLibros++;

        } else {

            System.out.println("No se puede agregar más libros, se alcanzó el máximo permitido.");

        }

    }

    public boolean eliminarLibro (String titulo) {

        boolean eliminado = false;
        for (int i = 0; i < totalLibros; i++) {

            if (libros[i].getTitulo().equals(titulo)) {
            
                for (int j = i; j < totalLibros - 1; j++) {

                    libros[j] = libros[j + 1];

                }

                libros[totalLibros - 1] = null;
                totalLibros--;  
                eliminado = true;  

            }

        }

        return eliminado; 

    }

    public Libro buscarLibro (String titulo) {

        for (int i = 0; i < totalLibros; i++) {

            if (libros[i].getTitulo().equals(titulo)) {

                return libros[i];
                
            }

        }

        return null;

    }

    public void mostrarLibros () {

        if (totalLibros == 0) {

            System.out.println("No hay libros disponibles.");

        } else {

            for (int i = 0; i < totalLibros; i++) {

                System.out.println(libros[i]);

            }

        }*/


class Biblioteca {

    private Libro[] libros;
    private int totalLibros;
    private static final int MAX_LIBROS = 100;

    public Biblioteca () {

        libros = new Libro[MAX_LIBROS];
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

        }

    }
    
}
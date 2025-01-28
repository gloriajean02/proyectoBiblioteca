

/**
 * Clase que gestiona los usuarios de la biblioteca.
 * 
 * @author Gloria y Guadalupe
 */

public class GestorUsuario {
    private Usuario [] usuarios; // array que guarda los objetos Usuario
    private int guardado; // controla cuántos usuarios están actualmente guardados en el array
    private static final int TAM = 100; // tamaño del array, num de objetos usuario que podemos guardar

    // Inializar el constructor
    public GestorUsuario() {
        usuarios = new Usuario[TAM]; 
        guardado = 0; // Ahora mismo hay 0 usuarios guardados
    }

    // Guardar nuevo usuario en el array
    public void nuevoUsuario(Usuario nuevoUsuario) {
        if (guardado<TAM){ // si el num de guardados es menor al tam del array
            usuarios[guardado] = nuevoUsuario; // nuevoUsuario se guarda en el array
            guardado++; // y se incrementa el contador de usuarios guardados
        }
    }

    //Consultar la info de todos los usuarios registrados
    @Override
    public String toString() {
        String stringUsuarios = "";
        for (int i = 0; i < guardado; i++) {
            stringUsuarios += usuarios[i].toString() + "\n";
        }
        return stringUsuarios;
    }

}
